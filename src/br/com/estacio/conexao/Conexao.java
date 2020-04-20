package br.com.estacio.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conexao {

    private String local;        //Local do servidor de banco de dados
    private String usuario;      //Usuário de conexão ao SGBD
    private String porta;
    private String banco;
    private String senha;        //Senha do usuário de conexão ao SGBD
    private Connection c;        //Objeto de conexão
    private Statement statement; //Objeto de envio de solicitações ao SGBD
    private ResultSet resultset; //Objeto de resposta do SGBD à aplicação
    private String strConexao;   //Conjunto de chaves para estabelecer a conexão
    private String driverjdbc;   //Driver para o SGBD

    public Conexao() {
    }

    public Conexao(String local, String porta, String banco, String usuario, String senha) {
        
        setLocal(local);
        setPorta(porta);
        setBanco(banco);
        setSenha(senha);
        setUsuario(usuario);
        setStrConexao("jdbc:mysql://" + getLocal() + ":" + getPorta() + "/" + getBanco() +"?useSSL=false"); //?useSSL=false 
        setDriverjdbc("com.mysql.jdbc.Driver");
    }

    //Conectar ao Banco de Dados
    public void conectar() {
        try {
            Class.forName(getDriverjdbc());
            setC(DriverManager.getConnection(getStrConexao(), getUsuario(), getSenha()));
            setStatement(getC().createStatement());
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println(e);
            e.printStackTrace();
        }
    }

    //Desconectar ao Banco de Dados
    public void desconectar() {
        try {
            getC().close();
        } catch (SQLException e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    //Rodar inclusão de registros no banco de dados
    public int queryIncluir(String sql, String sqlUltimo) {
        int status = 0;
        try {
            this.setStatement(getC().createStatement());
            this.getStatement().executeUpdate(sql);
            this.setResultset(this.getStatement().executeQuery(sqlUltimo));
            while (this.resultset.next()) {
                status = this.resultset.getInt(1);
            }
            //Retorna o último id inserido
            //Teste de retorno: System.out.println(status);
            return status;
        } catch (SQLException e) {
            e.printStackTrace();
            return status;
        }
    }

    //Rodar exclusão de registros no banco de dados
    public int queryDelete(String sql) {
        int qtdRegistrosAfetados = 0;
        try {
            this.setStatement(getC().createStatement());
            qtdRegistrosAfetados = getStatement().executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally{
        return qtdRegistrosAfetados;
        }
    }

    //Rodar atualização de registros no banco de dados
    public int queryUpdate(String sql) {
        int qtdRegistrosAfetados = 0;
        try {
            this.setStatement(getC().createStatement());
            qtdRegistrosAfetados = getStatement().executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
            return qtdRegistrosAfetados;
        }
        return qtdRegistrosAfetados;
    }

    //Rodar consulta de registros no banco de dados
    public ResultSet query(String sql) {
        try {
            this.setStatement(getC().createStatement());
            this.setResultset(getStatement().executeQuery(sql));
            resultset = statement.getResultSet();
            //resultset.first();
            return resultset;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Connection getC() {
        return c;
    }

    public void setC(Connection c) {
        this.c = c;
    }

    public Statement getStatement() {
        return statement;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    public ResultSet getResultset() {
        return resultset;
    }

    public String getPorta() {
        return porta;
    }

    public void setPorta(String porta) {
        this.porta = porta;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    
    
    public void setResultset(ResultSet resultset) {
        this.resultset = resultset;
    }

    public String getStrConexao() {
        return strConexao;
    }

    public void setStrConexao(String strConexao) {
        this.strConexao = strConexao;
    }

    public String getDriverjdbc() {
        return driverjdbc;
    }

    public void setDriverjdbc(String driverjdbc) {
        this.driverjdbc = driverjdbc;
    }

}
