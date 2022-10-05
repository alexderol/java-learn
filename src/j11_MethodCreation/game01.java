package j11_MethodCreation;

import java.util.Scanner;

public class game01 {
    /* Iki kisinin oynayacagi bir kelime oyunu uretelim
     * Kurallar
     * 1- Baslangicta 1.oyuncudan bir kelime girmesini isteyin ve kelimeyi yazdirin
     *
     * 2- 1.oyuncu kelimeyi girince 2.oyuncuya kelimeyi kabul edip etmedigini sorun.
     *      * Eger kelimeyi kabul ederse onceki oyuncuya kelimedeki harf sayisi kadar puan ekleyin
     *        ve 3.adima gecin
     *      * girilen kelimeyi kabul etmezse "gecersiz kelime" yazdirin ve onceki oyuncunun
     *        kazandigini yazip oyunu bitirin
     *
     * 3- yeni oyuncuya oyuna devam etmek isteyip istemedigini sorun
     *      * devam etmek isterse kelimeye eklemek istedigi string'i ve
     *          basa mi sona mi ekleyecegini sorun
     *          aldiginiz string'i kelimeye ekleyip 2.adima gidin
     *
     *      *   Devam etmek istemezse
     *          "Oyun bitti" yazin
     *          kullanicilarin puanlarini ve kazanan oyuncuyu yazdirin
     */
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("1. Oyuncu kelime girniz= ");
        String oyuncu1 = scan.next();
        System.out.println("2. oyunucu kelimeyi; \n Kabul ediyorum 1\nKabul etmiyorum 2");
        int kabul= scan.nextInt();
        if (kabul==1){
            System.out.println("1. oyuncunun puanı= "+oyuncu1.length());
        }else if(kabul==2){

        }


    }



}
