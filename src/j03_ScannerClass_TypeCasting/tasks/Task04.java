package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        /* TASK ->
        Clarusway spor salonu için kullanıcıdan isim soyisim, yaş, kilo, boy, salona devam edeceği ay süresini
        bilgilerini alıp aylık $20 olarak toplam ücretini hesplayıp print eden code create ediniz.
         */
        Scanner scan= new Scanner(System.in);
        System.out.println("İsim Soyisim= ");
        String AdSoyad= scan.nextLine();
        System.out.println("Yasınızı giriniz =");
        String yas= scan.nextLine();
        System.out.println("kilonuz =");
        String kilo= scan.nextLine();
        System.out.println("boyunuz =");
        String boy= scan.nextLine();
        System.out.println("kaç ay devam edilecek= ");
        int süre= scan.nextInt();
        System.out.println("Toplam ödenecek tutar ="+(süre*20*30));








    }
}
