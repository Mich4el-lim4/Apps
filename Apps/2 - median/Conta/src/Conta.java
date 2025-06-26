public class Conta {
    private int numero = (int)(Math.random() * 10000) + 1;
    private int agencia = (int)(Math.random() * 100) + 1;
    private double saldo;
    private String tipo;

    public Conta(int tipo) {
        if (tipo == 1){
            this.tipo = "Corrente";
        } else if (tipo == 2){
            this.tipo = "Poupança";
        } else if (tipo == 3){
            this.tipo = "Salário";
        }
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public boolean sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    public int getNumero() {
        return numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return String.format(
                "Conta %s | Agência %s | Tipo: %s | Saldo: R$%.2f",
                numero, agencia, tipo, saldo
        );
    }
}
