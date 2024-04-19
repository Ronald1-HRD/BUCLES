import java.util.Scanner;

public class Ejemplo4_9 {
    public static void main(String[] args) {
        Scanner RH = new Scanner(System.in);
        int A=0,B=1,VAL_GEN,NUM_ELEM,CONT=0;
        System.out.println("ingrese la cantidad de numeros a saber");
        NUM_ELEM=RH.nextInt();
        for (CONT=1;CONT<=NUM_ELEM;CONT++){
            VAL_GEN=A+B;
            System.out.println("el "+CONT+"° numero es= "+VAL_GEN);
            A=B;
            B=VAL_GEN;
        }
    }
}
