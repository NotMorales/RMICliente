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

        CodigoTextField = new javax.swing.JTextField();
        marcaTextField = new javax.swing.JTextField();
        nombreTextField = new javax.swing.JTextField();
        codigoLabel = new javax.swing.JLabel();
        marcaLabel = new javax.swing.JLabel();
        nombreLabel = new javax.swing.JLabel();
        aceptarButton = new javax.swing.JButton();
        preciolLabel = new javax.swing.JLabel();
        precioTextField = new javax.swing.JTextField();

        setOpaque(false);

        CodigoTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        marcaTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        nombreTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        codigoLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        codigoLabel.setText("Codigo:");

        marcaLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        marcaLabel.setText("Marca:");

        nombreLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nombreLabel.setText("Nombre:");

        aceptarButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        aceptarButton.setText("Aceptar");
        aceptarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarButtonActionPerformed(evt);
            }
        });

        preciolLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        preciolLabel.setText("Precio:");

        precioTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(aceptarButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(preciolLabel)
                            .addComponent(nombreLabel)
                            .addComponent(marcaLabel)
                            .addComponent(codigoLabel))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CodigoTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                            .addComponent(marcaTextField)
                            .addComponent(nombreTextField)
                            .addComponent(precioTextField))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CodigoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codigoLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(marcaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(marcaLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(precioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(preciolLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(aceptarButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void aceptarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarButtonActionPerformed
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
            }
            
        } catch (RemoteException ex) {
            Logger.getLogger(PanelAgregarProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_aceptarButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CodigoTextField;
    private javax.swing.JButton aceptarButton;
    private javax.swing.JLabel codigoLabel;
    private javax.swing.JLabel marcaLabel;
    private javax.swing.JTextField marcaTextField;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JTextField nombreTextField;
    private javax.swing.JTextField precioTextField;
    private javax.swing.JLabel preciolLabel;
    // End of variables declaration//GEN-END:variables
}
