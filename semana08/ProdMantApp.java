import java.nio.file.*;
import java.io.IOException;
import java.text.NumberFormat;
class ProdMAntApp {
    BD bd=new BD();
    public static void main (String[] args) {
        bd.escribir(Utility.ranI(10));
        bd.leer();
        reportar();
    }
    public void reportar(){
        float maxPrecio=0;
        String nomMax="";
        System.out.println("Nombre\tCant.\tPrecio");
        for(Producto p:bd.productos) {
            System.out.println(p.nombre+"\t" +p.cantidad+"\t"+p.precio);
            if(p.precio>maxPrecio){
                maxPrecio=p.precio;
                nomMax=p.nombre;
            }
        }
        System.out.println();
        System.out.println("El precio máximo es: "+maxPrecio+", corresponde al producto: "+nomMax);
    }
}
class Producto {
    String nombre;
    int cantidad;
    float precio;
    Producto(String nombre,int cantidad,float precio){
        this.nombre=nombre;
        this.cantidad=cantidad;
        this.precio=precio;
    }
    public String toString(){
        return nombre+"\t"+cantidad+"\t"+NumberFormat.getNumberInstance().format(precio);
    }
}
class Utility {
    public static int ranI(int n) {
        return (int)(Math.random()*n+1);
    }
    public static float ranF(int n) {
        return (float)(Math.random()*n+1);
    }
}
class BD {
    ArrayList<Producto> productos=new ArrayList<>();
    String dirString="CC211_26i/semana08/uno";
    String fileString=dirString+"/productos.txt";
    Path dirPath=Paths.get(dirString);
    Path filePath=Paths.get(fileString);
    BD(){
        try{
            if(Files.notExists(dirPath)){
                Files.createDirectories(dirPath);
            }
        }catch(IOException e){
            System.err.println(e.toString());
        }
    }
    public void escribir(int nReg){
        try{
            BufferedWriter bw=Files.newBufferedWriter(filePath);
            for(int i=0;i<=nReg;i++){
                Producto p=new Producto("P"+i,Utility.RanI(100),Utility.RanF(50));
                bw.write(p.toString());
                bw.newLine();
            }
            bw.close();
        }catch(IOException e){
            System.err.println(e.toString());
        }
    }
    public void leer(){
        productos.clear();
        try{
            BufferedReader br=Files.newBufferedReader(filePath);
            String linea;
            while((linea=br.readLine()!=null)){
                String datos[]=linea.split("\t");
                String nombre=datos[0];
                int cantidad=Integer.parseInt(datos[1]);
                float precio=Float.parseFloat(datos[2]);
                Producto p=new Producto(nombre,cantidad,precio);
                productos.add();
            }
            br.close();
        }catch(IOException e){
            System.err.println(e.toString());
        }
    }
}