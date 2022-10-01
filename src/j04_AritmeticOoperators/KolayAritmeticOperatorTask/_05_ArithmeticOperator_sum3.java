package j04_AritmeticOperators.KolayAritmeticOperatorTask;

import java.util.Scanner;

public class _05_ArithmeticOperator_sum3 {

    public static void main(String[] args) {

          /*    kullanıcıdan alınan 3 tane int
         toplamını print eden code create ediniz. */

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen a sayısına bir değer giriniz = ");
        int a= scan.nextInt();
        System.out.println("lütfen b sayısına bir değer giriniz = ");
        int b= scan.nextInt();
        System.out.println("lütfen c sayısına bir değer giriniz = ");
        int c= scan.nextInt();

        System.out.println("a+b+c= "+(a+b+c));
    }
}
