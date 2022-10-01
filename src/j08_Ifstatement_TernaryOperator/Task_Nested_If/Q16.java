package j08_Ifstatement_TernaryOperator.Task_Nested_If;

import java.util.Scanner;

public class Q16 {
/* TASK :
    Kullanicidan 3 Numara isteyiniz ve bu numaralarin en buyuk ve 
    en kucuk olanlarini konsola yazdiriniz
    int num1 
    int num2 
    int num3
*/


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz");
        int num1 = scan.nextInt();
        System.out.println("İkinci sayıyı giriniz");
        int num2 = scan.nextInt();
        System.out.println("Üçüncü sayıyı giriniz");
        int num3 = scan.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " büyüktür" + num2 + " ve " + num3);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " büyüktür" + num1 + " ve " + num3);
        } else if (num3 > num1 && num3 > num2) {
            System.out.println(num3 + " büyüktür" + num1 + " ve " + num2);


        }
        if (num1 < num2 && num1 < num3) {
            System.out.println(num1 + " küçüktür " + num2 + " ve " + num3);
        } else if (num2 < num1 && num2 < num3) {
            System.out.println(num2 + " küçüktür " + num1 + " ve " + num3);
        } else if (num3 < num1 && num3 < num2) {
            System.out.println(num3 + " küçüktür" + num1 + " ve " + num2);


        }


    }


}





