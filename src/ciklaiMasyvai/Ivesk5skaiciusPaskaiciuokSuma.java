package ciklaiMasyvai;

import java.util.Scanner;

/**
 * Created by Veronika on 2017-03-07.
 */
public class Ivesk5skaiciusPaskaiciuokSuma {
    int[] masyvas;

    public Ivesk5skaiciusPaskaiciuokSuma() {
    }

    public void nuskaitymas(int ilgis) {
        System.out.println("Įvesk " + ilgis + " skaičius");
        Scanner in = new Scanner(System.in);
        masyvas = new int[ilgis];
        for (int i = 0; i < masyvas.length; i++) {
            masyvas[i] = in.nextInt();
        }
    }

    public void skaičiavimas() {
        int suma = 0;
        for (int i = 0; i < masyvas.length; i++) {
            System.out.println("Įvestas skaičius =" + masyvas[i]);
            suma += masyvas[i];
        }
        System.out.println("Visų skaičių suma yra" + suma);
    }


}
