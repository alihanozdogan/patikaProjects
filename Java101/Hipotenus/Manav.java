package java101;

import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {
        double armut = 2.14, elma = 3.67, domates = 1.11 , muz = 0.95 , patlıcan = 5.00,toplam;
        int armutKg,elmaKg,domateskg,muzKg,patlıcanKg;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo ? :");
        armutKg = scanner.nextInt();
        System.out.print("Elma Kaç Kilo ? :");
        elmaKg = scanner.nextInt();
        System.out.print("Domates Kaç Kilo ? :");
        domateskg = scanner.nextInt();
        System.out.print("Muz Kaç Kilo ? :");
        muzKg = scanner.nextInt();
        System.out.print("Patlıcan Kaç Kilo ? :");
        patlıcanKg = scanner.nextInt();
        toplam = (armutKg * armut) + (elma* elmaKg)+(domateskg*domates)+(muz*muzKg)+(patlıcanKg*patlıcan);
        System.out.print("Toplam Tutar  :" + toplam + "TL");
    }
}
