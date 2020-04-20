
package br.com.estacio.modelo;

public class Turma {
    private int codigo;
    private String descricao;

    public Turma() {
    }

    public Turma(int codigo, String descricao) {
        setCodigo(codigo);
        setDescricao(descricao);
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
    
    
    
}
