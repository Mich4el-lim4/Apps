import java.util.ArrayList;

public class User {
    private String id;
    private String nome;
    private String email;
    private ArrayList<Emprestimo> emprestimosAtivos;

    public User(String id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.emprestimosAtivos = new ArrayList<>();
    }

    // Getters
    public String getId() { return id; }
    public String getNome() { return nome; }
    public String getEmail() { return email; }
    public ArrayList<Emprestimo> getEmprestimosAtivos() { return emprestimosAtivos; }

    public void emprestarLivro(Livro livro) {
        if (livro.isDisponivel()) {
            Emprestimo novoEmprestimo = new Emprestimo(this, livro);
            emprestimosAtivos.add(novoEmprestimo);
            livro.setDisponivel(false);
        }
    }

    public void devolverLivro(Livro livro) {
        for (Emprestimo emp : emprestimosAtivos) {
            if (emp.getLivro().equals(livro)) {
                emp.finalizarEmprestimo();
                emprestimosAtivos.remove(emp);
                break;
            }
        }
    }

    @Override
    public String toString() {
        return String.format(
                "ID: %s\nNome: %s\nEmail: %s\nEmpréstimos ativos: %d",
                id, nome, email, emprestimosAtivos.size()
        );
    }
}