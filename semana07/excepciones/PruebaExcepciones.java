package excepciones;

import java.io.File;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

public class PruebaExcepciones {
    public static void leerArchivo() throws FileNotFoundException, IOException {
        File archivo = new File("excepciones/prueba.txt");
        FileReader fr = new FileReader(archivo);
        BufferedReader bf = new BufferedReader(fr);
        String linea;
        while((linea=bf.readLine())!=null){
            System.out.println(linea);
        }
    }
    public static void leerArchivo2() {
        try{
            leerArchivo();
        }catch(FileNotFoundException ex){
            JOptionPane.showMessageDialog(null,"No se ha encontrado el archivo deseado, por favor verifique la ruta");
        }catch(IOException e){
            JOptionPane.showMessageDialog(null,"Ha ocurrido una excepcion verificada");
        }
        System.out.println("Programa terminado");
    }
    public static void main (String[] args) {
        PruebaExcepciones prueba = new PruebaExcepciones();
        prueba.leerArchivo2();
    }
}