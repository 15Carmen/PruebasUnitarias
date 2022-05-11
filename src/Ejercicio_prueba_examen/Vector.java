package Ejercicio_prueba_examen;

public class Vector {

    public double vector[];

    public Vector(double[] vector){
        this.vector=vector.clone();
    }

    public void duplicarValores(){
        for (int i = 0; i< vector.length; i++){
            vector[i] *=2;
        }
    }

    /**
     * Si el vector está vacío lanza una excepción
     * @return
     */
    public double obtenerMáximo() throws Exception {

        if (vector.length==0){
            throw new Exception("No hay datos");
        }

        double maximo = vector[0];
        for (int i = 1; i < vector.length; i++) {
            if (vector[i] > maximo)
                maximo = vector[i];
        }
        return maximo;
    }

    public boolean contieneValor(double valor){
        boolean valorEncontrado=false;
        int i=0;
        while(!valorEncontrado && i< vector.length){
            if (vector[i]==valor){
                    valorEncontrado=true;
            }
            i++;
        }
        return valorEncontrado;
    }

}
