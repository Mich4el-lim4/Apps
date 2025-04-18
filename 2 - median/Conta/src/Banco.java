import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Pessoa pessoa = null;

        boolean sair = true;
        do {
            System.out.println("1 - Cadastrar pessoa");
            System.out.println("2 - Mestrar dados da pessoa");
            System.out.println("3 - Depositar");
            System.out.println("4 - Sacar");
            System.out.println("5 - Encerrar");
            System.out.print("Digite a opção: ");
            int option = sc.nextInt();
            System.out.println();

            if (option == 1){
                System.out.print("Digite seu nome: ");
                String nome = sc.next();
                System.out.print("Digite seu CPF: ");
                String cpf = sc.next();
                System.out.println();

                pessoa = new Pessoa(nome, cpf);
            } else if (option == 2) {
                if (pessoa != null){
                    System.out.println(pessoa);
                } else {
                    System.out.println("Não existe pessoas cadastradas");
                    System.out.println();
                }
            } else if (option == 3) {
                Conta conta = pessoa.getConta();
                if (conta == null){
                    System.out.println("Conta não existe, deseja criar uma conta?");
                    System.out.println("1 - sim");
                    System.out.println("2 - sir");
                    System.out.print("Digite a opção: ");
                    int optionConta = sc.nextInt();
                    System.out.println();

                    if (optionConta == 1){
                        System.out.println("Qual tipo de conta");
                        System.out.println("1 - corrente");
                        System.out.println("2 - poupança");
                        System.out.println("3 - salário");
                        System.out.print("Digite a pção: ");
                        pessoa.criarConta(sc.nextInt());
                        System.out.println("Conta criada");
                    }
                } else {
                    System.out.print("Qual o valor a ser depositado: ");
                    pessoa.getConta().depositar(sc.nextDouble());
                }
                System.out.println();
            } else if (option == 4) {
                System.out.print("Quanto deseja sacar: ");
                boolean saldo = pessoa.getConta().sacar(sc.nextDouble());

                if (saldo == true){
                    System.out.println(pessoa.getConta());
                } else if (saldo == false){
                    System.out.println("Valor acima do que tem na conta");
                }
            } else if (option == 5) {
                sair = false;
            }

        } while (sair);

        System.out.println("Fim do programa");
    }
}
