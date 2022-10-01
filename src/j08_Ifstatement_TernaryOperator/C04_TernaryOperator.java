package j08_Ifstatement_TernaryOperator;

import java.util.Scanner;

public class C04_TernaryOperator {
    public static void main(String[] args) {
        // TASK-> girilen bir pozitif tamsayının 2 veya daha fazla basamkalı olmasını kontrol eden code create ediniz.
        Scanner scan = new Scanner(System.in);

        System.out.println("Sayı sayı giriniz");
        int sayı = scan.nextInt();
        String sonuc = sayı > 9 ? "sayı iki veya daha fazla basamaklı " : "sayı tek basamaklı";
        System.out.println("sonuc = " + sonuc);

        //fSystem.out.println(sayı > 9 ? "sayı iki veya daha fazla basamaklı " : "sayı tek basamaklı");






    }

}
