package com.užduotis2;

import java.util.Scanner;

/**
 * Created by Veronika on 2017-03-06.
 */
public class Užduotis2 {
    public Užduotis2(){
        System.out.println("Įveskite žodį");
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        System.out.println(x.length());
    }
}
