import java.util.Scanner;

/**
 * Created by Veronika on 2017-03-06.
 */
public class lyginisNelyginis {
    public static void main(String[] args) {
        System.out.println("Įveskite skaičių");
        Scanner in = new Scanner(System.in);
        Integer x = in.nextInt();
        if ((x % 2) == 0)
        {
            System.out.println("lyginis");
        }
        else
        {
            System.out.println("nelyginis");
        }
    }
}
