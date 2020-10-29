package e36;

import java.util.ArrayList;

public class StackInteger implements Stackable<Integer> {
    private final ArrayList<Integer> data = new ArrayList<>();

    @Override
    public void push(Integer e) {
        data.add(e);
    }

    @Override
    public Integer pop() {
        int index = data.size()-1;
        Integer result = data.get(index);
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

    public static void main(String[] args) {
        StackInteger si = new StackInteger();
        si.push(1);
        si.push(2);
        si.push(3);
        System.out.println("si.pop() = " + si.pop());
        System.out.println(si);
        System.out.println("si empty? = " + si.isEmpty());
    }
}
