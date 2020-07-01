package proyectormicliente;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JOptionPane;

public class Ip {
    private static String IP = "";
    private static String Ruta = "C:\\Users\\Luisa\\OneDrive\\Documentos\\NetBeansProjects\\archivoIp.txt";
    private Ip(){
        IP = leerIP();
    }
    public static String getIp(){
        crearArchivo();
        if("".equals(IP)){
            new Ip();
        }
        return IP;
    }
    
    public String leerIP()  {
        String contenido = null;
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
            //archivo = new File ("C:\\Users\\Luisa\\OneDrive\\Documentos\\NetBeansProjects\\RMICliente30\\leer.txt");
            archivo = new File (Ruta);
            fr = new FileReader (archivo);
            br = new BufferedReader(fr);

            // Lectura del fichero
            String linea;
            while((linea=br.readLine())!=null)
                contenido = linea; //Aquí manipularías lo que tenga tu archivo
        }
        catch(Exception e){
            e.printStackTrace();
        }finally{
            try{                    
                if( null != fr ){   
                    fr.close();     
                }                  
            }catch (Exception e2){ 
                e2.printStackTrace();
            }
        }
        return contenido;
    }
    public static void crearArchivo(){
         try {
            String ruta = Ruta;
            String contenido = "localhost";
            File file = new File(ruta);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
                FileWriter fw = new FileWriter(file);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(contenido);
                bw.close();
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void errorInicio(){
        String nuevaIp = JOptionPane.showInputDialog(null, "Ingrese Ip valida", "Ip no encontrada", JOptionPane.ERROR_MESSAGE);
        cambiarIp(nuevaIp);
    }
    public static void cambiarIp(String IpNueva){
        try {
            String ruta = Ruta;
            File file = new File(ruta);
            // Si el archivo no existe es creado
            
                FileWriter fw = new FileWriter(file);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(IpNueva);
                bw.close();
                JOptionPane.showMessageDialog(null, "Favor de abrir el sistema de nuevo!", "Reiniciar sistema", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
