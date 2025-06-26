import java.util.ArrayList;

public class GerenciadorDeNotas {
    ArrayList<String> nota = new ArrayList<>();

    public void addNota(String novaNota){
        nota.add(novaNota);
    }

    public void mostrarNotas(){
        if (nota.isEmpty()){
            System.out.println();
            System.out.println("Não a notas");
            System.out.println();
            return;
        }
        for (int i = 0; i < nota.size(); i++) {
            System.out.println("Nota - " + (i + 1) + " : " + nota.get(i));
        }
        System.out.println();
    }

    public void notaEditada(int indice, String notaEditada){
        nota.set(indice, notaEditada);
    }

    public void excluir(int indice){
        nota.remove(indice);
        System.out.println("Nota removida");
    }

}
