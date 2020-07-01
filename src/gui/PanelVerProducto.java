package gui;

import Interfaces.IProducto;
import java.rmi.RemoteException;
import javax.swing.JDialog;

public class PanelVerProducto extends javax.swing.JPanel {

    private IProducto producto;
    private JDialog dialogParent;
    
    public PanelVerProducto(JDialog dialogParent, IProducto producto) throws RemoteException{
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
        CodigoTextField.setEnabled(false);
        CodigoTextField.setPhColor(new java.awt.Color(100, 163, 252));
        CodigoTextField.setPlaceholder("codigo");
        CodigoTextField.setSelectionColor(new java.awt.Color(100, 163, 252));

        marcaTextField.setForeground(new java.awt.Color(0, 0, 0));
        marcaTextField.setBorderColor(new java.awt.Color(100, 163, 252));
        marcaTextField.setEnabled(false);
        marcaTextField.setPhColor(new java.awt.Color(100, 163, 252));
        marcaTextField.setPlaceholder("marca");
        marcaTextField.setSelectionColor(new java.awt.Color(100, 163, 252));

        nombreTextField.setForeground(new java.awt.Color(0, 0, 0));
        nombreTextField.setBorderColor(new java.awt.Color(100, 163, 252));
        nombreTextField.setEnabled(false);
        nombreTextField.setPhColor(new java.awt.Color(100, 163, 252));
        nombreTextField.setPlaceholder("nombre");
        nombreTextField.setSelectionColor(new java.awt.Color(100, 163, 252));

        precioTextField.setForeground(new java.awt.Color(0, 0, 0));
        precioTextField.setBorderColor(new java.awt.Color(100, 163, 252));
        precioTextField.setEnabled(false);
        precioTextField.setPhColor(new java.awt.Color(100, 163, 252));
        precioTextField.setPlaceholder("precio");
        precioTextField.setSelectionColor(new java.awt.Color(100, 163, 252));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(codigoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(marcaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreLabel)
                    .addComponent(preciolLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(precioTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(nombreTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CodigoTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(marcaTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSTextFieldTwo CodigoTextField;
    private javax.swing.JLabel codigoLabel;
    private javax.swing.JLabel marcaLabel;
    private RSMaterialComponent.RSTextFieldTwo marcaTextField;
    private javax.swing.JLabel nombreLabel;
    private RSMaterialComponent.RSTextFieldTwo nombreTextField;
    private RSMaterialComponent.RSTextFieldTwo precioTextField;
    private javax.swing.JLabel preciolLabel;
    // End of variables declaration//GEN-END:variables
}
