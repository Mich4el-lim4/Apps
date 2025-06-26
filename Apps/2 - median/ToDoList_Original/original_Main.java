import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();
        ToDoList list = new ToDoList();

        int optionMenu;
        do{
            menu.mainMenu();
            optionMenu = sc.nextInt();
            System.out.println();

            switch (optionMenu) {
                case 1 -> list.add();
                case 2 -> list.ListTasks();
                case 3 -> list.removeTask();
                case 4 -> list.taskCompleted();
                case 5 -> System.exit(0);
            }
        }while (optionMenu != 5);

        sc.close();
    }
}
