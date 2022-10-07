package j12_Loops.C01_WhileLoop;

import java.util.Scanner;

public class C02_WhileLoop {
    public static void main(String[] args) {
        //task--girilen tam sayının karamları toplamını print eden method create edin
        Scanner scan = new Scanner(System.in);
        System.out.println("bir tam sayı girin");
        int num = scan.nextInt();
        System.out.println(rakamTopla(num));


    }

    private static int rakamTopla(int num) {
        int rakamtoplamı = 0;
        while (num > 0) {//sayı 1 olana dek body action run
            rakamtoplamı += num % 10;//sayının birler basamağı rakmToplamına eklenecek
            num /= 10;//1 basamak eksiltildi


        }

        return rakamtoplamı;
    }
}