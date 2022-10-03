package j11_MethodCreation;

import java.util.Scanner;

public class Task05AtmMethod {
    static Scanner scan = new Scanner(System.in);
    static int bakiye = 1000;


    public static void secim() {
        System.out.println("Agam yapacagın islemi sec :");
        int secim = scan.nextInt();
        switch (secim) {
            case 1:
                bakiyever();
                break;
            case 2:
                paraYatir();
                break;
            case 3:
                paraCek();
                break;
            case 4:
                cıkısYap();
                break;
            default:
                System.out.println("agam daha secim yapamirsen para istirsen...");
        }


    }

    private static void cıkısYap() {
        System.out.println("agam yine bekleriz cıkısınız yapılmıştır selametle :) ");
    }

    private static void paraCek() {
        System.out.println("agam ne kadar cekecen gir bakam = ");
        int cekilecekMiktar = scan.nextInt();
        if (cekilecekMiktar <= bakiye) {
            bakiye -= cekilecekMiktar;
            System.out.println("agam para cebinde gözügn aydın:) ");
            System.out.println("yeni bakiyen = " + bakiye);

        } else System.out.println("agam nettin olmayan miktarda para istiyon :( ");
        karar();

    }

    private static void paraYatir() {
        System.out.print("agam elin tutulmaz yatıracağın tutarı gir =");
        int yatırılacakMiktar = scan.nextInt();
        bakiye += yatırılacakMiktar;
        System.out.println("agam para hesapta şuan toplam = " + bakiye + " TL");
        karar();


    }


    private static void bakiyever() {
        System.out.println("agam bakiyen = " + bakiye + " TL");
        karar();

    }

    public static void karar() {
        System.out.println("agam isleme devam ise ---> 1\nİslemi sonlandırmak icin ---> 0");
        int karar = scan.nextInt();
        if (karar == 1) {
            secim();
        } else if (karar == 0) cıkısYap();


    }
}
