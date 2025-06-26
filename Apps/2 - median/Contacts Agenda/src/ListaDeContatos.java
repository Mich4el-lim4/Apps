import java.util.ArrayList;

public class ListaDeContatos {
    ArrayList<Contato> listaDecontatos = new ArrayList<>();

    public void addContato(String nome, String telefone){
        listaDecontatos.add(new Contato(nome, telefone));
    }


}
