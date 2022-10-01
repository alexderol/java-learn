package j08_Ifstatement_TernaryOperator;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        /*Task--> girilen iki sayıyı seçilen dört işlemden birine uygulayıp  sonucu
        print eden code create ediniz
        * */

        Scanner scan = new Scanner(System.in);
        System.out.print("birinci sayıyı giriniz");
        double sayi1 = scan.nextDouble();
        System.out.print("ikinci sayıyı giriniz");
        double sayi2 = scan.nextDouble();
        System.out.println("+ için 1 ,\n  - için 2, \n / için 3,\n * için 4 \n ü seçiniz ");
        int secim = scan.nextInt();
        //char secim= scan.next().charAt(0)// bunu kullanırsak aşağıda 1 yerine +-*/ filan yaz

        if (secim == 1) {
            System.out.println("Toplama sonucu = " + sayi1 + "+" + sayi2 + "=" + (sayi1 + sayi2));

        } else if (secim == 2) {
            System.out.println("Çıkarma sonucu = " + sayi1 + "-" + sayi2 +"="+ (sayi1 - sayi2));

        } else if (secim == 3) {
            System.out.println("Bölme sonucu = " + sayi1 + "/" + sayi2 +"=" + (sayi1 / sayi2));

        } else if (secim == 4) {
            System.out.println("Çarpma sonucu = " + sayi1 + "*" + sayi2 +"=" + (sayi1 * sayi2));

        } else System.out.println("yanlış giriş bu girdiyle işlem yapmam tekrar dikkatli giriniz");


    }
}
