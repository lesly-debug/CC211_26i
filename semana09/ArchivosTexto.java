import java.io.*;
public class ArchivosTexto {
    File archivo;
    private void crearArchivoDeTexto(String nombreArchivo) {
        archivo=new File(nombreArchivo);
        try{
            if(archivo.createNewFile()){
                System.out.println("Archivo creado con exito");
            }
        }catch(IOException ex){
            ex.printStackTrace(System.out);
        }
    }
    private void eliminarArchivoDeTexto(String nombreArchivo) {
        if(archivo.delete()){
            System.out.println("Archivo eliminado con exito");
        }else{
            System.out.println("Error al eliminar el archivo");
        }
    }
    private void escribirAlArchivoDeTexto(String nombreArchivo) {
        try{
            FileWriter escritura=new FileWriter(archivo,true);
            escritura.write("\nNo pierdas de vista al horizonte");
            escritura.close();
            System.out.println("Texto añadido con exito");
        }catch(IOException ex){
            ex.printStackTrace(System.out);
        }
    }
    private void leerArchivoDeTexto(String nombreArchivo) {
        String cadena;
        try{
            FileReader lectura=new FileReader(archivo);
            BufferedReader contenido=new BufferedReader(lectura);
            cadena=contenido.readLine();
            while(cadena!=null) {
                System.out.println(cadena);
                cadena=contenido.readLine();
            }
        }catch(IOException ex){
            ex.printStackTrace(System.out);
        }
    }
    public static void main(String args[]) {
        ArchivosTexto archivo=new ArchivosTexto();
        archivo.crearArchivoDeTexto("archivo.txt");
        archivo.escribirAlArchivoDeTexto("archivo.txt");
        archivo.leerArchivoDeTexto("archivo.txt");
    }
}