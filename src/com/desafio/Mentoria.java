package com.desafio;

import java.time.LocalDate;

public class Mentoria {
    private String assunto;
    private LocalDate data;

    public Mentoria(String assunto, LocalDate data) {
        this.assunto = assunto;
        this.data = data;
    }

    public String getAssunto() { return assunto; }
    public void setAssunto(String assunto) { this.assunto = assunto; }
    public LocalDate getData() { return data; }
    public void setData(LocalDate data) { this.data = data; }
}

