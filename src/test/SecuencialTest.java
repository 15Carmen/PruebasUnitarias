package test;


import Principal.Secuencial;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SecuencialTest {


    /**
     * Pruebas de caja negra con valores de entrada y salida
     */
    @org.junit.jupiter.api.Test
    void suma() {
        int x = 2;
        int y = 4;
        int resultadoEsperado=6;
        Secuencial secuencial = new Secuencial();
        int resultadoReal= secuencial.suma(x,y);
        assertEquals(resultadoReal, resultadoEsperado, "Suma no valida");
    }

    /**
     * Las pruebas de caja blanca solo se suelen hacer con estructuras complejas
     *
     */

    @org.junit.jupiter.api.Test
    void setContador() {
    }

    @org.junit.jupiter.api.Test
    void getContador() {
    }

    @org.junit.jupiter.api.Test
    void calcularMedia() {
        /*double a=4;
        double b=10;
        double resultadoEsperado=7;
        Secuencial secuencial = new Secuencial();
        double resultadoReal= secuencial.calcularMedia(a,b);
        assertEquals(resultadoReal, resultadoEsperado, "Media no es correcta");
        */
        //forma de poner la comprobacion de caja negra apropiadamente
        assertEquals(new Secuencial().calcularMedia(4,10), 7,
                "La media no es correcta");
    }
}