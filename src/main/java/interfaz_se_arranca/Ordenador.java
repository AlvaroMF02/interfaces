package interfaz_se_arranca;

/**
 *
 * @author alvaro
 */
public class Ordenador implements SeArranca,SePara{    //da un error tal cual lo implemenas ya que no es abstracta
                                                //puedes hacerla abastractta o implementar el metodo arrancar
    
    private double precio;

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Ordenador{" + "precio=" + precio + '}';
    }

    @Override
    public boolean arrancar() {
        System.out.println("El ordenador esta arrancado");
        return true;
    }


    @Override
    public boolean parar() {
        System.out.println("El ordenador esta parado");
        return true;
    }
}
