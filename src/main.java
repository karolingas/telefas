import java.util.Scanner;

/**
 * Created by Veronika on 2017-03-03.
 */
public class main {
    public static void main (String[] args){
        double x,y;
        System.out.println("Įveskite savo masę kg.");
        Scanner in = new Scanner(System.in);
        x = in.nextDouble();
        System.out.println("Įveskite savo ūgį metrais");
        y = in.nextDouble();
        System.out.println("Jūsų KMI" +KMI(x,y));


    } public static double KMI(double x, double y) {
        double z, d;
        z = x/(y*y);
        d = Math.floor(z);
        return (d);
    }
}
