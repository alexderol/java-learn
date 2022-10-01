package j08_Ifstatement_TernaryOperator;

import java.util.Scanner;

public class C02_ifElseStatement {
    public static void main(String[] args) {

        /*
        TASk-- girilen yasın 18 den büyüklüğünü kontrol ened code create ediniz


         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Yaşınızı giriniz= ");
        //int yas = scan.nextInt();
        //if (yas>18){
        //  System.out.println("yasınız = " + yas+" den büyük");

        int b = scan.nextInt();
        if (b < 18) {
            System.out.println("ehliyet alamazsınız");

        } else {
            System.out.println("ehliyet alabilirsiniz");

        }




    }


}



