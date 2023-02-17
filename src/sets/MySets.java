package sets;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MySets {
    private ArrayList<LinkedList<String>> tabela = new ArrayList<LinkedList<String>>();

    
    public MySets() {
        for (int i = 0; i < 26; i++) {
            tabela.add(new LinkedList<String>());
        }
    }

    public void adciona(String palavra) {
        if (!contem(palavra)) {
            int indice = calculaIndeceDaTabela(palavra);
            List<String> lista = tabela.get(indice);
            lista.add(palavra);
        }

    }

    // executa o espalhamento, precisa ser idempotente
    private int calculaIndeceDaTabela(String palavra) {
        return palavra.toLowerCase().charAt(0) % 26;
    }

    public boolean contem(String palavra) {
        int indice = calculaIndeceDaTabela(palavra);
        return tabela.get(indice).contains(palavra);
    }

    @Override
    public String toString() {
        return "MySets{" +
                "tabela=" + tabela +
                '}';
    }

    public void remove(String palavra) {
        if (contem(palavra)) {
            int indice = calculaIndeceDaTabela(palavra);
            List<String> lista = tabela.get(indice);
            lista.remove(palavra);
        }
    }
}