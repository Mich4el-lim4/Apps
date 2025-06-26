public class Categoria {
    private String nome;
    private String tipo; // "Gasto" ou "Ganho"

    public Categoria(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }
}