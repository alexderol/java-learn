package j04_AritmeticOperators.KolayAritmeticOperatorTask;

import java.util.Scanner;

public class _06_ArithmeticOperator_division1 {

    public static void main(String[] args) {

        /*    /*    kullanıcıdan alınan iki tane int  (num1 , num2),
         bölümünü print eden code create ediniz. */

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen bölünmesini istediğiniz sayı giriniz = ");
        int num1= scan.nextInt();
        System.out.println("lütfen bölmek istediğiniz sayı giriniz = ");
        int num2= scan.nextInt();
        System.out.println("num1/num2= "+(num1/num2));
    }
}
