/*
 * Program rekusif java dengan oop
 * Yogi Noviana 211401137
 */
package no2;

/**
 *
 * @author ASUS
 */
public class No2 {
     public static int hitungfaktorial(int bilangan) {
        if (bilangan == 0) {
            return 1;
        } else {
            return bilangan * hitungfaktorial(bilangan - 1);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int bilangan = 5;
        int faktorial = hitungfaktorial(bilangan);
        System.out.println("Faktorial dari " + bilangan + " adalah " + faktorial);
    }
    
}
