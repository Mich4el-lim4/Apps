import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Comtatos> contatos = new ArrayList<>();

        do {
            System.out.println("1 - Adicionar contatos");
            System.out.println("2 - Listar todos os contatos");
            System.out.println("3 - Buscar contatos por nome");
            System.out.println("4 - Remover contatos");
            System.out.println("5 - Sair do programa");
            System.out.print("Digite a opcão: ");
            int option = sc.nextInt();
            System.out.println();

            if (option == 1){
                Comtatos novoContact = new Comtatos();

                System.out.print("Digite o nome: ");
                novoContact.nome = sc.next();

                System.out.print("Digite o telefone: ");
                novoContact.numero = sc.next();

                System.out.print("Digite o email: ");
                novoContact.email = sc.next();

                System.out.println();
                contatos.add(novoContact);

            } else if (option == 2){
                if (contatos.isEmpty()){
                    System.out.println("📭 lista vazia!");
                    System.out.println();
                } else {
                    for (int i = 0; i < contatos.size(); i++) {
                        System.out.println(contatos.get(i));
                        System.out.println();
                    }
                }
            } else if (option == 3){
                if (contatos.isEmpty()){
                    System.out.println("📭 lista vazia!");
                    System.out.println();
                } else {
                    System.out.print("Digite o nome: ");
                    String nomeProcurado = sc.next();
                    boolean encontrado = false;
                    for (int i = 0; i < contatos.size(); i++) {
                        if (contatos.get(i).nome.equals(nomeProcurado)){
                            System.out.println(contatos.get(i));
                            System.out.println();
                            encontrado = true;
                        }
                    }
                }
            } else if (option == 4) {
                if (contatos.isEmpty()){
                    System.out.println("📭 lista vazia!");
                    System.out.println();
                } else {
                    System.out.print("Voce tem " + contatos.size() + " contatos, qual voce gostaria de remover: ");
                    int remover = sc.nextInt();
                    contatos.remove(remover);
                    System.out.println("Contato removido");
                    System.out.println();
                }
            } else if (option == 5) {
                System.out.println("Fim do programa");
                break;
            }
        } while (true);
    }
}