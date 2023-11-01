import java.util.ArrayList;

public class TarefaStorage {

    private ArrayList<Tarefa> tarefas;
    private static int incremento;

    public TarefaStorage() {
        tarefas = new ArrayList<Tarefa>();
        incremento = 1;
    }

    public void inserir(Tarefa tarefa) {
        tarefa.setId(this.incremento++);
        tarefas.add(tarefa);
    }

    public void atualizar(Tarefa tarefa) {
        int indice = tarefas.indexOf(tarefa);
        if (indice >= 0)
            tarefas.set(indice, tarefa);
    }

    public void remover(Tarefa tarefa) {
        this.tarefas.remove(tarefa);
    }

    public ArrayList<Tarefa> listar() {
        return this.tarefas;
    }
}