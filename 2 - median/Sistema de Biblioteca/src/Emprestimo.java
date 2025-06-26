import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Emprestimo {
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucaoPrevista;
    private LocalDate dataDevolucaoReal;
    private String status;
    private User usuario;
    private Livro livro;

    public Emprestimo(User usuario, Livro livro) {
        this.usuario = usuario;
        this.livro = livro;
        this.dataEmprestimo = LocalDate.now();
        this.dataDevolucaoPrevista = dataEmprestimo.plusDays(14); // 2 semanas de prazo
        this.status = "ATIVO";
    }

    public void finalizarEmprestimo() {
        this.dataDevolucaoReal = LocalDate.now();
        this.status = "FINALIZADO";
        this.livro.setDisponivel(true);
    }

    // Getters
    public LocalDate getDataEmprestimo() { return dataEmprestimo; }
    public LocalDate getDataDevolucaoPrevista() { return dataDevolucaoPrevista; }
    public LocalDate getDataDevolucaoReal() { return dataDevolucaoReal; }
    public String getStatus() { return status; }
    public User getUsuario() { return usuario; }
    public Livro getLivro() { return livro; }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String devolucaoReal = dataDevolucaoReal != null ?
                dataDevolucaoReal.format(formatter) : "Não devolvido";

        return String.format(
                "Empréstimo:\nUsuário: %s\nLivro: %s\nData Empréstimo: %s\n" +
                        "Data Devolução Prevista: %s\nData Devolução Real: %s\nStatus: %s",
                usuario.getNome(), livro.getTitulo(), dataEmprestimo.format(formatter),
                dataDevolucaoPrevista.format(formatter), devolucaoReal, status
        );
    }
}
