
package formularios;


public class Cuenta {
    private int noCuenta;
    private int contrasenia;

     public Cuenta(){
        System.out.println("Creando cuenta...");
        noCuenta=(int) (Math.random()*100000);
        contrasenia=(int) (Math.random()*100000);
    }
    
    public int getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(int contrasenia) {
        this.contrasenia = contrasenia;
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
        cad+="\nContraseña: "+getContrasenia();
        cad+="\n";
        return cad; 
    }
    
}
