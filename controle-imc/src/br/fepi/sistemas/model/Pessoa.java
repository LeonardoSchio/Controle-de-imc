package br.fepi.sistemas.model;

public class Pessoa {
    private String nome;
    private double peso;
    private double altura;

    public Pessoa(String nome, double peso, double altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }

    protected String dadosBasicos() {
        return "Nome: " + nome +
                " \nPeso: " + peso +
                " \nAltura: " + altura;
    }

    @Override
    public String toString() {
        return "*Pessoa comum* \n" + dadosBasicos();

    }

    public double exibirImc() {
        return (peso / (altura * altura));
    }

    public String classificarImc() {
        double imc = exibirImc();
        if (imc < 18.5) {
            return "Abaixo do peso!";
        } else if (imc < 25) {
            return "Peso normal!";
        } else if (imc < 30) {
            return "Sobrepeso!";
        } else if (imc < 35) {
            return "Obesidade grau 1!";
        } else if (imc < 40) {
            return "Obesidade grau 2!";
        } else {
            return "Obesidade grau 3!";
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
