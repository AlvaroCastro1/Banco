
package formularios;

public class Tarjetas {

    private String noTarjeta;
    private String fechaV;
    private String cvc;
    private String fechaS,propietario, tipo;
    private int lienaOsaldo, deuda;

    Tarjetas(String noTarjeta, String fechaV, String cvc, String fechaS, String propietario, String tipo) {
        this.noTarjeta = noTarjeta;
        this.fechaV = fechaV;
        this.cvc = cvc;
        this.fechaS = fechaS;
        this.propietario = propietario;
        this.tipo = tipo;
    }

    public int getDeuda() {
        return deuda;
    }

    public void setDeuda(int deuda) {
        this.deuda = deuda;
    }

    public int getLienaOsaldo() {
        return lienaOsaldo;
    }

    public void setLienaOsaldo(int lienaOsaldo) {
        this.lienaOsaldo = lienaOsaldo;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNoTarjeta() {
        return noTarjeta;
    }

    public void setNoTarjeta(String noTarjeta) {
        this.noTarjeta = noTarjeta;
    }

    public String getFechaV() {
        return fechaV;
    }

    public void setFechaV(String fechaV) {
        this.fechaV = fechaV;
    }

    public String getCvc() {
        return cvc;
    }

    public void setCvc(String cvc) {
        this.cvc = cvc;
    }

    public String getFechaS() {
        return fechaS;
    }

    public void setFechaS(String fechaS) {
        this.fechaS = fechaS;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
}
