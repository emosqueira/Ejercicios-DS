package e65;

import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("this is a test");
        while(st.hasMoreElements())
            System.out.println(st.nextElement());

        // Print 4 lines: this - is - a - test

        System.out.println();
        ClientIterator.traverseIteration(new AdapterEnumerationInheritance("this is a test H"));

        System.out.println();
        ClientIterator.traverseIteration(new AdapterEnumerationComposition("this is a test C"));

        System.out.println();
        ClientIterator.traverseIteration(new AdapterEnumerationCompositionV2<Object>(new StringTokenizer("this is a test CV2")));

        System.out.println("---asIterator---");
        StringTokenizer st2 = new StringTokenizer("this is a test");
        ClientIterator.traverseIteration(st2.asIterator());
    }
}
