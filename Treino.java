import java.util.ArrayList;

public class Treino {
    private ArrayList<String> exercicios;
    private int duracao;

    public Treino(int duracao) {
        this.duracao = duracao;
        this.exercicios = new ArrayList<>();
    }

    // Sobrecarga 1: adiciona só o nome
    public void adicionarExercicio(String nome) {
        exercicios.add(nome);
    }

    // Sobrecarga 2: adiciona nome + repetições
    public void adicionarExercicio(String nome, int repeticoes) {
        exercicios.add(nome + " - " + repeticoes + " repetições");
    }

    public void mostrarTreino() {
        System.out.println("Treino (" + duracao + " minutos)");
        for (String ex : exercicios) {
            System.out.println("- " + ex);
        }
    }
}

