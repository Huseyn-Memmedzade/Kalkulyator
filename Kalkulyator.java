package yenipabka;

import java.util.Scanner;

public class Kalkulyator {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Birinci ədədi daxil edin: ");
        double eded1 = sc.nextDouble();


        System.out.println("İkinci ədədi daxil edin: ");
        double eded2 = sc.nextDouble();

        System.out.println("Əməliyyatı daxil edin (+, -, *, /): ");
        char emeliyyat = sc.next().charAt(0);

        double netice;


        switch (emeliyyat) {
            case '+':
                System.out.println(eded1 + eded2);
                break;
            case '-':
                System.out.println(eded1 - eded2);
                break;
            case '*':
                System.out.println(eded1 * eded2);
                break;
            case '/':
                if (eded2 != 0) {
                    System.out.println(eded1 / eded2);
                } else {
                    System.out.println("Sıfıra bölmək olmaz!");
                }
                break;
            default:
                System.out.println("Yanlis Emeliyyat Daxil Edilmisdir");
                break;

        }

    }


}
