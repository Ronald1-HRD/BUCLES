import java.util.Scanner;
public class Ejemplo4_5 {
    public static void main(String[] args) {
        Scanner RH = new Scanner(System.in);
        int C_PER=0;
        float EST_PER=0,SUM_EST=0,PR=0;
        System.out.println("ingrese la estatura registrada en numero entero");
        EST_PER= RH.nextFloat();
        while (EST_PER>0){
            SUM_EST=SUM_EST+EST_PER;
            System.out.println("ingrese la estatura registrada en numero entero ");
            EST_PER= RH.nextFloat();
            C_PER++;
        }
        if(C_PER==0){
            System.out.println("no hay estatura");
        }else{
            PR=SUM_EST/C_PER;
        }
        System.out.println("el promedio de la estatura es : "+PR);
    }
}
