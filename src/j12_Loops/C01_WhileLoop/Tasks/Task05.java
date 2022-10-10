package j12_Loops.C01_WhileLoop.Tasks;

import java.util.Scanner;

public class Task05 {

    public static void main(String[] args) {
		/*
		task-> girilen  isim ve soyismi için ilk isminin ilk harfinden soy isminin son harfine kadar olan butun harfleri
		 ayni satirda aralarina bosluk birakarak print rden code create ediniz

		 */

        Scanner scan = new Scanner(System.in);
        System.out.println("isim giriniz");
        String name = scan.nextLine();
        System.out.println("Soyisim giriniz");
        String SoyName = scan.nextLine();


        for (int i = 0; i < (name.concat(SoyName)).length(); i++) {
            System.out.print((name.concat(SoyName)).charAt(i) + " ");

        }


    }

}





