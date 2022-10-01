package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        /*
         * TASK->
         *
         * Kullaniciya gunde kac saat uyudugunu sorun,
         * ayda yilda ve 40 yilda kac gununun uykuda gectigini yazdirin
         *
         * Ornek : Input : 8
         *         Output : Ayda 10, yilda 121, 40 yilda 4866 gununuz uykuda geciyor
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Günlük uyku saatinizi giriniz =");
        int g = scan.nextInt();

        System.out.println("Aylık uykuda geçirdiğiniz süre= " + (g * 30/24) + " gün ");
        System.out.println("40 yılda uykuda geçirdiğini9z süre= " + (g * 30 * 12/24) + " gün ");
        System.out.println("40 yılda uykuda geçirdiğini9z süre= " + (g * 30 * 12 * 40/24) + " gün ");
    }
}
