package java101;

import java.util.Scanner;

public class NotOrtalama {

    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,tarih,muzik;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Matematik notunuz");
        mat = scanner.nextInt();
        System.out.print("Fizik notunuz");
        fizik = scanner.nextInt();
        System.out.print("Kimya notunuz");
        kimya = scanner.nextInt();
        System.out.print("Turkce notunuz");
        turkce = scanner.nextInt();
        System.out.print("Tarih notunuz");
        tarih = scanner.nextInt();
        System.out.print("Muzik notunuz");
        muzik = scanner.nextInt();
        scanner.close();
        double ortalama = (mat + fizik + kimya + turkce+tarih+muzik)/6.0;
        System.out.println("Ortalamanız " +ortalama);
        String gecme = ortalama >= 60 ? "Geçtiniz" : "Kaldınız";
        System.out.println("Geçme durumunuz :" + gecme);


    }
}
