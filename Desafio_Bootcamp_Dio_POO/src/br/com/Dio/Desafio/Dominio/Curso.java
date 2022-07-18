package br.com.Dio.Desafio.Dominio;

public class Curso extends Conteudo{


    private int cargaHoraria;

    @Override
    public double calcularTotalXp() {
        return 0;
    }

    @Override
    public double calcularXp(){
        return XP * cargaHoraria;
    }

    public Curso() {
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
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}


