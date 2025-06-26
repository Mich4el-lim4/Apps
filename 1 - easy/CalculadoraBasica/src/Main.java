import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int primeiroNumero = scanner.nextInt();
        System.out.print("Qual operação deseja fazer: ");
        String operacao = scanner.next();
        System.out.print("Digite o primeiro numero: ");
        int segundoNumero = scanner.nextInt();

        if (operacao.equals("+")) {
            int resultado = primeiroNumero + segundoNumero;
            System.out.println(resultado);
        } else if (operacao.equals("-")){
            int resultado = primeiroNumero - segundoNumero;
            System.out.println(resultado);
        } else if (operacao.equals("/")){
            int resultado = primeiroNumero / segundoNumero;
            System.out.println(resultado);
        } else if (operacao.equals("*")){
            int resultado = primeiroNumero * segundoNumero;
            System.out.println(resultado);
        }

        scanner.close();
    }
}