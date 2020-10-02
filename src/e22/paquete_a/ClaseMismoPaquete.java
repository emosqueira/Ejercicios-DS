package e22.paquete_a;

class ClaseMismoPaquete {
    public void metodoDeAcceso_2() {
        Clase c = new Clase();
        // c.privado   = 1; // ERROR
        c.protegido = 2; // OK <=
        c.paquete   = 3; // OK
        c.publico   = 4; // OK
    }
}
