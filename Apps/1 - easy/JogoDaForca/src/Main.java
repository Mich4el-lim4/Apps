import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Configuração inicial do jogo
        String palavraSecreta = "JAVA";
        char[] palavraMascarada = new char[palavraSecreta.length()];
        ArrayList<Character> letrasTentadas = new ArrayList<>();
        int tentativasRestantes = 6;
        boolean jogoTerminado = false;

        // Inicializa a palavra mascarada com underlines
        for (int i = 0; i < palavraMascarada.length; i++) {
            palavraMascarada[i] = '_';
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Jogo da Forca!");

        // Loop principal do jogo
        while (!jogoTerminado) {
            // Exibe o estado atual do jogo
            System.out.println("\nPalavra: " + String.valueOf(palavraMascarada));
            System.out.println("Letras tentadas: " + letrasTentadas);
            System.out.println("Tentativas restantes: " + tentativasRestantes);

            // Solicita uma letra ao jogador
            System.out.print("Digite uma letra: ");
            char letra = scanner.next().toUpperCase().charAt(0);

            // Verifica se a letra já foi tentada
            if (letrasTentadas.contains(letra)) {
                System.out.println("Você já tentou esta letra!");
                continue;
            }

            // Adiciona a letra às tentativas
            letrasTentadas.add(letra);

            // Verifica se a letra está na palavra secreta
            boolean letraEncontrada = false;
            for (int i = 0; i < palavraSecreta.length(); i++) {
                if (palavraSecreta.charAt(i) == letra) {
                    palavraMascarada[i] = letra;
                    letraEncontrada = true;
                }
            }

            // Atualiza o jogo conforme o resultado
            if (!letraEncontrada) {
                tentativasRestantes--;
                System.out.println("Letra não encontrada!");

                // Verifica se o jogador perdeu
                if (tentativasRestantes == 0) {
                    System.out.println("\nVocê perdeu! A palavra era: " + palavraSecreta);
                    jogoTerminado = true;
                }
            } else {
                System.out.println("Letra encontrada!");

                // Verifica se o jogador ganhou
                if (String.valueOf(palavraMascarada).equals(palavraSecreta)) {
                    System.out.println("\nParabéns! Você acertou a palavra: " + palavraSecreta);
                    jogoTerminado = true;
                }
            }
        }
        scanner.close();
    }
}