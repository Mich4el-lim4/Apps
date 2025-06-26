import java.util.ArrayList;

public class HangmanGame {
    String palavraSecreta;
    ArrayList<String> letrasUsadas = new ArrayList<>();
    ArrayList<Character> letrasAcertadas = new ArrayList<>();
    int tentativasErradas = 0;
    final int maxTentativas = 6;

    public boolean comparador(String letra) {
        char letraDigitada = letra.charAt(0);

        // Ignora se já tentou essa letra
        if (letrasUsadas.contains(letra)) {
            System.out.println("Você já tentou essa letra.");
            return false;
        }

        letrasUsadas.add(letra);

        boolean acertou = false;

        for (int i = 0; i < palavraSecreta.length(); i++) {
            if (palavraSecreta.charAt(i) == letraDigitada) {
                // Só adiciona se ainda não acertou antes
                if (!letrasAcertadas.contains(letraDigitada)) {
                    letrasAcertadas.add(letraDigitada);
                }
                acertou = true;
            }
        }

        if (!acertou) {
            tentativasErradas++;
            System.out.println("Letra errada! Tentativas restantes: " + (maxTentativas - tentativasErradas));
        } else {
            System.out.println("Boa! Você acertou a letra!");
        }

        mostrarPalavraParcial();

        return palavraCompleta();
    }

    public void mostrarPalavraParcial() {
        String palavraParcial = "";
        for (int i = 0; i < palavraSecreta.length(); i++) {
            char letra = palavraSecreta.charAt(i);
            if (letrasAcertadas.contains(letra)) {
                palavraParcial += letra;
            } else {
                palavraParcial += "_";
            }
        }
        System.out.println("Palavra: " + palavraParcial);
        System.out.println("Letras usadas: " + letrasUsadas);
    }

    public boolean palavraCompleta() {
        for (int i = 0; i < palavraSecreta.length(); i++) {
            if (!letrasAcertadas.contains(palavraSecreta.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public boolean atingiuLimiteErros() {
        return tentativasErradas >= maxTentativas;
    }
}
