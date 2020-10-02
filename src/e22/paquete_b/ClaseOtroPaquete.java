package e22.paquete_b;

import e22.paquete_a.Clase;

class ClaseOtroPaquete {
    public void metodoDeAcceso_4() {
        Clase c = new Clase();
        // c.privado   = 1; // ERROR
        // c.protegido = 2; // ERROR
        // c.paquete   = 3; // ERROR
        c.publico   = 4; // OK
    }
}
