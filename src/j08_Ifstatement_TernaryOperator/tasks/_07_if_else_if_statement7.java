package j08_Ifstatement_TernaryOperator.tasks;

import java.util.Scanner;

public class _07_if_else_if_statement7 {

    public static void main(String[] args) {

 /*  int number 8. satırda.
     Eğer, int number ikiye bölündüğünde geri kalanı 0'a eşit ise "number is a EVEN number" yazdırın.
     Eğer, int number ikiye bölündüğünde geri kalanı 0'a eşit değil ise "number is a ODD number" yazdırın.
*/
        Scanner scan = new Scanner(System.in);
        System.out.print("bir sayı giriniz ");
        int number = scan.nextInt();
        if (number%2==0) {
            System.out.println("number is a EVEN number");
        }
        if (number%2!=0){
            System.out.println("number is a ODD number");
        }






    }
}
