public class Address {
    private String estado;
    private String cidade;
    private String bairro;
    private String cep;
    private String numero;

    public Address(String numero, String cep, String bairro, String cidade, String estado) {
        this.numero = numero;
        this.cep = cep;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public String getCidade() {
        return cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCep() {
        return cep;
    }

    public String getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return String.format("Endereço" +
                        "\nEstado: %s" +
                        "\nCidade: %s" +
                        "\nBairro: %s" +
                        "\nCEP: %s" +
                        "\nNúmero: %s",
                        estado, cidade,bairro,cep,numero);
    }
}
