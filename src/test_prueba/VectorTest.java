package test_prueba;

import Ejercicio_prueba_examen.Vector;
import Principal.Secuencial;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VectorTest {


    @Test
    void VectorCN1() {
        double[] datos = new double[]{1,2,3};
        assertArrayEquals(new Vector(datos).vector, datos,
                "Vector creado de forma erronea");

    }

    @Test
    void VectorCN2() {
        double[] datos = new double[0];
        assertArrayEquals(new Vector(datos).vector, datos,
                "Vector creado de forma erronea");

    }

    @Test
    void VectorCN3() {
        boolean excepcionProducida =false;
        try{
            new Vector(new double[0]);
        }catch(Exception e){
            excepcionProducida=true;
        }
        assertTrue(excepcionProducida);

    }

    @Test
    void duplicarValoresCN1() {

        Vector vector = new Vector(new double[]{3,5,-5});
        vector.duplicarValores();
        assertArrayEquals(vector.vector, new double[]{6,10,-10},
                "Duplicado erroneo");

    }

    @Test
    void duplicarValoresCN2() {
        Vector vector = new Vector(new double[]{});
        vector.duplicarValores();
        assertArrayEquals(vector.vector, new double[]{},
                "Duplicado erroneo");

    }

    @Test
    void duplicarValoresCB1() {
        Vector vector = new Vector(new double[]{2.4});
        vector.duplicarValores();
        assertArrayEquals(vector.vector, new double[]{4.8},
                "Duplicado erroneo");

    }

    @Test
    void obtenerMáximoCN1() throws Exception{
       assertEquals(
               new Vector(new double[]{2.5,5.6,-5.9,8.6}).obtenerMáximo(), 8.6);
    }

    @Test
    void obtenerMáximoCN2(){
        boolean exepcionProducida=false;

        try {
            new Vector(new double[0]).obtenerMáximo();
        } catch (Exception e) {
            exepcionProducida=true;
        }
        assertTrue(exepcionProducida);
    }

    @Test
    void obtenerMáximoCB1() throws Exception{
        assertEquals(
                new Vector(new double[]{2.5,5.6,-5.9,8.6}).obtenerMáximo(), 8.6);
    }

    @Test
    void contieneValorCN1() {
        assertTrue(new Vector(new double[]{23,97,12,6}).contieneValor(23));
    }

    @Test
    void contieneValorCN2() {
        assertFalse(new Vector(new double[]{23,97,12,6}).contieneValor(3));
    }

    @Test
    void contieneValorCN3() {
        assertFalse(new Vector(new double[0]).contieneValor(3));
    }

    @Test
    void contieneValorCB1() {
        assertTrue(new Vector(new double[]{23}).contieneValor(23));
    }

    @Test
    void contieneValorCB2() {
        assertFalse(new Vector(new double[]{12}).contieneValor(23));
    }

}