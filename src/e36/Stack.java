package e36;

import java.util.ArrayList;

public class Stack<E> implements Stackable<E> {
    private final ArrayList<E> data = new ArrayList<>();

    @Override
    public void push(E e) {
        data.add(e);
    }

    @Override
    public E pop() {
        int index = data.size()-1;
        E result = data.get(index);
        data.remove(index);
        return result;
    }

    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }

    @Override
    public String toString() {
        return data.toString();
    }

    public void pushAll(Stack<? extends E> source) {
        this.data.addAll(source.data);
    }

    public static void main(String[] args) {
        Stack<Integer> si = new Stack<>();
        si.push(1);
        si.push(2);
        si.push(3);
        System.out.println("si.pop() = " + si.pop());
        System.out.println(si);
        System.out.println("si empty? = " + si.isEmpty());

        Stack<Number> sn = new Stack<>();
        sn.push(5.0);
        System.out.println(sn);
        sn.pushAll(si);
        System.out.println(sn);

        Stack<String> ss = new Stack<>();
        ss.push("Hello");
        ss.push("World");
        ss.push("What's up");
        System.out.println("ss.pop() = " + ss.pop());
        System.out.println(ss);
        System.out.println("ss empty? = " + ss.isEmpty());

        Stack<String> ss2 = new Stack<>();
        ss2.push("Bye");
        ss2.pushAll(ss);
        System.out.println(ss2.toString());

    }
}
