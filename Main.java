public class Main {
    public static void main(String[] args) {

        // Criando a academia
        Academia academia = new Academia();

        // Criando alunos
        Aluno aluno1 = new Aluno("João Silva", "111.111.111-11", 25, "Mensal");
        Aluno aluno2 = new Aluno("Maria Souza", "222.222.222-22", 30, "Anual");

        // Criando instrutor
        Instrutor instrutor1 = new Instrutor("Carlos Lima", "333.333.333-33", 40, "Musculação", "CR1001");

        // Cadastrando no sistema
        academia.cadastrarAluno(aluno1);
        academia.cadastrarAluno(aluno2);
        academia.cadastrarInstrutor(instrutor1);

        // Criando ficha de treino
        Treino treino = new Treino(45);
        treino.adicionarExercicio("Supino");
        treino.adicionarExercicio("Agachamento", 12);
        treino.adicionarExercicio("Flexão", 20);

        System.out.println("\n--- Ficha de Treino ---");
        treino.mostrarTreino();

        // Exibir informações
        System.out.println("\n--- Informações dos Alunos ---");
        academia.listarAlunos();

        System.out.println("\n--- Informações dos Instrutores ---");
        academia.listarInstrutores();

        // Testando pagamento
        aluno1.pagarMensalidade();

        // Testando busca com try/catch
        try {
            Aluno buscado = academia.buscarAluno("111.111.111-11");
            System.out.println("\nAluno encontrado:");
            buscado.exibirDados();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
