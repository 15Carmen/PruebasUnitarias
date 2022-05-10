package test_prueba;

import Ejercicio_prueba_examen.Producto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class ProductoTest {

    private Producto producto;

    @Test
    void getDescripcion() {
        boolean hola=false;
        try{
            producto=new Producto("pendientes", 2.0);
        }catch (Exception e){
            hola=true;
        }
        assertFalse(hola, "El producto es correcto");
    }

    @Test
    void setDescripcionCN1() throws Exception {
        /*producto=new Producto("pendientes", 2.0);
        assertEquals("pendientes", producto.getDescripcion(), "Error! no funciona");
        */

        assertEquals("pendientes", new Producto("pendientes", 2.0).getDescripcion(), "Error! no funciona");
        }

    @Test
    void setDescripcionCN2() {

        boolean hola=false;
        try{
            producto=new Producto("", 2.0);
        }catch (Exception e){
            hola=true;
        }
       assertTrue(hola, "La excepción no ha saltado");
    }

    @Test
    void setDescripcionCN3() {

        boolean hola=false;
        try{
            producto=new Producto("´xcvjhdi`dxgh`zdi0fz`09fgu`z90xfugz¡09fug'`z0d9fug'`z0df9ugz'0dfugz'", 2.0);
        }catch (Exception e){
            hola=true;
        }
        assertTrue(hola, "La excepción no ha saltado");
    }

    @Test
    void getPrecio() {
    }

    @Test
    void setPrecio() {
    }
}