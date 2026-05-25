package persistenciadatos;
import java.io.*;
public class ManejoArchivos{
    public static void crearArchivo(String nombreArchivo){
        File archivo=new File(nombreArchivo);
        try{
            PrintWriter salida=new PrintWriter(archivo);
            salida.println("---Itinerario de actividades---");
            salida.println("1. Danza");
            salida.println("2. Escultura");
            salida.close();
            System.out.println("Se creo el archivo correctamente");
        }catch(FileNotFoundException ex){
            ex.printStackTrace();
        }
    }
    public static void main(String[] args){
        String nombre="Lesly Baltazar Alanoca - 20242233A";
        crearArchivo(nombre);
    }
}