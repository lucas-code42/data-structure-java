package sets;

import java.util.HashSet;
import java.util.Set;

public class MySetsTest {

    public static void main(String[] args) {

        MySets conjunto = new MySets();
        conjunto.adciona("Golang");
        System.out.println(conjunto);

        conjunto.adciona("Google");
        System.out.println(conjunto);

        conjunto.adciona("Python");
        System.out.println(conjunto);

        conjunto.adciona("Python 3.10");
        System.out.println(conjunto);

        conjunto.remove("Python 3.10");
        System.out.println(conjunto);


        // Java Implementation
        Set<String> javaSets = new HashSet<>();
        javaSets.add("Java");
        javaSets.add("Java 17");
        javaSets.add("Python");
        javaSets.add("Golang");

        System.out.println(javaSets);

        System.out.println("go".hashCode());
        System.out.println("golang".hashCode());

        javaSets.add("Python");
        System.out.println(javaSets);
    }
}
