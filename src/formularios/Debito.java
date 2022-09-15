
package formularios;


public class Debito extends Tarjetas {
     
    
    public Debito(String noTarjeta, String fechaV, String cvc, String fechaS, String propietario,String tipo, int saldoI ) {
        super(noTarjeta, fechaV, cvc, fechaS, propietario,tipo );
        super.setLienaOsaldo(saldoI);
       
    }


    
   public String toString(){
       String cad= "\nDebito"; 
       cad+="\nNumero de tarjeta: "+super.getNoTarjeta();
       cad+="\nFecha Vencimiento: "+super.getFechaV(); 
       cad+="\nCVC: "+super.getCvc();
       cad+="\nFecha de solicitud: "+super.getFechaS();
       cad+="\nPropietario: "+super.getPropietario();
       cad+="\nTipo: "+super.getTipo();
       cad+="\nSaldo Inicial: "+super.getLienaOsaldo();
       return cad;
   }
           
    
}
