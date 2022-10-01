package j08_Ifstatement_TernaryOperator;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        /*Task--> Kullanicidan bir sayi alin

    Eger sayi pozitif ise; 10dan buyuk olup olmadigini kontrol edin
    Eger 10 dan buyuk ise "Buyuksun!" yazdirin
    Eger 10 dan kucuk ise "Normalsin!" yazdirin

    Eger sayi pozitif degil ise; -10dan buyuk olup olmadigini kontrol edin
    Eger -10 dan buyuk ise "Negatifsin!" yazdirin
    Eger -10 dan kucuk ise "Cok Negatifsin!" yazdirin
        * */

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz =");
        int sayı = scan.nextInt();
        if (sayı > 0) {
            if (sayı > 10) {
                System.out.println("Büyüksün....");

            } else if (sayı < 10) {
                System.out.println("Normalsin.....");
            }
        }
        if (sayı < 0) {
            if (sayı < -10) {System.out.println("Negatifsin....");
        } else if (sayı > -10) {
            System.out.println("çok negatifsin şekerim");
        }
    }
}}
