package j11_MethodCreation.tasks;

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		/*
		 Kullanıcıya paralelkenar, dikdörtgen ve üçgen kelimelerinden birini 
		 ve iki sayı seçmesini söyleyin. 
         Hangi şekli seçerse, o şeklin alanını ve çevresini ekrana yazdıran programı yazınız.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Hesap yapmak istediğiniz Diktörgen, Paralel kenar veya üçgen den birini seçin");
		String secim = scan.nextLine().toUpperCase();
		sekil(secim);



	}
	public static void sekil (String x){
		switch (x){
			case "PARALEL":
				Scanner scan = new Scanner(System.in);
				System.out.println("Paralel kenar için önce yükseklik giriniz");
				int h = scan.nextInt();
				System.out.println("Paralel kenar için önce taban uzunluğu giriniz");
				int t = scan.nextInt();
				System.out.println("Paralel kenar için önce kenar uzunluğu giriniz");
				int k = scan.nextInt();
				System.out.println("paralel Kenar alanı = "+(h*t));
				System.out.println("parlel kenarın çevris = "+(t+k)*2);
				break;
			case"DİKDÖRTGEN":
				Scanner scan1 = new Scanner(System.in);

				System.out.println("Dikdörtgen için sırayla kenar uzunluğunu giriniz");
				int k1 = scan1.nextInt(); int k2 = scan1.nextInt();
				System.out.println("Dikdörtgen alanı = "+(k1*k2));
				System.out.println("Dikdörtgen kenarın çevris = "+((k1+k2)*2));
				break;
			case"ÜÇGEN":
				Scanner scan2 = new Scanner(System.in);
				System.out.println("Üçgenin yüksekliğini ve kenar uzunluklarını sırayla giriniz");
				int h2= scan2.nextInt();
				int k3 = scan2.nextInt();
				int k4 = scan2.nextInt();
				int k5 = scan2.nextInt();
				System.out.println("Üçgenin alanı = "+(h2*k3)/2);
				System.out.println("parlel kenarın çevris = "+(k3+k4+k5));
				break;
			default:
				System.out.println("dikkatli olun yanlışlık var");
		}

	}

}
