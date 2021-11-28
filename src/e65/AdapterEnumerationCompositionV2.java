package e65;

import java.util.Enumeration;
import java.util.Iterator;

public class AdapterEnumerationCompositionV2<E> implements Iterator<E> {
    private Enumeration<E> enumeration;

    public AdapterEnumerationCompositionV2(Enumeration<E> e) {
        enumeration = e;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public E next() {
        return enumeration.nextElement();
    }
}
