import java.util.ArrayList;

public class TaskManager {
    private ArrayList<Task> tarefas = new ArrayList<>();

    public void adicionar(String descricao) {
        tarefas.add(new Task(descricao));
    }

    public void listar() {
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa adicionada.\n");
            return;
        }

        for (int i = 0; i < tarefas.size(); i++) {
            System.out.println((i + 1) + ". " + tarefas.get(i));
        }
        System.out.println();
    }

    public void remover(int indice) {
        if (indice >= 0 && indice < tarefas.size()) {
            tarefas.remove(indice);
            System.out.println("Tarefa removida.\n");
        } else {
            System.out.println("Índice inválido.\n");
        }
    }

    public void concluir(int indice) {
        if (indice >= 0 && indice < tarefas.size()) {
            tarefas.get(indice).marcarComoConcluida();
            System.out.println("Tarefa marcada como concluída.\n");
        } else {
            System.out.println("Índice inválido.\n");
        }
    }

    public int totalTarefas() {
        return tarefas.size();
    }
}
