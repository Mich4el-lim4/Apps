import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskManager manager = new TaskManager();
        ConsoleUI ui = new ConsoleUI(scanner, manager);

        ui.start(); // Inicia o programa
    }
}
