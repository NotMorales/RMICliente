package gui;

import Interfaces.IProducto;
import Interfaces.IProductoController;
import java.rmi.RemoteException;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyectormicliente.RMI;

public class PanelVerProductos extends javax.swing.JPanel {

    private static String PRODUCTOID = "productoId";
    private static String CODIGO = "codigo";
    private static String MARCA = "marca";
    private static String NOMBRE = "nombre";
    private static String PRECIO = "precio";
    
    public PanelVerProductos() {
        initComponents();
        refrescarTabla();
    }
    
    public void refrescarTabla(){
        try {            
            Vector<Vector> datos = new Vector<>();
            
            String texto = buscarTextField.getText();
            List<IProducto> listProductos;
            if( texto.length() == 0 ){
                listProductos = RMI.getIProductoController().list();
            }else{
                IProducto producto = RMI.getIProductoController().newInstance();
                String columna = columnasComboBox.getSelectedItem().toString();
                
                if( columna.compareTo(CODIGO) == 0 ){
                    try {
                        producto.setCodigo(Integer.parseInt(texto) );
                    } catch ( NumberFormatException ex ) {
                        JOptionPane.showMessageDialog(
                                this, 
                                "Se requiere un valor numerico.", 
                                "Numero requerido",
                                JOptionPane.ERROR_MESSAGE
                        );
                        return;
                    }
                }else if( columna.compareTo(MARCA) == 0 ){
                    producto.setMarca(texto);
                }else if( columna.compareTo(NOMBRE) == 0 ){
                    producto.setNombre(texto);
                }else if( columna.compareTo(PRECIO) == 0 ){
                    try {
                        producto.setPrecio( Integer.parseInt(texto) );
                    } catch ( NumberFormatException ex ) {
                        JOptionPane.showMessageDialog(
                                this, 
                                "Se requiere un valor numerico.", 
                                "Numero requerido",
                                JOptionPane.ERROR_MESSAGE
                        );
                        return;
                    }
                }
                listProductos = RMI.getIProductoController().find(producto);
            }
            
            for( IProducto producto : listProductos ){
                Vector registro = new Vector();
                registro.add( producto.getProductoId());
                registro.add( producto.getCodigo());
                registro.add( producto.getMarca());
                registro.add( producto.getNombre());
                registro.add( producto.getPrecio());
                
                datos.add( registro );
            }
            
            Vector<String> columnas = new Vector<>();
            columnas.add("productoId");
            columnas.add("codigo");
            columnas.add("marca");
            columnas.add("nombre");
            columnas.add("precio");
            productosTable.setModel( new DefaultTableModel( datos, columnas ) );
        } catch (RemoteException ex) {
            Logger.getLogger(PanelVerProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        productosTable = new javax.swing.JTable();
        columnasComboBox = new javax.swing.JComboBox<>();
        buscarTextField = new javax.swing.JTextField();
        buscarButton = new javax.swing.JButton();
        eliminarButton = new javax.swing.JButton();
        modificarButton = new javax.swing.JButton();
        agregarButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setOpaque(false);

        productosTable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        productosTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(productosTable);

        columnasComboBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        columnasComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "codigo", "marca", "nombre", "precio" }));
        columnasComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                columnasComboBoxActionPerformed(evt);
            }
        });

        buscarTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        buscarButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buscarButton.setText("Buscar");
        buscarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarButtonActionPerformed(evt);
            }
        });

        eliminarButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        eliminarButton.setText("Eliminar");
        eliminarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarButtonActionPerformed(evt);
            }
        });

        modificarButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        modificarButton.setText("Modificar");
        modificarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarButtonActionPerformed(evt);
            }
        });

        agregarButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        agregarButton.setText("Agregar");
        agregarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(columnasComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buscarTextField)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buscarButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(agregarButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(modificarButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(eliminarButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(columnasComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eliminarButton)
                    .addComponent(modificarButton)
                    .addComponent(agregarButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void columnasComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_columnasComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_columnasComboBoxActionPerformed

    private void buscarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarButtonActionPerformed
        refrescarTabla();
    }//GEN-LAST:event_buscarButtonActionPerformed

    private void modificarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarButtonActionPerformed
        try {
            int filaSeleccionada = productosTable.getSelectedRow();
            if( filaSeleccionada == -1 ){
                return;
            }
            
            int idProducto = (Integer) productosTable.getValueAt(filaSeleccionada, 0);
            IProducto producto = RMI.getIProductoController().findOne( idProducto );
            if( producto.getProductoId() == 0 ){
                JOptionPane.showMessageDialog(this, 
                        "Producto no encontrada\n"
                                + "Es probable que el producto haya sido eliminada previamente.", 
                        "Producto no encontrada.",
                        JOptionPane.ERROR_MESSAGE);
                refrescarTabla();
                return;
            }
            
            DialogModificarProducto dialogModificarProducto = new DialogModificarProducto(null, true, producto);
            dialogModificarProducto.setLocationRelativeTo(this);
            dialogModificarProducto.setVisible(true);
            
            //Regrescar tabla
            refrescarTabla();
            
        } catch (RemoteException ex) {
            Logger.getLogger(PanelVerProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_modificarButtonActionPerformed

    private void eliminarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarButtonActionPerformed
        try {
            int filaSeleccionada = productosTable.getSelectedRow();
            if( filaSeleccionada == -1 ){
                return;
            }
            
            int confirmacion = JOptionPane.showConfirmDialog(this, 
                    "Usted esta apunto de eliminar un producto.\n"
                            + "¿Desea continuar?",
                    "Eliminar producto",
                    JOptionPane.YES_NO_OPTION);
            if( confirmacion != JOptionPane.YES_OPTION ){
                return;
            }
            
            int productoId = (int) productosTable.getValueAt(filaSeleccionada, 0);
            int respuesta = RMI.getIProductoController().delete( productoId );
            
            if( respuesta == IProductoController.DELETE_EXITO ){
                JOptionPane.showMessageDialog(
                        this,
                        "producto eliminado con exito.",
                        "Operacion exitosa",
                        JOptionPane.INFORMATION_MESSAGE);
                refrescarTabla();
            }else if( respuesta == IProductoController.DELETE_ID_INEXISTENTE ){
                JOptionPane.showMessageDialog(
                        this,
                        "producto no encontrada\n"
                                + "Es posible que el producto haya sido eliminado previamente.",
                        "producto no encontrada",
                        JOptionPane.ERROR_MESSAGE);
            }else {
                JOptionPane.showMessageDialog(
                        this,
                        "Operacion incompleta.\n"
                                + "No fue posible eliminar al producto.",
                        "Operacion incompleta",
                        JOptionPane.ERROR_MESSAGE);
            }
        } catch (RemoteException ex) {
            Logger.getLogger(PanelVerProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_eliminarButtonActionPerformed

    private void agregarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarButtonActionPerformed
        DialogAgregarProducto dialogAgregarPersona = new DialogAgregarProducto(null, true);
        dialogAgregarPersona.setLocationRelativeTo(this);
        dialogAgregarPersona.setVisible(true);
        refrescarTabla();
    }//GEN-LAST:event_agregarButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarButton;
    private javax.swing.JButton buscarButton;
    private javax.swing.JTextField buscarTextField;
    private javax.swing.JComboBox<String> columnasComboBox;
    private javax.swing.JButton eliminarButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modificarButton;
    private javax.swing.JTable productosTable;
    // End of variables declaration//GEN-END:variables
}
