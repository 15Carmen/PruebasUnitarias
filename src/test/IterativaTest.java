package test;

import Principal.Iterativa;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IterativaTest {

    @Test
    void obtenerMaximoCN1() {
        double[] vector = new double[] {20.8,40.5,60.4,8.10,100.3};
        double resultadoEsperado=100.3;
        Iterativa iterativa = new Iterativa(vector);
        double resultadoReal=iterativa.obtenerMaximo(vector);
        assertEquals(resultadoEsperado, resultadoReal, 0.1,"El resultado es erroneo");
    }

    @Test
    void obtenerMaximoCN2() {
        double[] vector= {20.8,40.5,60.4,8.10,100.3};
        double resultadoEsperado=8.10;
        Iterativa iterativa = new Iterativa(vector);
        double resultadoReal=iterativa.obtenerMaximo(vector);
        assertEquals(resultadoEsperado, resultadoReal, 0.1,"El resultado es erroneo");
    }

    @Test
    void obtenerValorEntreCN1() {


    }

    @Test
    void primerNegativo() {
    }
}