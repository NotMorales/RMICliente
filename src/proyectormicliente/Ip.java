package proyectormicliente;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Ip {
    private static String IP = "";
    private Ip(){
        IP = leerIP();
    }
    public static String getIp(){
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
            archivo = new File ("C:\\Users\\Luisa\\OneDrive\\Documentos\\NetBeansProjects\\RMICliente30\\leer.txt");
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
    
}
