import java.util.ArrayList;

public class HangmanGame {
    String palavraSecreta;

    ArrayList<String> letrasUsadas = new ArrayList<>();
    ArrayList<Character> letrasAcertadas = new ArrayList<>();

    public void comparador(String letra){
        letrasUsadas.add(letra);
        char letraDigitada = letra.charAt(0);

        // Verifica se a letra está na palavra
        for (int i = 0; i < palavraSecreta.length(); i++) {
            if (palavraSecreta.charAt(i) == letraDigitada){
                letrasAcertadas.add(letraDigitada);
            }
        }

        // Mostra letras já digitadas
        System.out.println("Letras usadas: " + letrasUsadas);

        // Mostra progresso da palavra
        String palavraParcial = "";
        for (int i = 0; i < palavraSecreta.length(); i++) {
            char letraDaPalavra = palavraSecreta.charAt(i);
            if (letrasAcertadas.contains(letraDaPalavra)) {
                palavraParcial += letraDaPalavra;
            } else {
                palavraParcial += "_";
            }
        }

        System.out.println("Palavra: " + palavraParcial);
    }
}
