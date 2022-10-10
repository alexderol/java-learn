package j12_Loops.C01_WhileLoop.Tasks;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        // task-> girilen  5 sayının  en büyüğünü print den code create eediniz
        Scanner scan = new Scanner(System.in);
        int buyuk=0;


        System.out.println("bir sayı girin");
        int say1 = scan.nextInt();
        buyuk = say1;
        for (int i = 0; i < 4; i++) {
            System.out.println("sayı gir");
            int j = scan.nextInt();
            if (j > buyuk) {
                buyuk=j;
            }
        } System.out.println("en buyuk sayı---> "+buyuk);


    }
}
