import br.com.Dio.Desafio.Dominio.Bootcamp;
import br.com.Dio.Desafio.Dominio.Curso;
import br.com.Dio.Desafio.Dominio.Dev;
import br.com.Dio.Desafio.Dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso preparatorio para Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("Curso preparatorio para Js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Preparatorio Java");
        mentoria1.setData(LocalDate.now());


       // System.out.println(curso1);
        //System.out.println(curso2);
        //System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Curso Java Developer");
        bootcamp.setDescricao("Curso de inicialização Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devCristina = new Dev();
        devCristina.setNome("Cristina Martins Coelho");
        devCristina.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Cristina"  + devCristina.getConteudoInscritos());
        devCristina.progredir();
        devCristina.progredir();
        devCristina.progredir();
        System.out.println("Conteudos Inscritos Cristina"  + devCristina.getConteudoInscritos());
        System.out.println("Conteudos Concluidos Cristina" + devCristina.getConteudosConcluidos());
        System.out.println("XP: " + devCristina.calcularTotalXp());



        Dev devLuis = new Dev();
        devLuis.setNome("Luis Miguel Menezes");
        devLuis.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Luis Miguel"  + devLuis.getConteudoInscritos());
        devLuis.progredir();
        System.out.println("Conteudos Inscritos Luis Miguel"  + devLuis.getConteudoInscritos());
        System.out.println("Conteudos Concluidos Luis Miguel" + devLuis.getConteudosConcluidos());
        System.out.println("XP: " + devLuis.calcularTotalXp());


    }

}
