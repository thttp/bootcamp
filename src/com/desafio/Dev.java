package com.desafio;

import java.util.ArrayList;
import java.util.List;

public class Dev {
    private String nome;
    private List<Curso> cursosInscritos;
    private List<Mentoria> mentoriasParticipadas;

    public Dev(String nome) {
        this.nome = nome;
        this.cursosInscritos = new ArrayList<>();
        this.mentoriasParticipadas = new ArrayList<>();
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public List<Curso> getCursosInscritos() { return cursosInscritos; }
    public void setCursosInscritos(List<Curso> cursosInscritos) { this.cursosInscritos = cursosInscritos; }
    public List<Mentoria> getMentoriasParticipadas() { return mentoriasParticipadas; }
    public void setMentoriasParticipadas(List<Mentoria> mentoriasParticipadas) { this.mentoriasParticipadas = mentoriasParticipadas; }

    public void inscreverCurso(Curso curso) {
        this.cursosInscritos.add(curso);
    }

    public void participarMentoria(Mentoria mentoria) {
        this.mentoriasParticipadas.add(mentoria);
    }
}

