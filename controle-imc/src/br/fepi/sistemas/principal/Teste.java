package br.fepi.sistemas.principal;

import br.fepi.sistemas.model.Pessoa;

import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Norberto", 80.3, 1.67));
        pessoas.add(new Pessoa("José", 50.00, 1.90));

        for (Pessoa p : pessoas) {
            p.imprime();
            System.out.println("IMC: " + p.exibirImc());
            System.out.println("Classificar IMC: " + p.classificarImc());
            System.out.println();
        }
    }
}