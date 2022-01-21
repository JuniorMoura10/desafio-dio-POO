package br.com.dio.desafio;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("descrição do Curso de Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("\nCurso de JS");
        curso2.setDescricao("descrição do Curso de JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("\nMentoria de Java");
        mentoria.setData(LocalDate.now());
        mentoria.setDescricao("Mentoria sobre Java");

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer\n");
        bootcamp.setDescricao("Curso de Java Developer\n");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Júnior");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Júnior: " + dev1.getConteudosIncritos());
        dev1.progredir();
        dev1.progredir();
        System.out.println("Conteúdos Inscritos Júnior: " + dev1.getConteudosIncritos());
        System.out.println("Conteúdos Concluídos Júnior: " + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcularTotalXp());

        System.out.println("\t----------\t");

        Dev dev2 = new Dev();
        dev2.setNome("Camila");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila: " + dev2.getConteudosIncritos());
        dev2.progredir();
        System.out.println("Conteúdos Inscritos Camila: " + dev2.getConteudosIncritos());
        System.out.println("Conteúdos Concluídos Camila: " + dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularTotalXp());
    }
}
