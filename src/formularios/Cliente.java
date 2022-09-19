
package formularios;

import javax.swing.JOptionPane;


public class Cliente {
    
    private Cuenta cuenta; 
    private String nombres,apellidoP,apellidoM, sexo, fechaN, direccion,rfc;
    private String ingresoMens;
    //Arreglo de tarjetas porque un cliente puede tener varias tarjetas 
    private Tarjetas[] tarjeta= new Tarjetas[10]; 
    private int i;
    
    public Cliente(String nom,String apP,String apM, String sexo,String fecN,String ingre,String direc,String RFC){
       //para crear un Cliente es necesario enviar todos esos parametros
        this.nombres= nom;
        this.apellidoP= apP;
        this.apellidoM=apM;
        this.sexo= sexo;
        this.fechaN=fecN;
        this.ingresoMens= ingre;
        this.direccion= direc;
        this.rfc= RFC;
        //Al crear nuestro Cliente se crea una cuenta (Composición)
        cuenta= new Cuenta();    
    }
    public Cliente(){
        
    }
    public void LlenarTarjeta(Tarjetas tar){
        for(i=0;i<tarjeta.length;i++){
            if(tarjeta[i]==null){
                tarjeta[i]=tar;
                break;
            }
            else{
                System.out.println("Has alcanzado el maximo de tarjetas");
            }
        }  
    }
    public void ImprimirTarjetas(){
        for(int j=0;j<i; j++){
            System.out.println(tarjeta[j]);
        }
    }
    public Tarjetas[] getTarjeta() {
        return tarjeta;
    }
    public String getTarjetaOneTipo(int a) {
        return tarjeta[a].getTipo();
    }
    
    public String getTarjetaOne(int a) {
        return tarjeta[a].getNoTarjeta();
    }
    
    public String getTarjetaOneCVC(int a) {
        return tarjeta[a].getCvc();
    }
    
    public int getTarjetaOneLineaOSaldo(int a) {
        return tarjeta[a].getLienaOsaldo();
    }
    
    public void setTarjetaOneLineaOSaldo(int i,int a) {
        tarjeta[i].setLienaOsaldo(a);
    }
    
    public void BorrarTarjeta(int i){  
        tarjeta[i]=null;
    }

    public void setTarjeta(Tarjetas[] tarjeta) {
        this.tarjeta = tarjeta;
    }
    public String getNoTarjeta(int i){
        String cad = null;
        if(tarjeta[i]!=null){
            cad=tarjeta[i].getNoTarjeta();
            return cad;
        }
        return "";
    }
    public int getLienaOsaldo(int i){
        int cad = 0;
        if(tarjeta[i]!=null){
            cad=tarjeta[i].getLienaOsaldo();
            return cad;
        }
        return 0;
    }
    public int getDeuda(int i){
        int cad = 0;
        if(tarjeta[i]!=null){
            cad=tarjeta[i].getDeuda();
            return cad;
        }
        return 0;
    }
    
    public void Cobrar(int i, int cobro){
        if(tarjeta[i] == null){
            System.out.println("VACIO TARJETA");
        }else{
            if(tarjeta[i].getTipo()=="Credito"){
                if(tarjeta[i].getLienaOsaldo()!=0){
                    tarjeta[i].setLienaOsaldo(tarjeta[i].getLienaOsaldo()-cobro);
                    JOptionPane.showMessageDialog(null, "Retirando: "+cobro);
                }
                if(tarjeta[i].getLienaOsaldo()==0){
                    JOptionPane.showMessageDialog(null, "No tiene saldo en su tarjeta, no puede cobrar");
                }
            }
            if(tarjeta[i].getTipo()=="Debito"){
                if(tarjeta[i].getDeuda()==tarjeta[i].getLienaOsaldo()){
                    JOptionPane.showMessageDialog(null, "su tarjeta alcanzó el limite, no puede cobrar mas");
                }
                if(tarjeta[i].getDeuda()!=tarjeta[i].getLienaOsaldo()){
                    tarjeta[i].setDeuda(tarjeta[i].getDeuda()+cobro);
                    JOptionPane.showMessageDialog(null, "Retirando: "+cobro);
                }
            }
        }
    }
    public String getTipo(){
          String cad = null;
        if(tarjeta[i]!=null){
            cad=tarjeta[i].getTipo();
            return cad;
        }
        return "";
    }
    
    
    public String getCuenta() {
        return cuenta.toString();
    }
    public int getContrasenia(){
        return cuenta.getContrasenia();
    }
    public int getNoCuenta(){
        return cuenta.getNoCuenta();
    }
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getFechaN() {
        return fechaN;
    }

    public void setFechaN(String fechaN) {
        this.fechaN = fechaN;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }
    
    public String getIngresoMens() {
        return ingresoMens;
    }

    public void setIngresoMens(String ingresoMens) {
        this.ingresoMens = ingresoMens;
    }

    
    public String toString() {
        String cad="\nCliente";
        cad+="Numero de cuenta: "+cuenta.toString();
        cad+="\nNombre: "+getNombres();
        cad+="\nApellido Paterno: "+getApellidoP();
        cad+="\nApellido Materno: "+getApellidoM();
        cad+="\nSexo: "+getSexo();
        cad+="\nFecha de Nacimiento: "+getFechaN();
        cad+="\nIngreso Mensual: "+getIngresoMens();
        cad+="\nDirección: "+getDireccion();
        cad+="\nRFC: "+getRfc();
        cad+="\n" ;
            for(int j=0;j<tarjeta.length; j++){
                if(tarjeta[j]==null){
                    cad+="\n";
                }
                if(tarjeta[j]!=null){
                   cad+="\nTarjetas: "+tarjeta[j].toString();
                }
            }
            

        return cad;
    }
}

