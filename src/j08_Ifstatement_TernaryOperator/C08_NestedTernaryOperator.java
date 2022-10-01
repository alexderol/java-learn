package j08_Ifstatement_TernaryOperator;

import java.util.Scanner;

public class C08_NestedTernaryOperator {
    public static void main(String[] args) {
        /*
 Kullanıcıdan alacağı ürün miktarını ve ürünün birim fiyatını alın.
  Eğer urun miktarı 100 den fazla ise %33  indirim yapıp  ödemesi gereken toplam miktarı
   print eden code create ediniz.
 */

        Scanner scan = new Scanner(System.in);
        System.out.print("Ürün Miktari = ");
        int miktar = scan.nextInt();
        System.out.print("Ürün fiyatı = ");
        int fiyat = scan.nextInt();
                                //       TRUE                 FALSE
        double fatura = miktar>100 ? (miktar*fiyat*0.67):(miktar*fiyat);// double atamadan sout ile de yazdırabilirdim
        System.out.println("fatura = " + fatura);


    }


}
