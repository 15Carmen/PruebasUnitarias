package test;

import Principal.Iterativa;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IterativaTest {

    @Test
    void buscarMaximoCN1() {
        double[] vector = new double[] {20.8,40.5,60.4,8.10,100.3};
        double resultadoEsperado=100.3;
        Iterativa iterativa = new Iterativa(vector);
        double resultadoReal=iterativa.buscarMaximo(vector);
        assertEquals(resultadoEsperado, resultadoReal, 0.1,"El resultado es erroneo");
        //delta el rango de error que hay, es la diferencia entre el numero esperoado y el real
    }

    @Test
    void buscarMaximoCN2() {
        double[] vector= {20.8,40.5,60.4,8.10,100.3};
        double resultadoEsperado=8.10;
        Iterativa iterativa = new Iterativa(vector);
        double resultadoReal=iterativa.buscarMaximo(vector);
        assertNotEquals(resultadoEsperado, resultadoReal, 0.1,"El resultado es erroneo");
    }

    @Test
    void buscarMaximoCB1() {
        double[] vector= new double[]{2.5,1};
        double resultadoEsperado=2.5;
        Iterativa iterativa = new Iterativa(vector);
        double resultadoReal=iterativa.buscarMaximo(vector);
        assertNotEquals(resultadoEsperado, resultadoReal, 0.1,"El resultado es erroneo");

    }

    @Test
    void buscarMinimoInternoCN1(){

    }

    @Test
    void obtenerValorEntreCN1() {

        boolean excepcionProducida=false;
        try{
            assertEquals(
            new Iterativa(new double[]{20,9.5,8.1,10}).obtenerValorEntre(1,100), 8.1, "error");
            excepcionProducida=false;
        }catch (Exception e){
            excepcionProducida=true;
        }

        assertEquals(excepcionProducida, true, "El codigo no ha producido una excepcion");

        //equivalente
        assertTrue(excepcionProducida, "El codigo no ha producido una excepcion");
    }

    //verifica datos en un array vacio
    @Test
    void verificarDatosInternosCN1() {
        Iterativa iterativa = new Iterativa(new double[]{});


    }

    //verificar datos que se salen de rango
    @Test
    void verificarDatosInternosCN2() {
        boolean excepcionProducida=false;

        try{
            new Iterativa(new double[]{8,15,42,7,96,110}).verificarDatosInternos();
        }catch (Exception e){
            excepcionProducida=true;
        }

        assertFalse(excepcionProducida, "El codigo no ha producido una excepcion");

    }

    //verificar datos que siestán dentro del rango
    @Test
    void verificarDatosInternosCN3() {
        boolean excepcionProducida=false;

        try{
            new Iterativa(new double[]{8,15,42,7,96,110}).verificarDatosInternos();
        }catch (Exception e){
            excepcionProducida=true;
        }

        assertFalse(excepcionProducida, "El codigo no ha producido una excepcion");

    }
}