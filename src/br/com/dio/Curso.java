package br.com.dio;

public class Curso {
    private String titulo;
    private String descreicao;
    private int cargaHoraria;

    public Curso() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescreicao() {
        return descreicao;
    }

    public void setDescreicao(String descreicao) {
        this.descreicao = descreicao;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + titulo + '\'' +
                ", descreicao='" + descreicao + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
