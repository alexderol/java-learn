package j12_Loops.C01_WhileLoop.Tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
/*
Task-> girilen sayıların toplamı 333 gectiğinde girilen sayı adedini ve toplamını prşnt eden code create ediniz.
 */
    Scanner scan = new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int say= scan.nextInt();



        int toplam= 0;

        while (say>0){
            toplam+=say;


        }
        System.out.println(toplam);



    }
}
