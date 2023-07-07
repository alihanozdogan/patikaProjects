package java101;

import java.util.Scanner;

public class ArtıkYıl {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int tarih, mod4, mod100, mod400;

        System.out.println("Artıkyıl bulma Uygulamasıdır.");
        System.out.print("Yıl giriniz: ");
        tarih = input.nextInt();
        mod4 = tarih % 4;
        mod100 = tarih % 100;
        mod400 = tarih % 400;

        if(mod4==0 && mod100==0 || mod400==0){
            System.out.println(tarih + " Bir artık yıldır.");
        }else{
            System.out.println(tarih + " Bir artık yıl değildir.");
        }
    }
}