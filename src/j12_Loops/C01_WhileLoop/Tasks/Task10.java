package j12_Loops.C01_WhileLoop.Tasks;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        // task ->  Girilen bir sayıya kadar  tek olanlarını print eden code create ediniz.
        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayı girin");
        int say = scan.nextInt();
        for (int i = 1; i < say; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " --> ");
            }


        }


    }
}
