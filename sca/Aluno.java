package sca;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Aluno extends JFrame {

    private static final long serialVersionUID = 7380071585538311117L;
	private JPanel contentPane;
    private JTextField textFieldNome;
    private JTextField textFieldMatricula;
    private JTextField textFieldCurso;
    private JLabel lblResultado;
// ------------------------------------------------------------
    private ArrayList<String> listaNomes = new ArrayList<>();
    private ArrayList<String> listaMatriculas = new ArrayList<>();
    private ArrayList<String> listaCursos = new ArrayList<>();
//------------------------------------------------------------------
   
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Aluno frame = new Aluno();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

  
    public Aluno() {
    	setTitle("Aluno");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 457, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JLabel lblNome = new JLabel("Nome:");
        lblNome.setBounds(30, 12, 79, 20);
        contentPane.add(lblNome);
        
        textFieldNome = new JTextField();
        textFieldNome.setBounds(113, 13, 288, 20);
        contentPane.add(textFieldNome);
        textFieldNome.setColumns(10);
        
        JLabel lblMatricula = new JLabel("Matrícula:");
        lblMatricula.setBounds(30, 44, 79, 20);
        contentPane.add(lblMatricula);
        
        textFieldMatricula = new JTextField();
        textFieldMatricula.setBounds(113, 45, 150, 20);
        contentPane.add(textFieldMatricula);
        textFieldMatricula.setColumns(10);
        
        JLabel lblCurso = new JLabel("Curso:");
        lblCurso.setBounds(30, 76, 79, 20);
        contentPane.add(lblCurso);
        
        textFieldCurso = new JTextField();
        textFieldCurso.setBounds(113, 77, 288, 20);
        contentPane.add(textFieldCurso);
        textFieldCurso.setColumns(10);
        
        JButton btnCadastrar = new JButton("Cadastrar");
        btnCadastrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cadastrarAluno();
            }
        });
        btnCadastrar.setBounds(30, 220, 110, 23);
        contentPane.add(btnCadastrar);

     
        JButton btnExibirLista = new JButton("Exibir Alunos");
        btnExibirLista.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                exibirListaAlunos();
            }
        });
        btnExibirLista.setBounds(152, 220, 150, 23);
        contentPane.add(btnExibirLista);
        
        lblResultado = new JLabel("");
        lblResultado.setBounds(10, 190, 300, 14);
        contentPane.add(lblResultado);
    }

   // Método Cadastrar Aluno
    private void cadastrarAluno() {
        try {
            String nome = textFieldNome.getText();
            String matricula = textFieldMatricula.getText();
            String curso = textFieldCurso.getText();

            if (nome.isEmpty()) {
                lblResultado.setText("Erro: Campo 'Nome' está vazio.");
                return;
            }

            if (matricula.isEmpty()) {
                lblResultado.setText("Erro: Campo 'Matrícula' está vazio.");
                return;
            }

            if (curso.isEmpty()) {
                lblResultado.setText("Erro: Campo 'Curso' está vazio.");
                return;
            }

            listaNomes.add(nome);
            listaMatriculas.add(matricula);
            listaCursos.add(curso);
            lblResultado.setText("Aluno " + nome + " cadastrado com sucesso!");

            
            textFieldNome.setText("");
            textFieldMatricula.setText("");
            textFieldCurso.setText("");

        } catch (Exception ex) {
            lblResultado.setText("Erro ao cadastrar o aluno.");
        }
    }

    // Método Exibir Alunos
    private void exibirListaAlunos() {
        System.out.println("Lista de Alunos Cadastrados:");
        for (int i = 0; i < listaNomes.size(); i++) {
            System.out.println("Aluno " + (i + 1) + ":");
            System.out.println("Nome: " + listaNomes.get(i));
            System.out.println("Matrícula: " + listaMatriculas.get(i));
            System.out.println("Curso: " + listaCursos.get(i));
            System.out.println("--------------------------");
        }
    }
}

