package model;

public class Turma {
    private Aluno[] alunos;
    private int quantidadeAlunos;

    public Turma(int capacidade) {
        alunos = new Aluno[capacidade];
        quantidadeAlunos = 0;
    }

    public boolean adicionarAluno(Aluno aluno) {
        if (quantidadeAlunos < alunos.length) {
            alunos[quantidadeAlunos++] = aluno;
            return true;
        }
        System.out.println("Turma cheia. Não foi possível adicionar o aluno: " + aluno.getNome());
        return false;
    }

    public void listarAprovados() {
        System.out.println("\nAlunos Aprovados:");
        for (int i = 0; i < quantidadeAlunos; i++) {
            if (alunos[i].estaAprovado()) {
                System.out.printf("%s (Matrícula: %s) - Média: %.2f\n",
                        alunos[i].getNome(),
                        alunos[i].getMatricula(),
                        alunos[i].Media());
            }
        }
    }

    public void listarReprovados() {
        System.out.println("\nAlunos Reprovados:");
        for (int i = 0; i < quantidadeAlunos; i++) {
            if (!alunos[i].estaAprovado()) {
                System.out.printf("%s (Matrícula: %s) - Média: %.2f\n",
                        alunos[i].getNome(),
                        alunos[i].getMatricula(),
                        alunos[i].Media());
            }
        }
    }
}
