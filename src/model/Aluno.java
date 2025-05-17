package model;

public class Aluno {
    private String matricula;
    private String nome;
    private double notas[];
    private int quatidadeNotas;

    public Aluno(String matricula, String nome){
        this.matricula = matricula;
        this.nome = nome;
        this.notas = new double[4];
        this.quatidadeNotas = 0;
    }

    public boolean adicionarNotas(double nota){
        if(quatidadeNotas < 4 && nota >= 0 && nota <= 10){
            notas[quatidadeNotas] = nota;
            quatidadeNotas++;
            return true;
        }
        else {
            System.out.println("ERRO: Nota inválida ou limite de notas atingido");
            return false;
        }
    }

    public double Media(){
        double soma = 0;
        for(int k = 0; k <quatidadeNotas; k++){
            soma += notas[k];
        }
        return soma/quatidadeNotas;
    }

    public boolean estaAprovado() {
        if (Media() >= 7.0) {
            return true;
        } else {
            return false;
        }
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public double[] getNotas() {
        return notas.clone();
    }
}
