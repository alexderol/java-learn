package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        /* TASK->
		 Ask user to enter mid-term tasks.grade, final tasks.grade, and project tasks.grade
		 Calculate the general tasks.grade (mid-term : 30% , project : 20%, final : 50%)

		  Example:
		      INPUT: mid-term tasks.grade=78
		      		 final tasks.grade = 66
		      		 project tasks.grade = 90
		      OUTPUT: "Your tasks.grade is : 81,6"


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
