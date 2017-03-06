package com.užduotis4;

import java.util.Scanner;

/**
 * Created by Veronika on 2017-03-06.
 */
public class Užduotis4 {
    public Užduotis4(){
        System.out.println("Įveskite savo masę kg.");
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        System.out.println("Įveskite savo ūgį metrais");
        double y = in.nextDouble();
        y = Math.pow(y, 2);
        double z = x / y;
        double d = Math.floor(z);

        System.out.println("Jūsų KMI" + d);
    }
}
