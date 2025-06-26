import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HangmanGame game = new HangmanGame();

        System.out.print("Digite a palavra secreta: ");
        String palavra = sc.nextLine().toLowerCase();
        game.iniciarJogo(palavra);

        while (!game.jogoFinalizado()) {
            System.out.print("Digite uma letra: ");
            String entrada = sc.nextLine().toLowerCase();

            if (entrada.length() != 1 || !Character.isLetter(entrada.charAt(0))) {
                System.out.println("Digite apenas uma letra válida!");
                continue;
            }

            char letra = entrada.charAt(0);
            game.jogar(letra);
        }

        if (game.venceu()) {
            System.out.println("Parabéns! Você venceu!");
        } else {
            System.out.println("Fim de jogo. A palavra era: " + palavra);
        }
    }
}
