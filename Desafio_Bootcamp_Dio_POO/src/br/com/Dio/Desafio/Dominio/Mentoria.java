package br.com.Dio.Desafio.Dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{


    LocalDate data;

    @Override
    public double calcularXp() {
        return XP +20d;
    }


    public Mentoria() {
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }

    @Override
    public double calcularTotalXp() {
        return 0;
    }
}
