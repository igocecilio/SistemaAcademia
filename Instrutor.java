public class Instrutor extends Pessoa {
    private String especialidade;
    private String registroProfissional;

    public Instrutor(String nome, String cpf, int idade, String especialidade, String registroProfissional) {
        super(nome, cpf, idade);
        this.especialidade = especialidade;
        this.registroProfissional = registroProfissional;
    }

    public void montarFichaTreino(Aluno aluno) {
        System.out.println("Instrutor " + nome + " montou um treino para o aluno " + aluno.nome);
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Especialidade: " + especialidade);
        System.out.println("Registro Profissional: " + registroProfissional);
    }
}
