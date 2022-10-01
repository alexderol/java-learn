package j10_StringManipulations.tasks;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        /* Task->
Girilen ad soyad bilgilerinin ilk harflerini buyuk harf print eden code create ediniz..
 */
        Scanner scan = new Scanner(System.in);
        System.out.println(" ad girin");
        String ad = scan.nextLine();
        System.out.println("soyad gir");
        String soyAd = scan.nextLine();
        System.out.println(ad.toUpperCase().charAt(0) + ad.substring(1) + " " + soyAd.toUpperCase().charAt(0) + soyAd.substring(1));
       //// ad.substring(0,1).toUpperCase()+ad.substring(1)+" "+ soyAd.substring(0,1).toUpperCase()+soyAd.substring(1);
    }
}
