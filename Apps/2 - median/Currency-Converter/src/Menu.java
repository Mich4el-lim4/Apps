public class Menu {
    Converter converter = new Converter();

    public void mainMenu(){
        System.out.println("Bem-vindo ao conversor!");
        System.out.println("1 - Real para Dólar");
        System.out.println("2 - Dólar para Real");
        System.out.println("3 - Real para Euro");
        System.out.println("4 - Euro para Real");
        System.out.println("5 - Sair");
        System.out.print("Escolha uma opção: ");
    }

    public void secondaryMenu(){
        System.out.print("Digite o valor a ser convertido: ");
    }

    public void menuFinalResult(int option, double valor){

        converter.converter(option, valor);
        String statusRS = valor > 1 ? "reais" : valor == 1 ? "real" : valor < 1 ? "centavos" : "";
        String statusUSD = valor > 1 ? "dolares" : valor == 1 ? "dolar" : valor < 1 ? "centavos de dolar" : "";
        String statusEUR = valor > 1 ? "euros" : valor == 1 ? "euro" : valor < 1 ? "centavos de euro" : "";

        switch (option) {
            case 1 -> {
                System.out.println(valor + " " + statusRS + " equivalem a " + converter.getConvertido() + " " + statusUSD);
                System.out.println();
            }
            case 2 -> {
                System.out.println(valor + " " + statusUSD + " equivalem a " + converter.getConvertido() + " " + statusRS);
                System.out.println();
            }
            case 3 -> {
                System.out.println(valor + " " + statusRS + " equivalem a " + converter.getConvertido() + " " + statusEUR);
                System.out.println();
            }
            case 4 -> {
                System.out.println(valor + " " + statusEUR + " equivalem a " + converter.getConvertido() + " " + statusRS);
                System.out.println();
            }
        }
    }
}
