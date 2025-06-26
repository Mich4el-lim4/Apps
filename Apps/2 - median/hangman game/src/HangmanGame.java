import java.util.ArrayList;

public class HangmanGame {
    String palavraSecreta;

    ArrayList<String> letrasUsadas = new ArrayList<>();
    ArrayList<Character> letrasAcertadas = new ArrayList<>();

    public void comparador(String letra){
        letrasUsadas.add(letra);
        char letraDigitada = letra.charAt(0);

        for (int i = 0; i < palavraSecreta.length(); i++) {

            if (palavraSecreta.charAt(i) == letraDigitada){
                letrasAcertadas.add(letraDigitada);
            }
        }

        System.out.println(letrasUsadas);

        String palavraParcial = "";
        for (int i = 0; i < palavraSecreta.length(); i++) {
            char letraDaPalavraSecreta = palavraSecreta.charAt(i);
            if (letrasAcertadas.contains(letraDaPalavraSecreta)) {
                palavraParcial += letraDaPalavraSecreta;
            } else {
                palavraParcial += "_";
            }
        }
        System.out.println("Palavra: " + palavraParcial);

    }
}
