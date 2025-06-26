public class Usuario {
    private String nome;
    private String dataNascimento;
    private Carteira carteira; // Agora o usuário tem uma Carteira

    public Usuario(String nome, String dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.carteira = new Carteira(); // Cria uma carteira vazia para o usuário
    }

    // Getter para a carteira (permite acessar transações)
    public Carteira getCarteira() {
        return carteira;
    }
}