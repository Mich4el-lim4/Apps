import java.util.HashSet;
import java.util.Set;

public class HangmanGame {
    private String palavraSecreta;
    private Set<Character> letrasAcertadas = new HashSet<>();
    private Set<Character> letrasTentadas = new HashSet<>();
    private final int maxTentativas = 6;
    private int tentativasErradas = 0;

    public void iniciarJogo(String palavra) {
        this.palavraSecreta = palavra;
    }

    public void jogar(char letra) {
        if (letrasTentadas.contains(letra)) {
            System.out.println("Você já tentou essa letra.");
            return;
        }

        letrasTentadas.add(letra);

        if (palavraSecreta.indexOf(letra) >= 0) {
            letrasAcertadas.add(letra);
            System.out.println("Acertou!");
        } else {
            tentativasErradas++;
            System.out.println("Errou! Tentativas restantes: " + (maxTentativas - tentativasErradas));
        }

        mostrarProgresso();
    }

    public void mostrarProgresso() {
        StringBuilder resultado = new StringBuilder();
        for (char c : palavraSecreta.toCharArray()) {
            if (letrasAcertadas.contains(c)) {
                resultado.append(c);
            } else {
                resultado.append("_");
            }
        }
        System.out.println("Palavra: " + resultado);
    }

    public boolean venceu() {
        for (char c : palavraSecreta.toCharArray()) {
            if (!letrasAcertadas.contains(c)) {
                return false;
            }
        }
        return true;
    }

    public boolean jogoFinalizado() {
        return venceu() || tentativasErradas >= maxTentativas;
    }
}
