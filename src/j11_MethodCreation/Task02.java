package j11_MethodCreation;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        //TASK->girilen ad soyadın ilk harfleri büyük diğerlerini küçük yopan method create et
        Scanner scan = new Scanner(System.in);
        System.out.println("Ad gir");
        String ad = scan.nextLine();
        System.out.println("Soyad gir");
        String soyad = scan.nextLine();

        System.out.println(ilkharfmethodu(ad, soyad));


    }

    public static String ilkharfmethodu(String s1, String s2) {
        return s1.toUpperCase().charAt(0)+s1.substring(1)+" "+s2.toUpperCase().charAt(0)+s2.substring(1);
    }
}/* private static void isimSoyisimHarfKontrol(String ad, String soyad) {

        ad=ad.substring(0,1).toUpperCase()+ad.substring(1).toLowerCase();
        soyad=soyad.substring(0,1).toUpperCase()+soyad.substring(1).toLowerCase();
        System.out.println("ad  soyad = " + ad + " " + soyad);
        }*/

