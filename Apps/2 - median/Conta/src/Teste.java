public class Teste {
    public static void main(String[] args) {
        //Address address = new Address("1234", "143123412", "cacau", "umuarama", "paraná");

        //System.out.println(address.toString());
        Pessoa pessoa = new Pessoa("Michael", "00011122203");
        //Conta conta = new Conta();
        pessoa.criarConta(1);
        //System.out.println(pessoa.getConta());
        System.out.println(pessoa);
        pessoa.adicionarEndereco(new Address("1234", "143123412", "cacau", "umuarama", "paraná"));
        System.out.println(pessoa.getEnderecos());
        //System.out.println(pessoa);
        //System.out.println(address.toString());

    }
}