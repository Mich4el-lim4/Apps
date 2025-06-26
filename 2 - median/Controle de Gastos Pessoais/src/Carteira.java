import java.util.ArrayList;
import java.util.List;

public class Carteira {
    private double saldoAtual;
    private List<Transacao> transacoes; // Agora armazena VÁRIAS transações

    public Carteira() {
        this.saldoAtual = 0.0;
        this.transacoes = new ArrayList<>();
    }

    public void adicionarTransacao(Transacao transacao) {
        this.transacoes.add(transacao);
        this.saldoAtual += transacao.getValor(); // Atualiza o saldo
    }
}