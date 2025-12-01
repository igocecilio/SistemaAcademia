import javax.swing.*;

// Tela de cadastro de alunos
public class TelaCadastroAluno extends JFrame {

    private JTextField txtNome;
    private JTextField txtCpf;
    private JTextField txtIdade;
    private JTextField txtPlano;
    private JTextArea txtResultado;
    private JButton btnCadastrar;

    public TelaCadastroAluno() {
        initComponents();
    }

    private void initComponents() {
        // Labels
        JLabel lblNome = new JLabel("Nome:");
        JLabel lblCpf = new JLabel("CPF:");
        JLabel lblIdade = new JLabel("Idade:");
        JLabel lblPlano = new JLabel("Plano:");

        // Campos de texto
        txtNome = new JTextField();
        txtCpf = new JTextField();
        txtIdade = new JTextField();
        txtPlano = new JTextField();

        // Área de resultado
        txtResultado = new JTextArea(6, 25);
        txtResultado.setEditable(false);
        JScrollPane scrollResultado = new JScrollPane(txtResultado);

        // Botão
        btnCadastrar = new JButton("Cadastrar");
        btnCadastrar.addActionListener(e -> cadastrarAluno());

        // Layout usando GroupLayout
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(lblNome)
                        .addComponent(lblCpf)
                        .addComponent(lblIdade)
                        .addComponent(lblPlano))
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(txtNome, 200, 200, 200)
                        .addComponent(txtCpf, 200, 200, 200)
                        .addComponent(txtIdade, 200, 200, 200)
                        .addComponent(txtPlano, 200, 200, 200)))
                .addComponent(btnCadastrar, GroupLayout.Alignment.CENTER)
                .addComponent(scrollResultado)
        );

        layout.setVerticalGroup(
            layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCpf)
                    .addComponent(txtCpf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdade)
                    .addComponent(txtIdade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPlano)
                    .addComponent(txtPlano, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(15)
                .addComponent(btnCadastrar)
                .addGap(15)
                .addComponent(scrollResultado)
        );

        setTitle("Cadastro de Aluno");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null); // Centraliza a tela
    }

    private void cadastrarAluno() {
        try {
            String nome = txtNome.getText().trim();
            String cpf = txtCpf.getText().trim();
            String plano = txtPlano.getText().trim();
            int idade = Integer.parseInt(txtIdade.getText().trim());

            if (nome.isEmpty() || cpf.isEmpty() || plano.isEmpty() || idade <= 0) {
                txtResultado.setText("Erro: Preencha todos os campos corretamente!");
                return;
            }

            // Cria o aluno
            Aluno aluno = new Aluno(nome, cpf, idade, plano);

            // Exibe os dados usando getters
            txtResultado.setText(
                "Aluno cadastrado com sucesso!\n\n" +
                "Nome: " + aluno.getNome() + "\n" +
                "CPF: " + aluno.getCpf() + "\n" +
                "Idade: " + aluno.getIdade() + "\n" +
                "Plano: " + aluno.getPlano()
            );

            // Limpa os campos
            txtNome.setText("");
            txtCpf.setText("");
            txtIdade.setText("");
            txtPlano.setText("");

        } catch (NumberFormatException e) {
            txtResultado.setText("Erro: Idade deve ser um número inteiro.");
        } catch (Exception e) {
            txtResultado.setText("Erro inesperado: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TelaCadastroAluno().setVisible(true));
    }
}
