package j16_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task12_Manav {

    static Scanner scan = new Scanner(System.in);
    static int fiyatToplam = 0;

    static double domates = 0;
    static double salatalık = 0;
    static double muz = 0;
    static double elma = 0;
    static double portakal = 0;


    public static void main(String[] args) {
        /* TASK :
         * Basit bir 5 ürünlü manav alisveris programi yaziniz.
         *
         * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
         * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
         * 			 istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
         * 			 Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
         * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
         * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.
         *
         * */
        System.out.println(" BEŞYOL MANAVA HOŞGELDİNİZ\n\nBizden yapacağınız her alışverişinizde yeşillikler bizden\nMaksat yeşillik olsun :)\n\n");
        urunSecimi();
        baskaIstek();



    }

    private static void baskaIstek() {
        System.out.println("Başka ürün istiyormusunuz\nEvet için -->1\nHayır için -->2");
        int devamMı= scan.nextInt();
        if(devamMı==1){
            urunSecimi();
            baskaIstek();
        }else System.out.println(" Toplam tutar = "+fiyatToplam+" TL \n\nBİZİ TERCİH ETTİĞİNİZ İÇİN TEŞEKKÜR EDERİZ");
    }


    private static void urunSecimi() {

        double ürün=1;
        while ( ürün>0) {
            System.out.println("Almak istediğiniz ürünü seçiniz\nDomates için --> 1\n" +
                    "Salatalık için -->2\nElma için -->3\nMuz için -->4\nPortakal için -->5\n Alışverişi tamamlamak için -->0");
            ürün = scan.nextDouble();

            switch ((int) ürün) {
                case 1:
                    System.out.println("Kaç kilo domates almak istersiniz yazınız");
                    double miktar = scan.nextDouble();
                    domates = 20 * miktar;
                    fiyatToplam += domates;

                    System.out.println(miktar+" kg domates sepete eklendi\n");

                    break;
                case 2:
                    System.out.println("Kaç kilo Salatalık almak istersiniz yazınız");
                    double gram = scan.nextDouble();
                    salatalık = 15 * gram;
                    fiyatToplam += salatalık;
                    break;
                case 3:
                    System.out.println("Kaç kilo Elma almak istersiniz yazınız");
                    double nekadar = scan.nextDouble();
                    elma = 15 * nekadar;
                    fiyatToplam += elma;
                    break;
                case 4:
                    System.out.println("Kaç kilo Muz almak istersiniz yazınız");
                    double ne = scan.nextDouble();
                    muz = 35 * ne;
                    fiyatToplam += muz;
                    break;
                case 5:
                    System.out.println("Kaç kilo Portakal almak istersiniz yazınız");
                    double yeteri = scan.nextDouble();
                    portakal = 225 * yeteri;
                    fiyatToplam += portakal;
                    break;

            }
        }

    }


}






