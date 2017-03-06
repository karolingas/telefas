package com.pamokos;

import com.užduotis1.Užduotis1;
import com.užduotis2.Užduotis2;
import com.užduotis3.Užduotis3;
import com.užduotis4.Užduotis4;
import com.užduotis5.Užduotis5;

import java.util.Scanner;


public class main3 {
    public static void main(String[] args) {
        Užduotis1 uzduotis1 = new Užduotis1();
        System.out.println("pasirinkite nuo 1 iki 4");
        Scanner sc = new Scanner(System.in);
        Integer x = sc.nextInt();
        if (x == 1){
            Užduotis2 uzduotis2 = new Užduotis2();
        } else if (x == 2) {
            Užduotis3 uzduotis3 = new Užduotis3();
        } else if (x == 3) {
        Užduotis4 uzduotis4 = new Užduotis4();
        } else if (x == 4) {
            Užduotis5 uzduotis5 = new Užduotis5();
        } else {
            System.out.println("Tokio pasirinkimo nėra rinkis nuo 1 iki 4");
        }
    }
}