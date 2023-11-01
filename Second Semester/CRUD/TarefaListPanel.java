import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class TarefaListPanel extends JPanel{

    private JButton novaTarefaBtn;
    private JButton editarTarefaBtn;
    private JButton removerTarefaBtn;


    public TarefaListPanel() {
        setLayout(new BorderLayout(10,10));

        criarComandosPanel();
        criarTabelaPanel();
    }

    private void criarComandosPanel() {
        JPanel panel = new JPanel();
        FlowLayout layout = (FlowLayout) panel.getLayout();
        layout.setAlignment(FlowLayout.RIGHT);

        novaTarefaBtn = new JButton("Criar");
        panel.add(novaTarefaBtn);
        
        editarTarefaBtn = new JButton("Editar");
        panel.add(editarTarefaBtn);

        removerTarefaBtn = new JButton("Remover");
        panel.add(removerTarefaBtn);

        add(panel, BorderLayout.NORTH);
    }
    
    private void criarTabelaPanel() {
        
    }

} // Fim da classe TarefaListPanel
