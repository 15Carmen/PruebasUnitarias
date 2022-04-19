package Principal;

public class Iterativa {

    private double[] datos;
    private final int MINIMO_VALIDO=-100;
    private final int MAXIMO_VALIDO=1000;


    public Iterativa(double [] datos){
        this.datos=datos;
    }


    /**
     * hacer pruebas de caja negra
     * @param vector
     * @return
     */
    public double buscarMaximo(double[] vector){

        double maximo = vector[0];
        for (int i = 1; i< vector.length; i++){
            if (vector[i]>maximo){
                maximo=vector[i];
            }
        }
        return maximo;
    }

    public double buscarMinimoInterno() {
        double minimo = datos[0];
        for (int i = 1; i < datos.length; i++) {
            if (datos[i] < minimo)
                minimo = datos[i];
        }
        return minimo;
    }

    public void duplicarValores(){
        for (int i = 0; i< datos.length; i++){
            datos[i] *=2;
        }
    }



    /**
     * hacer pruebas de caja negra
     * @param minimo
     * @param maximo
     * @return
     * @throws Exception
     */

    public double obtenerValorEntre(double minimo, double maximo) throws Exception {
        boolean encontrado= false;
        double valor = 0;
        int i = 0;
        while (i<datos.length && !encontrado){
            if (datos[i]<=minimo || datos[i]>=maximo){
                encontrado=true;
                valor=datos[i];
            }
            i++;
        }
        if (!encontrado){
            throw new Exception("No hay ningún numero en el rango");
        }
        return valor;
    }



    /**
     * hacer pruebas de caja negra
     * @return
     * @throws Exception
     */

    public double primerNegativo() throws Exception {
        boolean encontrado= false;
        double valor = 0;
        int i = 0;
        while (i<datos.length && !encontrado){
            if (datos[i]<0){
                encontrado=true;
                valor=datos[i];
            }
            i++;
        }
        if (!encontrado){
            throw new Exception("No hay ningún numero negativo");
        }
        return valor;
    }

    public void verificarDatosInternos() throws Exception {
        boolean encontrado= false;
        double valor = 0;
        int i = 0;
        while (i<datos.length){
            if (datos[i]< MINIMO_VALIDO || datos[i]> MAXIMO_VALIDO){
                throw new Exception("Dato fuera del rango permitido");
            }
            i++;
        }
    }
}
