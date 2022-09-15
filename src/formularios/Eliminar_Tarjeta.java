
package formularios;

import java.awt.Color;
import javax.swing.JOptionPane;

public class Eliminar_Tarjeta extends javax.swing.JFrame {
    Cliente[] cliente= new Cliente[5000];
    int id;
    int marcador; 

    public Eliminar_Tarjeta(Cliente[] cliente, int id) {
        this.cliente=cliente;
        this.id=id;
        initComponents();
        this.setLocationRelativeTo(null);
    }
    //metodo que pide la cuenta y contraseña para buscar si coincide con alguna que se encuentre en el arreglo Cliente
    public boolean BuscarUsuario(){
        int BCuenta =Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cuenta"));
        int BContra=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la Contraseña"));
        for(int i=0;i<id; i++){
            //si coinciden muestra un mensaje y guarda su posicion en la variable marcador para trabajar sonbre ese indice 
            if(BCuenta==cliente[i].getNoCuenta() || BContra==cliente[i].getContrasenia()){
                JOptionPane.showMessageDialog(null, "Usuario y contraseña son correctos"); 
                marcador=i;
                return true;
            }
            else{
                JOptionPane.showMessageDialog(null, "El cliente o la contraseña son erroneos o no se encuentran, vuelvalo a intentar o registrese");
            }
        }
            return false;
    }

    private Eliminar_Tarjeta() {
        initComponents();
    }
    
    //metodo para limpiar los datos
    public void Limpiar(){
        txt_NumTarjeta.setText("");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_NumTarjeta = new javax.swing.JTextField();
        btn_limpiar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_EliminarTarjeta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        btn_limpiar.setBackground(new java.awt.Color(204, 204, 255));
        btn_limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/3808224-broomstick-fly-magic-witch_109093.png"))); // NOI18N
        btn_limpiar.setText("Limpiar");
        btn_limpiar.setBorderPainted(false);
        btn_limpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_limpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_limpiarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_limpiarMouseExited(evt);
            }
        });
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 0, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancelcreditcard_120838.png"))); // NOI18N
        jLabel1.setText("Eliminar Tarjeta");

        jLabel2.setText("Numero Tarjeta:");

        btn_EliminarTarjeta.setBackground(new java.awt.Color(204, 204, 255));
        btn_EliminarTarjeta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancelcreditcard_120838.png"))); // NOI18N
        btn_EliminarTarjeta.setText("Eliminar Tarjeta");
        btn_EliminarTarjeta.setBorderPainted(false);
        btn_EliminarTarjeta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_EliminarTarjeta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_EliminarTarjetaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_EliminarTarjetaMouseExited(evt);
            }
        });
        btn_EliminarTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarTarjetaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_limpiar)
                                .addGap(64, 64, 64)
                                .addComponent(btn_EliminarTarjeta))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(37, 37, 37)
                                .addComponent(txt_NumTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(85, 85, 85))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_NumTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_EliminarTarjeta)
                    .addComponent(btn_limpiar))
                .addContainerGap(122, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_limpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_limpiarMouseEntered
         btn_limpiar.setBackground(new Color (204,204,255));
    }//GEN-LAST:event_btn_limpiarMouseEntered

    private void btn_limpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_limpiarMouseExited
        btn_limpiar.setBackground(new Color (204,204,255));
    }//GEN-LAST:event_btn_limpiarMouseExited

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        Limpiar();
    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void btn_EliminarTarjetaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_EliminarTarjetaMouseEntered
    btn_EliminarTarjeta.setBackground(new Color (204,204,255));    
    }//GEN-LAST:event_btn_EliminarTarjetaMouseEntered

    private void btn_EliminarTarjetaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_EliminarTarjetaMouseExited
        btn_EliminarTarjeta.setBackground(new Color (204,204,255));
    }//GEN-LAST:event_btn_EliminarTarjetaMouseExited

    private void btn_EliminarTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarTarjetaActionPerformed
        if(txt_NumTarjeta.getText()==""){
            JOptionPane.showMessageDialog(null, "LLENA TODOS LOS CAMPOS :/");
        }
        else{
            String encontrado = null;
            for(int i=0;i<10;i++){
               if(cliente[marcador].getNoTarjeta(i).equals(txt_NumTarjeta.getText())){
                    if(cliente[marcador].getTipo()=="Credito"){
                        cliente[marcador].Cobrar(i, cliente[marcador].getLienaOsaldo(i));
                        cliente[marcador].BorrarTarjeta(i);
                        encontrado="Tarjeta borrada";
                        break; 
                    }
                    if(cliente[marcador].getTipo()=="Debito"){
                        if(cliente[marcador].getDeuda(i)==0){
                            cliente[marcador].BorrarTarjeta(i);
                            encontrado="Tarjeta borrada";
                            break; 
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "No se puede borrar su tarjeta, tiene una deuda de: "+cliente[marcador].getDeuda(i));
                        }
                    }    
               }
               encontrado="No existe la tarjeta, revisa si esta bien escrito el numero de tarjeta";
            }
            JOptionPane.showMessageDialog(null, "Ta bien");
            JOptionPane.showMessageDialog(null, encontrado);
        }
        Limpiar();
        System.out.println(cliente[marcador].toString());
    }//GEN-LAST:event_btn_EliminarTarjetaActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Menu m = new Menu(cliente, id);
        m.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Eliminar_Tarjeta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Eliminar_Tarjeta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Eliminar_Tarjeta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Eliminar_Tarjeta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Eliminar_Tarjeta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_EliminarTarjeta;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_NumTarjeta;
    // End of variables declaration//GEN-END:variables
}
