package org.example;

public class Funcionario {

    private String nome;
    private boolean ferias;

    public Funcionario(String nome, boolean ferias) {
        this.nome = nome;
        this.ferias = ferias;
    }

    public boolean estaDeFerias() {
        return ferias;
    }
}
