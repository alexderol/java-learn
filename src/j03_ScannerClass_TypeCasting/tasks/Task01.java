package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        /* TASK->
		 Ask user to enter mid-term grade, final grade, and project grade
		 Calculate the general grade (mid-term : 30% , project : 20%, final : 50%)

		  Example:
		      INPUT: mid-term grade=78
		      		 final grade = 66
		      		 project grade = 90
		      OUTPUT: "Your grade is : 81,6"


 */
        Scanner scan= new Scanner(System.in);
        System.out.println("vize notu giriniz= ");
        int v= scan.nextInt();
        System.out.println("final notunu giriniz =");
        int f= scan.nextInt();
        System.out.println("proje notunu giriniz 0");
        int p= scan.nextInt();
        System.out.println("Ders notu ortalamanız= "+((v*30/100)+(f*50/100)+(p*20/100)));





    }
}
