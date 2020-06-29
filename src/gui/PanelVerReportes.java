
package gui;

import Interfaces.IDetalleVenta;
import java.rmi.RemoteException;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import proyectormicliente.RMI;


public class PanelVerReportes extends javax.swing.JPanel {

    public PanelVerReportes() {
        initComponents();
    }

    /*public void refrescarTabla(){
        try {
            Vector<Vector> datos = new Vector<>();
            List<IDetalleVenta> lista;
            
            lista = RMI.getIDetalleVentaController().list();
            
            for (IDetalleVenta iDetalleVenta : lista) {
                Vector registro = new Vector();
                registro.add( iDetalleVenta.getDetalleVentaId() );
                registro.add( iDetalleVenta.getVentaId() );
                registro.add( iDetalleVenta.getProductoId() );
                registro.add( iDetalleVenta.getUnidades() );
                registro.add( iDetalleVenta.getPrecioUnidad() );
                registro.add( iDetalleVenta.getTotal() );
                
                datos.add(registro);
            }
            
            Vector<String> columnas = new Vector<>();
            columnas.add("DetalleVentaId");
            columnas.add("VentaId");
            columnas.add("ProductoID");
            columnas.add("Unidades");
            columnas.add("Precio Unidad");
            columnas.add("Total");
            tablaReportes.setModel( new DefaultTableModel(datos, columnas));
        } catch (RemoteException ex) {
            Logger.getLogger(PanelVerReportes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DateChooserInicial = new newscomponents.RSDateChooser();
        lblFechaInicio = new javax.swing.JLabel();
        DateChooserFinal = new newscomponents.RSDateChooser();
        lblFechaFin = new javax.swing.JLabel();
        rSButtonMaterialIconTwo1 = new RSMaterialComponent.RSButtonMaterialIconTwo();
        rSButtonMaterialIconTwo2 = new RSMaterialComponent.RSButtonMaterialIconTwo();

        setBackground(new java.awt.Color(255, 255, 255));
        setName("PanelVerReportes"); // NOI18N
        setPreferredSize(new java.awt.Dimension(541, 357));

        DateChooserInicial.setBackground(new java.awt.Color(100, 158, 253));
        DateChooserInicial.setBgColor(new java.awt.Color(100, 181, 246));
        DateChooserInicial.setFormatDate("dd/MM/yyyy\n");

        lblFechaInicio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblFechaInicio.setText("Fecha inicial:");

        DateChooserFinal.setBackground(new java.awt.Color(100, 158, 253));
        DateChooserFinal.setBgColor(new java.awt.Color(100, 181, 246));
        DateChooserFinal.setFormatDate("dd/MM/yyyy\n");

        lblFechaFin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblFechaFin.setText("Fecha final:");

        rSButtonMaterialIconTwo1.setBackground(new java.awt.Color(0, 204, 0));
        rSButtonMaterialIconTwo1.setText("Venta de productos");
        rSButtonMaterialIconTwo1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.IMAGE);
        rSButtonMaterialIconTwo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconTwo1ActionPerformed(evt);
            }
        });

        rSButtonMaterialIconTwo2.setBackground(new java.awt.Color(0, 153, 255));
        rSButtonMaterialIconTwo2.setText("Monto total vendido");
        rSButtonMaterialIconTwo2.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CASINO);
        rSButtonMaterialIconTwo2.setInheritsPopupMenu(true);
        rSButtonMaterialIconTwo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconTwo2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rSButtonMaterialIconTwo1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rSButtonMaterialIconTwo2, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFechaInicio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DateChooserInicial, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                            .addComponent(DateChooserFinal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DateChooserInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(lblFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DateChooserFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(lblFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rSButtonMaterialIconTwo1, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(rSButtonMaterialIconTwo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(106, 106, 106))
        );

        DateChooserInicial.getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    private void rSButtonMaterialIconTwo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconTwo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonMaterialIconTwo1ActionPerformed

    private void rSButtonMaterialIconTwo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconTwo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonMaterialIconTwo2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private newscomponents.RSDateChooser DateChooserFinal;
    private newscomponents.RSDateChooser DateChooserInicial;
    private javax.swing.JLabel lblFechaFin;
    private javax.swing.JLabel lblFechaInicio;
    private RSMaterialComponent.RSButtonMaterialIconTwo rSButtonMaterialIconTwo1;
    private RSMaterialComponent.RSButtonMaterialIconTwo rSButtonMaterialIconTwo2;
    // End of variables declaration//GEN-END:variables
}
