package br.com.estacio.teste;

import br.com.estacio.conexao.Conexao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Teste {
    public static void main(String [] args){
       Conexao conexao = new Conexao("157.245.140.48", "3306", "estacio", "kelvin", "");
        
       Statement st;
       ResultSet rs;
       
       
       try{
           conexao.conectar();
           st =conexao.getStatement();
           rs = st.executeQuery("select * from aluno");
           while (rs.next()){
               System.out.println(rs.getInt("matricula") + ", "+ rs.getString("nome")+", "+ rs.getString("email"));
           }
       }
       catch(SQLException e){
           e.printStackTrace();
       }
       finally{
           conexao.desconectar();
           
       }
    }
}
