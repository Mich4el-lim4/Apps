import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Usuario> usuarios = new ArrayList<>();
        ArrayList<Categoria> categorias = new ArrayList<>();
        Carteira carteira = new Carteira();

        // Categorias padrão
        categorias.add(new Categoria("Salário", "Ganho"));
        categorias.add(new Categoria("Alimentação", "Gasto"));

        boolean sair = false;
        while (!sair) {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Criar usuário");
            System.out.println("2 - Listar usuários");
            System.out.println("3 - Adicionar transação");
            System.out.println("4 - Gerar relatório");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");

            int opcao = sc.nextInt();
            sc.nextLine(); // Limpa buffer

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Data Nascimento (DD/MM/AAAA): ");
                    String data = sc.nextLine();
                    usuarios.add(new Usuario(nome, data));
                    break;

                case 2:
                    if (usuarios.isEmpty()) {
                        System.out.println("Nenhum usuário cadastrado.");
                    } else {
                        usuarios.forEach(System.out::println);
                    }
                    break;

                case 3:
                    System.out.print("Valor (ex: -50 para gasto, 100 para ganho): ");
                    double valor = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Descrição: ");
                    String descricao = sc.nextLine();
                    System.out.print("Data (DD/MM/AAAA): ");
                    String dataTransacao = sc.nextLine();

                    // Mostra categorias disponíveis
                    System.out.println("Categorias:");
                    for (int i = 0; i < categorias.size(); i++) {
                        System.out.println(i + " - " + categorias.get(i).getNome());
                    }
                    System.out.print("Escolha uma categoria: ");
                    int idCategoria = sc.nextInt();

                    Transacao t = new Transacao();
                    t.setValor(valor);
                    t.setDate(dataTransacao);
                    t.setDescricao(descricao);
                    t.setCategoria(categorias.get(idCategoria));

                    carteira.adicionarTransacao(t);
                    break;

                case 4:

                    break;

                case 0:
                    sair = true;
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }
        sc.close();
    }
}