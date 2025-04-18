package br.com.sistemaInterno.banco;

import br.com.pessoa.banco.Conta;
import br.com.pessoa.banco.Pessoa;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Banco banco = new Banco();

        boolean sair = false;
        while (!sair) {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Criar conta");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Consultar saldo");
            System.out.println("5 - Listar clientes");
            System.out.println("6 - Sair");
            System.out.print("Escolha uma opção: ");

            int option = sc.nextInt();
            sc.nextLine(); // Limpar buffer

            switch (option) {
                case 1:
                    System.out.print("\nNome: ");
                    String nome = sc.nextLine();

                    System.out.print("CPF: ");
                    String cpf = sc.nextLine();

                    System.out.print("Telefone: ");
                    String telefone = sc.nextLine();

                    Pessoa novaPessoa = new Pessoa();
                    novaPessoa.setNome(nome);
                    novaPessoa.setCpf(cpf);
                    novaPessoa.setTelefone(telefone);
                    novaPessoa.setConta(new Conta());

                    banco.pessoas.add(novaPessoa);
                    System.out.println("\nConta criada com sucesso! Número: " +
                            novaPessoa.getConta().getNumero());
                    break;

                case 2:
                    System.out.print("\nCPF do titular: ");
                    String cpfDeposito = sc.nextLine();
                    System.out.print("Valor do depósito: ");
                    banco.deposito(cpfDeposito, sc.nextDouble());
                    sc.nextLine(); // Limpar buffer
                    break;

                case 3:
                    System.out.print("\nCPF do titular: ");
                    String cpfSaque = sc.nextLine();
                    System.out.print("Valor do saque: ");
                    banco.sacar(cpfSaque, sc.nextDouble());
                    sc.nextLine(); // Limpar buffer
                    break;

                case 4:
                    System.out.print("\nCPF do titular: ");
                    banco.consultarSaldo(sc.nextLine());
                    break;

                case 5:
                    banco.buscarPessoas();
                    break;

                case 6:
                    sair = true;
                    break;

                default:
                    System.out.println("\nOpção inválida!");
            }
        }

        System.out.println("\nPrograma encerrado.");
        sc.close();
    }
}