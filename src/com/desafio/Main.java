package com.desafio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Bootcamp bootcamp = new Bootcamp("Java Developer Bootcamp", "Bootcamp para se tornar um desenvolvedor Java.");

        Curso cursoJava = new Curso("Curso de Java", 60);
        Mentoria mentoriaJava = new Mentoria("Mentoria de Java", LocalDate.now());

        bootcamp.adicionarCurso(cursoJava);
        bootcamp.adicionarMentoria(mentoriaJava);

        Dev dev1 = new Dev("João");
        dev1.inscreverCurso(cursoJava);
        dev1.participarMentoria(mentoriaJava);

        bootcamp.inscreverDev(dev1);

        System.out.println("Bootcamp: " + bootcamp.getNome() + " - " + bootcamp.getDescricao());
        System.out.println("Cursos oferecidos:");
        for (Curso curso : bootcamp.getCursos()) {
            System.out.println("- " + curso.getNome() + " com carga horária de " + curso.getCargaHoraria() + " horas.");
        }
        System.out.println("Mentorias oferecidas:");
        for (Mentoria mentoria : bootcamp.getMentorias()) {
            System.out.println("- " + mentoria.getAssunto() + " na data " + mentoria.getData());
        }
        System.out.println("Devs inscritos:");
        for (Dev dev : bootcamp.getDevs()) {
            System.out.println("- " + dev.getNome());
        }
    }
}
