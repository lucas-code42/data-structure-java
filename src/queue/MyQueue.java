package queue;

import java.util.LinkedList;
import java.util.List;

public class MyQueue {

    private List<String> alunos = new LinkedList<>();

    public void add(String aluno) {
        alunos.add(aluno);
    }

    @Override
    public String toString() {
        return "MyQueue{" +
                "alunos=" + alunos +
                '}';
    }

    public String remove() {
        return alunos.remove(0);
    }

    public boolean vazia() {
        return alunos.size() == 0;
    }
}
