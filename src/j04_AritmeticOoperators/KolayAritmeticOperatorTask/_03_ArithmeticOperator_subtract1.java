package j04_AritmeticOperators.KolayAritmeticOperatorTask;

import java.util.Scanner;

public class _03_ArithmeticOperator_subtract1 {

    public static void main(String[] args) {

    /*     /*    kullanıcıdan alınan iki tane int  (num1 , num2),
         farkını print eden code create ediniz. */

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen a sayısına bir değer giriniz = ");
        int a= scan.nextInt();
        System.out.println("lütfen b sayısına bir değer giriniz = ");
        int b= scan.nextInt();

        System.out.println("a-b= "+(a-b));
    }
}
