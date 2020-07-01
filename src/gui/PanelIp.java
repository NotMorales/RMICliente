package gui;

import proyectormicliente.Ip;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import javax.swing.JOptionPane;


public final class PanelIp extends javax.swing.JPanel {
    
    public PanelIp(){
        initComponents();
        String IP = Ip.getIp();
        inputIpActual.setText( IP );
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inputIpActual = new RSMaterialComponent.RSTextFieldTwo();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        inputIpNueva = new RSMaterialComponent.RSTextFieldTwo();
        jSeparator1 = new javax.swing.JSeparator();
        btnGuardar = new RSMaterialComponent.RSButtonMaterialIconTwo();

        setBackground(new java.awt.Color(255, 255, 255));
        setName("PanelVerVentas"); // NOI18N
        setPreferredSize(new java.awt.Dimension(541, 357));

        inputIpActual.setEditable(false);
        inputIpActual.setForeground(new java.awt.Color(102, 102, 102));
        inputIpActual.setBorderColor(new java.awt.Color(100, 181, 246));
        inputIpActual.setPlaceholder("");
        inputIpActual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputIpActualActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Ip actual: ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Nueva Ip:");

        inputIpNueva.setForeground(new java.awt.Color(102, 102, 102));
        inputIpNueva.setBorderColor(new java.awt.Color(100, 181, 246));
        inputIpNueva.setPlaceholder("192.168.0.*");
        inputIpNueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputIpNuevaActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(51, 204, 0));
        btnGuardar.setText("Guardar nueva Ip");
        btnGuardar.setBackgroundHover(new java.awt.Color(51, 133, 23));
        btnGuardar.setFont(new java.awt.Font("Roboto Bold", 1, 16)); // NOI18N
        btnGuardar.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SAVE);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(inputIpActual, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputIpNueva, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(inputIpActual, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(inputIpNueva, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(119, Short.MAX_VALUE))
        );

        inputIpActual.getAccessibleContext().setAccessibleDescription("");
    }// </editor-fold>//GEN-END:initComponents

    private void inputIpActualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputIpActualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputIpActualActionPerformed

    private void inputIpNuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputIpNuevaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputIpNuevaActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String Val = inputIpNueva.getText();
        if( Val.length() == 0 ){
            JOptionPane.showMessageDialog(
                    this, 
                    "Ingrese Ip...",
                    "Validación",
                    JOptionPane.ERROR_MESSAGE);
            inputIpNueva.requestFocus();
            return;
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSButtonMaterialIconTwo btnGuardar;
    private RSMaterialComponent.RSTextFieldTwo inputIpActual;
    private RSMaterialComponent.RSTextFieldTwo inputIpNueva;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
