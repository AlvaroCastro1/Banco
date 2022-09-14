
package formularios;


public class Credito extends Tarjetas {
    private int lineaDeSaldo; 

    public Credito(String noTarjeta, String fechaV, String cvc, String fechaS, String propietario, String tipo, int lineaSal) {
        super(noTarjeta, fechaV, cvc, fechaS, propietario, tipo);
        lineaDeSaldo=lineaSal;
    }

    public int getLineaDeSaldo() {
        return lineaDeSaldo;
    }

    public void setLineaDeSaldo(int lineaDeSaldo) {
        this.lineaDeSaldo = lineaDeSaldo;
    }

   
public String toString(){
       String cad= "Debito"; 
       cad+="\nNumero de tarjeta: "+super.getNoTarjeta();
       cad+="\nFecha Vencimiento: "+super.getFechaV(); 
       cad+="\nCVC: "+super.getCvc();
       cad+="\nFecha de solicitud: "+super.getFechaS();
       cad+="\nPropietario: "+super.getPropietario();
       cad+="\nTipo: "+super.getTipo();
       cad+="\nLinea de saldo: "+getLineaDeSaldo();
       return cad;
   }

    
}
