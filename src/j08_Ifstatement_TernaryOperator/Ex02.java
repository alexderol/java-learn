package j08_Ifstatement_TernaryOperator;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        /*
 Kullanicidan 100 uzerinden notunu isteyin.
 Not'u harf sistemine cevirip yazdirin.
 50’den kucukse "D",
 =50  <60 arasi "C",
 =60  <80 arasi "B",
 =80’nin uzerinde ise "A"
 */

        Scanner scan = new Scanner(System.in);
        System.out.print(" Notunuzu giriniz = ");
        int not = scan.nextInt();
        // recomended
        //f if (not < 0 || not > 100) {
        //f     System.out.println("0 ile 100 arası bir not gir =");
//f
        //f } else if (not < 50) {
        //f     System.out.println("Notunuz \'D\'");
        //f } else if (not < 60) {
        //f     System.out.println("Notunuz \'C\'");
        //f } else if (not < 80) {
        //f     System.out.println("Notunuz \'B\'");
        //f } else
        //f     System.out.println("Notunuz \'A\' ");


       /* System.out.println("puan giriniz");
        int puan = scan.nextInt();


        if (puan <= 100 && not>= 0) {
            char harf = not >= 80 ? 'A' : (not >= 60 ? 'B' : (not >= 50 ? 'C' : 'D'));
            System.out.println("Notunuz : " + harf);
        } else System.out.println("yanlış not girdiniz, yeniden deneyiniz. ");
        */

        if (not < 0 ) {
            System.out.println("negatif not olmaz =");

        } else if (not < 50) {
            System.out.println("Notunuz \'D\'");
        } else if (not >= 50 && not<=59) {
            System.out.println("Notunuz \'C\'");
        } else if (not >= 60 && not <= 79) {
            System.out.println("Notunuz \'B\'");
        } else if (not >=80 && not >=100 )
            System.out.println("Notunuz \'A\' ");
        else System.out.println("dikkat");

        ///!!!!interview de çok sorulur****!!!!!





    }





}


