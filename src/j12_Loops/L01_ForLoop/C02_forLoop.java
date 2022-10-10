package j12_Loops.L01_ForLoop;

import java.util.Scanner;

public class C02_forLoop {
    public static void main(String[] args) {
        //Girilen sayıdan 100 e kadar 4 ün katı olan pazitif tam sayıları print eden code create edin
        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayı gir");
        int sayi = scan.nextInt();
        if (sayi > 100) {
            System.out.println("sayı yanlış girildi 100 den küçük olmalı");
        } else {
            for (int i = sayi; i < 100; i++) {//100 for u çalıştırmaz 98 ise for içindeki if çalışmaz
                if (i % 4 == 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
