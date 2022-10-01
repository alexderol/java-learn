package j08_Ifstatement_TernaryOperator;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        /*girilen sayının negatif pozitif kontrol et
         /*
        Task01
           girilen bir sayının negatif ve pozitifliğini kontrol eden code create ediniz..
         */

        /*hocanın ekranı

        Scanner sc = new Scanner(System.in);
        System.out.println("agam bir sayi gir : ");
        int sayi = sc.nextInt();

        if (sayi > 0) {//sayinin sıfırdan buyuk olması şarta baglandı
            System.out.println("girilen sayi pozitif");
        } else if (sayi < 0) {//sayinin sıfırdan buyuk olmaması halinde sıfırdan kucuk olamsı sarta baglandı
            System.out.println("girilen sayi negatif");
        } else {//syının sıfırdan buyuk veya kucuk olmaması halıinde kalan durum(sıfıra eşit olması) şarta bağlandı
            System.out.println("girilen sayi ne negatif  ne de pozitifdir yani nötr'dür");
        }


         */
        Scanner scan = new Scanner(System.in);
        System.out.println("kontrol edilmesini istediğiniz sayıyı giriniz =");
        int sayı = scan.nextInt();
        if (sayı > 0) {
            System.out.println("sayı pozitiftir");
            if (sayı < 0) {
                System.out.println(" sayı negatiftir");
                if (sayı == 0) {
                    System.out.println(
                            "sayı nötürdür"
                    );
                }

            }
        }
        System.out.println("yeni sayı giriniz");

        int sayı2 = scan.nextInt();
        if (sayı2>0){
            System.out.println("sayı2 pozitiftir");
        } else if (sayı2<0){
            System.out.println("sayı2 negatif");
        }else System.out.println("sayı2 nötür");





    }


}
