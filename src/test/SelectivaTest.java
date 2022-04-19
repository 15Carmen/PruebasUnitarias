package test;

import Principal.Secuencial;
import Principal.Selectiva;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SelectivaTest {

    @Test
    void obteneMaximoCN1() {
        Selectiva selectiva = new Selectiva();
        assertEquals(5, selectiva.obteneMaximo(5,2),
                "El resultado es erroneo");
    }

    @Test
    void obteneMaximoCN2() {
        Selectiva selectiva = new Selectiva();
        assertEquals(5, selectiva.obteneMaximo(2,5),
                "El resultado es erroneo");
    }

    @Test
    void realizarCalculoCN1() {
        Selectiva selectiva = new Selectiva();
        assertEquals(9, selectiva.realizarCalculo(0,5,4),
                "El resultado es erroneo");
    }


    @Test
    void realizarCalculoCN2() {
        Selectiva selectiva = new Selectiva();
        assertEquals(20, selectiva.realizarCalculo(1,5,4),
                "El resultado es erroneo");
    }

    @Test
    void realizarCalculoCN3() {
        Selectiva selectiva = new Selectiva();
        assertEquals(-1, selectiva.realizarCalculo(-1,5, 4),
                "El resultado es erroneo");

    }

    @Test
    void actualizarMinimoCN1() {
        Selectiva selectiva = new Selectiva();
        selectiva.actualizarMinimo(0);
        assertEquals(0, selectiva.minimo,
                "El minimo no es valido");
        selectiva.actualizarMinimo(-10);
        assertEquals(-10, selectiva.minimo,
                "El minimo no es valido");
        selectiva.actualizarMinimo(3);
        assertEquals(-10, selectiva.minimo,
                "El minimo no es valido");
    }

    @Test
    void actualizarMinimoCN2() {
        Selectiva selectiva = new Selectiva();
        selectiva.actualizarMinimo(-23);
        assertEquals(-23, selectiva.minimo,
                "El minimo no es valido");
    }

    @Test
    void actualizarMinimoCN3() {
        Selectiva selectiva = new Selectiva();
        selectiva.actualizarMinimo(3);
        assertEquals(0, selectiva.minimo,
                "El minimo no es valido");
    }

    @Test
    void restaurarMinimoPositivoCN1() {
        Selectiva selectiva = new Selectiva();
        selectiva.restaurarMinimoPositivo();
        assertEquals(0, selectiva.minimo,
                "No se ha restaurado el mínimo");

    }

    @Test
    void restaurarMinimoPositivoCN2() {
        Selectiva selectiva = new Selectiva();
        //selectiva.minimo=-10;
        selectiva.actualizarMinimo(-10);
        selectiva.restaurarMinimoPositivo();
        assertEquals(0, selectiva.minimo,
                "No se ha restaurado el mínimo");

    }

    @Test
    void multiplicarPorSignoCN1() {
        Selectiva selectiva = new Selectiva();
        selectiva.actualizarMinimo(-2);
        selectiva.multiplicacionPorSigno();
        assertEquals(4, selectiva.minimo,
                "No se ha restaurado el mínimo");
    }

    @Test
    void multiplicarPorSignoCN2() {
        Selectiva selectiva = new Selectiva();
        selectiva.minimo = 3;
        selectiva.multiplicacionPorSigno();
        assertEquals(9, selectiva.minimo,
                "No se ha restaurado el mínimo");
    }

}