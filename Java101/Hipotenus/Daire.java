package java101;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Daire {
    public static void main(String[] args) {
        final double pi = 3.14;
        int r,merkezAci;
        double alan,cevre,dairedilimialanı;
        Scanner sc = new Scanner(System.in);
        System.out.println("Yarıçapı giriniz; ");
        r = sc.nextInt();
        cevre = 2 * pi * r;
        alan = pi * r * r;
        System.out.println("Dairenin çevrei ;" + cevre + " Dairenin Alanı : " + alan);
        System.out.println("Merkez açı giriniz");
        merkezAci= sc.nextInt();
        dairedilimialanı = (pi * (r*r)*merkezAci)/360;
        System.out.println("Daire diliminin alanı : " + dairedilimialanı);
    }
}
