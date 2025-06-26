import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HangmanGame hangmanGame = new HangmanGame();

        // Solicita a palavra secreta
        System.out.print("Digite a palavra: ");
        hangmanGame.palavraSecreta = sc.next().toLowerCase();  // converte para minúsculas

        // Laço principal do jogo
        while (true) {
            System.out.print("Digite uma letra: ");
            String letraDigitada = sc.next().toLowerCase();
            hangmanGame.comparador(letraDigitada);
        }
    }
}
