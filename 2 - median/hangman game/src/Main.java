import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HangmanGame hangmanGame = new HangmanGame();

        System.out.print("Digite a palavra: ");
        hangmanGame.palavraSecreta = sc.next();

        do {
            System.out.print("Digite uma letra: ");
            String letraDigitada = sc.next();
            hangmanGame.comparador(letraDigitada);
        }while (true);

    }
}
