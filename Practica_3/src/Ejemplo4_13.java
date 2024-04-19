public class Ejemplo4_13 {
    public static void main(String[] args) {
        float pag=5.0f,pag_t=0;
        for (int i=1;i<=20;i++){
            pag=pag*2;
            System.out.println("el pago de este "+i+"° mes sera:"+pag);
            pag_t=pag_t+pag;
        }
        System.out.println("el pago total es: "+pag_t);
    }
}
