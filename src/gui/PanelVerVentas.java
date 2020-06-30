
package gui;

import Interfaces.IProducto;
import Interfaces.IVenta;
import Interfaces.IVentaController;
import java.rmi.RemoteException;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyectormicliente.RMI;


public class PanelVerVentas extends javax.swing.JPanel {
    
    private DecimalFormat df = new DecimalFormat("#.00");
    public PanelVerVentas() {
        initComponents();
        refrescarTabla();
        
    }
    
    private String devolverEstado(int estado){
        return (estado == 1) ? "PROCESADA" : "CANCELADA";
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
                    try {
                        venta.setFolio( Integer.parseInt(texto));
                    } catch ( NumberFormatException ex ) {
                        JOptionPane.showMessageDialog(
                                this, 
                                "Se requiere un valor.", 
                                "Folio requerido",
                                JOptionPane.ERROR_MESSAGE
                        );
                        return;
                    }
                listVentas = RMI.getIVentaController().find(venta);  
            }
            for( IVenta venta : listVentas ){
                Vector registro = new Vector();
                registro.add( venta.getVentaId());
                registro.add( venta.getFolio());
                registro.add( venta.getSubTotal());
                registro.add( df.format( venta.getIva() ) );
                registro.add( venta.getTotal() );
                registro.add( venta.getFecha() );
                registro.add( devolverEstado(venta.getEstado()) );
                
                datos.add( registro );
            }
            
            Vector<String> columnas = new Vector<>();
            columnas.add("VentaID");
            columnas.add("Folio");
            columnas.add("Subtotal");
            columnas.add("IVA");
            columnas.add("Total");
            columnas.add("Fecha");
            columnas.add("Estado");
            tablaVentas.setModel( new DefaultTableModel( datos, columnas ) );
            tablaVentas.getColumnModel().getColumn(0).setMaxWidth(0);
            tablaVentas.getColumnModel().getColumn(0).setMinWidth(0);
            tablaVentas.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(0);
            tablaVentas.getTableHeader().getColumnModel().getColumn(0).setMinWidth(0);
            tablaVentas.getColumnModel().getColumn(0).setResizable(false);
        } catch (Exception e) {
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inputBuscarFolio = new RSMaterialComponent.RSTextFieldTwo();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVentas = new RSMaterialComponent.RSTableMetro();
        rSButtonIconTwo1 = new RSMaterialComponent.RSButtonIconTwo();
        rSButtonMaterialIconTwo1 = new RSMaterialComponent.RSButtonMaterialIconTwo();
        btnCancelarVenta = new RSMaterialComponent.RSButtonMaterialIconTwo();
        btnMostrarVenta = new RSMaterialComponent.RSButtonMaterialIconTwo();

        setBackground(new java.awt.Color(255, 255, 255));
        setName("PanelVerVentas"); // NOI18N
        setPreferredSize(new java.awt.Dimension(541, 357));

        inputBuscarFolio.setForeground(new java.awt.Color(102, 102, 102));
        inputBuscarFolio.setBorderColor(new java.awt.Color(100, 181, 246));
        inputBuscarFolio.setPlaceholder("Buscar venta por Folio");

        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        tablaVentas.setForeground(new java.awt.Color(255, 255, 255));
        tablaVentas.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaVentas.setBackgoundHead(new java.awt.Color(100, 181, 246));
        tablaVentas.setBackgoundHover(new java.awt.Color(100, 181, 246));
        tablaVentas.setColorBorderHead(new java.awt.Color(255, 255, 255));
        tablaVentas.setColorBorderRows(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tablaVentas);

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

        btnCancelarVenta.setBackground(new java.awt.Color(255, 102, 102));
        btnCancelarVenta.setText("Cancelar Venta");
        btnCancelarVenta.setBackgroundHover(new java.awt.Color(211, 102, 102));
        btnCancelarVenta.setFont(new java.awt.Font("Roboto Bold", 1, 16)); // NOI18N
        btnCancelarVenta.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CANCEL);
        btnCancelarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarVentaActionPerformed(evt);
            }
        });

        btnMostrarVenta.setBackground(new java.awt.Color(0, 204, 51));
        btnMostrarVenta.setText("Mostar Venta");
        btnMostrarVenta.setBackgroundHover(new java.awt.Color(0, 180, 59));
        btnMostrarVenta.setFont(new java.awt.Font("Roboto Bold", 1, 16)); // NOI18N
        btnMostrarVenta.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SHOP);
        btnMostrarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarVentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(inputBuscarFolio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(rSButtonIconTwo1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rSButtonMaterialIconTwo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMostrarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)))
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rSButtonMaterialIconTwo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMostrarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        refrescarTabla();
    }//GEN-LAST:event_rSButtonMaterialIconTwo1ActionPerformed

    private void btnCancelarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarVentaActionPerformed
        try {
            int filaSelecc = tablaVentas.getSelectedRow();
            if( filaSelecc == -1 ){
                return;
            }
            
            int ventaid = (Integer)tablaVentas.getValueAt(filaSelecc, 0);
            IVenta venta = RMI.getIVentaController().findOne(ventaid);
            if( venta.getVentaId() == 0 ){
                JOptionPane.showMessageDialog(this, 
                        "Venta no encontrada\n"
                                + "Es probable que el producto haya sido eliminada previamente.", 
                        "Venta no encontrado.",
                        JOptionPane.ERROR_MESSAGE);
                refrescarTabla();
                return;
            }
  
            int confirmacion = JOptionPane.showConfirmDialog(this, 
                    "Usted está apunto de cancelar una venta.\n"
                            + "¿Desea continuar?",
                    "Cancelar venta",
                    JOptionPane.YES_NO_OPTION);
            if( confirmacion != JOptionPane.YES_OPTION ){
                return;
            }
            
            int respuesta = RMI.getIVentaController().cancelarVenta(ventaid);
            //aqui debo actualizar la bd con cancelada
            if( respuesta == IVentaController.DELETE_EXITO ){
                JOptionPane.showMessageDialog(
                        this,
                        "Venta cancelada con exito.",
                        "Operacion exitosa",
                        JOptionPane.INFORMATION_MESSAGE);
                refrescarTabla();
            }else if( respuesta == IVentaController.DELETE_ID_INEXISTENTE ){
                JOptionPane.showMessageDialog(
                        this,
                        "Venta no encontrada\n"
                                + "Es posible que la venta haya sido eliminada previamente.",
                        "Venta no encontrado.",
                        JOptionPane.ERROR_MESSAGE);
            }else {
                JOptionPane.showMessageDialog(
                        this,
                        "Operacion incompleta.\n"
                                + "No fue posible cancelar la venta.",
                        "Operacion incompleta",
                        JOptionPane.ERROR_MESSAGE);
            }
            refrescarTabla();
        } catch (RemoteException ex) {
            Logger.getLogger(PanelVerVentas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCancelarVentaActionPerformed

    private void btnMostrarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarVentaActionPerformed
        try {
            int filaSeleccionada = tablaVentas.getSelectedRow();
            if( filaSeleccionada == -1 ){
                return;
            }
            
            int idVenta = (Integer) tablaVentas.getValueAt(filaSeleccionada, 0);
            IVenta venta = RMI.getIVentaController().findOne( idVenta );
            if( venta.getVentaId()== 0 ){
                JOptionPane.showMessageDialog(this, 
                        "Venta no encontrado\n"
                                + "Es probable que la haya sido eliminada previamente.", 
                        "Venta no encontrado.",
                        JOptionPane.ERROR_MESSAGE);
                refrescarTabla();
                return;
            }
            
            DialogVerVenta dialogVerVenta = new DialogVerVenta(null, true, venta);
            dialogVerVenta.setLocationRelativeTo(this);
            dialogVerVenta.setVisible(true);
            
        } catch (RemoteException ex) {
            Logger.getLogger(PanelVerProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnMostrarVentaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSButtonMaterialIconTwo btnCancelarVenta;
    private RSMaterialComponent.RSButtonMaterialIconTwo btnMostrarVenta;
    private RSMaterialComponent.RSTextFieldTwo inputBuscarFolio;
    private javax.swing.JScrollPane jScrollPane1;
    private RSMaterialComponent.RSButtonIconTwo rSButtonIconTwo1;
    private RSMaterialComponent.RSButtonMaterialIconTwo rSButtonMaterialIconTwo1;
    private RSMaterialComponent.RSTableMetro tablaVentas;
    // End of variables declaration//GEN-END:variables
}
