public class Menu {
    public void mainMenu(){
        System.out.println("1. Adicionar nova tarefa");
        System.out.println("2. Ver todas as tarefas");
        System.out.println("3. Remover tarefa");
        System.out.println("4. Marcar tarefa como concluída");
        System.out.println("5. Sair");
        System.out.print("Escolha uma opção: ");
    }

    public void addMenu(){
        System.out.print("Nome da tarefa: ");
    }

    public void removeTaskMenu(){
        System.out.print("Qual tarefa gostaria de remover ? :");
    }

    public void taskCompletedMenu(){
        System.out.print("Qual tarefa gostaria de marcar como comcluida ? :");
    }
}
