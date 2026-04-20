import java.text.NumberFormat;
import java.util.Locale;
public class Producto implements Printable{
    private String codigo;
    private String descripcion;
    private double precio;
    public Producto(String codigo,String descripcion,double precio){
        this.codigo=codigo;
        this.descripcion=descripcion;
        this.precio=precio;
    }
    public String getCodigo(){
        return codigo;
    }
    public void setCodigo(String codigo){
        this.codigo=codigo;
    }
    public String getDescripcion(){
        return descripcion;
    }
    public void setDescripcion(String descripcion){
        this.descripcion=descripcion;
    }
    public double getPrecio(){
        return precio;
    }
    public void setPrecio(double precio){
        this.precio=precio;
    }
    public String getFormattedPrecio(){
        NumberFormat nf=NumberFormat.getCurrencyInstance(Locale.US);
        return nf.format(this.precio);
    }
    public void print(){
        System.out.println("Codigo:     "+codigo);
        System.out.println("Descripcion:"+descripcion);
        System.out.println("Precio:     "+this.getFormattedPrecio());
    }
    public static void main(String[] args){
    Producto p1=new Producto("java","José Vargas",49.50);
    p1.print();
    Printable p2=new Producto("java","José Vargas",49.50);
    p2.print();
    }
}