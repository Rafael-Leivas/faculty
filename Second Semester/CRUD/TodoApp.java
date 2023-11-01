import javax.swing.SwingUtilities;

public class TodoApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                criarMostrarTela();
            }
        });
    }//Fim do main

    public static void criarMostrarTela() {
        AppFrame frame = new AppFrame();
        frame.mostrar();
    }
} //Fim da classe Todo List