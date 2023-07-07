package java101;

import java.util.Scanner;

public class kdv {
    public static void main(String[] args) {
        double fiyat,kdvTutarı,kdvliFiyat,kdvOran=0.18;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Fiyat giriniz : ");
        fiyat = scanner.nextDouble();
        if(fiyat <=1000 && fiyat >0)kdvOran = 0.18;
        else kdvOran = 0.08;
        kdvTutarı = fiyat * kdvOran;
        kdvliFiyat = fiyat + kdvTutarı;
        System.out.println("Kdv'siz Fiyat : " + fiyat);
        System.out.println("Kdv Oranı : " + kdvOran);
        System.out.println("Kdv Tutarı : " + kdvTutarı);
        System.out.println("Kdvli Fiyat : " + kdvliFiyat);
    }
}
