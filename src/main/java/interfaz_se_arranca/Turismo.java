package interfaz_se_arranca;

/**
 *
 * @author alvaro
 */
public class Turismo extends Vehiculo{
    private int numPuertas;

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nTurismo{" + "numPuertas=" + numPuertas + '}';
    }
    
    
    public void repostar(){
        System.out.println("El turismo reposta ");
    }
    
    
}
