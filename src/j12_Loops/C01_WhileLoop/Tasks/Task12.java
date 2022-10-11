package j12_Loops.C01_WhileLoop.Tasks;

import java.util.Scanner;

public class Task12 {

    public static void main(String[] args) {
		/*
		 task->girilen bir metinde harf rakam ve özel karakter sayısını print eden code create ediniz.
		do-While loop
		 */
        Scanner scan = new Scanner(System.in);
        int rakam = 0;
        int harf = 0;
        int karakter = 0;
        System.out.println("birşeyler yazın ");
        String girdi = scan.nextLine();
        for (int i = 0; i < girdi.length (); i++) {
            if (girdi.charAt(i) >= 'a' && girdi.charAt(i) <= 'z' || girdi.charAt(i) >= 'A' && girdi.charAt(i) <= 'Z') {
                harf++;
            } else if (girdi.charAt(i) >= '0' && girdi.charAt(i) <= '9') {
                rakam++;
            } else karakter++;


        }
        System.out.println("harf sayısı--> "+harf+" rakam sayısı--> "+rakam+" karkarter sayısı--> "+karakter);


    }

}
