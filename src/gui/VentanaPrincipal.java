package gui;

import java.awt.Color;
import java.awt.Component;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class VentanaPrincipal extends javax.swing.JFrame {

    private Component[] paneles;
    private PanelVerProductos panelVerProductos = new PanelVerProductos();
    private PanelVerVentas panelVerVentas = new PanelVerVentas();
    private PanelVerReportes panelVerReportes = new PanelVerReportes();
    
    public VentanaPrincipal() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/media/newUV_obelisco2.png")).getImage());
        panelCentral.add(panelVerProductos);
        panelCentral.add(panelVerVentas);
        panelCentral.add(panelVerReportes);
        paneles = panelCentral.getComponents();
        for (Component panele : paneles) {
            System.out.println(panele.getName());
        }
        
    }
    
    public void cambiarPanel(JPanel panel){
        for (Component jp : paneles) {
            if( jp.getName().equals( panel.getName() ) ){
                jp.setVisible(true);
            }else{
                jp.setVisible(false);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCentral = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnProductos = new RSMaterialComponent.RSButtonMaterialOne();
        btnVenta = new RSMaterialComponent.RSButtonMaterialOne();
        btnReportes = new RSMaterialComponent.RSButtonMaterialOne();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cliente RMI");
        setMinimumSize(new java.awt.Dimension(800, 450));

        panelCentral.setLayout(new java.awt.CardLayout());
        getContentPane().add(panelCentral, java.awt.BorderLayout.CENTER);

        jPanel1.setBackground(new java.awt.Color(100, 181, 246));

        btnProductos.setBackground(new java.awt.Color(100, 181, 246));
        btnProductos.setText("Productos");
        btnProductos.setBackgroundHover(new java.awt.Color(99, 164, 255));
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });

        btnVenta.setBackground(new java.awt.Color(100, 181, 246));
        btnVenta.setText("Venta");
        btnVenta.setBackgroundHover(new java.awt.Color(99, 164, 255));
        btnVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentaActionPerformed(evt);
            }
        });

        btnReportes.setBackground(new java.awt.Color(100, 181, 246));
        btnReportes.setText("Reportes");
        btnReportes.setBackgroundHover(new java.awt.Color(99, 164, 255));
        btnReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnProductos, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
            .addComponent(btnVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(btnReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
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
                .addContainerGap(180, Short.MAX_VALUE))
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
    private RSMaterialComponent.RSButtonMaterialOne btnProductos;
    private RSMaterialComponent.RSButtonMaterialOne btnReportes;
    private RSMaterialComponent.RSButtonMaterialOne btnVenta;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelCentral;
    // End of variables declaration//GEN-END:variables
}
