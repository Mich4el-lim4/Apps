import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();

        int option;
        double valor = 0;
        do {
            menu.mainMenu();
            option = sc.nextInt();
                if (option == 5){
                    System.out.println("Fim de execução");
                    break;
                }
            System.out.println();
            menu.secondaryMenu();
            double value = sc.nextDouble();
            menu.menuFinalResult(option, value);
        } while (true);
    }
}
