package j12_Loops.C01_WhileLoop.Tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
/*
Task-> girilen sayıların toplamı 333 gectiğinde girilen sayı adedini ve toplamını prşnt eden code create ediniz.
 */
    Scanner scan = new Scanner(System.in);




        int toplam= 0;
        int sayAdet=0;

        while (true){
            System.out.println("bir sayı giriniz");
            int say= scan.nextInt();
            sayAdet++;
            toplam+=say;
            if(toplam>333)
                break;




        }
        System.out.println("şimdiye kadar girilen sayı toplamı= "+toplam+"\nGirilen sayı adeti="+sayAdet);



    }
}
