package e65;

import java.util.Iterator;

public class ClientIterator {
    public static void traverseIteration(Iterator<?> i) {
        while(i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
