import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] rgs) {
        Scanner sc = new Scanner(System.in);
        Ui ui = new Ui();
        ListaDeContatos listaDeContatos = new ListaDeContatos();
        Contato contato;

        do {
            ui.menuPrincipal();
            int option = sc.nextInt();

            switch (option) {
                case 1 -> {
                    System.out.print("nome da pessoa: ");
                    String nome = sc.next();
                    System.out.print("número de telefone: ");
                    String telefone = sc.next();
                    listaDeContatos.addContato(nome, telefone);
                    System.out.println();
                }
                case 2 -> {

                }
                case 3 -> {

                }
                case 4 -> {

                }
                case 5 -> {
                    System.out.println("Fim de execução");
                    return;
                }
            }
        }while (true) ;
    }
}
