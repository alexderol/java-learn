package j08_Ifstatement_TernaryOperator;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        /*Task-->
        girilen bir karakterin harf olup olmadığını kontral eden code create ediniz
        * */

        Scanner scan = new Scanner(System.in);
        System.out.print("bir karakter giriniz");
        char girdi = scan.next().charAt(0);//yazdığında ilk karakteri alır
        if (((girdi>='A' && girdi<='Z')) ||( (girdi>='a' && girdi<='z')))//burada ascii de bakar bulur
        {System.out.println("Girilen karakter harftir ;) "); }
        else System.out.println("Girilen karakter harf değildir :(");














    }
}
