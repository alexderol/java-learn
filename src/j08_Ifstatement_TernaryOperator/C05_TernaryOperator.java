package j08_Ifstatement_TernaryOperator;

import java.util.Scanner;

public class C05_TernaryOperator {
    public static void main(String[] args) {
        // TASK-> girilen bir tamsayı çiftse yarısını değilse
        // "girilen sayı tek oldugu için yarısı tamsayı değildir" print eden code create ediniz
        Scanner scan = new Scanner(System.in);

        System.out.println("Bir sayı giriniz");
        int sayı = scan.nextInt();
       // String sonuc = sayı%2==0 ? sayı/2 : "Girilen sayı tek sayı değildir";// bir string içinde int olmaz o yüzden
        // Trick -- Ternary iki durum (t/f) için farklı data type çıktısı veriyorsa variable atama yapmadan sout yapılmalı
        // yada ternary çıktısı aynı data type cast edilmeli...
        System.out.println(sayı % 2 == 0 ? sayı / 2 : "Girilen sayı tek sayı olduğu için yarısı tam sayı değildir");


        // yukarıdaki trick te anlattığı gibi ya saliloin yap yada sout için çak



    }

}
