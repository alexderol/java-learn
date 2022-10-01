package j11_MethodCreation.tasks;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		// Saati saniyeye, mil'i kilometreye, kilogrami gram'a 
		// ceviren bir method yaziniz.
		double saat = 2;
		double mil = 3;
		double kg = 4;
		saatcevirici(saat);
		milcevirici(mil);
		gramcevirici(kg);


	}
	public static void saatcevirici (double a){
		System.out.println(a+ " saat = "+(a*3600) + " saniye ");

	}
	public static void milcevirici (double a){
		System.out.println(a+ " mil = "+(a*1.6)+ " km ");
	}
	public static void gramcevirici (double a){
		System.out.println(a+ " kg = "+ ( a*1000)+ " gram ");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
