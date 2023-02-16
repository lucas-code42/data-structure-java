package queue;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueueTest {
    public static void main(String[] args) {
        MyQueue fila = new MyQueue();

        System.out.println(fila);
        fila.add("Golang");
        System.out.println(fila);
        fila.add("Python");

        System.out.println(fila);
        fila.add("Java");

        System.out.println(fila);
        fila.remove();

        System.out.println(fila); // FIRST IN FIRST OUT = FIFO
        System.out.println(fila.vazia());

        // JAVA IMPLEMENTATION
        Queue<String> javaQ = new LinkedList<String>();
        javaQ.add("teste");
        javaQ.add("teste999");

        System.out.println(javaQ);

        javaQ.poll();
        System.out.println(javaQ);


    }
}
