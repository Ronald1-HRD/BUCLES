import java.util.Scanner;

public class Ejemplo4_11 {
    public static void main(String[] args) {
        Scanner RH = new Scanner(System.in);
        float ka=70,kb=150;
        int r;
        r= (int) (kb-ka);
        while(r>0){
            ka=ka+1;
            kb=kb-1;
            r= (int) (kb-ka);

        }
        if (r==0){
            ka=kb;
        }else {
            ka=ka-0.5f;
        }
        System.out.println("el punto de encuentro es: "+ka);
    }
}
