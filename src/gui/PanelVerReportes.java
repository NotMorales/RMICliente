
package gui;

import Interfaces.IDetalleVenta;
import java.rmi.RemoteException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import proyectormicliente.RMI;


public class PanelVerReportes extends javax.swing.JPanel {

    private DecimalFormat df = new DecimalFormat("#.00");
    private SimpleDateFormat SDF = new SimpleDateFormat("dd-MM-yyyy");
    private String[] FECHAS = new String[2];
    public PanelVerReportes() {
        initComponents();
    }
    
    public void setFechas(){
        FECHAS[0] = SDF.format(DateChooserInicial.getDate());
        FECHAS[1] = SDF.format(DateChooserFinal.getDate());
    }
    
    public void calcularMonto(){
        double montoTot = 0;
        try {
            montoTot = RMI.getIDetalleVentaController().getMontoTotal(FECHAS);
            
            inputMonto.setText( "$ "+ String.valueOf( df.format(montoTot)) );
        } catch (RemoteException ex) {
            Logger.getLogger(PanelVerReportes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void productosVendidos(){
        List<Map<String,Object>> lista;
        
        try {
            lista = RMI.getIDetalleVentaController().getProductosVendidos(FECHAS);
            for (Map<String, Object> map : lista) {
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    System.out.println(key + " = " + value);
                }
            }
        } catch (RemoteException ex) {
            Logger.getLogger(PanelVerReportes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /*public void refrescarTabla(){
        try {
            Vector<Vector> datos = new Vector<>();
            List<IDetalleVenta> lista;
            
            lista = RMI.getIDetalleVentaController().list();
            
            for (IDetalleVenta iDetalleVenta : lista) {
                Vector registro = new Vector();
                registro.add( iDetalleVenta.getDetalleVentaId() );
                registro.add( iDetalleVenta.getVentaId() );
                registro.add( iDetalleVenta.getProductoId() );
                registro.add( iDetalleVenta.getUnidades() );
                registro.add( iDetalleVenta.getPrecioUnidad() );
                registro.add( iDetalleVenta.getTotal() );
                
                datos.add(registro);
            }
            
            Vector<String> columnas = new Vector<>();
            columnas.add("DetalleVentaId");
            columnas.add("VentaId");
            columnas.add("ProductoID");
            columnas.add("Unidades");
            columnas.add("Precio Unidad");
            columnas.add("Total");
            tablaReportes.setModel( new DefaultTableModel(datos, columnas));
        } catch (RemoteException ex) {
            Logger.getLogger(PanelVerReportes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DateChooserInicial = new newscomponents.RSDateChooser();
        lblFechaInicio = new javax.swing.JLabel();
        DateChooserFinal = new newscomponents.RSDateChooser();
        lblFechaFin = new javax.swing.JLabel();
        btnReporteMontoTotal = new RSMaterialComponent.RSButtonMaterialIconTwo();
        jScrollPane1 = new javax.swing.JScrollPane();
        rSTableMetro1 = new RSMaterialComponent.RSTableMetro();
        inputMonto = new RSMaterialComponent.RSTextFieldTwo();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(541, 400));
        setName("PanelVerReportes"); // NOI18N
        setPreferredSize(new java.awt.Dimension(541, 400));

        DateChooserInicial.setBackground(new java.awt.Color(100, 158, 253));
        DateChooserInicial.setBgColor(new java.awt.Color(100, 181, 246));
        DateChooserInicial.setFormatDate("dd/MM/yyyy\n");

        lblFechaInicio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblFechaInicio.setText("Fecha inicial:");

        DateChooserFinal.setBackground(new java.awt.Color(100, 158, 253));
        DateChooserFinal.setBgColor(new java.awt.Color(100, 181, 246));
        DateChooserFinal.setFormatDate("dd/MM/yyyy\n");

        lblFechaFin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblFechaFin.setText("Fecha final:");

        btnReporteMontoTotal.setBackground(new java.awt.Color(100, 158, 253));
        btnReporteMontoTotal.setText("Generar Reporte");
        btnReporteMontoTotal.setBackgroundHover(new java.awt.Color(100, 145, 253));
        btnReporteMontoTotal.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CASINO);
        btnReporteMontoTotal.setInheritsPopupMenu(true);
        btnReporteMontoTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteMontoTotalActionPerformed(evt);
            }
        });

        rSTableMetro1.setModel(new javax.swing.table.DefaultTableModel(
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
        rSTableMetro1.setBackgoundHead(new java.awt.Color(100, 158, 253));
        rSTableMetro1.setBackgoundHover(new java.awt.Color(100, 158, 253));
        rSTableMetro1.setColorBorderHead(new java.awt.Color(255, 255, 255));
        rSTableMetro1.setColorBorderRows(new java.awt.Color(255, 255, 255));
        rSTableMetro1.setColorPrimaryText(new java.awt.Color(51, 51, 51));
        rSTableMetro1.setColorSecundaryText(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(rSTableMetro1);

        inputMonto.setForeground(new java.awt.Color(0, 51, 0));
        inputMonto.setBorderColor(new java.awt.Color(153, 153, 153));
        inputMonto.setPhColor(new java.awt.Color(153, 153, 153));
        inputMonto.setPlaceholder("Monto total");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Monto Total entre fechas:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFechaInicio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DateChooserInicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DateChooserFinal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnReporteMontoTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inputMonto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DateChooserInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(lblFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DateChooserFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(lblFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(inputMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnReporteMontoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        DateChooserInicial.getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    private void btnReporteMontoTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteMontoTotalActionPerformed
        setFechas();
        calcularMonto();
        productosVendidos();
    }//GEN-LAST:event_btnReporteMontoTotalActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private newscomponents.RSDateChooser DateChooserFinal;
    private newscomponents.RSDateChooser DateChooserInicial;
    private RSMaterialComponent.RSButtonMaterialIconTwo btnReporteMontoTotal;
    private RSMaterialComponent.RSTextFieldTwo inputMonto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFechaFin;
    private javax.swing.JLabel lblFechaInicio;
    private RSMaterialComponent.RSTableMetro rSTableMetro1;
    // End of variables declaration//GEN-END:variables
}
