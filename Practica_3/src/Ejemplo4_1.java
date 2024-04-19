import java.util.Scanner;

public class Ejemplo4_1 {
    public static void main(String[] args) {
        Scanner RH = new Scanner(System.in);
        int c=1;
        float vs=1,sv=0;

        while (c<=10){
            sv=sv +vs;
            c++;
            System.out.println(sv);
        }
        System.out.println("suma de valores es : "+sv);
    }
}
