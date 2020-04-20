package br.com.estacio.dao;
import br.com.estacio.conexao.Conexao;
import br.com.estacio.modelo.Aluno;

public class AlunoDao {
    
    //Metodo respondavel por enviar a instrução SQL para inclusão de dados
    public int incluirDao(Aluno aluno){
        
        return 1;
    }
    
    //Metodo respondavel por enviar a instrução SQL para exclusão de dados
    public int excluirDao(int matricula){
        
        return 1;
    }
    
    //Metodo respondavel por enviar a instrução SQL para salvar de dados
    public int salvarDao (Aluno aluno){
        
        return 1;
    }
    
    //Metodo respondavel por enviar a instrução SQL para consultar de dados
    public Aluno getAlunoDao(int matricula){
        Aluno aluno = new Aluno();
        return aluno;
        
    }
    
    //Metodo respondavel por enviar a instrução SQL para consultar de dados
    public Aluno getAlunoDao(String nome){
        Aluno aluno = new Aluno();
        return aluno;
        
    }
}
