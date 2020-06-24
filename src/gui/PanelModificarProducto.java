package gui;

import Interfaces.IProducto;
import Interfaces.IProductoController;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import proyectormicliente.RMI;

public class PanelModificarProducto extends javax.swing.JPanel {

    private IProducto producto;
    private JDialog dialogParent;
    
    public PanelModificarProducto(JDialog dialogParent, IProducto producto) throws RemoteException {
        initComponents();
        this.dialogParent = dialogParent;
        this.producto = producto;
        CodigoTextField.setText( String.valueOf( producto.getCodigo() ) );
        marcaTextField.setText( producto.getMarca());
        nombreTextField.setText( producto.getNombre());
        precioTextField.setText( String.valueOf( producto.getPrecio() ) );       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        preciolLabel = new javax.swing.JLabel();
        codigoLabel = new javax.swing.JLabel();
        marcaLabel = new javax.swing.JLabel();
        nombreLabel = new javax.swing.JLabel();
        CodigoTextField = new RSMaterialComponent.RSTextFieldTwo();
        marcaTextField = new RSMaterialComponent.RSTextFieldTwo();
        nombreTextField = new RSMaterialComponent.RSTextFieldTwo();
        precioTextField = new RSMaterialComponent.RSTextFieldTwo();
        rSButtonMaterialOne1 = new RSMaterialComponent.RSButtonMaterialOne();

        setBackground(new java.awt.Color(255, 255, 255));
        setOpaque(false);

        preciolLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        preciolLabel.setText("Precio");

        codigoLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        codigoLabel.setText("Codigo");

        marcaLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        marcaLabel.setText("Marca");

        nombreLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nombreLabel.setText("Nombre");

        CodigoTextField.setForeground(new java.awt.Color(0, 0, 0));
        CodigoTextField.setBorderColor(new java.awt.Color(100, 163, 252));
        CodigoTextField.setPhColor(new java.awt.Color(100, 163, 252));
        CodigoTextField.setPlaceholder("codigo");
        CodigoTextField.setSelectionColor(new java.awt.Color(100, 163, 252));

        marcaTextField.setForeground(new java.awt.Color(0, 0, 0));
        marcaTextField.setBorderColor(new java.awt.Color(100, 163, 252));
        marcaTextField.setPhColor(new java.awt.Color(100, 163, 252));
        marcaTextField.setPlaceholder("marca");
        marcaTextField.setSelectionColor(new java.awt.Color(100, 163, 252));

        nombreTextField.setForeground(new java.awt.Color(0, 0, 0));
        nombreTextField.setBorderColor(new java.awt.Color(100, 163, 252));
        nombreTextField.setPhColor(new java.awt.Color(100, 163, 252));
        nombreTextField.setPlaceholder("nombre");
        nombreTextField.setSelectionColor(new java.awt.Color(100, 163, 252));

        precioTextField.setForeground(new java.awt.Color(0, 0, 0));
        precioTextField.setBorderColor(new java.awt.Color(100, 163, 252));
        precioTextField.setPhColor(new java.awt.Color(100, 163, 252));
        precioTextField.setPlaceholder("precio");
        precioTextField.setSelectionColor(new java.awt.Color(100, 163, 252));

        rSButtonMaterialOne1.setBackground(new java.awt.Color(100, 163, 252));
        rSButtonMaterialOne1.setText("Modificar");
        rSButtonMaterialOne1.setBackgroundHover(new java.awt.Color(100, 149, 253));
        rSButtonMaterialOne1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialOne1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(rSButtonMaterialOne1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(codigoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(marcaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombreLabel)
                            .addComponent(preciolLabel))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(precioTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nombreTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CodigoTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(marcaTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CodigoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codigoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(marcaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(marcaLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(precioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(preciolLabel))
                .addGap(18, 18, 18)
                .addComponent(rSButtonMaterialOne1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void rSButtonMaterialOne1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialOne1ActionPerformed
        try {
            String codigo = CodigoTextField.getText();
            String marca = marcaTextField.getText();
            String nombre = nombreTextField.getText();
            String precio = precioTextField.getText();
            
            if( codigo.length() == 0 ){
                JOptionPane.showMessageDialog(
                        this, 
                        "Ingrese codigo...",
                        "Validación",
                        JOptionPane.ERROR_MESSAGE);
                CodigoTextField.requestFocus();
                return;
            }else {
                try {
                    producto.setCodigo( Integer.parseInt(codigo) );
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(
                        this, 
                        "Ingrese codigo numerico...",
                        "Validación",
                        JOptionPane.ERROR_MESSAGE);
                CodigoTextField.requestFocus();
                return;
                }
            }//Fin if-else
            
            if( marca.length() == 0 ){
                JOptionPane.showMessageDialog(
                        this, 
                        "Ingrese marca...",
                        "Validación",
                        JOptionPane.ERROR_MESSAGE);
                marcaTextField.requestFocus();
                return;
            }else{
                producto.setMarca(marca);
            }
            
            if( nombre.length() == 0 ){
                JOptionPane.showMessageDialog(
                        this, 
                        "Ingrese nombre...",
                        "Validación",
                        JOptionPane.ERROR_MESSAGE);
                nombreTextField.requestFocus();
                return;
            }else{
                producto.setNombre(nombre);
            }
            
            if( precio.length() == 0 ){
                JOptionPane.showMessageDialog(
                        this, 
                        "Ingrese precio...",
                        "Validación",
                        JOptionPane.ERROR_MESSAGE);
                precioTextField.requestFocus();
                return;
            }else {
                try {
                    producto.setPrecio( Double.parseDouble(precio) );
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(
                        this, 
                        "Ingrese precio numerico...",
                        "Validación",
                        JOptionPane.ERROR_MESSAGE);
                precioTextField.requestFocus();
                return;
                }
            }
            
            int respuesta = RMI.getIProductoController().update(producto);
            if( respuesta == IProductoController.UPDATE_EXITO ){
                JOptionPane.showMessageDialog(
                        this, 
                        "Producto modificado con éxito.",
                        "Operacion exitosa",
                        JOptionPane.INFORMATION_MESSAGE);
                dialogParent.dispose();
            }else if( respuesta == IProductoController.UPDATE_SIN_EXITO ){
                JOptionPane.showMessageDialog(
                        this, 
                        "No fue posible completar la operación\n" 
                            + "Producto no encontrado.\n"
                            + "Es probable que el producto haya sido eliminada con anterioridad.",
                        "Operación no completada",
                        JOptionPane.ERROR_MESSAGE);
            }else if( respuesta == IProductoController.UPDATE_ID_INEXISTE ){
                JOptionPane.showMessageDialog(
                        this, 
                        "No fue posible completar la operación",
                        "Operación no completada",
                        JOptionPane.ERROR_MESSAGE);
                dialogParent.dispose();
            }
            
        } catch (RemoteException ex) {
            Logger.getLogger(PanelModificarProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_rSButtonMaterialOne1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSTextFieldTwo CodigoTextField;
    private javax.swing.JLabel codigoLabel;
    private javax.swing.JLabel marcaLabel;
    private RSMaterialComponent.RSTextFieldTwo marcaTextField;
    private javax.swing.JLabel nombreLabel;
    private RSMaterialComponent.RSTextFieldTwo nombreTextField;
    private RSMaterialComponent.RSTextFieldTwo precioTextField;
    private javax.swing.JLabel preciolLabel;
    private RSMaterialComponent.RSButtonMaterialOne rSButtonMaterialOne1;
    // End of variables declaration//GEN-END:variables
}
