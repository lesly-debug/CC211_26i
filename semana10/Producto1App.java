import java.io.*;
import java.util.GregorianCalendar;
public class Producto1App {
    public static void main(String[] args){
        System.out.println("Productos");
        System.out.println("Cod.\tDesc.\tPre.\tFecha");
        DB db=new DB();
        db.outOpen("producto.txt");
        GregorianCalendar fecha=new GregorianCalendar(2021, 10, 15);
        for(int i=0;i<7;i++) {
            Producto p=new Producto(i,"D"+i,10+i,(GregorianCalendar) fecha.clone());
            System.out.println(p);
            db.write(p);
            fecha.add(GregorianCalendar.DAY_OF_MONTH, 1);
        }
        db.close();
    }
}
class GCUtils{
    public static String toString(GregorianCalendar gc) {
        int anio=gc.get(GregorianCalendar.YEAR);
        int mes=gc.get(GregorianCalendar.MONTH)+1;
        int dia=gc.get(GregorianCalendar.DAY_OF_MONTH);
        return String.format("%04d/%02d/%02d",anio,mes,dia);
    }
}
class Producto {
    int codigo;
    String descripcion;
    int precio;
    GregorianCalendar fecha;
    Producto(int cod,String desc,int pre,GregorianCalendar fecha){
        this.codigo=cod;
        this.descripcion=desc;
        this.precio=pre;
        this.fecha=fecha;
    }
    public String toString() {
        return codigo+"\t"+descripcion+"\t"+precio+"\t"+GCUtils.toString(fecha);
    }
}
class DB {
    private PrintWriter out;
    public void outOpen(String file) {
        try{
            out=new PrintWriter(new FileWriter(file));
        }catch(Exception e) {
            System.out.println("Error al abrir el archivo");
        }
    }
    public void write(Producto p) {
        out.println(p);
    }
    public void close() {
        if(out!=null){
            out.close();
        }
    }
}