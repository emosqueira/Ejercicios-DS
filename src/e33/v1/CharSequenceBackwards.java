package e33.v1;

import java.util.Arrays;

public class CharSequenceBackwards implements CharSequence {
    // ESTADO
    private final String backwards;

    public CharSequenceBackwards(String s) {
        StringBuilder sb = new StringBuilder(s);
        backwards = new String(sb.reverse()); // Darle la vuelta
    }

    @Override
    public int length() {
        return backwards.length();
    }

    @Override
    public char charAt(int index) {
        return backwards.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return backwards.subSequence(start, end);
    }

    @Override
    public String toString() {
        return backwards;
    }

    public static char[] CharSequenceToCharArray(CharSequence cs) {
        char[] result = new char[cs.length()];
        for (int i = 0; i < cs.length(); i++) {
            result[i] = cs.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "AdiosMundo";
        StringBuilder sb = new StringBuilder("AdiosMundoMutable");
        CharSequence csb = new CharSequenceBackwards("HolaMundo");

        char[] ca1 = CharSequenceToCharArray(s);
        char[] ca2 = CharSequenceToCharArray(sb);
        char[] ca3 = CharSequenceToCharArray(csb);

        System.out.println("ca1 = " + Arrays.toString(ca1));
        System.out.println("ca2 = " + Arrays.toString(ca2));
        System.out.println("ca3 = " + Arrays.toString(ca3));
    }
}
