package gui;

import Interfaces.IVenta;
import java.rmi.RemoteException;

public class DialogVerVenta extends javax.swing.JDialog {

    public DialogVerVenta(java.awt.Frame parent, boolean modal, IVenta venta) throws RemoteException {
        super(parent, modal);   
        initComponents();
        getContentPane().add( new PanelVerVenta(this, venta) );
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(650, 450));
        setMinimumSize(new java.awt.Dimension(650, 450));
        setPreferredSize(new java.awt.Dimension(650, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
