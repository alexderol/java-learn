package j12_Loops.C01_WhileLoop.Tasks;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		/*

        task-> girilen  tamsayı için carpim tablosunu print eden code create ediniz.

		 Ornek input = 13
		 13x1=13 13x2=26  . . .. .  . 13x10=130
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("bir sayı girin");
		int sayı1= scan.nextInt();

		for (int i = 1; i <= sayı1; i++) {
			for (int j = 1; j <= sayı1 ; j++) {
				System.out.println(i+" * "+j+" = "+(i*j));
			}
			System.out.println();
		}


				

	}

}
