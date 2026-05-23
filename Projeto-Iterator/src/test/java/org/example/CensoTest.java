package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CensoTest {

    @Test
    void deveContarAlunosAtivosCurso() {
        Setor setor = new Setor(
                new Funcionario("Gustavo", true),
                new Funcionario("Vítor", true),
                new Funcionario("Lucas", false),
                new Funcionario("Felipe", false)
        );
        assertEquals(2, Censo.contarFuncionariosDeFeriasDoSetor(setor));
    }

    @Test
    void deveContarTotalAlunosCurso() {
        Setor setor = new Setor(
                new Funcionario("Gustavo", true),
                new Funcionario("Vítor", false),
                new Funcionario("Lucas", true),
                new Funcionario("Felipe", false)
        );
        assertEquals(4, Censo.contarTotalFuncionariosDoSetor(setor));
    }
}