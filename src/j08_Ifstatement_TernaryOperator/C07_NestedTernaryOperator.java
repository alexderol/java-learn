package j08_Ifstatement_TernaryOperator;

import java.util.Scanner;

public class C07_NestedTernaryOperator {
    public static void main(String[] args) {
        /*
TASK :
 Girilrn bir pozitif tamsayı  4 basamaklı ise  "4 Basamaklı" print eden
 4 basamaklı degilse çift olup olmadigini kontrol edip. Çift ise "4 basamaklı olmayan çift sayı" yazdırın.
 Çift sayı degilse "4 basamaklı olmayan tek sayı yazdırın."
 */

        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayı gir");
        int sayı = scan.nextInt();

        System.out.println(sayı>999 && sayı<10000 ? "dört basamaklı" : (sayı%2==0 ? " dört basamaklı olmayan çift sayı" : "dört basamaklı olmayan tek sayı"));
            // dış şark 4 basamaklı kontrolü          eğer doğru ise       false ise
















    }


}
