package br.com.sistemaInterno.banco;

import br.com.pessoa.banco.Conta;
import br.com.pessoa.banco.Pessoa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Banco banco = new Banco();

        boolean sair = true;
        do {
            System.out.println("1 - Criar conta");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Consultar saldo");
            System.out.println("5 - Sair");
            System.out.print("Digite a opcão: ");
            int option = sc.nextInt();
            System.out.println();

            if (option == 1){
                Pessoa pessoa = new Pessoa();
                Conta conta;

                System.out.print("Digite o nome: ");
                pessoa.setNome(sc.next());

                System.out.print("Digite o cpf: ");
                pessoa.setCpf(sc.next());

                System.out.print("Digite o telefone: ");
                pessoa.setTelefone(sc.next());

                System.out.println();
                banco.pessoas.add(pessoa);
                pessoa.setConta(new Conta());

            } else if (option == 2) {
                System.out.print("Qual o valor para deposito: ");
                banco.deposito(sc.nextDouble());
                System.out.println();
            } else if (option == 3) {
                System.out.print("Quanto deseja sacar: ");
                banco.sacar(sc.nextDouble());
                System.out.println();
            } else if (option == 4) {
                banco.consultarSaldo();
            } else if (option == 5) {
                sair = false;
            } else if (option == 6) {
                banco.buscarPesso();
            }
        } while (sair);

        System.out.println("Fim do Programa");

        sc.close();
    }
}