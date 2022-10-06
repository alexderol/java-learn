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
    static int oyuncu1puan=0;
    static int oyuncu2puan=0;
    static String birsonkelime="";
    static String ikisonkelime="";


   static Scanner scan = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println("***KELİME OYUNUNA HOŞGELDİNİZ***\n\n");

        oyuncu1Tur();
        oyuncu2Tur();
        tamamMıDevamMı();

    }

    private static void tamamMıDevamMı() {
        System.out.println("oyuna devam edilsin mi?");
    }///en son burada kaldımmmmmmmmmmmmmmm


    private static void oyuncu1Tur() {

        oyuncubir();


        System.out.println("oyuncu2 --->'"+birsonkelime+ "' kelimesini kabul ediyorsa 1 e etmiyorsa 2 ye bassın");
        int onay= scan.nextInt();
        if (onay==1){
            System.out.println("oyuncu1 "+ oyuncu1puan + " puan kazandı");
            System.out.println("Sıra oyuncu2 ye geçti...");
            oyuncu2Tur();
        }else if(onay==2){
            System.out.println("oyuncu2 kelimeyi kabul etmedi");
           oyuncu1Tur();
        }


    }

    private static void oyuncubir() {
        System.out.print("oyuncu1  kelimesini girsin = ");
        String giren1= scan.nextLine();
        oyuncu1puan+=giren1.length();
        birsonkelime=giren1;
    }
    private static void oyuncuiki(){
        System.out.print("oyuncu2  kelimesini girsin = ");
        String giren2= scan.next();
        oyuncu2puan+=giren2.length();
        ikisonkelime=giren2;
        birkabulEdiyormu();
    }

    private static void birkabulEdiyormu() {
        System.out.println("oyuncu1 ---> girilen '"+ikisonkelime+"' kelimesini onaylıyormusun Evet için -1- Hayır için -2-");
        int onay2= scan.nextInt();
        if(onay2==1){
            System.out.println("oyuncu1---> bu kelime başa eklensin diyorsan -1- sona eklensin diyorsan -2-");
            int onay3= scan.nextInt();
            if(onay3==1){
                ikisonkelime.concat(birsonkelime);
                System.out.println("kelime eklendi yeni kelime '"+ikisonkelime.concat(birsonkelime)+"' şeklinde oldu\nKabul ediyorsan -1- kabul etmiyorsan -2- ");
                int onay4= scan.nextInt();
                if(onay4==1){
                    System.out.println("kelime '"+ikisonkelime.concat(birsonkelime)+"' şeklinde tamamlandı\n" +
                            "Oyuncu2----> "+(ikisonkelime.concat(birsonkelime).length()) + " puan kazandı");
                }else if(onay4==2){
                    System.out.println("kelime kabul edilmedi");
                    oyuncuiki();
                }
            }else if(onay3==2){
                birsonkelime.concat(ikisonkelime);
                System.out.println("kelime eklendi yeni kelime '"+birsonkelime.concat(ikisonkelime)+"' şeklinde oldu\nKabul ediyorsan -1- kabul etmiyorsan -2- ");
                int onay4= scan.nextInt();
                if(onay4==1){
                    System.out.println("kelime '"+birsonkelime.concat(ikisonkelime)+"' şeklinde tamamlandı\n" +
                            "Oyuncu2----> "+birsonkelime.concat(ikisonkelime).length() + " puan kazandı");
                }else if(onay4==2){
                    System.out.println("kelime kabul edilmedi");
                    oyuncuiki();
                }

            }

        }else if(onay2==2){
            System.out.println("kelime onaylanmadı");
            oyuncuiki();
        }
    }

    private static void oyuncu2Tur() {
       oyuncuiki();


       /*System.out.println("oyuncu1 '" +ikisonkelime + "' kelimesini kabul ediyorsa 1 e etmiyorsa 2 ye bassın");
        int onay= scan.nextInt();
        if (onay==1){
            System.out.println("oyuncu2 in puanı = ");
            System.out.println("Sıra oyuncu1 e geçti");
            oyuncu1Tur();
        }else if(onay==2){
            System.out.println("oyuncu1 kelimeyi kabul etmedi");
            oyuncu2Tur();


    }*/




}


}
