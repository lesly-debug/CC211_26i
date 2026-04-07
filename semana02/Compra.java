class Compra{
    public static void main(String[] args){
        int p1=10;
        int p2=20;
        int dinero=60;
        int c1,c2,total;
        System.out.println("p1 = "+p1+", p2 = "+p2+", dinero = "+dinero);
        System.out.println(" c1 "+" c2 "+" compra ");
        for(c1=1;c1<=dinero/p1;c1++){
            for(c2=1;c2<=dinero/p2;c2++){
                total=p1*c1+p2*c2;
                if(total<=dinero){
                    System.out.println( c1 + "  " + c2 + "  " + total);
                }
            }
        }
    }
}