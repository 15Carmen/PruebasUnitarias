package Principal;

public class Selectiva {

     int minimo=0;

    /**
     * hacer prueba de caja negra
     * @param x
     * @param y
     * @return
     */
    public int obteneMaximo(int x, int y){
        int maximo = x;

        if(maximo<y){
            maximo=y;
        }
        return maximo;
    }

    public void actualizarMinimo (int x){
        if (minimo > x){
            minimo = x;
        }
    }

    public void restaurarMinimoPositivo(){
        if (minimo < 0){
            minimo = 0;
        }
    }

    public void multiplicacionPorSigno(){
        if (minimo < 0){
            minimo*=-2;
        }else {
            minimo*=3;
        }
    }

    /**
     * hacer prueba de caja negra
     * @param opcion
     * @param a
     * @param b
     * @return
     */
    public int realizarCalculo (int opcion, int a, int b){
        int calculo=0;
        switch (opcion){
            case 0:
                calculo=a+b;
                break;
            case 1:
                calculo=a*b;
                break;
            default:
                calculo=-1;
        }
        return calculo;
    }


}
