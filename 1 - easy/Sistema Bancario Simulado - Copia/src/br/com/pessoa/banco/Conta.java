package br.com.pessoa.banco;

import java.util.Random;

public class Conta {
    private int numero;
    private double saldo;

    public Conta() {
        this.numero = gerarNumeroConta();
        this.saldo = 0.0;
    }

    private int gerarNumeroConta() {
        Random rand = new Random();
        return 10000 + rand.nextInt(90000); // Números de 10000 a 99999
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}