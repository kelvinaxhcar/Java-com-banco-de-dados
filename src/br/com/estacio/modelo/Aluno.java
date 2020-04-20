
package br.com.estacio.modelo;

public class Aluno {
    private int matricula;
    private String nome;
    private String email;
    
    
    public Aluno(){
        
    }
    
    public Aluno(int matricula, String nome, String email){
        setMatricula(matricula);
        setNome(nome);
        setEmail(email);
    }
    
    public int getMatricula(){
        return this.matricula;
    }
    
    public void setMatricula(int matricula){
        this.matricula=matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
