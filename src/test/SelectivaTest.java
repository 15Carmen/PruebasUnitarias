package test;

import Principal.Selectiva;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SelectivaTest {

    @Test
    void obteneMaximoCN1() {
        int x = 5;
        int y = 3;
        int resultadoEsperado=5;
        Selectiva selectiva = new Selectiva();
        int resultadoReal=selectiva.obteneMaximo(x,y);
        assertEquals(resultadoEsperado, resultadoReal, "El resultado es erroneo");
    }
    @Test
    void obteneMaximoCN2() {
        int x = 5;
        int y = 9;
        int resultadoEsperado=9;
        Selectiva selectiva = new Selectiva();
        int resultadoReal=selectiva.obteneMaximo(x,y);
        assertEquals(resultadoEsperado, resultadoReal, "El resultado es erroneo");
    }

    @Test
    void realizarCalculoCN1() {
        int opcion=0;
        int a=4;
        int b=5;
        int resultadoEsperado=9;
        Selectiva selectiva = new Selectiva();
        int resultadoReal=selectiva.realizarCalculo(opcion,a,b);
        assertEquals(resultadoEsperado, resultadoReal, "El resultado es erroneo");
    }


    @Test
    void realizarCalculoCN2() {
        int opcion=0;
        int a=4;
        int b=5;
        int resultadoEsperado=20;
        Selectiva selectiva = new Selectiva();
        int resultadoReal=selectiva.realizarCalculo(opcion,a,b);
        assertEquals(resultadoEsperado, resultadoReal, "El resultado es erroneo");
    }

    @Test
    void realizarCalculoCN3() {
        int opcion=1;
        int a=4;
        int b=5;
        int resultadoEsperado=20;
        Selectiva selectiva = new Selectiva();
        int resultadoReal=selectiva.realizarCalculo(opcion,a,b);
        assertEquals(resultadoEsperado, resultadoReal, "El resultado es erroneo");
    }

    @Test
    void realizarCalculoCN4() {
        int opcion=1;
        int a=4;
        int b=5;
        int resultadoEsperado=20;
        Selectiva selectiva = new Selectiva();
        int resultadoReal=selectiva.realizarCalculo(opcion,a,b);
        assertEquals(resultadoEsperado, resultadoReal, "El resultado es erroneo");
    }}