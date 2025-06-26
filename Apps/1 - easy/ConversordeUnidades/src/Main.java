import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("qual tipo de conversão");
        System.out.println("Temperatura(1), Distância(2) ou Peso(3)");
        int tipoDeConversao = sc.nextInt();

        if (tipoDeConversao == 1) {

            System.out.println();
        } else if (tipoDeConversao == 2){

            System.out.println();
        } else if (tipoDeConversao == 3){

            System.out.println();
        }

        sc.close();
    }
}