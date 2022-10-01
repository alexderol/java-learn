package j08_Ifstatement_TernaryOperator;

import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {
        //!!! interview sorusu////****

        /*TASK girilen bir yılın arttık (LEAP YEAR) olmasını kontrol eden code create ediniz...
        Kural1--4 ile bolünemeyen yıllar ortık yıl değildir.
        Kural2 --4 ile bolünüp 100 ile bolünemeyen yıllar artık yıldır
        kural3 -- 4 ün katı olmasına rağmen 100 ile bölünebilen yıllardan sadece 400 ün katı olan yıllar artık yıldır
         */


        Scanner scan = new Scanner(System.in);
        System.out.println("yıl giriniz = ");
        int yıl = scan.nextInt();
        if (yıl%4==0 && yıl%100!=0 || yıl%400==0 ){
            System.out.println(yıl + " artık yıldır");
        }else System.out.println("artık yıl değildir");

    }
}
