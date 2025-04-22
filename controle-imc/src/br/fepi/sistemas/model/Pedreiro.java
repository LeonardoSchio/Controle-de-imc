package br.fepi.sistemas.model;

public class Pedreiro extends Pessoa {
    public Pedreiro(String nome, double peso, double altura) {
        super(nome, peso, altura);
    }

    @Override
    public String toString() {
        return "*Pedreiro* \n" + super.toString();
    }
}
