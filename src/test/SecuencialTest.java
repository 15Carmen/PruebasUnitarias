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
    }
}