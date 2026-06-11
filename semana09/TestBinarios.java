import java.io.*;
class Persona implements Serializable{//Sirve para converirlo en flujo de bites
    private int edad;
    private String nombre;
    public Persona(int edad,String nombre) {
        this.edad=edad;
        this.nombre=nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad=edad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre=nombre;
    }
    public void mostrarDatos(){
        System.out.println("Nombre: "+nombre+"\nEdad: "+edad);
    }
}
class AniadirContenido extends ObjectOutputStream{
    public AniadirContenido(OutputStream out) throws IOException {
        super(out);
    }
    public AniadirContenido() throws IOException,SecurityException{
    }
    @Override
    protected void writeStreamHeader() throws IOException {
        reset();
    }
}
public class TestBinarios {
    private void escribirBinario() {
        try {
            FileOutputStream archivo=new FileOutputStream("personas.bin");
            ObjectOutputStream escritura=new ObjectOutputStream(archivo);
            escritura.writeObject(new Persona(20,"Lesly Baltazar Alanoca"));
            System.out.println("Objeto añadido con exito");
            escritura.close();
        }catch(IOException ex){
            ex.printStackTrace(System.out);
        }
    }
    private void leerBinario() {
        Persona persona;
        try{
            FileInputStream archivo=new FileInputStream("personas.bin");
            ObjectInputStream lectura=new ObjectInputStream(archivo);
            while(true){
                persona=(Persona)lectura.readObject();
                persona.mostrarDatos();
            }
        }catch(EOFException excepcion){
            return;
        }catch(ClassNotFoundException ex){
            ex.printStackTrace(System.out);
        }catch(IOException ex){
            ex.printStackTrace(System.out);
        }
    }
    private void aniadirBinario() {
        try{
            FileOutputStream archivo=new FileOutputStream("personas.bin",true);
            AniadirContenido escritura=new AniadirContenido(archivo);
            escritura.writeObject(new Persona(14,"Christian"));
            escritura.writeObject(new Persona(15,"Raul"));
            escritura.writeObject(new Persona(16,"Mario"));
            System.out.println("Objeto agregado con exito");
            escritura.close();
        }catch(IOException ex){
            ex.printStackTrace(System.out);
        }
    }
    public static void main(String args[]) throws ClassNotFoundException {
        TestBinarios test=new TestBinarios();
        test.escribirBinario();
        test.aniadirBinario();
        test.leerBinario();
    }
}