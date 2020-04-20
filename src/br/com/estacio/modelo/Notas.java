
package br.com.estacio.modelo;


public class Notas {
    public float nota1;
    public float nota2;
    public float media;

    public Notas() {
    }

    public Notas(float nota1, float nota2, float media) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.media = media;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }
    
    
}
