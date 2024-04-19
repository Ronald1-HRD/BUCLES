import java.util.Scanner;

public class Ejemplo4_15 {
    public static void main(String[] args) {
        Scanner RH1 = new Scanner(System.in);
        Scanner RH2 = new Scanner(System.in);
        int NUM_TRBJ,SUM_HRS_S=0,DIAS_LAB=0;
        float HRS_TRJS,pagxhrs,SS,TOT=0;
        System.out.println("ingrese la cantidad de trabajadores");
        NUM_TRBJ=RH1.nextInt();
        for (int i=1;i<=NUM_TRBJ;i++){
            System.out.println("ingrese los dias laborados del trabajador "+i);
            DIAS_LAB=RH1.nextInt();
            System.out.println("ingrese la cantidad de pago por hora");
            pagxhrs=RH2.nextFloat();

            for (int d=1;d<=DIAS_LAB;d++){
                System.out.println("ingrese las horas trabajadas del dia "+d);
                HRS_TRJS=RH2.nextFloat();
                SUM_HRS_S= (int) (SUM_HRS_S+HRS_TRJS);
            }

            SS=SUM_HRS_S*pagxhrs;
            System.out.println("el sueldo del trabajador"+i+" es: "+SS);
            TOT=TOT+SS;
        }
        System.out.println("el total que se pago es: "+TOT);
    }
}
