
package br.com.estacio.modelo;


public class Curso {
    public int codigo;
    public String nome;
    public String habilitacao;
    public int tempo;

    public Curso() {
    }

    public Curso(int codigo, String nome, String habilitacao, int tempo) {
        this.codigo = codigo;
        this.nome = nome;
        this.habilitacao = habilitacao;
        this.tempo = tempo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHabilitacao() {
        return habilitacao;
    }

    public void setHabilitacao(String habilitacao) {
        this.habilitacao = habilitacao;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }
    
    
}
