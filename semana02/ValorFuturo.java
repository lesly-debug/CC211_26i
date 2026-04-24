public class ValorFuturo{
    public static void main(String[] args){
        int anIni=4,anFin=2,tasaPor=4,meses,i,j,k;
        double tasaIni=0.05,ahMes=100,tasaJ,vF,tasaMes;
        System.out.print("Años                Tasa anual\n    ");
        for(j=0,tasaJ=tasaIni;j<tasaPor;j++,tasaJ+=0.005)
            System.out.printf("   %.1f%%    ", tasaJ*100);
        System.out.println();
        for(i=anIni;i>=anFin;i--){
            meses=i*12;
            System.out.print(i+"  ");
            for(j=0, tasaJ= tasaIni; j<tasaPor; j++, tasaJ+=.005){
                tasaMes=tasaJ/12;
                vF=0;
                for(k=1;k<=meses;k++)
                vF=(vF+ahMes)*(1+tasaMes);
                System.out.printf("  $%.2f ",vF);
            }
            System.out.println();
        }
    }
}