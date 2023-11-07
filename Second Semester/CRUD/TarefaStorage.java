import java.util.ArrayList;

public class TarefaStorage {

    private static ArrayList<Tarefa> tarefas = new ArrayList<Tarefa>();
    private static int incremento;

    public TarefaStorage() {
        tarefas = new ArrayList<Tarefa>();
        incremento = 1;
    }

    public static void inserir(Tarefa tarefa) {
        tarefa.setId(incremento++);
        tarefas.add(tarefa);
    }

    public static void atualizar(Tarefa tarefa) {
        int indice = tarefas.indexOf(tarefa);
        if (indice >= 0)
            tarefas.set(indice, tarefa);
    }

    public static void remover(Tarefa tarefa) {
        tarefas.remove(tarefa);
    }

    public ArrayList<Tarefa> listar() {
        return this.tarefas;
    }
}