
package br.com.estacio.modelo;


public class Materia {
    public int codigo;
    public String descricao;
    public int creditos;

    public Materia() {
    }

    public Materia(int codigo, String descricao, int creditos) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.creditos = creditos;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }
    
    
}
