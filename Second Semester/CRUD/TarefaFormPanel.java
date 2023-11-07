import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JOptionPane;

import java.awt.GridBagLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TarefaFormPanel extends JPanel {
    private static final Insets REJUNTE = new Insets(5, 10, 0, 0);
    private GridBagLayout layout;
    private GridBagConstraints constraints;

    private JTextField nomeTxt;
    private JTextArea descricaoTxa;
    private JButton salvarBtn;
    private JButton cancelarBtn;

    public TarefaFormPanel() {
        this.layout = new GridBagLayout();
        this.constraints = new GridBagConstraints();
        setLayout(layout);

        criarForm();
    }

    private void criarForm() {
        JLabel rotulo;

        rotulo = new JLabel("Nome:");
        adicionarComponente(rotulo, 0, 0);
        nomeTxt = new JTextField(30);
        adicionarComponente(nomeTxt, 0, 1);

        rotulo = new JLabel("Descrição:");
        adicionarComponente(rotulo, 1, 0);
        descricaoTxa = new JTextArea(5, 30);
        JScrollPane scrollPane = new JScrollPane(descricaoTxa);
        adicionarComponente(scrollPane, 1, 1, 1, 5);

        criarBotoes();
    }

    private void criarBotoes() {
        JPanel btnPanel = new JPanel();
        FlowLayout flowLayout = (FlowLayout) btnPanel.getLayout();
        flowLayout.setAlignment(FlowLayout.LEFT);

        criarSalvarBtn(btnPanel);
        criarCancelarBtn(btnPanel);

        adicionarComponente(btnPanel, 6, 1);
    }

    public void criarSalvarBtn(JPanel btnPanel) {
        salvarBtn = new JButton("Salvar");
        salvarBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Tarefa tarefa = new Tarefa();
                tarefa.setNome(nomeTxt.getText());
                tarefa.setDescricao(descricaoTxa.getText());

                TarefaStorage.inserir(tarefa);

                JOptionPane.showMessageDialog(TarefaFormPanel.this, "Tarefa criada com sucesso!", AppFrame.TITULO, JOptionPane.INFORMATION_MESSAGE);
            }
        });
        btnPanel.add(salvarBtn);        
    }

    public void criarCancelarBtn(JPanel btnPanel) {
        cancelarBtn = new JButton("Cancelar");
        btnPanel.add(cancelarBtn);
    }

    private void adicionarComponente(JComponent componente, int linha, int coluna) {
        adicionarComponente(componente, linha, coluna, 1, 1);
    }

    private void adicionarComponente(JComponent componente, int linha, int coluna, int largura, int altura) {
        constraints.gridx = coluna;
        constraints.gridy = linha;
        constraints.gridwidth = largura;
        constraints.gridheight = altura;

        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.insets = REJUNTE;

        layout.setConstraints(componente, constraints);
        add(componente);
    }

}
