public class Main {

    public static void main(String[] args){
        Ui userInterface = new Ui();
        GerenciadorDeNotas notas = new GerenciadorDeNotas();

        do {
            int option = userInterface.ui();

            switch (option) {
                case 1 -> {
                    String nota = userInterface.uiDigiteNota();
                    notas.addNota(nota);
                }
                case 2 -> {
                    notas.mostrarNotas();
                }
                case 3 -> {
                    notas.mostrarNotas();
                    int notaEscolhida = userInterface.uiEscolherNota() - 1;
                    String notaEditada = userInterface.uiEditarNota();
                    notas.notaEditada(notaEscolhida, notaEditada);
                }
                case 4 -> {
                    notas.mostrarNotas();
                    int indiceExcluir = userInterface.uiExcluirNota() - 1;
                    notas.excluir(indiceExcluir);
                    notas.mostrarNotas();
                }
                case 5 -> {
                    System.out.println("Fim de execução");
                    return;
                }
            }

        } while (true);

    }

}
