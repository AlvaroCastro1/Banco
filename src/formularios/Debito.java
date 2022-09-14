
package formularios;


public class Debito extends Tarjetas {
    private int saldoInicial; 
    
    public Debito(String noTarjeta, String fechaV, String cvc, String fechaS, String propietario,String tipo, int saldoI ) {
        super(noTarjeta, fechaV, cvc, fechaS, propietario,tipo );
        this.saldoInicial=saldoI;
       
    }

    public int getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(int saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    
   public String toString(){
       String cad= "Debito"; 
       cad+="\nNumero de tarjeta: "+super.getNoTarjeta();
       cad+="\nFecha Vencimiento:"+super.getFechaV(); 
       cad+="\nCVC:"+super.getCvc();
       cad+="\nFecha de solicitud:"+super.getFechaS();
       cad+="\nPropietario:"+super.getPropietario();
       cad+="\nTipo:"+super.getTipo();
       cad+="\nSaldo Inicial:"+getSaldoInicial();
       return cad;
   }
           
    
}
