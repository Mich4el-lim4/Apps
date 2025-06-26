import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HangmanGame hangmanGame = new HangmanGame();

        System.out.print("Digite a palavra secreta: ");
        hangmanGame.palavraSecreta = sc.next().toLowerCase();

        while (true) {
            System.out.print("Digite uma letra: ");
            String letraDigitada = sc.next().toLowerCase();

            // Validação básica
            if (letraDigitada.length() != 1 || !Character.isLetter(letraDigitada.charAt(0))) {
                System.out.println("Digite apenas uma letra válida.");
                continue;
            }

            boolean venceu = hangmanGame.comparador(letraDigitada);

            if (venceu) {
                System.out.println("Parabéns! Você acertou a palavra completa!");
                break;
            }

            if (hangmanGame.atingiuLimiteErros()) {
                System.out.println("Fim de jogo! Você perdeu.");
                System.out.println("A palavra era: " + hangmanGame.palavraSecreta);
                break;
            }
        }

        sc.close();
    }
}
