package j11_MethodCreation.tasks;

import java.util.Scanner;

public class destek {


        static Scanner dat = new Scanner(System.in);
        static int oyuncu1 = 0;
        static int oyuncu2 = 0;
        static String word1;
        static String word2;

        public static void main(String[] args) {
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

            adım1();



        }//main sonu

        public static void adım1() {
            System.out.println("Oyuncu 1, kelime giriniz= ");
            word1 = dat.nextLine();
            System.out.println("girdiğiniz kelime: " + word1);
            adım2();
        }

        public static void adım2() {
            System.out.println("2. oyuncu '" + word1 + "' kelimesini kabul ediyor mu? Evet için -1-, Hayır için -2-...");
            int cevap = dat.nextInt();
            if (cevap == 1) {
                oyuncu1 = word1.length();
                System.out.println("1. oyuncu " + (word1.length()) + " puan kazandı.");
                karar();
            } else
                oyuncu1 = word1.length();
            System.out.println("geçersiz kelime.. oyun bitti... 1. oyuncu kazandı!");


        }

        public static void karar() {
            System.out.println("girilen kelime '"+word1+"'... \n2. oyuncu devam mı? Evet ise -1- / Hayır ise -2-= ");
            int karar = dat.nextInt();
            switch (karar) {
                case 1:
                    adım3();
                    break;
                case 2:
                    System.out.println("oyun bitti");
                    System.out.println("1. oyuncu puanı= " + oyuncu1);
                    System.out.println("2. oyuncu puanı= " + oyuncu2);

            }
        }

        public static void adım3() {
            dat.nextLine();
            System.out.println("2. oyuncu hangi kelimeyi eklemek ister?= ");
            String word2 = dat.nextLine();

            System.out.println("önce -1- mi sonraı mı -2-= ");
            int karar2 = dat.nextInt();

            switch (karar2) {
                case 1:
                    word1 = word2.concat(word1);
                    karar();
                    break;
                case 2:
                    word1 = word1.concat(word2);
                    karar();
                    break;
                default:
                    System.out.println("agam daha seçim yapamiisen");
            }

        }

    }

