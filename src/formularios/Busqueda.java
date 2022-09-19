package formularios;

import javax.swing.JOptionPane;

public class Busqueda {

    Cliente[] Cliente = new Cliente[5000];
    int id;

    public Busqueda(Cliente[] Cliente, int id) {
        this.id = id;
        this.Cliente = Cliente;
    }

    public boolean BuscarUsuario() {
        String SBCuenta = JOptionPane.showInputDialog(null, "Ingrese la cuenta");

        if (SBCuenta == null) {
            //click on boton cancel
        } else if (SBCuenta.equals("")) {
            JOptionPane.showMessageDialog(null, "Ingresa una Cuenta valida", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            //validar contraseña
            String SBContra = JOptionPane.showInputDialog(null, "Ingrese la Contraseña");
            if (SBContra == null) {
                //click on boton cancel
            } else if (SBContra.equals("")) {
                JOptionPane.showMessageDialog(null, "Ingresa una Contraseña valida", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "validacion correctas");
                int BCuenta = Integer.parseInt(SBCuenta);
                int BContra = Integer.parseInt(SBContra);
                for (int i = 0; i < Cliente.length; i++) {
                    if (Cliente[i] == null) {
                        //elemento vacio
                    } else {
                        if (BCuenta == Cliente[i].getNoCuenta() && BContra == Cliente[i].getContrasenia()) {
                            JOptionPane.showMessageDialog(null, "Usuario y contraseña son correctos");
                            return true;
                        }
                    }
                }
                JOptionPane.showMessageDialog(null, "El cliente o la contraseña son erroneos o no se encuentran, vuelvalo a intentar o registrese");
                return false;
            }
        }
        return false;
    }

    public boolean BuscarTarjeta() {
        String SNumTarjeta = JOptionPane.showInputDialog(null, "Ingrese el Numero de tarjeta");

        if (SNumTarjeta == null) {
            //click on boton cancel
        } else if (SNumTarjeta.equals("")) {
            JOptionPane.showMessageDialog(null, "Ingresa una Tarjeta valida", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            //validar contraseña
            String S_CVC = JOptionPane.showInputDialog(null, "Ingrese el CVC");
            if (S_CVC == null) {
                //click on boton cancel
            } else if (S_CVC.equals("")) {
                JOptionPane.showMessageDialog(null, "Ingresa un CVC valido", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Verificando ...");

                for (int i = 0; i < Cliente.length; i++) {
                    for (int j = 0; j < 10; j++) {
                        if (Cliente[i] != null) {
                            if (Cliente[i].getTarjetaOne(j) != null) {
                                if (Cliente[i].getTarjetaOne(j).equals(SNumTarjeta) && Cliente[i].getTarjetaOneCVC(j).equals(S_CVC)) {
                                    RecargarSaldo r = new RecargarSaldo(Cliente, id);
                                    r.enviarDatos(i, j, SNumTarjeta, S_CVC);
                                    return true;
                                } else {
                                    JOptionPane.showMessageDialog(null, "Tarjeta NO valida", "Error", JOptionPane.ERROR_MESSAGE);
                                    return false;
                                }
                            } else {
                                //elem vacio
                            }
                        } else {
                            //elemento vacios
                        }
                    }
                }
                JOptionPane.showMessageDialog(null, "Tarjeta NO valida", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
        return false;
    }
}
