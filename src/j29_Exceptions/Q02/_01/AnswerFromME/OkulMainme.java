package j29_Exceptions.Q02._01.AnswerFromME;

import java.util.Scanner;

public class OkulMainme {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Okulme okul = new Okulme();
        System.out.println("Okul adı girin");
        okul.setOkulAd(scan.nextLine());
        System.out.println("maxOgrSayisi giriniz");
        okul.setMaxOgrSayisi(scan.nextInt());
        Ogrencime ogrenci = new Ogrencime();

        for (int i = 0; i < okul.getMaxOgrSayisi(); i++) {
            System.out.println(i + 1 + ".Ogrenci adı");
            scan.nextLine();//
            ogrenci.setAd(scan.nextLine());
            System.out.println(i + 1 + ". Ogrenci soyad");
            ogrenci.setSoyad(scan.nextLine());
            System.out.println(i + 1 + ".Ogrenci yası?");
            ogrenci.setYas(scan.nextInt());
            while (true) {
                try {
                    if (ogrenci.getYas() < 8 || ogrenci.getYas() > 15) {
                        throw new IllegalArgumentException("yaş 8-15 arası olmalı");

                    } else System.out.println("Ogrenci kaydı başarılı");
                    break;

                } catch (IllegalArgumentException e) {
                    System.out.println("Ogrenci yasi 8 ile 15 arasında olmalıdır. Tekrar giriniz.");
                    break;
                }
            }


        }


    }

}
