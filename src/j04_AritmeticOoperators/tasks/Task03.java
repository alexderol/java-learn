package j04_AritmeticOoperators.tasks;

import java.util.Scanner;

public class Task03 {
	
	public static void main(String[] args) {
		
		/* Soru 10:
		 * Kullanicinin girdigi 3 basamakli sayinin ilk ve son rakamlarinin toplamini veren programi yaziniz.
		 */
		Scanner scan=new Scanner(System.in);
		System.out.print("üç basamaklı bir sayı giriniz= ");
		int sayi= scan.nextInt();
		int birler=sayi%10;
		sayi/=10;//sayının 10 a bölümü bölümü verir
		int onlar= sayi%10;
		int yüzler= sayi/10;
		System.out.println("sayının rakamları toplamı= "+(birler+onlar+yüzler));



		
	}

}
