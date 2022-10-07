package j12_Loops.C01_DoWhileLoop;

import java.util.Scanner;

public class C02_DoWhileLoop {
    public static void main(String[] args) {
// Task--> girilen sayı 17 den küçkü ise KAZANDINIZ 17 den küçük ise KAYBETTİNİZ print eden do while code create edin
        Scanner scan = new Scanner(System.in);
        System.out.println("bir  sayı girin");
        int sayi= scan.nextInt();

        do {

            System.out.println("KAZANDINIZ");
            sayi++;
        }while (sayi<17) ;
            System.out.println(sayi +" için KAYBETTİNİZ");





    }
}
