import java.util.Scanner;

public class ConsoleUI {
    private Scanner scanner;
    private TaskManager manager;

    public ConsoleUI(Scanner scanner, TaskManager manager) {
        this.scanner = scanner;
        this.manager = manager;
    }

    public void start() {
        int opcao;

        do {
            exibirMenu();
            opcao = lerInt("Escolha uma opção: ");

            switch (opcao) {
                case 1 -> adicionarTarefa();
                case 2 -> manager.listar();
                case 3 -> removerTarefa();
                case 4 -> concluirTarefa();
                case 5 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida!\n");
            }

        } while (opcao != 5);
    }

    private void exibirMenu() {
        System.out.println("=== MENU ===");
        System.out.println("1. Adicionar nova tarefa");
        System.out.println("2. Listar tarefas");
        System.out.println("3. Remover tarefa");
        System.out.println("4. Marcar como concluída");
        System.out.println("5. Sair");
    }

    private void adicionarTarefa() {
        System.out.print("Digite a descrição da tarefa: ");
        String descricao = scanner.nextLine();
        manager.adicionar(descricao);
        System.out.println("Tarefa adicionada.\n");
    }

    private void removerTarefa() {
        manager.listar();
        int indice = lerInt("Digite o número da tarefa para remover: ") - 1;
        manager.remover(indice);
    }

    private void concluirTarefa() {
        manager.listar();
        int indice = lerInt("Digite o número da tarefa para concluir: ") - 1;
        manager.concluir(indice);
    }

    private int lerInt(String mensagem) {
        System.out.print(mensagem);
        while (!scanner.hasNextInt()) {
            System.out.print("Por favor, digite um número: ");
            scanner.next();
        }
        int numero = scanner.nextInt();
        scanner.nextLine(); // limpar quebra de linha
        return numero;
    }
}
