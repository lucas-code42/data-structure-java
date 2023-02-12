package array;

import java.util.Arrays;

public class Vetor {

    private Aluno[] alunos = new Aluno[100];
    private int totalDeAlunos = 0;


    // Solução leva tempo constante, criamos um índice que aponta um buraco no array
    public void adiciona(Aluno aluno) {
        this.alunos[this.totalDeAlunos] = aluno;
        this.totalDeAlunos++;
    }

    private boolean posicaoOcupada(int posicao) {
        return posicao >= 0 && posicao < this.totalDeAlunos;
    }


    public Aluno pega(int posicao) {
        if (!posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("posição inválida");
        }
        return this.alunos[posicao];
    }

    public void remove(int posicao) {
        if (!this.posicapValida(posicao)) {
            throw new IllegalArgumentException("posição inválida");
        }

        for (int i = posicao; i < this.totalDeAlunos; i++) {
            this.alunos[i] = this.alunos[i + 1];
        }

        this.totalDeAlunos--;
    }

    private boolean posicapValida(int posicao) {
        return posicao >= 0 && posicao <= this.totalDeAlunos;
    }

    public void adiciona(int posicao, Aluno aluno) {
        if (!this.posicapValida(posicao)) {
            throw new IllegalArgumentException("posição inválida");
        }

        for (int i = this.totalDeAlunos - 1; i >= posicao; i--) {
            this.alunos[i + 1] = this.alunos[i];
        }
        this.alunos[posicao] = aluno;
        this.totalDeAlunos++;
    }

    public boolean contem(Aluno aluno) {
        for (int i = 0; i < this.totalDeAlunos; i++) {
            if (aluno.equals(this.alunos[i])) {
                return true;
            }
        }
        return false;
    }

    public int tamanho() {
        return this.totalDeAlunos;
    }

    @Override
    public String toString() {
        return Arrays.toString(this.alunos);
    }
}
