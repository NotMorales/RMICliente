
package gui;

import Interfaces.IDetalleVenta;
import java.rmi.RemoteException;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import proyectormicliente.RMI;


public class PanelVerReportes extends javax.swing.JPanel {

    public PanelVerReportes() {
        initComponents();
        refrescarTabla();
    }

    public void refrescarTabla(){
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
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DateChooserInicial = new newscomponents.RSDateChooser();
        lblFechaInicio = new javax.swing.JLabel();
        DateChooserFinal = new newscomponents.RSDateChooser();
        lblFechaFin = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaReportes = new RSMaterialComponent.RSTableMetro();
        btnGenerarReporte = new RSMaterialComponent.RSButtonMaterialOne();

        setBackground(new java.awt.Color(255, 255, 255));
        setName("PanelVerReportes"); // NOI18N
        setPreferredSize(new java.awt.Dimension(541, 357));

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

        tablaReportes.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaReportes.setBackgoundHead(new java.awt.Color(100, 181, 246));
        tablaReportes.setBackgoundHover(new java.awt.Color(100, 181, 246));
        tablaReportes.setColorBorderHead(new java.awt.Color(255, 255, 255));
        tablaReportes.setColorBorderRows(new java.awt.Color(255, 255, 255));
        tablaReportes.setColorPrimaryText(new java.awt.Color(51, 51, 51));
        tablaReportes.setColorSecundaryText(new java.awt.Color(51, 51, 51));
        jScrollPane1.setViewportView(tablaReportes);

        btnGenerarReporte.setBackground(new java.awt.Color(0, 204, 51));
        btnGenerarReporte.setText("Generar Reporte");
        btnGenerarReporte.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFechaInicio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DateChooserInicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DateChooserFinal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(btnGenerarReporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGenerarReporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        DateChooserInicial.getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private newscomponents.RSDateChooser DateChooserFinal;
    private newscomponents.RSDateChooser DateChooserInicial;
    private RSMaterialComponent.RSButtonMaterialOne btnGenerarReporte;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFechaFin;
    private javax.swing.JLabel lblFechaInicio;
    private RSMaterialComponent.RSTableMetro tablaReportes;
    // End of variables declaration//GEN-END:variables
}
