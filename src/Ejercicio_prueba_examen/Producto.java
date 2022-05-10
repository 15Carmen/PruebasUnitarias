package Ejercicio_prueba_examen;

public class Producto {

    private String descripcion;
    private double precio;

    public Producto(String descripcion, double precio) throws Exception {
      setPrecio(precio);
      setDescripcion(descripcion);
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) throws Exception {
        if (descripcion.length()<1||descripcion.length()>50){
            throw new Exception(
                    String.format("La longitud %d de descripción es incorrecta", descripcion.length())
            );
        }
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) throws Exception {
        if(precio<=0){
            throw new Exception(
                    String.format("El precio %f es incorrecto", precio)
            );
        }
        this.precio = precio;
    }


}
