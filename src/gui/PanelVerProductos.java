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
                                "Se requiere un valor númerico.", 
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
            columnas.add("ProductoId");
            columnas.add("Codigo");
            columnas.add("Marca");
            columnas.add("Nombre");
            columnas.add("Precio");
            productosTable.setModel( new DefaultTableModel( datos, columnas ) );
        } catch (RemoteException ex) {
            Logger.getLogger(PanelVerProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        columnasComboBox = new RSMaterialComponent.RSComboBoxMaterial();
        buscarTextField = new RSMaterialComponent.RSTextFieldMaterial();
        buscarButton = new RSMaterialComponent.RSButtonIconTwo();
        jScrollPane2 = new javax.swing.JScrollPane();
        productosTable = new RSMaterialComponent.RSTableMetro();
        agregarButton = new RSMaterialComponent.RSButtonMaterialIconTwo();
        rSButtonMaterialIconTwo1 = new RSMaterialComponent.RSButtonMaterialIconTwo();
        rSButtonMaterialIconTwo2 = new RSMaterialComponent.RSButtonMaterialIconTwo();

        setBackground(new java.awt.Color(255, 255, 255));
        setName("PanelVerProductos"); // NOI18N
        setOpaque(false);

        columnasComboBox.setBorder(null);
        columnasComboBox.setForeground(new java.awt.Color(51, 51, 51));
        columnasComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "codigo", "marca", "nombre", "precio" }));
        columnasComboBox.setColorMaterial(new java.awt.Color(100, 181, 246));
        columnasComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                columnasComboBoxItemStateChanged(evt);
            }
        });
        columnasComboBox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                columnasComboBoxFocusLost(evt);
            }
        });

        buscarTextField.setForeground(new java.awt.Color(0, 0, 0));
        buscarTextField.setColorMaterial(new java.awt.Color(100, 181, 246));
        buscarTextField.setMinimumSize(new java.awt.Dimension(6, 18));
        buscarTextField.setPhColor(new java.awt.Color(100, 181, 246));
        buscarTextField.setPlaceholder("Buscar por codigo");
        buscarTextField.setSelectionColor(new java.awt.Color(100, 181, 246));

        buscarButton.setBackground(new java.awt.Color(100, 181, 246));
        buscarButton.setBackgroundHover(new java.awt.Color(100, 164, 253));
        buscarButton.setIconTextGap(3);
        buscarButton.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        buscarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarButtonActionPerformed(evt);
            }
        });

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
        productosTable.setBackgoundHead(new java.awt.Color(100, 181, 246));
        productosTable.setBackgoundHover(new java.awt.Color(100, 181, 246));
        productosTable.setColorBorderHead(new java.awt.Color(255, 255, 255));
        productosTable.setColorBorderRows(new java.awt.Color(255, 255, 255));
        productosTable.setColorPrimaryText(new java.awt.Color(102, 102, 102));
        productosTable.setColorSecundaryText(new java.awt.Color(102, 102, 102));
        jScrollPane2.setViewportView(productosTable);

        agregarButton.setBackground(new java.awt.Color(100, 181, 246));
        agregarButton.setText("Agregar");
        agregarButton.setBackgroundHover(new java.awt.Color(100, 164, 247));
        agregarButton.setFont(new java.awt.Font("Roboto Bold", 1, 16)); // NOI18N
        agregarButton.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.ADD);
        agregarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarButtonActionPerformed(evt);
            }
        });

        rSButtonMaterialIconTwo1.setBackground(new java.awt.Color(100, 181, 246));
        rSButtonMaterialIconTwo1.setText("Modificar");
        rSButtonMaterialIconTwo1.setBackgroundHover(new java.awt.Color(100, 163, 255));
        rSButtonMaterialIconTwo1.setFont(new java.awt.Font("Roboto Bold", 1, 16)); // NOI18N
        rSButtonMaterialIconTwo1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SETTINGS_APPLICATIONS);
        rSButtonMaterialIconTwo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconTwo1ActionPerformed(evt);
            }
        });

        rSButtonMaterialIconTwo2.setBackground(new java.awt.Color(255, 153, 153));
        rSButtonMaterialIconTwo2.setText("Eliminar");
        rSButtonMaterialIconTwo2.setBackgroundHover(new java.awt.Color(255, 51, 51));
        rSButtonMaterialIconTwo2.setFont(new java.awt.Font("Roboto Bold", 1, 16)); // NOI18N
        rSButtonMaterialIconTwo2.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.DELETE);
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
                        .addComponent(columnasComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buscarTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buscarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(agregarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rSButtonMaterialIconTwo1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rSButtonMaterialIconTwo2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 573, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buscarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(buscarTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(columnasComboBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rSButtonMaterialIconTwo2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(agregarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rSButtonMaterialIconTwo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void columnasComboBoxFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_columnasComboBoxFocusLost
        
    }//GEN-LAST:event_columnasComboBoxFocusLost

    private void columnasComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_columnasComboBoxItemStateChanged
        buscarTextField.setPlaceholder("Buscar por " + columnasComboBox.getSelectedItem().toString());
    }//GEN-LAST:event_columnasComboBoxItemStateChanged

    private void buscarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarButtonActionPerformed
        refrescarTabla();
    }//GEN-LAST:event_buscarButtonActionPerformed

    private void agregarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarButtonActionPerformed
        DialogAgregarProducto dialogAgregarPersona = new DialogAgregarProducto(null, true);
        dialogAgregarPersona.setLocationRelativeTo(this);
        dialogAgregarPersona.setVisible(true);
        refrescarTabla();
    }//GEN-LAST:event_agregarButtonActionPerformed

    private void rSButtonMaterialIconTwo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconTwo1ActionPerformed
        try {
            int filaSeleccionada = productosTable.getSelectedRow();
            if( filaSeleccionada == -1 ){
                return;
            }
            
            int idProducto = (Integer) productosTable.getValueAt(filaSeleccionada, 0);
            IProducto producto = RMI.getIProductoController().findOne( idProducto );
            if( producto.getProductoId() == 0 ){
                JOptionPane.showMessageDialog(this, 
                        "Producto no encontrado\n"
                                + "Es probable que el producto haya sido eliminada previamente.", 
                        "Producto no encontrado.",
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
    }//GEN-LAST:event_rSButtonMaterialIconTwo1ActionPerformed

    private void rSButtonMaterialIconTwo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconTwo2ActionPerformed
        try {
            int filaSeleccionada = productosTable.getSelectedRow();
            if( filaSeleccionada == -1 ){
                return;
            }
            
            int confirmacion = JOptionPane.showConfirmDialog(this, 
                    "Usted está apunto de eliminar un producto.\n"
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
                        "Producto eliminado con exito.",
                        "Operacion exitosa",
                        JOptionPane.INFORMATION_MESSAGE);
                refrescarTabla();
            }else if( respuesta == IProductoController.DELETE_ID_INEXISTENTE ){
                JOptionPane.showMessageDialog(
                        this,
                        "Producto no encontrada\n"
                                + "Es posible que el producto haya sido eliminado previamente.",
                        "Producto no encontrado.",
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
    }//GEN-LAST:event_rSButtonMaterialIconTwo2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSButtonMaterialIconTwo agregarButton;
    private RSMaterialComponent.RSButtonIconTwo buscarButton;
    private RSMaterialComponent.RSTextFieldMaterial buscarTextField;
    private RSMaterialComponent.RSComboBoxMaterial columnasComboBox;
    private javax.swing.JScrollPane jScrollPane2;
    private RSMaterialComponent.RSTableMetro productosTable;
    private RSMaterialComponent.RSButtonMaterialIconTwo rSButtonMaterialIconTwo1;
    private RSMaterialComponent.RSButtonMaterialIconTwo rSButtonMaterialIconTwo2;
    // End of variables declaration//GEN-END:variables
}
