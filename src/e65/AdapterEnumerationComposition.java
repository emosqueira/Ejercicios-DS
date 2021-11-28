package e65;

import java.util.Iterator;
import java.util.StringTokenizer;

public class AdapterEnumerationComposition implements Iterator<Object> {
    private StringTokenizer tokenizer;

    public AdapterEnumerationComposition(String s) {
        tokenizer = new StringTokenizer(s);
    }

    @Override
    public boolean hasNext() {
        return tokenizer.hasMoreElements();
    }

    @Override
    public Object next() {
        return tokenizer.nextElement();
    }
}
