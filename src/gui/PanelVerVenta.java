package gui;

import Interfaces.IDetalleVenta;
import Interfaces.IProducto;
import Interfaces.IVenta;
import java.rmi.RemoteException;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.table.DefaultTableModel;
import proyectormicliente.RMI;

public class PanelVerVenta extends javax.swing.JPanel {

    private final JDialog dialogParent;
    private final IVenta venta;
    private IDetalleVenta detalleVenta;
    private IProducto producto;
    private DecimalFormat df = new DecimalFormat("#.00");
    
    public PanelVerVenta(JDialog dialogParent, IVenta venta){
        initComponents();
        this.dialogParent = dialogParent;
        this.venta = venta;
        mostrarInformacion(venta);
    }
    
    public void mostrarInformacion(IVenta venta){
        try {
            inputFolio.setText(    String.valueOf( venta.getFolio() ) );
            inputSubtotal.setText( String.valueOf( df.format( venta.getSubTotal())) );
            inputIVA.setText(      String.valueOf( df.format( venta.getIva())) );
            inputTOTAL.setText(    String.valueOf( df.format( venta.getTotal())) );
            this.detalleVenta = RMI.getIDetalleVentaController().findOne( venta.getVentaId() );
            this.producto =     RMI.getIProductoController().findOne( detalleVenta.getProductoId() );
            refrescarTabla();
        } catch (RemoteException ex) {
            Logger.getLogger(PanelVerVenta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public void refrescarTabla(){
        try {
            Vector<Vector> datos = new Vector<>();
            
            Vector registro = new Vector();
            registro.add( detalleVenta.getUnidades() );
            registro.add( producto.getNombre() );
            registro.add( detalleVenta.getPrecioUnidad());
            registro.add( df.format( detalleVenta.getTotal()) );
            datos.add( registro );
            
            Vector<String> columnas = new Vector<>();
            columnas.add("Unidades");
            columnas.add("Producto");
            columnas.add("Precio");
            columnas.add("Total");
            tablaProductos.setModel( new DefaultTableModel(datos, columnas));
        } catch (RemoteException ex) {
            Logger.getLogger(PanelVerVenta.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inputFolio = new RSMaterialComponent.RSTextFieldMaterial();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProductos = new RSMaterialComponent.RSTableMetro();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        inputSubtotal = new RSMaterialComponent.RSTextFieldTwo();
        inputIVA = new RSMaterialComponent.RSTextFieldTwo();
        inputTOTAL = new RSMaterialComponent.RSTextFieldTwo();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(650, 450));
        setMinimumSize(new java.awt.Dimension(650, 450));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(650, 450));

        inputFolio.setForeground(new java.awt.Color(0, 0, 0));
        inputFolio.setToolTipText("Ingrese un número que sera el folio de la venta");
        inputFolio.setEnabled(false);
        inputFolio.setFocusable(false);
        inputFolio.setPhColor(new java.awt.Color(153, 153, 153));
        inputFolio.setPlaceholder("Ingrese un folio");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Folio:");

        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaProductos.setBackgoundHead(new java.awt.Color(100, 181, 246));
        tablaProductos.setColorBorderHead(new java.awt.Color(255, 255, 255));
        tablaProductos.setColorBorderRows(new java.awt.Color(255, 255, 255));
        tablaProductos.setColorPrimaryText(new java.awt.Color(0, 0, 0));
        tablaProductos.setColorSecundaryText(new java.awt.Color(0, 0, 0));
        tablaProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaProductos);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("SubTotal:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("IVA:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel5.setText("__________________________________________");
        jLabel5.setToolTipText("");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Total:");

        inputSubtotal.setForeground(new java.awt.Color(0, 0, 0));
        inputSubtotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        inputSubtotal.setText("0.00");
        inputSubtotal.setBorderColor(new java.awt.Color(204, 204, 204));
        inputSubtotal.setEnabled(false);
        inputSubtotal.setFocusable(false);

        inputIVA.setForeground(new java.awt.Color(0, 51, 51));
        inputIVA.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        inputIVA.setText("0.00");
        inputIVA.setBorderColor(new java.awt.Color(204, 204, 204));
        inputIVA.setEnabled(false);
        inputIVA.setFocusable(false);
        inputIVA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputIVAActionPerformed(evt);
            }
        });

        inputTOTAL.setForeground(new java.awt.Color(0, 0, 0));
        inputTOTAL.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        inputTOTAL.setText("0.00");
        inputTOTAL.setBorderColor(new java.awt.Color(204, 204, 204));
        inputTOTAL.setEnabled(false);
        inputTOTAL.setFocusable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(405, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(inputIVA, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                .addComponent(inputSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(inputTOTAL, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                    .addComponent(inputSubtotal, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputIVA, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputTOTAL, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputFolio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputFolio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(113, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void inputIVAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputIVAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputIVAActionPerformed

    private void tablaProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProductosMouseClicked
        
    }//GEN-LAST:event_tablaProductosMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSTextFieldMaterial inputFolio;
    private RSMaterialComponent.RSTextFieldTwo inputIVA;
    private RSMaterialComponent.RSTextFieldTwo inputSubtotal;
    private RSMaterialComponent.RSTextFieldTwo inputTOTAL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private RSMaterialComponent.RSTableMetro tablaProductos;
    // End of variables declaration//GEN-END:variables
}
