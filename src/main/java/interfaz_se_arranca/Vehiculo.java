package interfaz_se_arranca;

/**
 *
 * @author alvaro
 */
public abstract class Vehiculo implements SeArranca,SePara,Comparable<Vehiculo>{
    
    private String matricula;

    
    
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public abstract void repostar();

    @Override
    public String toString() {
        return "Vehiculo{" + "matricula=" + matricula + '}';
    }
    
    
    
    
    //al implementa la interfaz SeArranca esta clase deberia dar codigo arranar(), pero al ser abstracta la debe de ejecutar la hija
    
    //si vehiculo implenta arranncar no le hara falta ejecutarla a la hija
    //si quitara este metodo, daria un error en turismo
    public boolean arrancar(){
        System.out.println("El turismo ha arrancado");
       return true;
    }
    
    
    
    
    public int compareTo(Vehiculo v){       //terminar compareto
        return this.matricula.compareTo(v.matricula);
    }

    
    
    @Override
    public boolean parar() {
        System.out.println("Se para");
        return true;
    }
    
}
