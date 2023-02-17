package linkedList;

public class LinkedList<S> {

    private Celula primeira = null;
    private Celula ultima = null;
    private int totalDeElementos = 0;

    // adiciona no começo da lista
    public void adicionaNoComeco(Object elemento) {
        Celula nova = new Celula(elemento, primeira);
        this.primeira = nova;

        if (this.totalDeElementos == 0) {
            this.ultima = this.primeira;
        }

        this.totalDeElementos++;
    }


    // adiciona o final da lista
    public void adiciona(Object elemento) {
        if (this.totalDeElementos == 0) {
            this.adicionaNoComeco(elemento);
        }
        Celula nova = new Celula(elemento, null);
        this.ultima.setProximo(nova);
        this.ultima = nova;

        this.totalDeElementos++;
    }

    // add no meio da lista
    public void adiciona(int posicao, Object elemento) {

        if (posicao == 0) {
            this.adicionaNoComeco(elemento);
        } else if (posicao == this.totalDeElementos) {
            this.adiciona(elemento);
        } else {
            Celula anterior = this.pegaCelula(posicao - 1);
            Celula nova = new Celula(elemento, anterior.getProximo());

            anterior.setProximo(nova);
        }

        this.totalDeElementos++;

    }

    private boolean posicaoOcuada(int posicao) {
        return posicao >= 0 && posicao < this.totalDeElementos;
    }

    // pega uma celula baseada em sua posicao;
    public Celula pegaCelula(int posicao) {
        if (!this.posicaoOcuada(posicao)) {
            throw new IllegalArgumentException("posicao inexistente");
        }

        Celula atual = primeira;

        for (int i = 0; i < posicao; i++) {
            atual = atual.getProximo();
        }

        return atual;
    }

    public Object pega(int posicao) {
        return this.pegaCelula(posicao).getElemento();
    }

    public void removeDoComeco(int posicao) {
        if (this.totalDeElementos == 0) {
            throw new IllegalArgumentException("lista vazia");
        }

        this.primeira = this.primeira.getProximo();
        this.totalDeElementos--;

        if (this.totalDeElementos == 0) {
            this.ultima = null;
        }

    }

    public int tamanho() {
        return this.totalDeElementos;
    }

    public boolean contem(Object o) {
        return false;
    }

    @Override
    public String toString() {
        if (this.totalDeElementos == 0) {
            return "[]";
        }

        Celula atual = primeira;

        StringBuilder builder = new StringBuilder();
        builder.append("[");

        for (int i = 0; i < this.totalDeElementos; i++) {
            builder.append(atual.getElemento());
            builder.append(",");

            atual = atual.getProximo();
        }

        builder.append("]");
        return builder.toString();
    }
}

















