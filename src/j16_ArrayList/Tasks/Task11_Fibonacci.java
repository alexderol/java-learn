package j16_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task11_Fibonacci {
     /*
     Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
     1-1-2-3-5-8-13-21-34....
     */

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("bir sayı giriniz");
        int sayı = scan.nextInt();

        List<Integer> fibosay = new ArrayList<>();

        int x = 0, y = 1, toplam = 1;

        if (sayı > 0) {
            while (toplam < sayı) {

                fibosay.add(toplam);
                toplam = x + y;
                x = y;
                y = toplam;

            }
            System.out.println("girilen sayıya kadar olan fibonacci sayıları: " + fibosay);

        } else System.out.println("girilen sayı sıfırdan büyük olmalı.");


    }


}
