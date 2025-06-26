public class Task {
    String description;
    boolean concluida;

    public Task(String description){
        this.description = description;
        this.concluida = false;
    }

    public void marcarComoComcluida(){
        this.concluida = true;
    }

    public String toString() {
        String status = concluida ? "[X]" : "[ ]";
        return status + " " + description;
    }
}
