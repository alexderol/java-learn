package j08_Ifstatement_TernaryOperator.Task_Nested_If;

import java.util.Scanner;
import java.util.SortedMap;

public class Q08 {
    /*
     * TASK :

     * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
     * musteri karti olup olmadigini sorun
     * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
     * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
     * alirsa %10 indirim yapan code create ediniz.
     */
    public static void main(String[] args) {
        System.out.println("Demir Marketler Zincirine Hoşgeldiniz");
        System.out.println("");

        Scanner scan = new Scanner(System.in);
        System.out.print("Ürün Adedi= ");
        int adet = scan.nextInt();
        System.out.print("Liste Fiyatı Giriniz = ");
        int fiyat = scan.nextInt();
        System.out.print("Müşteri Kartınız varsa 'E' Yoksa 'H' tuşuna basınız ");
        char müşteri = scan.next().toUpperCase().charAt(0);

        if (müşteri == 'E' && adet > 10) {
            System.out.println("İndirimli %20 İndirimli Alışveriş Hakkı Kazandınız =" + "\n" + ((fiyat*adet)-(fiyat * adet * 0.2)) + "Tl");

        }  else if (müşteri == 'H' && adet < 10) {
            System.out.println("Müşteri Kartınız Yok ancak 10 üründen az aldığınız için sadece % 10 indirim Kazandınız =" +
                    "\n" + ((fiyat*adet)-(fiyat * adet * 0.1)) + "Tl");
        }

        else if (müşteri == 'H' && adet > 10) {
            System.out.println("Müşteri Kartınız Yok ancak 10 üründen fazla aldığınız için sadece %15 indirim Kazandınız =" +
                    "\n" + ((fiyat*adet)-(fiyat * adet * 0.15)) + "Tl");
        }

        else if (müşteri == 'H') {
            System.out.println("Müşteri Kartınız Olmadığı için sadece %15 İndirim Kazandınız = " + "\n" + ((fiyat*adet)-(fiyat * adet * 0.15)) + "Tl");
        }
        System.out.println("");
        System.out.println("\t\tBizi Tercih Ettiğiniz İçin Teşekkürler ");


    }

}
