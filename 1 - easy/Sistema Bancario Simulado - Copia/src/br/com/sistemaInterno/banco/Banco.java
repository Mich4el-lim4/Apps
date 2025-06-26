package br.com.sistemaInterno.banco;

import br.com.pessoa.banco.Pessoa;
import java.util.ArrayList;

public class Banco {
    ArrayList<Pessoa> pessoas = new ArrayList<>();

    public void buscarPessoas() {
        for (Pessoa p : pessoas) {
            System.out.println(p.toString());
        }
    }

    // Encontra pessoa por CPF
    private Pessoa encontrarPessoa(String cpf) {
        for (Pessoa p : pessoas) {
            if (p.getCpf().equals(cpf)) {
                return p;
            }
        }
        return null;
    }

    public void deposito(String cpf, double valor) {
        Pessoa pessoa = encontrarPessoa(cpf);
        if (pessoa != null && pessoa.getConta() != null) {
            pessoa.getConta().setSaldo(pessoa.getConta().getSaldo() + valor);
            System.out.println("Depósito realizado com sucesso!");
        } else {
            System.out.println("Pessoa ou conta não encontrada!");
        }
    }

    public void sacar(String cpf, double valor) {
        Pessoa pessoa = encontrarPessoa(cpf);
        if (pessoa != null && pessoa.getConta() != null) {
            if (pessoa.getConta().getSaldo() >= valor) {
                pessoa.getConta().setSaldo(pessoa.getConta().getSaldo() - valor);
                System.out.println("Saque realizado com sucesso!");
            } else {
                System.out.println("Saldo insuficiente!");
            }
        } else {
            System.out.println("Pessoa ou conta não encontrada!");
        }
    }

    public void consultarSaldo(String cpf) {
        Pessoa pessoa = encontrarPessoa(cpf);
        if (pessoa != null && pessoa.getConta() != null) {
            System.out.println("Saldo atual: " + pessoa.getConta().getSaldo());
        } else {
            System.out.println("Pessoa ou conta não encontrada!");
        }
    }
}

