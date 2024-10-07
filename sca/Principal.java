package sca;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {

	private static final long serialVersionUID = 1327102560582561224L;
	private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Principal frame = new Principal();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public Principal() {
    	setTitle("Sistema de Controle Acadêmico");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 397, 427);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        
        JButton btnCadastroAluno = new JButton("Alunos");
        btnCadastroAluno.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
//                CadastroAlunos frameAluno = new CadastroAlunos();
//                frameAluno.setVisible(true);
            }
        });
        btnCadastroAluno.setBounds(50, 32, 293, 50);
        contentPane.add(btnCadastroAluno);

        
        JButton btnCadastroProfessor = new JButton("Professores");
        btnCadastroProfessor.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
//                CadastroProfessor frameProfessor = new CadastroProfessor();
//                frameProfessor.setVisible(true);
            }
        });
        btnCadastroProfessor.setBounds(50, 94, 293, 50);
        contentPane.add(btnCadastroProfessor);
        
        JButton btnCadastroDisciplina = new JButton("Disciplinas");
        btnCadastroDisciplina.setBounds(50, 156, 293, 50);
        contentPane.add(btnCadastroDisciplina);
        
        JButton btnCadastroNotas = new JButton("Notas");
        btnCadastroNotas.setBounds(50, 218, 293, 50);
        contentPane.add(btnCadastroNotas);
        
        JButton btnCadastroFrequencia = new JButton("Frequência");
        btnCadastroFrequencia.setBounds(50, 280, 293, 50);
        contentPane.add(btnCadastroFrequencia);
    }
}
