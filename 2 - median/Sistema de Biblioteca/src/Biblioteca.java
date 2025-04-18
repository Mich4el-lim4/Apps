import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
    private ArrayList<Livro> livros;
    private ArrayList<User> usuarios;
    private Scanner scanner;

    public Biblioteca() {
        this.livros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public void iniciarSistema() {
        int opcao;
        do {
            System.out.println("\n=== SISTEMA DE BIBLIOTECA ===");
            System.out.println("1. Cadastrar Livro");
            System.out.println("2. Listar Livros");
            System.out.println("3. Cadastrar Usuário");
            System.out.println("4. Listar Usuários");
            System.out.println("5. Emprestar Livro");
            System.out.println("6. Devolver Livro");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer

            switch (opcao) {
                case 1 -> cadastrarLivro();
                case 2 -> listarLivros();
                case 3 -> cadastrarUsuario();
                case 4 -> listarUsuarios();
                case 5 -> emprestarLivro();
                case 6 -> devolverLivro();
                case 0 -> System.out.println("Saindo do sistema...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    private void cadastrarLivro() {
        System.out.println("\n=== CADASTRO DE LIVRO ===");
        System.out.print("ISBN: ");
        String isbn = scanner.nextLine();

        System.out.print("Título: ");
        String titulo = scanner.nextLine();

        System.out.print("Autor: ");
        String autor = scanner.nextLine();

        System.out.print("Ano de Publicação: ");
        int ano = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Editora: ");
        String editora = scanner.nextLine();

        Livro novoLivro = new Livro(isbn, titulo, autor, ano, editora);
        livros.add(novoLivro);
        System.out.println("Livro cadastrado com sucesso!");
    }

    private void listarLivros() {
        System.out.println("\n=== LISTA DE LIVROS ===");
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
        } else {
            for (int i = 0; i < livros.size(); i++) {
                System.out.println("\nLivro #" + (i + 1));
                System.out.println(livros.get(i));
            }
        }
    }

    private void cadastrarUsuario() {
        System.out.println("\n=== CADASTRO DE USUÁRIO ===");
        System.out.print("ID: ");
        String id = scanner.nextLine();

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        User novoUsuario = new User(id, nome, email);
        usuarios.add(novoUsuario);
        System.out.println("Usuário cadastrado com sucesso!");
    }

    private void listarUsuarios() {
        System.out.println("\n=== LISTA DE USUÁRIOS ===");
        if (usuarios.isEmpty()) {
            System.out.println("Nenhum usuário cadastrado.");
        } else {
            for (int i = 0; i < usuarios.size(); i++) {
                System.out.println("\nUsuário #" + (i + 1));
                System.out.println(usuarios.get(i));
            }
        }
    }

    private void emprestarLivro() {
        System.out.println("\n=== EMPRÉSTIMO DE LIVRO ===");

        User usuario = selecionarUsuario();
        if (usuario == null) return;

        Livro livro = selecionarLivroDisponivel();
        if (livro == null) return;

        usuario.emprestarLivro(livro);
        System.out.println("Livro emprestado com sucesso para " + usuario.getNome());

        // Mostra detalhes do empréstimo
        Emprestimo ultimoEmprestimo = usuario.getEmprestimosAtivos().get(
                usuario.getEmprestimosAtivos().size() - 1
        );
        System.out.println("Data de devolução prevista: " +
                ultimoEmprestimo.getDataDevolucaoPrevista().format(
                        DateTimeFormatter.ofPattern("dd/MM/yyyy")
                )
        );
    }

    private void devolverLivro() {
        System.out.println("\n=== DEVOLUÇÃO DE LIVRO ===");

        User usuario = selecionarUsuario();
        if (usuario == null) return;

        if (usuario.getEmprestimosAtivos().isEmpty()) {
            System.out.println("Este usuário não tem livros emprestados.");
            return;
        }

        System.out.println("Livros emprestados:");
        for (int i = 0; i < usuario.getEmprestimosAtivos().size(); i++) {
            System.out.println((i + 1) + ". " +
                    usuario.getEmprestimosAtivos().get(i).getLivro().getTitulo() +
                    " (Emprestado em: " +
                    usuario.getEmprestimosAtivos().get(i).getDataEmprestimo().format(
                            DateTimeFormatter.ofPattern("dd/MM/yyyy")
                    ) + ")"
            );
        }

        System.out.print("Selecione o livro para devolver: ");
        int escolha = scanner.nextInt() - 1;
        scanner.nextLine();

        if (escolha >= 0 && escolha < usuario.getEmprestimosAtivos().size()) {
            Livro livro = usuario.getEmprestimosAtivos().get(escolha).getLivro();
            usuario.devolverLivro(livro);
            System.out.println("Livro devolvido com sucesso!");
        } else {
            System.out.println("Opção inválida!");
        }
    }

    private User selecionarUsuario() {
        if (usuarios.isEmpty()) {
            System.out.println("Nenhum usuário cadastrado.");
            return null;
        }

        listarUsuarios();
        System.out.print("Selecione o usuário (número): ");
        int escolha = scanner.nextInt() - 1;
        scanner.nextLine();

        if (escolha >= 0 && escolha < usuarios.size()) {
            return usuarios.get(escolha);
        } else {
            System.out.println("Usuário inválido!");
            return null;
        }
    }

    private Livro selecionarLivroDisponivel() {
        ArrayList<Livro> disponiveis = new ArrayList<>();
        for (Livro livro : livros) {
            if (livro.isDisponivel()) {
                disponiveis.add(livro);
            }
        }

        if (disponiveis.isEmpty()) {
            System.out.println("Nenhum livro disponível para empréstimo.");
            return null;
        }

        System.out.println("Livros disponíveis:");
        for (int i = 0; i < disponiveis.size(); i++) {
            System.out.println((i + 1) + ". " + disponiveis.get(i).getTitulo());
        }

        System.out.print("Selecione o livro (número): ");
        int escolha = scanner.nextInt() - 1;
        scanner.nextLine();

        if (escolha >= 0 && escolha < disponiveis.size()) {
            return disponiveis.get(escolha);
        } else {
            System.out.println("Livro inválido!");
            return null;
        }
    }

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.iniciarSistema();
    }
}