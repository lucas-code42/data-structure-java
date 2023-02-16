package stack;

import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        MyStack pilha = new MyStack();

        System.out.println(pilha.push());

        System.out.println(pilha);

        pilha.insere("Golang");

        System.out.println(pilha);

        pilha.insere("Python");

        System.out.println(pilha);

        pilha.pop();

        System.out.println(pilha);

        pilha.insere("Java");

        System.out.println(pilha);


        Stack<String> stack = new Stack<String>();
        stack.push("Teste1");
        stack.push("Teste2");
        stack.push("Teste3");

        System.out.println(stack);

        stack.pop();

        System.out.println(stack);

        System.out.println(stack.peek()); // apenas mostra qual é o último elemento da pilha



    }
}
