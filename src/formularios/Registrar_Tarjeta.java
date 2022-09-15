
package formularios;

import javax.swing.JOptionPane;
import java.awt.Color;
import java.util.LinkedList;


public class Registrar_Tarjeta extends javax.swing.JFrame {
        Cliente[] Cliente = new Cliente[5000];
        int id;
        int marcador;
    
    public Registrar_Tarjeta( Cliente[] Cliente, int id) {
        this.id=id;
        this.Cliente= Cliente;
        initComponents();
        this.setLocationRelativeTo(null);
        et_LineaOsaldo.setVisible(false);
        txt_lienaOsaldo.setVisible(false);
        
        
    }
    public boolean BuscarUsuario(){
        int BCuenta =Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cuenta"));
        int BContra=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la Contraseña"));
        for(int i=0;i<id; i++){
            if(BCuenta==Cliente[i].getNoCuenta() || BContra==Cliente[i].getContrasenia()){
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

    private Registrar_Tarjeta() {
        initComponents();
        BuscarUsuario();
        this.setLocationRelativeTo(null);
        et_LineaOsaldo.setVisible(false);
        txt_lienaOsaldo.setVisible(false);
      
    }
   


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_NumTarjeta = new javax.swing.JTextField();
        txt_FechaVenci = new javax.swing.JTextField();
        cb_tipo = new javax.swing.JComboBox<>();
        txt_CVC = new javax.swing.JTextField();
        txt_Propietario = new javax.swing.JTextField();
        btn_limpiar = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();
        txt_fehcaSoli = new javax.swing.JTextField();
        et_LineaOsaldo = new javax.swing.JLabel();
        txt_lienaOsaldo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(188, 216, 251));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 0, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/4105938-account-card-id-identification-identity-card-profile-user-profile_113929.png"))); // NOI18N
        jLabel1.setText(" Nueva Tarjeta");

        jLabel2.setText("Numero Tarjeta:");

        jLabel3.setText("Fecha Vencimiento:");

        jLabel4.setText("CVC");

        jLabel5.setText("Tipo");

        jLabel6.setText("Fecha de Solicitud:");

        jLabel7.setText("Propietario:");

        cb_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Credito", "Debito" }));
        cb_tipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_tipoItemStateChanged(evt);
            }
        });
        cb_tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_tipoActionPerformed(evt);
            }
        });

        btn_limpiar.setBackground(new java.awt.Color(188, 216, 251));
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

        btn_guardar.setBackground(new java.awt.Color(188, 216, 251));
        btn_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ididentitycarddriverlicense_109689.png"))); // NOI18N
        btn_guardar.setText("Guardar");
        btn_guardar.setBorderPainted(false);
        btn_guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_guardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_guardarMouseExited(evt);
            }
        });
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        txt_fehcaSoli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fehcaSoliActionPerformed(evt);
            }
        });

        et_LineaOsaldo.setText("ejemplo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(jLabel1)
                .addGap(0, 150, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_limpiar)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_CVC, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(txt_FechaVenci, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_NumTarjeta, javax.swing.GroupLayout.Alignment.LEADING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_Propietario, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(txt_fehcaSoli)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(et_LineaOsaldo))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cb_tipo, 0, 100, Short.MAX_VALUE)
                            .addComponent(txt_lienaOsaldo)))
                    .addComponent(btn_guardar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txt_fehcaSoli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txt_Propietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cb_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_NumTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_FechaVenci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txt_CVC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(et_LineaOsaldo)
                    .addComponent(txt_lienaOsaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_limpiar)
                    .addComponent(btn_guardar))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_limpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_limpiarMouseEntered
        btn_limpiar.setBackground(new Color (98,153,122));
    }//GEN-LAST:event_btn_limpiarMouseEntered

    private void btn_limpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_limpiarMouseExited
        btn_limpiar.setBackground(new Color (188,216,251));
    }//GEN-LAST:event_btn_limpiarMouseExited
    public void Limpiar(){
        txt_fehcaSoli.setText("");
        txt_NumTarjeta.setText("");
        txt_FechaVenci.setText("");
        txt_CVC.setText("");
        txt_Propietario.setText("");
        cb_tipo.setSelectedIndex(0);
        txt_FechaVenci.setText("");
        txt_lienaOsaldo.setText("");
    }
    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        Limpiar();
    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void btn_guardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_guardarMouseEntered
        btn_guardar.setBackground(new Color (127,196,154));
    }//GEN-LAST:event_btn_guardarMouseEntered

    private void btn_guardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_guardarMouseExited
        btn_guardar.setBackground(new Color (188,216,251));
    }//GEN-LAST:event_btn_guardarMouseExited

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        if(txt_NumTarjeta.getText().isEmpty() || txt_FechaVenci.getText().isEmpty() ||txt_CVC.getText().isEmpty() || txt_Propietario.getText().isEmpty()
            || cb_tipo.getSelectedItem() == "Seleccione" || txt_FechaVenci.getText().isEmpty() || txt_lienaOsaldo.getText().isEmpty() ){
            JOptionPane.showMessageDialog(null, "LLENA TODOS LOS CAMPOS :/");
        }else{
            if(cb_tipo.getSelectedItem()=="Credito"){
                Credito c1 = new Credito(txt_NumTarjeta.getText(),txt_FechaVenci.getText(),txt_CVC.getText(),txt_fehcaSoli.getText(),txt_Propietario.getText(),
                (String)cb_tipo.getSelectedItem(), Integer.parseInt(txt_lienaOsaldo.getText()));
                Cliente[marcador].LlenarTarjeta(c1);
                System.out.println(Cliente[marcador].toString());
  
            }
            if(cb_tipo.getSelectedItem()=="Debito"){
                 Debito d1 = new Debito(txt_NumTarjeta.getText(),txt_FechaVenci.getText(),txt_CVC.getText(),txt_fehcaSoli.getText(),txt_Propietario.getText(),
                (String)cb_tipo.getSelectedItem(), Integer.parseInt(txt_lienaOsaldo.getText()));
                Cliente[marcador].LlenarTarjeta(d1);
                System.out.println(Cliente[marcador].toString());
                
            }
            JOptionPane.showMessageDialog(null, "TA BIEN");
            Limpiar();
            //guardar datos
        }
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void cb_tipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_tipoItemStateChanged
        
        if (cb_tipo.getSelectedItem()== "Credito") {
            et_LineaOsaldo.setText("Linea de saldo:");
            et_LineaOsaldo.setVisible(true);
            txt_lienaOsaldo.setVisible(true);
        }else if(cb_tipo.getSelectedItem()== "Seleccione"){
            et_LineaOsaldo.setVisible(false);
            txt_lienaOsaldo.setVisible(false);
        }else{
            et_LineaOsaldo.setText("Saldo inicial:");
            et_LineaOsaldo.setVisible(true);
            txt_lienaOsaldo.setVisible(true);
        }
    }//GEN-LAST:event_cb_tipoItemStateChanged

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Menu m = new Menu(Cliente, id);
        m.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_formWindowClosing

    private void cb_tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_tipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_tipoActionPerformed

    private void txt_fehcaSoliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fehcaSoliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_fehcaSoliActionPerformed

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
            java.util.logging.Logger.getLogger(Registrar_Tarjeta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrar_Tarjeta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrar_Tarjeta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrar_Tarjeta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrar_Tarjeta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JComboBox<String> cb_tipo;
    private javax.swing.JLabel et_LineaOsaldo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_CVC;
    private javax.swing.JTextField txt_FechaVenci;
    private javax.swing.JTextField txt_NumTarjeta;
    private javax.swing.JTextField txt_Propietario;
    private javax.swing.JTextField txt_fehcaSoli;
    private javax.swing.JTextField txt_lienaOsaldo;
    // End of variables declaration//GEN-END:variables
}
