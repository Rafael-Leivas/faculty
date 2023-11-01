import java.util.ArrayList;

public class TodoApp {
    public static void main(String[] args) {
        System.out.println("ok");

        TarefaStorage s = new TarefaStorage();

        Tarefa t = new Tarefa();
        t.setNome("Tarefa 1");
        t.setDescricao("Descrição 1");
        
        s.inserir(t);

        t = new Tarefa();
        t.setNome("Tarefa 2");
        t.setDescricao("Descrição 2");

        ArrayList<Tarefa> a = s.listar();
        for (Tarefa t2 : a) {
            System.out.println(t.getNome());
        }
    }

}