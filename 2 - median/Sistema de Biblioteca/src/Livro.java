public class Livro {
    private String isbn;
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private String editora;
    private boolean disponivel;

    public Livro(String isbn, String titulo, String autor, int anoPublicacao, String editora) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.editora = editora;
        this.disponivel = true;
    }

    // Getters e Setters
    public String getIsbn() { return isbn; }
    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getAnoPublicacao() { return anoPublicacao; }
    public String getEditora() { return editora; }
    public boolean isDisponivel() { return disponivel; }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    @Override
    public String toString() {
        return String.format(
                "ISBN: %s\nTítulo: %s\nAutor: %s\nAno: %d\nEditora: %s\nStatus: %s",
                isbn, titulo, autor, anoPublicacao, editora,
                disponivel ? "Disponível" : "Emprestado"
        );
    }
}