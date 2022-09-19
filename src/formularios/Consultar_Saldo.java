
package formularios;

import java.awt.Color;
import javax.swing.JOptionPane;

public class Consultar_Saldo extends javax.swing.JFrame {
    private Cliente[] cliente= new Cliente[5000];
    private int id;
    private int marcador;
    
    public Consultar_Saldo() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public Consultar_Saldo(Cliente[] Cliente, int id) {
        cliente=Cliente;
        this.id=id;
        initComponents();
    }
        public boolean BuscarUsuario(){
        int BCuenta =Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cuenta"));
        int BContra=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la Contraseña"));
        for(int i=0;i<id; i++){
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
        btn_ConsultaS = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        btn_limpiar.setBackground(new java.awt.Color(255, 204, 204));
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
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/carduse_card_payment_5122.png"))); // NOI18N
        jLabel1.setText("Consultar Tarjeta");

        jLabel2.setText("Numero Tarjeta:");

        btn_ConsultaS.setBackground(new java.awt.Color(255, 204, 204));
        btn_ConsultaS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/carduse_card_payment_5122.png"))); // NOI18N
        btn_ConsultaS.setText("Consultar saldo");
        btn_ConsultaS.setBorderPainted(false);
        btn_ConsultaS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_ConsultaS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_ConsultaSMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_ConsultaSMouseExited(evt);
            }
        });
        btn_ConsultaS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ConsultaSActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(39, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(37, 37, 37)
                        .addComponent(txt_NumTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(btn_limpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_ConsultaS)))
                .addGap(130, 130, 130))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(85, 85, 85))
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
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ConsultaS)
                    .addComponent(btn_limpiar))
                .addContainerGap(131, Short.MAX_VALUE))
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
        btn_limpiar.setBackground(new Color (255,204,204));
    }//GEN-LAST:event_btn_limpiarMouseEntered

    private void btn_limpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_limpiarMouseExited
        btn_limpiar.setBackground(new Color (255,204,204));
    }//GEN-LAST:event_btn_limpiarMouseExited

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        Limpiar();
    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void btn_ConsultaSMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ConsultaSMouseEntered
        btn_ConsultaS.setBackground(new Color (255,204,204));
    }//GEN-LAST:event_btn_ConsultaSMouseEntered

    private void btn_ConsultaSMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ConsultaSMouseExited
        btn_ConsultaS.setBackground(new Color (255,204,204));
    }//GEN-LAST:event_btn_ConsultaSMouseExited

    private void btn_ConsultaSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ConsultaSActionPerformed
        if(txt_NumTarjeta.getText()==""){
            JOptionPane.showMessageDialog(null, "LLENA TODOS LOS CAMPOS :/");
        }
        else{
            for(int i=0;i<10;i++){
               if(cliente[marcador].getNoTarjeta(i).equals(txt_NumTarjeta.getText())){
                    if(cliente[marcador].getTipo()=="Credito"){
                        JOptionPane.showMessageDialog(null, "SU SALDO ES DE: "+cliente[marcador].getLienaOsaldo(i));
                        break;
                    }
                    if(cliente[marcador].getTipo()=="Debito"){
                        JOptionPane.showMessageDialog(null, "SU DEUDA ES DE: "+cliente[marcador].getDeuda(i));
                        break;
                    }
               }
            }
        }
        Limpiar();
    }//GEN-LAST:event_btn_ConsultaSActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Menu m = new Menu();
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
            java.util.logging.Logger.getLogger(Consultar_Saldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consultar_Saldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consultar_Saldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consultar_Saldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consultar_Saldo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ConsultaS;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_NumTarjeta;
    // End of variables declaration//GEN-END:variables
}
