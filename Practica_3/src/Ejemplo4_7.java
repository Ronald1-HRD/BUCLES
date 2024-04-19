import java.util.Scanner;

public class Ejemplo4_7 {
    public static void main(String[] args) {
        Scanner RH1 = new Scanner(System.in);
        Scanner RH2 = new Scanner(System.in);
        int CANT_LEER,CANT_P=0,CANT_N=0;
        float NUM_CA;
         System.out.println("introduzca una cantidad 'N' de numeros enteros");
        NUM_CA= RH1.nextFloat();
        for(int i=1 ;i<=NUM_CA;i++){
            System.out.println("introduzca la cantidad"+i+" en numeros enteros");
            CANT_LEER= RH2.nextInt();
            if(CANT_LEER<=0){
                CANT_N=CANT_N+1;
            }else {
                CANT_P=CANT_P+1;
            }

        }
        System.out.println("la cantidad positiva es : "+CANT_P);
        System.out.println("la cantidad negativa es : "+CANT_N);


    }
}
