package j08_Ifstatement_TernaryOperator;

import java.util.Scanner;

public class C03_TernaryOperator {
    public static void main(String[] args) {
        /* Ternary ile yapilan tum islemler if-else blok ile de yapilabilir
 ternary tercih edilmesi yapinin basit okunabilir ve anlasilabilir olmasi içindir -> clean code
 Ternary icerisinde kompleks kodlar yerine dogrudan sonuç üreten veya sonucu veren
 daha basic code'lar bulunur.

 */

        // TASK01 -> girilen bir tamsayının tek-çift olmasını kontrol eden code create ediniz.
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz = ");
        int num1 = scan.nextInt();

        System.out.println("*** if - else ****");

        if (num1%2 == 0){
            System.out.println("sayı çift");
        }else System.out.println("sayı tek");






        System.out.println("*** Ternary *********");

        String sonuc = (num1%2 == 0 ? "sayı çif" : "sayı tek");// komut çıktısı String variable
        System.out.println("sonuc = " + sonuc);

        //System.out.println(num1%2 == 0 ? "sayı çif" : "sayı tek");////böyel de olur

        /* TRİCK--> Ternary operator işlem sonucunda True veya False göre bir
        çıktı verir. Eger bu çıktı type göre bir variable a atanmazsa sout ile doğrudan print edilmeli

         */
        System.out.println("****  TASK 02 ******");
        //Girilen sayının negative liğini kontrol edin

        //System.out.println(sonuc < 0 ? "sayı negative" : "sayı negative DEĞİL");


    }

}
