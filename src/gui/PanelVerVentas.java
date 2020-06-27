
package gui;

import Interfaces.IVenta;
import java.rmi.RemoteException;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import proyectormicliente.RMI;


public class PanelVerVentas extends javax.swing.JPanel {

    public PanelVerVentas() {
        initComponents();
    }

    public void refrescarTabla(){
        try {
            Vector<Vector> datos = new Vector<>();
            
            String texto = inputBuscarFolio.getText();
            List<IVenta> listVentas;
            if( texto.length() == 0 ){
                listVentas = RMI.getIVentaController().list();
                        
            }else{
                IVenta venta = RMI.getIVentaController().newInstance();
                if( texto.length() == 0 ){
                    JOptionPane.showMessageDialog(
                                this, 
                                "Se requiere un valor.", 
                                "Folio requerido",
                                JOptionPane.ERROR_MESSAGE
                        );
                    
                }else{
                    listVentas = RMI.getIVentaController().find(venta);
                }
            }
        } catch (Exception e) {
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inputBuscarFolio = new RSMaterialComponent.RSTextFieldTwo();
        jScrollPane1 = new javax.swing.JScrollPane();
        rSTableMetro1 = new RSMaterialComponent.RSTableMetro();
        rSButtonIconTwo1 = new RSMaterialComponent.RSButtonIconTwo();
        rSButtonMaterialIconTwo1 = new RSMaterialComponent.RSButtonMaterialIconTwo();
        rSButtonMaterialIconTwo2 = new RSMaterialComponent.RSButtonMaterialIconTwo();

        setBackground(new java.awt.Color(255, 255, 255));
        setName("PanelVerVentas"); // NOI18N
        setPreferredSize(new java.awt.Dimension(541, 357));

        inputBuscarFolio.setForeground(new java.awt.Color(102, 102, 102));
        inputBuscarFolio.setBorderColor(new java.awt.Color(100, 181, 246));
        inputBuscarFolio.setPlaceholder("Buscar venta por Folio");

        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        rSTableMetro1.setForeground(new java.awt.Color(255, 255, 255));
        rSTableMetro1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        rSTableMetro1.setBackgoundHead(new java.awt.Color(100, 181, 246));
        rSTableMetro1.setBackgoundHover(new java.awt.Color(100, 181, 246));
        rSTableMetro1.setColorBorderHead(new java.awt.Color(255, 255, 255));
        rSTableMetro1.setColorBorderRows(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(rSTableMetro1);

        rSButtonIconTwo1.setBackground(new java.awt.Color(100, 181, 246));
        rSButtonIconTwo1.setBackgroundHover(new java.awt.Color(100, 166, 249));
        rSButtonIconTwo1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        rSButtonIconTwo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIconTwo1ActionPerformed(evt);
            }
        });

        rSButtonMaterialIconTwo1.setBackground(new java.awt.Color(100, 181, 246));
        rSButtonMaterialIconTwo1.setText("Agregar Venta");
        rSButtonMaterialIconTwo1.setBackgroundHover(new java.awt.Color(100, 163, 249));
        rSButtonMaterialIconTwo1.setFont(new java.awt.Font("Roboto Bold", 1, 16)); // NOI18N
        rSButtonMaterialIconTwo1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.ADD);
        rSButtonMaterialIconTwo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconTwo1ActionPerformed(evt);
            }
        });

        rSButtonMaterialIconTwo2.setBackground(new java.awt.Color(255, 102, 102));
        rSButtonMaterialIconTwo2.setText("Cancelar Venta");
        rSButtonMaterialIconTwo2.setBackgroundHover(new java.awt.Color(211, 102, 102));
        rSButtonMaterialIconTwo2.setFont(new java.awt.Font("Roboto Bold", 1, 16)); // NOI18N
        rSButtonMaterialIconTwo2.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CANCEL);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(inputBuscarFolio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(rSButtonIconTwo1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rSButtonMaterialIconTwo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rSButtonMaterialIconTwo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(inputBuscarFolio, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addComponent(rSButtonIconTwo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rSButtonMaterialIconTwo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSButtonMaterialIconTwo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        inputBuscarFolio.getAccessibleContext().setAccessibleDescription("Ingresa un folio");
    }// </editor-fold>//GEN-END:initComponents

    private void rSButtonIconTwo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIconTwo1ActionPerformed
        refrescarTabla();
    }//GEN-LAST:event_rSButtonIconTwo1ActionPerformed

    private void rSButtonMaterialIconTwo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconTwo1ActionPerformed
        DialogAgregarVenta dialogAgregarVenta = new DialogAgregarVenta(null, true);
        dialogAgregarVenta.setLocationRelativeTo(this);
        dialogAgregarVenta.setVisible(true);
        
    }//GEN-LAST:event_rSButtonMaterialIconTwo1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSTextFieldTwo inputBuscarFolio;
    private javax.swing.JScrollPane jScrollPane1;
    private RSMaterialComponent.RSButtonIconTwo rSButtonIconTwo1;
    private RSMaterialComponent.RSButtonMaterialIconTwo rSButtonMaterialIconTwo1;
    private RSMaterialComponent.RSButtonMaterialIconTwo rSButtonMaterialIconTwo2;
    private RSMaterialComponent.RSTableMetro rSTableMetro1;
    // End of variables declaration//GEN-END:variables
}
