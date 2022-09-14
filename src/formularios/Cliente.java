
package formularios;


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
   public void LlenarTarjeta(Tarjetas tar){
       tarjeta[i]=tar;
       i=i++;
   }
    public Tarjetas[] getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Tarjetas[] tarjeta) {
        this.tarjeta = tarjeta;
    }
    
    
    public Cuenta getCuenta() {
        return cuenta;
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
        String cad="Cliente";
        cad+="Numero de cuenta: "+cuenta.toString();
        cad+="\nNombre: "+getNombres();
        cad+="\nApellido Paterno: "+getApellidoP();
        cad+="\nApellido Materno: "+getApellidoM();
        cad+="\nSexo: "+getSexo();
        cad+="\nFecha de Nacimiento: "+getFechaN();
        cad+="\nIngreso Mensual: "+getIngresoMens();
        cad+="\nDirección: "+getDireccion();
        cad+="\nRFC: "+getRfc();
       /* if(tarjeta!=null){
            for(int i=0;i<tarjeta.length;i++){
                cad+="\n"+tarjeta[i].toString();
            }*/
       return cad;
        }
  
    }

