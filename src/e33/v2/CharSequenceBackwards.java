package e33.v2;

public class CharSequenceBackwards implements CharSequence {
    // Estado
    private final char[] datos;

    public CharSequenceBackwards(String s) {
        datos = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            datos[i] = s.charAt(i);
        }
    }

    @Override
    public int length() {
        return datos.length;
    }

    @Override
    public char charAt(int index) {
        return datos[datos.length-index-1];
    }

    private String inverseSequence(int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = end-1; i >= start ; i--) {
            sb.append(datos[i]);
        }
        return new String(sb);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        if (start < 0 || end < 0 || end > datos.length || start > end)
            throw new IndexOutOfBoundsException();
        return inverseSequence(start, end);
    }

    @Override
    public String toString() {
        return inverseSequence(0, datos.length);
    }
}
