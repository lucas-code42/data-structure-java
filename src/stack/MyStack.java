package stack;

import java.util.LinkedList;
import java.util.List;

public class MyStack {


    private List<String> nomes = new LinkedList<String>();
    public void insere(String nome) {
        nomes.add(nome);
    }

    public String pop() {
        return  nomes.remove(nomes.size() -1);
    }

    public boolean push() {
        return nomes.size() == 0;
    }

    @Override
    public String toString() {
        return "MyStack{" +
                "nomes=" + nomes +
                '}';
    }
}
