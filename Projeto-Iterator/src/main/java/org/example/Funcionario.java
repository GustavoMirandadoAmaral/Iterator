package org.example;

public class Funcionario {

    private String nome;
    private boolean ferias;

    public Funcionario(String nome, boolean ferias) {
        this.nome = nome;
        this.ferias = ferias;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isFerias() {
        return ferias;
    }

    public void setFerias(boolean ferias) {
        this.ferias = ferias;
    }

    public boolean estaDeFerias() {
        return ferias;
    }
}
