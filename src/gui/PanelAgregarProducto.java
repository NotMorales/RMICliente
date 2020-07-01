package gui;

import Interfaces.IProducto;
import Interfaces.IProductoController;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import proyectormicliente.RMI;

public class PanelAgregarProducto extends javax.swing.JPanel {

    private JDialog dialogParent;
    public PanelAgregarProducto(JDialog dialogParent){
        initComponents();
        this.dialogParent = dialogParent;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CodigoTextField = new RSMaterialComponent.RSTextFieldMaterial();
        marcaTextField = new RSMaterialComponent.RSTextFieldMaterial();
        nombreTextField = new RSMaterialComponent.RSTextFieldMaterial();
        precioTextField = new RSMaterialComponent.RSTextFieldMaterial();
        rSButtonMaterialOne1 = new RSMaterialComponent.RSButtonMaterialOne();

        setOpaque(false);

        CodigoTextField.setForeground(new java.awt.Color(51, 51, 51));
        CodigoTextField.setToolTipText("Ingrese un codigo identificador");
        CodigoTextField.setColorMaterial(new java.awt.Color(100, 181, 246));
        CodigoTextField.setPhColor(new java.awt.Color(100, 181, 246));
        CodigoTextField.setPlaceholder("Codigo");

        marcaTextField.setForeground(new java.awt.Color(51, 51, 51));
        marcaTextField.setToolTipText("Ingresa una marca");
        marcaTextField.setColorMaterial(new java.awt.Color(100, 181, 246));
        marcaTextField.setPhColor(new java.awt.Color(100, 181, 246));
        marcaTextField.setPlaceholder("Marca");

        nombreTextField.setForeground(new java.awt.Color(51, 51, 51));
        nombreTextField.setToolTipText("Ingresa un nombre");
        nombreTextField.setColorMaterial(new java.awt.Color(100, 181, 246));
        nombreTextField.setPhColor(new java.awt.Color(100, 181, 246));
        nombreTextField.setPlaceholder("Nombre");

        precioTextField.setForeground(new java.awt.Color(51, 51, 51));
        precioTextField.setToolTipText("Ingresa una cantidad");
        precioTextField.setColorMaterial(new java.awt.Color(100, 181, 246));
        precioTextField.setPhColor(new java.awt.Color(100, 181, 246));
        precioTextField.setPlaceholder("Precio");

        rSButtonMaterialOne1.setBackground(new java.awt.Color(100, 181, 246));
        rSButtonMaterialOne1.setText("Aceptar");
        rSButtonMaterialOne1.setBackgroundHover(new java.awt.Color(100, 163, 252));
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rSButtonMaterialOne1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CodigoTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
                    .addComponent(marcaTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nombreTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(precioTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CodigoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(marcaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(precioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
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
            
            IProducto producto = RMI.getIProductoController().newInstance();
            
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
            
            int respuesta = RMI.getIProductoController().add(producto);
            if( respuesta == IProductoController.ADD_EXITO ){
                JOptionPane.showMessageDialog(
                        this, 
                        "Producto agregado con éxito.",
                        "Operacion exitosa",
                        JOptionPane.INFORMATION_MESSAGE);
                dialogParent.dispose();
            }else if( respuesta == IProductoController.ADD_SIN_EXITO ){
                JOptionPane.showMessageDialog(
                        this, 
                        "No fue posible completar la operación",
                        "Operación no completada",
                        JOptionPane.ERROR_MESSAGE);
            }else if( respuesta == IProductoController.ADD_ID_DUPLICADO ){
                JOptionPane.showMessageDialog(
                        this, 
                        "Este codigo ya esta registrado",
                        "Operación no completada",
                        JOptionPane.ERROR_MESSAGE);
            }
            
        } catch (RemoteException ex) {
            Logger.getLogger(PanelAgregarProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_rSButtonMaterialOne1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSTextFieldMaterial CodigoTextField;
    private RSMaterialComponent.RSTextFieldMaterial marcaTextField;
    private RSMaterialComponent.RSTextFieldMaterial nombreTextField;
    private RSMaterialComponent.RSTextFieldMaterial precioTextField;
    private RSMaterialComponent.RSButtonMaterialOne rSButtonMaterialOne1;
    // End of variables declaration//GEN-END:variables
}
