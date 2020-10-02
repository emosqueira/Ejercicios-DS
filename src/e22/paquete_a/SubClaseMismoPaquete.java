package e22.paquete_a;

class SubClaseMismoPaquete extends Clase {
    public void metodoDeAcceso_3() {
        Clase c = new Clase();
        // c.privado   = 1; // ERROR
        c.protegido = 2; // OK
        c.paquete   = 3; // OK
        c.publico   = 4; // OK
    }
}
