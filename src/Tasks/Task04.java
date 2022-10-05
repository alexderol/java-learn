package Tasks;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        /*
        girilen iki sayı arasındaki çift sayıları print eden method creat edin
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("sayı girin");
        int sayı1 = scan.nextInt();
        System.out.println("tekrar sayı girin");
        int sayı2 = scan.nextInt();


        if (sayı1 < sayı2) {
            for (int i = sayı1; i <= sayı2; i++) {
                if (i % 2 == 0)
                    System.out.println("çift sayılar= " + i);

            }
        } else if (sayı2 < sayı1) {
            for (int i = sayı2; i <= sayı1; i++) {
                if (i % 2 == 0)
                    System.out.println("çift sayılar= " + i);

            }


        }
    }
}
