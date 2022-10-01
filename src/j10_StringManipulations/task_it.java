package j10_StringManipulations;

import java.util.Scanner;

public class task_it {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String ed = "sözlerimi geri alamam";
        String he = "yazdığımı yeniden yazamam";
        String ce = "Bir daha geri dönemem";

        System.out.println(ed.substring(0, 6));
        System.out.println(ed.length());
        System.out.println(ed.endsWith("mam"));
        System.out.println(ed.contains("i"));
        System.out.println(ed.charAt(20));
        System.out.println(ed.concat(",").concat(he).concat(",").concat(ce));
        ed = ed.concat(",").concat(he).concat(",").concat(ce).concat("....");
        System.out.println(ed);
        System.out.println(ed.contains("Bir daha geri dönemem"));

        System.out.println("bir yıl giriniz");
        int artık = scan.nextInt();

        if (artık % 4 == 0 || artık % 400 == 0 && artık % 100 != 0) {
            System.out.println("Girilen " + artık + " yılı artık yıldır");

        } else {
            System.out.println("Girilen " + artık + " yılı artık yıl değildir");

        }

        System.out.println("Aldığınız notu giriniz");
        int not = scan.nextInt();
        if (not < 50) {
            System.out.println("Kaldınız '0' aldınız");
        } else if (not < 60) {
            System.out.println("geçer not '1' aldınız");
        } else if (not < 70) {
            System.out.println("geçer not '2' aldınız");
        } else if (not < 80) {
            System.out.println("geçer not '3' aldınız");
        } else if (not < 90) {
            System.out.println("geçer not '4' aldınız");
        } else if (not < 100) {
            System.out.println("geçer not '5' aldınız");
        } else System.out.println("hatalı giriş");

        System.out.println("birinci sayıyı yazın");
        int sayı1 = scan.nextInt();
        System.out.println("ikinci sayıyı yazın");
        int sayı2 = scan.nextInt();
        System.out.println("üçüncü sayıyı yazın");
        int sayı3 = scan.nextInt();
        System.out.println(sayı1>sayı2 && sayı1>sayı3 ? sayı1 + " büyüktür " +sayı2+ " ve"+ sayı3 :
              sayı2>sayı1 && sayı2>sayı3 ? sayı2 +
        " büyüktür "+ sayı1+ sayı3 :
        sayı3>sayı1 && sayı3>sayı2 ? sayı3 + " büyüktür "+ sayı2 + "ve " + sayı1:
        " biryerlerde terslik olabilir");








    }
}






















