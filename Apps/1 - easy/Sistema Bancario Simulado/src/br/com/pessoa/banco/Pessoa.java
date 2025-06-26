package br.com.pessoa.banco;

public class Pessoa {
    private String nome;
    private String cpf;
    private String telefone;

    private Endereco endereco;
    private Conta conta;

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int conta(){
        return this.conta.getNumero();
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome = '" + nome + '\'' +
                ", cpf = '" + cpf + '\'' +
                ", telefone = '" + telefone + '\'' +
                ", endereco = " + (endereco != null ? endereco : "null") +
                ", conta = " + (conta != null ? conta : "null") +
                '}';
    }
}
