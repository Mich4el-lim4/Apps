import java.util.ArrayList;
import java.util.Scanner;

public class NumberGenerator {
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> numeros = new ArrayList<>();

    int numero = (int)(Math.random() * 100) + 1;
    int tentativas = 1;

    public void game(){
        do {
            System.out.print("Digite um numero: ");
            int numeroChute = sc.nextInt();
            numeros.add(numeroChute);

            if (numeroChute != numero){
                if (numeroChute < numero){
                    System.out.println("O numero aliatorio é maior (>) que " + numeroChute);
                } else if (numeroChute > numero) {
                    System.out.println("O numero aliatorio é menor (<) que " + numeroChute);
                }
                tentativas ++;
            } else if (numeroChute == numero){
                System.out.println();
                System.out.println("Voce acertou o numero aliatorio com " + tentativas + " tentativas");
                System.out.println("O numero aliatorio é: " + numero);
                break;
            }
            tentativas();
        } while (true);
    }

    public void tentativas(){
        System.out.println("Chutes " + numeros);
    }

    public void randomNumber(){
        System.out.println(numero);
    }
}
