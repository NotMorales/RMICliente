package proyectormicliente;

import Interfaces.IDetalleVentaController;
import Interfaces.IProductoController;
import Interfaces.IVentaController;
import gui.VentanaPrincipal;
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
            Ip.errorInicio();
        } catch (RemoteException ex) {
            Ip.errorInicio();
        }
        return productoController;
    }
    
    public static IVentaController getIVentaController(){
        if( ventaController == null){
            try {
                ventaController = (IVentaController) Naming.lookup("rmi://" + Ip.getIp() + "/VentaController");
            } catch (NotBoundException ex) {
                Logger.getLogger(RMI.class.getName()).log(Level.SEVERE, null, ex);
            } catch (MalformedURLException ex) {
                Ip.errorInicio();
            } catch (RemoteException ex) {
                Ip.errorInicio();
            }
        }
        return ventaController;
    }
    
    public static IDetalleVentaController getIDetalleVentaController(){
        if( detalleVentaController == null){
            try {
                detalleVentaController = (IDetalleVentaController) Naming.lookup("rmi://" + Ip.getIp() + "/DetalleVentaController");
            } catch (NotBoundException ex) {
                Logger.getLogger(RMI.class.getName()).log(Level.SEVERE, null, ex);
            } catch (MalformedURLException ex) {
                Ip.errorInicio();
            } catch (RemoteException ex) {
                Ip.errorInicio();
            }
        }
        return detalleVentaController;
    }
}
