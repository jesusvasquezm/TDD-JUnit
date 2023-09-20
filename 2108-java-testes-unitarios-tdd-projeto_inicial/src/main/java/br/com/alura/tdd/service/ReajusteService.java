package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Funcionario;

import java.math.BigDecimal;

public class ReajusteService {
    public void fazerReajuste(Funcionario funcionario, Desempenho desempenho) {
            BigDecimal percentual = desempenho.ajusteDesempenho();
            BigDecimal reajuste = funcionario.getSalario().multiply(percentual);
            funcionario.reajustarSalario(reajuste);
    }
}
