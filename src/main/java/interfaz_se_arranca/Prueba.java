package interfaz_se_arranca;

import java.util.ArrayList;

/**
 *
 * @author alvaro
 */
public class Prueba {
    public static void main(String[] args) {
        
        //no s epueden instanciar objetos de interfaces ni clases abstractas
        //no puedo hacer new vehiculo ni new se arranca
        
        Vehiculo v1 = new Turismo(); //conversion implicita
        Ordenador o1 = new Ordenador();
        SeArranca i1 = new Ordenador();     //la diferencia es que una es de tipo ordenador y otra de tipo interfaz
        SeArranca i2 = v1;   //se puede porque es un turismo
        
        System.out.println(i1.arrancar());
        
        
        ArrayList<SeArranca> listaArrancable = new ArrayList<>();
        
        listaArrancable.add(v1);
        listaArrancable.add(o1);
        listaArrancable.add(new Turismo());
        listaArrancable.add(new Ordenador());
        
        
        for (SeArranca obj : listaArrancable) {
            obj.arrancar();                 //puedo llamar al metodo arrancar porque todos implementan SeArranca
            if (obj instanceof Ordenador) {
                System.out.println(((Ordenador)obj).getPrecio());
            }
        }
        
    }
}
