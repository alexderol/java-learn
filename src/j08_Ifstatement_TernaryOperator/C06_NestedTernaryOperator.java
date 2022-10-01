package j08_Ifstatement_TernaryOperator;

import java.util.Scanner;

public class C06_NestedTernaryOperator {
    public static void main(String[] args) {
         /* TASK :
         Kullanicidan bir sayi aliniz
         Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
         10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
         Sayi o dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.
          */

        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayı gir");
        int sayı = scan.nextInt();
        System.out.println(sayı>=0 ? (sayı<10 ? "rakam" : "pozitif sayı"): "Negatif sayıı");
                                     //True kısmı içinde bir koşul var      false kısmı
        //Ternary de kaç ? varsa o kadar : vardır



    }

}
