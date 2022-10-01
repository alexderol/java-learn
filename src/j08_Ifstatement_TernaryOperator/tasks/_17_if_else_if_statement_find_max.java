package j08_Ifstatement_TernaryOperator.tasks;

import java.util.Scanner;

public class _17_if_else_if_statement_find_max {

    public static void main(String[] args) {

      /* Oluşturulan bu 3 int içinde en yüksek değerli olanı bulun.
         Bu en yüksek numarayı yazdırın.

         Not: Num1 = 18 veya Num2 = 25 değerini değiştirdiğinizde kodunuz maksimum değeri yazmalıdır.
         Tüm farklı senaryolarda maksimum sayıyı yazdırmalıdır  */

        Scanner scan = new Scanner(System.in);
        System.out.println("3 adet sayı giriniz ");
        int i1 = scan.nextInt();//5
        int i2 = scan.nextInt();//6
        int i3 = scan.nextInt();//7
        //Kodu aşağıya yazınız. BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ.
        if (i1 > i2 && i1 > i3) {
            System.out.println("i1 en büyük" + i1);


        } else if (i2 > i3 && i2 > i1) {
            System.out.println("i2 en büyük " + i2);
        } else if (i3 > i1 && i3 > i2) {
            System.out.println("i3 en büyük" + i3);
        }
    }}