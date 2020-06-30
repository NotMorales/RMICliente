package gui;


public class PanelIp extends javax.swing.JPanel {
    
    public PanelIp() {
        initComponents();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inputBuscarFolio = new RSMaterialComponent.RSTextFieldTwo();

        setBackground(new java.awt.Color(255, 255, 255));
        setName("PanelVerVentas"); // NOI18N
        setPreferredSize(new java.awt.Dimension(541, 357));

        inputBuscarFolio.setForeground(new java.awt.Color(102, 102, 102));
        inputBuscarFolio.setBorderColor(new java.awt.Color(100, 181, 246));
        inputBuscarFolio.setPlaceholder("Buscar venta por Folio");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(inputBuscarFolio, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
                .addGap(142, 142, 142))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(inputBuscarFolio, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(297, Short.MAX_VALUE))
        );

        inputBuscarFolio.getAccessibleContext().setAccessibleDescription("Ingresa un folio");
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSTextFieldTwo inputBuscarFolio;
    // End of variables declaration//GEN-END:variables
}
