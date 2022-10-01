package j04_AritmeticOperators.KolayAritmeticOperatorTask;

import java.util.Scanner;

public class _04_ArithmeticOperator_subtract2 {

    public static void main(String[] args) {

        /*
        Verilen 4 tane int (num 1, num2 , num3 , num4),
        Int'leri birbirinden çıkarın.
        Sonucu yazdırın.
        Örneğin;
        num1 = 90
        num2 = 40
        num3 = 10
        num4 = 10
        Sonuc 30 olmalı.
         */
        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen a sayısına bir değer giriniz = ");
        int a= scan.nextInt();
        System.out.println("lütfen b sayısına bir değer giriniz = ");
        int b= scan.nextInt();
        System.out.println("lütfen c sayısına bir değer giriniz = ");
        int c= scan.nextInt();
        System.out.println("lütfen d sayısına bir değer giriniz = ");
        int d= scan.nextInt();
        System.out.println("a-b-c-d= "+(a-b-c-d));


    }
}
