package e22.paquete_b;

import e22.paquete_a.Clase;

class SubClaseOtroPaquete extends Clase {
    public void metodoDeAcceso_5() {
        Clase c = new Clase();
        // c.privado   = 1; // ERROR
        // c.protegido = 2; // ERROR <=
        // c.paquete   = 3; // ERROR
        c.publico   = 4; // OK

        SubClaseOtroPaquete scop = new SubClaseOtroPaquete();
        // scop.privado   = 1; // ERROR
        scop.protegido = 2; // OK
        // scop.paquete   = 3; // ERROR
        scop.publico   = 4; // OK
    }
}
