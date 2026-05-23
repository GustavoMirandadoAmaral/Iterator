package org.example;

import java.util.Iterator;

public class Censo {

    public static Integer contarFuncionariosDeFeriasDoSetor(Setor setor) {
        int quantidade = 0;
        for (Funcionario funcionario : setor) {
            if (funcionario.estaDeFerias()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalFuncionariosDoSetor(Setor setor) {
        int quantidade = 0;
        for (Iterator a = setor.iterator(); a.hasNext(); ) {
            quantidade++;
            a.next();
        }
        return quantidade;
    }
}
