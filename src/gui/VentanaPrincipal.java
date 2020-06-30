package gui;

import java.awt.Color;
import java.awt.Component;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class VentanaPrincipal extends javax.swing.JFrame {

    private PanelVerProductos panelVerProductos = new PanelVerProductos();
    private PanelVerVentas panelVerVentas = new PanelVerVentas();
    private PanelVerReportes panelVerReportes = new PanelVerReportes();
    private PanelIp panelIp = new PanelIp();
    private Component panelActual = panelVerProductos;
    
    public VentanaPrincipal() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/media/newUV_obelisco2.png")).getImage());
        panelCentral.add(panelVerProductos);
        panelCentral.add(panelVerVentas);
        panelCentral.add(panelVerReportes);
        panelCentral.add(panelIp);
        panelActual.setVisible(true);
    }
    
    public void cambiarPanel(JPanel panel){
        panelActual.setVisible(false);
        panelActual = panel;
        panelActual.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCentral = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnProductos = new RSMaterialComponent.RSButtonMaterialOne();
        btnVenta = new RSMaterialComponent.RSButtonMaterialOne();
        btnReportes = new RSMaterialComponent.RSButtonMaterialOne();
        btnIp = new RSMaterialComponent.RSButtonMaterialOne();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cliente RMI");
        setMinimumSize(new java.awt.Dimension(800, 450));

        panelCentral.setLayout(new java.awt.CardLayout());
        getContentPane().add(panelCentral, java.awt.BorderLayout.CENTER);

        jPanel1.setBackground(new java.awt.Color(100, 181, 246));

        btnProductos.setBackground(new java.awt.Color(100, 181, 246));
        btnProductos.setText("Productos");
        btnProductos.setBackgroundHover(new java.awt.Color(99, 164, 255));
        btnProductos.setFont(new java.awt.Font("Roboto Bold", 1, 16)); // NOI18N
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });

        btnVenta.setBackground(new java.awt.Color(100, 181, 246));
        btnVenta.setText("Venta");
        btnVenta.setBackgroundHover(new java.awt.Color(99, 164, 255));
        btnVenta.setFont(new java.awt.Font("Roboto Bold", 1, 16)); // NOI18N
        btnVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentaActionPerformed(evt);
            }
        });

        btnReportes.setBackground(new java.awt.Color(100, 181, 246));
        btnReportes.setText("Reportes");
        btnReportes.setBackgroundHover(new java.awt.Color(99, 164, 255));
        btnReportes.setFont(new java.awt.Font("Roboto Bold", 1, 16)); // NOI18N
        btnReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportesActionPerformed(evt);
            }
        });

        btnIp.setBackground(new java.awt.Color(100, 181, 246));
        btnIp.setText("IP");
        btnIp.setBackgroundHover(new java.awt.Color(99, 164, 255));
        btnIp.setFont(new java.awt.Font("Roboto Bold", 1, 16)); // NOI18N
        btnIp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnProductos, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
            .addComponent(btnVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(btnReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnIp, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(btnProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnIp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(134, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
        cambiarPanel(panelVerProductos);
    }//GEN-LAST:event_btnProductosActionPerformed

    private void btnVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentaActionPerformed
        cambiarPanel(panelVerVentas);
    }//GEN-LAST:event_btnVentaActionPerformed

    private void btnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesActionPerformed
        cambiarPanel(panelVerReportes);
    }//GEN-LAST:event_btnReportesActionPerformed

    private void btnIpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIpActionPerformed
        cambiarPanel(panelIp);
    }//GEN-LAST:event_btnIpActionPerformed

    public static void main(String args[]) {
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
                ventanaPrincipal.setLocationRelativeTo(null);
                ventanaPrincipal.setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSButtonMaterialOne btnIp;
    private RSMaterialComponent.RSButtonMaterialOne btnProductos;
    private RSMaterialComponent.RSButtonMaterialOne btnReportes;
    private RSMaterialComponent.RSButtonMaterialOne btnVenta;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelCentral;
    // End of variables declaration//GEN-END:variables
}
