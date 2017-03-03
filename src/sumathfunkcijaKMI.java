import java.util.Scanner;
import java.lang.Math;

/**
 * Created by Veronika on 2017-03-03.
 */
public class sumathfunkcijaKMI {
    public static void main(String[] args) {
        double x, y, z, d;
        System.out.println("Įveskite savo masę kg.");
        Scanner in = new Scanner(System.in);
        x = in.nextDouble();
        System.out.println("Įveskite savo ūgį metrais");
        y = in.nextDouble();
        y = Math.pow(y, 2);
        z = x / y;
        d = Math.floor(z);

        System.out.println("Jūsų KMI" + d);


    }
}
