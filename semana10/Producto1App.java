import java.io.*
import java.util.GregorianCalendar;
public class Producto1App {
    public static void main(String[] args){
        System.out.println("Productos");
    }
}
class GCUtils{
    public static String to String(GregorianCalendar gc) {
        int anio=gc.get(GregorianCalendar.YEAR);
        int mes=gc.get(GregorianCalendar.MONTH)+1;
        int dia=gc.get(GregorianCalendar.DAY_OF_MONTH);
        return String.format("%04d/%02d/%02d",anio,mes,dia);
    }
}
class producto {
    int codigo;
    String descripcion;
    int precio;
    GregorianCalendar fecha;
    Producto(int cod,String desc,int precio,GregorianCalendar fecha){
        this.codigo=cod;
        this.descripcion=desc;
        this.precio=pre;
        this.fecha=fecha;
    }
    public String toString() {
        return cod+"\t"+desc+"\t"+pre+"\t"+GCUtils.toString(fecha);
    }
}
