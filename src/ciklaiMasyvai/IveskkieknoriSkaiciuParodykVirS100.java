package ciklaiMasyvai;

import java.util.Scanner;

/**
 * Created by Veronika on 2017-03-07.
 */
public class IveskkieknoriSkaiciuParodykVirS100 {
    public IveskkieknoriSkaiciuParodykVirS100() {
    }

    public void nuskaitymas3() {

        Scanner s = new Scanner(System.in);

        System.out.println("ivesk kiek nori skaiciu isivesti");

        int n = s.nextInt();

        Integer arr[] = new Integer[n];

        System.out.println("Įvesk " + n + "skaičius");

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();

        }
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 100) {
                System.out.println(arr[i]);
            }
        }
    }
}
