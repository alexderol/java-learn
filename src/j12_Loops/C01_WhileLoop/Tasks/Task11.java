package j12_Loops.C01_WhileLoop.Tasks;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        /*
    task -> 0 (sıfır) girilene kadar girilen tum sayıların adedini ve toplamını print eden code create edinz.
    */
        Scanner scan = new Scanner(System.in);
        int toplam = 0;
        int adet = 0;

        for (int i = 1; i < 100000; i++) {
            System.out.println("bir sayı girin");
            int say = scan.nextInt();
            toplam += say;
            adet++;
            if (say == 0) break;

        }
        System.out.println("toplam girilen sayı adeti= " + adet + "\n\nGirilen sayılanır toplamı= " + toplam);

    }


}

