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

    // valida de uma posicao é ocupada ou null
    private boolean posicaoOcupada(int posicao) {
        return posicao >= 0 && posicao < this.totalDeAlunos;
    }


    // pega um aluno de acordo com sua posição
    public Aluno pega(int posicao) {
        if (!posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("posição inválida");
        }
        return this.alunos[posicao];
    }

    // remove um aluno de acordo com sua posicao
    public void remove(int posicao) {
        if (!this.posicaoValida(posicao)) {
            throw new IllegalArgumentException("posição inválida");
        }

        for (int i = posicao; i < this.totalDeAlunos; i++) {
            this.alunos[i] = this.alunos[i + 1];
        }

        this.totalDeAlunos--;
    }

    // valida de uma posicao não esta fora dos indices do array
    private boolean posicaoValida(int posicao) {
        return posicao >= 0 && posicao <= this.totalDeAlunos;
    }

    // adiciona um aluno no array
    public void adiciona(int posicao, Aluno aluno) {
        if (!this.posicaoValida(posicao)) {
            throw new IllegalArgumentException("posição inválida");
        }

        for (int i = this.totalDeAlunos - 1; i >= posicao; i--) {
            this.alunos[i + 1] = this.alunos[i];
        }
        this.alunos[posicao] = aluno;
        this.totalDeAlunos++;
    }

    // verifica se existe o mesmo aluno passado para o metodo
    public boolean contem(Aluno aluno) {
        for (int i = 0; i < this.totalDeAlunos; i++) {
            if (aluno.equals(this.alunos[i])) {
                return true;
            }
        }
        return false;
    }

    // devolve a última posicao livre do array
    public int tamanho() {
        return this.totalDeAlunos;
    }

    @Override
    public String toString() {
        return Arrays.toString(this.alunos);
    }
}
