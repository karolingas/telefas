import java.util.Scanner;

/**
 * Created by Veronika on 2017-03-06.
 */
public class zodziuatvaizdavimas {
    public static void main(String[] args) {

        System.out.println("Įveskite žodį");
        Scanner in = new Scanner(System.in);
        String x = in.next();
        while (!x.equals("Pabaiga")) {
            System.out.println(x);
            x = in.next();
            System.out.println("Ivestas "+x);
        }
        System.out.println("Viskas");
    }
}