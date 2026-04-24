class Circulo{
    float[] centro=new float[2];
    float radio=0.0f;
    Circulo(float[] centro,float radio){
        this.centro[0]=centro[0];
        this.centro[1]=centro[1];
        this.radio=radio;
    }
    float area(){
        return (float)Math.PI*radio*radio;
    }
    public static void main(String[] args){
        Circulo c1=new Circulo(new float[]{2.0f,3.0f},2.0f);
        System.out.println("Area del circulo: "+c1.area());
    }
}
class CirculoTest{
    public static void main(String[] args){
        float[] cent2={4.0f,5.0f};
        Circulo c2=new Circulo(cent2,3.0f);
        System.out.println("Area: "+c2.area());
    }
}