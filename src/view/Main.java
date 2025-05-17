package view;

import model.Aluno;
import model.Turma;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define a capacidade da turma
        System.out.print("Digite a capacidade da turma: ");
        int capacidade = scanner.nextInt();
        Turma turma = new Turma(capacidade);

        // Cadastro de alunos
        for (int i = 0; i < capacidade; i++) {
            System.out.print("\nDigite o nome do aluno: ");
            scanner.nextLine();
            String nome = scanner.nextLine();

            System.out.print("Digite a matrícula do aluno: ");
            String matricula = scanner.nextLine();

            Aluno aluno = new Aluno(matricula, nome);

            System.out.println("Digite até 4 notas para o aluno:");
            int notasAdicionadas = 0;
            while (notasAdicionadas < 4) {
                System.out.print("Nota " + (notasAdicionadas + 1) + ": ");
                double nota = scanner.nextDouble();
                if (aluno.adicionarNotas(nota)) {
                    notasAdicionadas++;
                } else {
                    System.out.println("Nota inválida! Tente novamente.");
                }
            }

            turma.adicionarAluno(aluno);
        }

        // Exibir resultados
        turma.listarAprovados();
        turma.listarReprovados();
    }
}
