package j04_AritmeticOperators;

import java.util.Scanner;

public class Task09 {


    /*
     Çiftlikteki hayvanların ayaklarının toplam sayısını bulma.
     Çiftlikteki bulunun inek, koyun, tavukların ayark sayısını hesaplayalım.

     */

    public static void main(String[] args) {


        Scanner scan= new Scanner(System.in);
        System.out.print("İnek sayısını giriniz =");
        int inek= scan.nextInt();
        System.out.print("Tavuk sayısını giriniz =");
        int tavuk= scan.nextInt();
        System.out.print("Koyun sayısın giriniz =");
        int koyun=scan.nextInt();
        System.out.println("İneklerin toplam ayak sayısı ="+inek*4+
                "\nTuvukların toplam ayak sayısı ="+ tavuk*2+"\nk" +
                "Koyunların toplam ayak sayısı ="+koyun*4+"\nKümesteki toplam ayak sayası ="+((inek*4)+(koyun*4)+(tavuk*2)));




    }

}
