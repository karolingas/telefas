import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Veronika on 2017-03-06.
 */
public class klaidospagavimas {
    public static void main(String[] args) {
        int x = -1;
        System.out.println("Įveskite skaičius");
        int suma = 0;
        while (x!=0) {
            try{
                Scanner sc = new Scanner (System.in);
                x = sc.nextInt();
                suma += x;
            }
            catch (InputMismatchException e) {
                System.out.println ("Netinkamas skaičius");
            }
        }
        System.out.println("Viskas, suma" + suma);
    }
}
