import java.text.NumberFormat;
class Producto{
    private String codigo;
    private String descripcion;
    private double precio;
public Producto(){
    codigo="";
    descripcion="";
    precio=0;
}
public Producto(String c,String d,double p){
    this.codigo=c;
    this.descripcion=d;
    this.precio=p;
}
public void setCodigo(String c){
    this.codigo=c;
}
public String getCodigo(){
    return codigo;
}
public void setDescripcion(String d){
    this.descripcion=d;
}
public String getDescripcion(){
    return descripcion;
}
public void setPrecio(double p){
    this.precio=p;
}
public double getPrecio(){
    return precio;
}
public String getPrecioFormatted(){
    NumberFormat moneda=NumberFormat.getCurrencyInstance();
    return moneda.format(precio);
}
public static void main(String[] args){
    Producto p1=new Producto("101","Mesa",300);
    System.out.println(p1.getCodigo());
    System.out.println(p1.getDescripcion());
    System.out.println(p1.getPrecio());
}
}