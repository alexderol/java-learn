package j10_StringManipulations.tasks;

import java.util.Scanner;

public class Q09 {

    public static void main(String[] args) {

		/*  TASK :
				StringMethods:
				girilen  bir strngin ilk yarisini print eden code create ediniz
	    	    ORNEK:
		     	INPUT :istanbul
				OUTPUT :ista
	    */
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir kelime yazınız");
        String isim = scan.nextLine();
        String yarı = isim.substring(0, isim.length() / 2);//substring istediğimiz karakter aralığını yazdırır
        System.out.println(yarı);//yukarıda 0. karakter ile tüm karakter uzunluğu /2 yani yarısını bulduk ve yazdır dedik





    }
}
