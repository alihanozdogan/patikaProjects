package java101;

import java.util.Scanner;

public class taksi {
    public static void main(String[] args) {
    double tutar,km,acilis=10;
        Scanner sc = new Scanner(System.in);
        System.out.println("Km giriniz; ");
        km = sc.nextInt();
        tutar = acilis + km*2.20;
        if(tutar < 20)tutar=20;

        System.out.println("Toplam tutar "+ tutar);
    }
}
