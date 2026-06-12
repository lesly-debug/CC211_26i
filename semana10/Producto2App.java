package P2;
import java.io.*;
import java.util.GregorianCalendar;
import java.io.IOException;

public class Producto2App {
    public static void main(String[] args){
        DB db = new DB();
        db.actualizar("p1.txt","p2.txt");
        db.close();
    }
}

class DB{
    BufferedReader in;
    PrintWriter out;
    
    public void actualizar(String file1,String file2){
        try{
            in = new BufferedReader(new FileReader(file1));
            out = new PrintWriter(new BufferedWriter(new FileWriter(file2)));
            String linea;
            linea = in.readLine();
            String[] s, fechaSplit;
            int codigo, anio,mes,dia, precio;
            String descripcion;
            GregorianCalendar fecha;
            while(linea != null){
                Producto p;
                s = linea.split("\t");
                codigo = Integer.parseInt(s[0]);
                descripcion = s[1];
                precio = Integer.parseInt(s[2]);
                fechaSplit = s[3].split("/");
                anio = Integer.parseInt(fechaSplit[0]);
                mes = Integer.parseInt(fechaSplit[1]);
                dia = Integer.parseInt(fechaSplit[2]);
                fecha = new GregorianCalendar(anio+1,mes,dia);
                p = new Producto(codigo,descripcion,precio+1,fecha);
                System.out.println(p.toString());
                out.println(p.toString());
                linea = in.readLine();
            }
        }catch (IOException e) {
            System.out.println("Error al abrir el archivo");
            System.out.println(e);
        }
    }
    public void close(){
        out.close();
    }
}

class Producto{
    int codigo;
    String descripcion;
    int precio;
    GregorianCalendar fecha;
    GCUtil gc = new GCUtil();
    Producto(int codigo, String descripcion, int precio, GregorianCalendar fecha){
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.fecha = fecha;
    }
    public String toString(){
        return codigo + "\t" + descripcion + "\t" + precio + "\t" + gc.toString(fecha);
    }
}

class GCUtil{
    public String toString(GregorianCalendar fecha){
        return fecha.get(GregorianCalendar.YEAR) + "/" + fecha.get(GregorianCalendar.MONTH) + "/" + fecha.get(GregorianCalendar.DAY_OF_MONTH);
    }
}