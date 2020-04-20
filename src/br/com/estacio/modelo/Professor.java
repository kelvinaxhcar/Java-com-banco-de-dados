
package br.com.estacio.modelo;


public class Professor {
    public int matricula;
    public String nome;
    public String sobrenome;
    public String habilitacao;

    public Professor() {
    }

    public Professor(int matricula, String nome, String sobrenome, String habilitacao) {
        this.matricula = matricula;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.habilitacao = habilitacao;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getHabilitacao() {
        return habilitacao;
    }

    public void setHabilitacao(String habilitacao) {
        this.habilitacao = habilitacao;
    }
    
    
    
}
