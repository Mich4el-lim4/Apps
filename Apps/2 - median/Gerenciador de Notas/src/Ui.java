import java.util.Scanner;

public class Ui {
    Scanner sc = new Scanner(System.in);

    int option = 0;
    public int ui(){
        System.out.println("1. Criar nova nota");
        System.out.println("2. Ver todas as notas");
        System.out.println("3. Editar uma nota");
        System.out.println("4. Apagar uma nota");
        System.out.println("5. Sair");
        System.out.print("Digite uma opção:");
        return option = sc.nextInt();
    }

    public String uiDigiteNota(){
        System.out.println();
        System.out.print("Digitar a nota: ");
        return sc.next();
    }

    public int uiEscolherNota(){
        int nota;
        System.out.print("Qual nota gostaria de editar: ");
        return nota = sc.nextInt();
    }

    public String uiEditarNota(){
        String nota;
        System.out.print("Digite o novo conteúdo da nota: ");
        return nota = sc.next();
    }

    public int uiExcluirNota(){
        int nota;
        System.out.print("Qual nota gostaria de excluir: ");
        return nota = sc.nextInt();
    }

}
