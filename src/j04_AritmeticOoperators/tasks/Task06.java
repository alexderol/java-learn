package j04_AritmeticOperators.tasks;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {

        /*
         * Kullanicidan uc basamakli bir sayi alin
         * ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin
         *
         *
         * Ornek : Inputs : 853
         * Output : Girdiginiz sayinin birler basamagi : 3
         *          Girdiginiz sayinin onlar basamagi : 5
         *          Girdiginiz sayinin yuzler basamagi : 8
         *
         *
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("3 basamaklı sayı giriniz");
        int sayi= scan.nextInt();
		int birler=sayi%10;
		sayi/=10;//sayının 10 a bölümü bölümü verir
		int onlar= sayi%10;
		int yüzler= sayi/10;
		System.out.println("Birler basamağı = "+ birler+ "\n Onlar basamağı ="+ onlar+
                "\nyüzler basamağı = "+ yüzler);











    }
}
