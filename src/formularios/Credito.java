
package formularios;


public class Credito extends Tarjetas {
   

    public Credito(String noTarjeta, String fechaV, String cvc, String fechaS, String propietario, String tipo, int lineaSal) {
        super(noTarjeta, fechaV, cvc, fechaS, propietario, tipo);
        super.setLienaOsaldo(lineaSal);
    }

   
public String toString(){
       String cad= "\nCredito"; 
       cad+="\nNumero de tarjeta: "+super.getNoTarjeta();
       cad+="\nFecha Vencimiento: "+super.getFechaV(); 
       cad+="\nCVC: "+super.getCvc();
       cad+="\nFecha de solicitud: "+super.getFechaS();
       cad+="\nPropietario: "+super.getPropietario();
       cad+="\nTipo: "+super.getTipo();
       cad+="\nLinea de saldo: "+super.getLienaOsaldo();
       return cad;
   }

    
}
