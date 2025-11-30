import java.util.ArrayList;

public class Academia {
    private ArrayList<Aluno> alunos;
    private ArrayList<Instrutor> instrutores;

    public Academia() {
        alunos = new ArrayList<>();
        instrutores = new ArrayList<>();
    }

    // Cadastrar aluno
    public void cadastrarAluno(Aluno aluno) {
        alunos.add(aluno);
        System.out.println("Aluno " + aluno.nome + " cadastrado com sucesso!");
    }

    // Cadastrar instrutor
    public void cadastrarInstrutor(Instrutor instrutor) {
        instrutores.add(instrutor);
        System.out.println("Instrutor " + instrutor.nome + " cadastrado com sucesso!");
    }

    // Buscar aluno
    public Aluno buscarAluno(String cpf) throws Exception {
        for (Aluno a : alunos) {
            if (a.cpf.equals(cpf)) {
                return a;
            }
        }
        throw new Exception("Aluno não encontrado!");
    }

    // Listar todos os alunos
    public void listarAlunos() {
        System.out.println("\n--- Lista de Alunos ---");
        for (Aluno a : alunos) {
            a.exibirDados();
            System.out.println("-----------------------");
        }
    }

    // Listar todos os instrutores
    public void listarInstrutores() {
        System.out.println("\n--- Lista de Instrutores ---");
        for (Instrutor i : instrutores) {
            i.exibirDados();
            System.out.println("----------------------------");
        }
    }
}
