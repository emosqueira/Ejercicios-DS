package e22.paquete_a;

public class Clase {
    private int privado;
    protected int protegido;
    int paquete;
    public int publico;

    public void metodoDeAcceso_1() {
        Clase c = new Clase();
        c.privado   = 1; // OK
        c.protegido = 2; // OK
        c.paquete   = 3; // OK
        c.publico   = 4; // OK
    }
}
