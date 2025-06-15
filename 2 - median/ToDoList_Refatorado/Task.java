public class Task {
    private String descricao;
    private boolean concluida;

    public Task(String descricao) {
        this.descricao = descricao;
        this.concluida = false;
    }

    public void marcarComoConcluida() {
        this.concluida = true;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    @Override
    public String toString() {
        String status = concluida ? "[✔]" : "[ ]";
        return status + " " + descricao;
    }
}
