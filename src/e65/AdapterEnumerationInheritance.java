package e65;

import java.util.Iterator;
import java.util.StringTokenizer;

// StringTokenizer implementa Enumeration<Object>
public class AdapterEnumerationInheritance
        extends StringTokenizer implements Iterator<Object> {
    public AdapterEnumerationInheritance(String s) {
        super(s);
    }

    @Override
    public boolean hasNext() {
        return hasMoreElements();
    }

    @Override
    public Object next() {
        return nextElement();
    }
}
