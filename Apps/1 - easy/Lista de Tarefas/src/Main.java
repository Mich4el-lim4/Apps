import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> tarefas = new ArrayList<>();

        boolean sair = true;
        do{
           ;
            System.out.println("1 - Adicionar tarefas.");
            System.out.println("2 - Listar todas as tarefas.");
            System.out.println("3 - Remover tarefas.");
            System.out.println("4 - Sair do programa.");
            System.out.print("Digite a opção: ");
            int option = sc.nextInt();
            System.out.println();

            if (option == 1){
                System.out.print("Nova tarefa: ");
                String novaTarefa = sc.next();
                tarefas.add(novaTarefa);
                System.out.println();
            } if (option == 2){
                System.out.println(tarefas);
                System.out.println();
            } if (option == 3){
                System.out.print("Qual tarefa deseja remover: ");
                int remover = sc.nextInt();
                tarefas.remove(remover);
            }else if (option == 4) {
                sair = false;
            }
        }while (sair);

        System.out.println("Fim do programa");

        sc.close();
    }
}