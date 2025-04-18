package br.fepi.sistemas.principal;

import br.fepi.sistemas.model.Pessoa;

import java.util.ArrayList;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        while (true) {
            System.out.println("Digite o seu nome: (ou 'sair' para encerrar): ");
            String nome = scanner.nextLine();

            if (nome.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.println("Digite o peso: ");
            double peso = scanner.nextDouble();

            System.out.println("Digite a sua altura: ");
            double altura = scanner.nextDouble();
            scanner.nextLine();

            Pessoa p = new Pessoa(nome, peso, altura);
            pessoas.add(p);
            System.out.println("Pessoa cadastrada com sucesso!");
        }
        scanner.close();

        System.out.println("\n === Pessoas cadastradas ===");
        for (Pessoa p : pessoas) {
            p.imprime();
            System.out.println("IMC: " + p.exibirImc());
            System.out.println("Classificar IMC: " + p.classificarImc());
            System.out.println();
        }
    }
}