package java101;

import java.util.Scanner;

public class hipotenus {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("A kenarını giriniz");
        a = sc.nextInt();
        System.out.println("B kenarını giriniz");
        b= sc.nextInt();
        double hipo = Math.sqrt(a*a + b*b);
        System.out.println("Hipotenüs : " + hipo);
        double u = (a+b+hipo)/2;
        double cevre = 2*u;
        System.out.println("Çevre : " + cevre);
        double alan = (a*b)/2;
        System.out.println("Alan : " + alan);
    }
}
