package e36;

public interface Stackable<E> {
    void push(E e);

    E pop();

    boolean isEmpty();

    String toString();
}
