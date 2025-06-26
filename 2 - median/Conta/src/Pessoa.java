import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
    private String cpf;
    private ArrayList<Address> enderecos;
    private Conta conta;

    public Pessoa(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
        this.enderecos = new ArrayList<>();
    }

    public void adicionarEndereco(Address endereco) {
        this.enderecos.add(endereco);
    }

    public void criarConta(int tipo){
        if (this.conta == null){
            this.conta = new Conta(tipo);
        }
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public List<Address> getEnderecos() {
        return new ArrayList<>(enderecos);
    }

    public Conta getConta() {
        return conta;
    }

    @Override
    public String toString() {
        return String.format("Dados pessoais \nNome: %s | CPF: %S | Endereço: %S \nDados Bancarios \nConta: %s\n", nome, cpf, enderecos, conta);
    }
}
