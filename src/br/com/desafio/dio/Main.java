package br.com.desafio.dio;

import br.com.desafio.dio.dominio.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devFatima = new Dev();
        devFatima.setNome("Fatima");
        devFatima.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Fatima:" + devFatima.getConteudosInscritos());
        devFatima.progredir();
        devFatima.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devFatima.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + devFatima.getConteudosConcluidos());
        System.out.println("XP:" + devFatima.calcularTotalXp());

        System.out.println("-------");

        Dev devPedroZeferino = new Dev();
        devPedroZeferino.setNome("Pedro Zeferino");
        devPedroZeferino.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Pedro Zeferino:" + devPedroZeferino.getConteudosInscritos());
        devPedroZeferino.progredir();
        devPedroZeferino.progredir();
        devPedroZeferino.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Pedro Zeferino:" + devPedroZeferino.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + devPedroZeferino.getConteudosConcluidos());
        System.out.println("XP:" + devPedroZeferino.calcularTotalXp());

    }

}
