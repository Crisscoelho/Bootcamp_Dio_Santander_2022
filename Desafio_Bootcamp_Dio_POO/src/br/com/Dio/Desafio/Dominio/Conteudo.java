package br.com.Dio.Desafio.Dominio;

public abstract class Conteudo {

    protected static final double XP = 10d;

    private String titulo;
    private String descricao;

    public double calcularXp;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public abstract double calcularTotalXp();

    public abstract double calcularXp();
}
