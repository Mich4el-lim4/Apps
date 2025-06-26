package br.com.sistemaInterno.banco;

import br.com.pessoa.banco.Conta;
import br.com.pessoa.banco.Pessoa;

import java.util.ArrayList;

public class Banco {
    ArrayList<Pessoa> pessoas = new ArrayList<>();
    Conta conta = new Conta();

    public void buscarPesso(){
        for (Pessoa p : pessoas) {
            System.out.println(p.toString());
        }
    }

    public void deposito(double valor){
        conta.setSaldo(conta.getSaldo() + valor);
    }

    public void consultarSaldo(){
        System.out.println("Saldo atual: " + conta.getSaldo());
        System.out.println();
    }

    public void sacar(double valorSaque){
        conta.setSaldo(conta.getSaldo() - valorSaque);
        consultarSaldo();
    }

}

