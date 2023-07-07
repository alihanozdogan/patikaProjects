package java101;


import java.util.Scanner;

public class bmi {
    public static void main(String[] args) {
        double height,weight;
        double bmi;
        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        height = sc.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz : ");
        weight = sc.nextDouble();
        bmi = weight / (height * height);
        System.out.println("Vücut Kitle İndeksiniz : " + bmi);
    }
}
