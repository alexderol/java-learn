package j04_AritmeticOoperators.tasks;

import java.util.Scanner;

public class Task08 {
    /*
     * Saniyeyi saat, dk ve saniyeye çeviren bir program yazınız.
     * 		Örnek : 4250 - > 1 saat 10 dakika 50 saniye
     * 1 saat = 3600 saniye
     * 1 dk   = 60 saniye
     *
     */

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("saniye giriniz=");
        int zaman= scan.nextInt();
        int saat= zaman/3600;
        int dakika= zaman/60;
        int saniye=zaman%60;
        System.out.println(saat+" saat "+ dakika +" dakika" + saniye+" saniye");




    }
}
