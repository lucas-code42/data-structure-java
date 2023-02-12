package linkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList lista = new LinkedList();

        System.out.println(lista);
        lista.adicionaNoComeco("teste1");
        System.out.println(lista);
        lista.adicionaNoComeco("teste2");
        System.out.println(lista);
        lista.adicionaNoComeco("teste3");
        System.out.println(lista);

        lista.adiciona("teste0");
        System.out.println(lista);


        System.out.println(lista.pegaCelula(1).toString());


        lista.adiciona(2, "python");
        System.out.println(lista);

        Object x = lista.pega(2);
        System.out.println(x);
        System.out.println(lista.tamanho());


        lista.removeDoComeco(0);

        System.out.println(lista);
        System.out.println(lista.tamanho());


    }


}
