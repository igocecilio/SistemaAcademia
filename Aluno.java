public class Aluno extends Pessoa {
    private String plano;
    private boolean statusPagamento;

    public Aluno(String nome, String cpf, int idade, String plano) {
        super(nome, cpf, idade); // chama a superclasse Pessoa
        this.plano = plano;
        this.statusPagamento = false;
    }

    public void pagarMensalidade() {
        this.statusPagamento = true;
        System.out.println(nome + " realizou o pagamento da mensalidade.");
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Plano: " + plano);
        System.out.println("Pagamento em dia: " + statusPagamento);
    }
}
