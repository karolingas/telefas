package com.užduotis5;

import java.util.Scanner;

/**
 * Created by Veronika on 2017-03-06.
 */
public class Užduotis5 {
    public Užduotis5(){
        System.out.println("Įveskite nuvažiuotus km");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        System.out.println("Įveskite kiek litrų sunaudojo");
        double y = in.nextDouble();
        y = Math.pow(y, 2);
        double z = (x*100)/y;
        double d = Math.floor(z);

        System.out.println("Jūsų automobilis vidutinškai suvartoja" + d + "l/100km.");
    }
}
