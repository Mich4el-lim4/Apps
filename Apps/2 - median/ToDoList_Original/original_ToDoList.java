import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    Scanner sc = new Scanner(System.in);
    Task task;
    Menu menu = new Menu();
    ArrayList<Task> list = new ArrayList<>();

    public void add(){
        menu.addMenu();
        String taskDescription = sc.next();
        task = new Task(taskDescription);
        list.add(task);
        System.out.println();
    }

    public void ListTasks(){
        //list.forEach(list -> System.out.println(list));
        System.out.println("Tasks............:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + 1 + " - " + list.get(i));
        }
        System.out.println();
    }

    public void removeTask(){
        menu.removeTaskMenu();
        int removeTask = sc.nextInt();
        list.remove(removeTask - 1);
    }

    public void taskCompleted(){
        int taskIndex = 0;
        menu.taskCompletedMenu();
        int taskCompleted = sc.nextInt();

        for (int indice = 0; indice < taskCompleted; indice++) {
             taskIndex = indice;
        }

        list.get(taskIndex).marcarComoComcluida();
    }

}