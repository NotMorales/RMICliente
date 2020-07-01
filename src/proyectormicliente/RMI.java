package proyectormicliente;

import Interfaces.IDetalleVentaController;
import Interfaces.IProductoController;
import Interfaces.IVentaController;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RMI {
    private static IProductoController productoController;
    private static IVentaController ventaController;
    private static IDetalleVentaController detalleVentaController;
    
    public static IProductoController getIProductoController(){
        try {
            if ( productoController == null ){
                productoController = (IProductoController) Naming.lookup("rmi://" + Ip.getIp() + "/ProductoController");
            }
        } catch (NotBoundException ex) {
            Logger.getLogger(RMI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(RMI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(RMI.class.getName()).log(Level.SEVERE, null, ex);
        }
        return productoController;
    }
    
    public static IVentaController getIVentaController(){
        if( ventaController == null){
            try {
                ventaController = (IVentaController) Naming.lookup("rmi://localhost/VentaController");
            } catch (NotBoundException ex) {
                Logger.getLogger(RMI.class.getName()).log(Level.SEVERE, null, ex);
            } catch (MalformedURLException ex) {
                Logger.getLogger(RMI.class.getName()).log(Level.SEVERE, null, ex);
            } catch (RemoteException ex) {
                Logger.getLogger(RMI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return ventaController;
    }
    
    public static IDetalleVentaController getIDetalleVentaController(){
        if( detalleVentaController == null){
            try {
                detalleVentaController = (IDetalleVentaController) Naming.lookup("rmi://localhost/DetalleVentaController");
            } catch (NotBoundException ex) {
                Logger.getLogger(RMI.class.getName()).log(Level.SEVERE, null, ex);
            } catch (MalformedURLException ex) {
                Logger.getLogger(RMI.class.getName()).log(Level.SEVERE, null, ex);
            } catch (RemoteException ex) {
                Logger.getLogger(RMI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return detalleVentaController;
    }
}
