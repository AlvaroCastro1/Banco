/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package formularios;

import java.awt.Color;
/**
 *
 * @author Alvaro
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_UserNuevo = new javax.swing.JButton();
        btn_TarjetaNueva = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 221, 140));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 0, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/3643769-building-home-house-main-menu-start_113416.png"))); // NOI18N
        jLabel1.setText("Menu");

        btn_UserNuevo.setBackground(new java.awt.Color(255, 221, 140));
        btn_UserNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/UserAdd_40960.png"))); // NOI18N
        btn_UserNuevo.setText("Registrar Cliente");
        btn_UserNuevo.setBorderPainted(false);
        btn_UserNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_UserNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_UserNuevoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_UserNuevoMouseExited(evt);
            }
        });
        btn_UserNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UserNuevoActionPerformed(evt);
            }
        });

        btn_TarjetaNueva.setBackground(new java.awt.Color(255, 221, 140));
        btn_TarjetaNueva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ididentitycarddriverlicense_109689.png"))); // NOI18N
        btn_TarjetaNueva.setText("Registrar Tarjeta");
        btn_TarjetaNueva.setBorderPainted(false);
        btn_TarjetaNueva.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_TarjetaNueva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_TarjetaNuevaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_TarjetaNuevaMouseExited(evt);
            }
        });
        btn_TarjetaNueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TarjetaNuevaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(203, 203, 203)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(btn_UserNuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                .addComponent(btn_TarjetaNueva)
                .addGap(84, 84, 84))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_UserNuevo)
                    .addComponent(btn_TarjetaNueva))
                .addContainerGap(180, Short.MAX_VALUE))
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

    private void btn_UserNuevoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_UserNuevoMouseEntered
        btn_UserNuevo.setBackground(new Color (98,153,122));
    }//GEN-LAST:event_btn_UserNuevoMouseEntered

    private void btn_UserNuevoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_UserNuevoMouseExited
        btn_UserNuevo.setBackground(new Color (255,221,140));
    }//GEN-LAST:event_btn_UserNuevoMouseExited

    private void btn_UserNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UserNuevoActionPerformed
        Registrar_Usuario ru = new Registrar_Usuario();
        ru.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_UserNuevoActionPerformed

    private void btn_TarjetaNuevaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_TarjetaNuevaMouseEntered
        btn_TarjetaNueva.setBackground(new Color (127,196,154));
    }//GEN-LAST:event_btn_TarjetaNuevaMouseEntered

    private void btn_TarjetaNuevaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_TarjetaNuevaMouseExited
        btn_TarjetaNueva.setBackground(new Color (255,221,140));
    }//GEN-LAST:event_btn_TarjetaNuevaMouseExited

    private void btn_TarjetaNuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TarjetaNuevaActionPerformed
        Registrar_Tarjeta r = new Registrar_Tarjeta();
        r.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_TarjetaNuevaActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_TarjetaNueva;
    private javax.swing.JButton btn_UserNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
