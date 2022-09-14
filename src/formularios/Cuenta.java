
package formularios;


public class Cuenta {
    private int noCuenta;
    
    public Cuenta(){
        System.out.println("Creando cuenta...");
        noCuenta= noCuenta+1;
    }

    public int getNoCuenta() {
        return noCuenta;
    }

    public void setNoCuenta(int noCuenta) {
        this.noCuenta = noCuenta;
    }

   
    public String toString() {
        String cad="\n";
        cad+="\nNumero de cuenta: "+getNoCuenta();
        return cad; 
    }
    
}
