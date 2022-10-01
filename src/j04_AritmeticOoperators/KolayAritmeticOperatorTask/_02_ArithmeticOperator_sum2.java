package j04_AritmeticOperators.KolayAritmeticOperatorTask;

import java.util.Scanner;

public class _02_ArithmeticOperator_sum2 {

    public static void main(String[] args) {

     /*     /*    kullanıcıdan alınan 4 tane int
         toplamını print eden code create ediniz. */

       Scanner scan= new Scanner(System.in);
        System.out.println("lütfen a sayısına bir değer giriniz = ");
        int a= scan.nextInt();
        System.out.println("lütfen b sayısına bir değer giriniz = ");
        int b= scan.nextInt();
        System.out.println("lütfen c sayısına bir değer giriniz = ");
        int c= scan.nextInt();
        System.out.println("lütfen d sayısına bir değer giriniz = ");
        int d= scan.nextInt();
        System.out.println("a+b+c+d= "+(a+b+c+d));



    }
}
