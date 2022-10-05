package j11_MethodCreation;

import java.util.Scanner;

public class ucusKendiCalısmam {
    /*
  A şehrinden uçmak isteyen bir yolcu B şehrine 500km C şehrine  700km  D şehrine  900 km mesafededir.
  Bilet tarifesi:
  km birim fiyati : 0.10$
  yolcu 12 yasindan kucukse toplam fiyat %50 indirim,
  12 ve 24 yas arasindaysa 10% indirim,
  65 yasindan buyukse 30% indirim,
  bilet gidis donus alinirrsa 20% indirim uygulayan bi app create ediniz
   */
    static double fiyatB = 500 / 0.10;
    static double fiyatC = 700 / 0.10;
    static double fiyatD = 900 / 0.10;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        rota();


    }

    private static void rota() {
        System.out.println("hangi şehre gitmek istediğinizi seçiniz:\nB şehri için 1\nC şehri için 2\nD şehri için 3");
        int trip = scan.nextInt();
        switch (trip) {
            case 1:
                ticketB();

                break;
            case 2:
                ticketC();

                break;
            case 3:
                ticketD();

                break;
            default:
                System.out.println("senin istediğin yere buradan geçmiyor otobüs");

        }
    }

    private static void ticketD() {
        System.out.println("yaşınızı giriniz = ");
        int yas = scan.nextInt();
        if (yas < 12) {
            System.out.println("tek yön bilet mi çift yön bilet mi almak istersiniz?\nTek yön için -->1\nÇift yön için --> 2");
            int yön = scan.nextInt();
            switch (yön) {
                case 1:
                    System.out.println("tek yön bilet fiyatı =" + (fiyatD / 2) + " $");
                    break;
                case 2:
                    System.out.println("çift yön bilet fiyatı = " + (fiyatD / 2) * 0.8 * 2 + " $");
                    break;
                default:
                    System.out.println("sadece iki seçenek var 1 ve 2");
            }
        } else if (yas > 12 && yas < 24) {
            System.out.println("tek yön bilet mi çift yön bilet mi almak istersiniz?\nTek yön için -->1\nÇift yön için --> 2");
            int yön = scan.nextInt();
            switch (yön) {
                case 1:
                    System.out.println("tek yön bilet fiyatı =" + (fiyatD * 0.9) + " $");
                    break;
                case 2:
                    System.out.println("çift yön bilet fiyatı = " + (fiyatD * 0.9) * 2 + " $");
                    break;
                default:
                    System.out.println("sadece iki seçenek var 1 ve 2");


            }
        } else if (yas > 24 && yas < 65) {
            System.out.println("tek yön bilet mi çift yön bilet mi almak istersiniz?\nTek yön için -->1\nÇift yön için --> 2");
            int yön = scan.nextInt();
            switch (yön) {
                case 1:
                    System.out.println("tek yön bilet fiyatı =" + (fiyatD) + " $");
                    break;
                case 2:
                    System.out.println("çift yön bilet fiyatı = " + (fiyatD) * 2 + " $");
                    break;
                default:
                    System.out.println("sadece iki seçenek var 1 ve 2");
            }


        } else if (yas > 65) {
            System.out.println("tek yön bilet mi çift yön bilet mi almak istersiniz?\nTek yön için -->1\nÇift yön için --> 2");
            int yön = scan.nextInt();
            switch (yön) {
                case 1:
                    System.out.println("tek yön bilet fiyatı =" + (fiyatD * 0.7) + " $");
                    break;
                case 2:
                    System.out.println("çift yön bilet fiyatı = " + (fiyatD * 0.7) * 2);
                    break;
                default:
                    System.out.println("sadece iki seçenek var 1 ve 2");
            }

        } else System.out.println("yaşın hemen öğrenmelisin !!!");


    }


    private static void ticketC() {
        System.out.println("yaşınızı giriniz = ");
        int yas = scan.nextInt();
        if (yas < 12) {
            System.out.println("tek yön bilet mi çift yön bilet mi almak istersiniz?\nTek yön için -->1\nÇift yön için --> 2");
            int yön = scan.nextInt();
            switch (yön) {
                case 1:
                    System.out.println("tek yön bilet fiyatı =" + (fiyatC / 2) + " $");
                    break;
                case 2:
                    System.out.println("çift yön bilet fiyatı = " + (fiyatC / 2) * 0.8 * 2 + " $");
                    break;
                default:
                    System.out.println("sadece iki seçenek var 1 ve 2");
            }
        } else if (yas > 12 && yas < 24) {
            System.out.println("tek yön bilet mi çift yön bilet mi almak istersiniz?\nTek yön için -->1\nÇift yön için --> 2");
            int yön = scan.nextInt();
            switch (yön) {
                case 1:
                    System.out.println("tek yön bilet fiyatı =" + (fiyatC * 0.9) + " $");
                    break;
                case 2:
                    System.out.println("çift yön bilet fiyatı = " + (fiyatC * 0.9) * 2 + " $");
                    break;
                default:
                    System.out.println("sadece iki seçenek var 1 ve 2");


            }
        } else if (yas > 24 && yas < 65) {
            System.out.println("tek yön bilet mi çift yön bilet mi almak istersiniz?\nTek yön için -->1\nÇift yön için --> 2");
            int yön = scan.nextInt();
            switch (yön) {
                case 1:
                    System.out.println("tek yön bilet fiyatı =" + (fiyatC) + " $");
                    break;
                case 2:
                    System.out.println("çift yön bilet fiyatı = " + (fiyatC) * 2 + " $");
                    break;
                default:
                    System.out.println("sadece iki seçenek var 1 ve 2");
            }


        } else if (yas > 65) {
            System.out.println("tek yön bilet mi çift yön bilet mi almak istersiniz?\nTek yön için -->1\nÇift yön için --> 2");
            int yön = scan.nextInt();
            switch (yön) {
                case 1:
                    System.out.println("tek yön bilet fiyatı =" + (fiyatC * 0.7) + " $");
                    break;
                case 2:
                    System.out.println("çift yön bilet fiyatı = " + (fiyatC * 0.7) * 2);
                    break;
                default:
                    System.out.println("sadece iki seçenek var 1 ve 2");
            }

        } else System.out.println("yaşın hemen öğrenmelisin !!!");


    }


    private static void ticketB() {
        System.out.println("yaşınızı giriniz = ");
        int yas = scan.nextInt();
        if (yas < 12) {
            System.out.println("tek yön bilet mi çift yön bilet mi almak istersiniz?\nTek yön için -->1\nÇift yön için --> 2");
            int yön = scan.nextInt();
            switch (yön) {
                case 1:
                    System.out.println("tek yön bilet fiyatı =" + (fiyatB / 2) + " $");
                    break;
                case 2:
                    System.out.println("çift yön bilet fiyatı = " + (fiyatB / 2) * 0.8 * 2 + " $");
                    break;
                default:
                    System.out.println("sadece iki seçenek var 1 ve 2");
            }
        } else if (yas > 12 && yas < 24) {
            System.out.println("tek yön bilet mi çift yön bilet mi almak istersiniz?\nTek yön için -->1\nÇift yön için --> 2");
            int yön = scan.nextInt();
            switch (yön) {
                case 1:
                    System.out.println("tek yön bilet fiyatı =" + (fiyatB * 0.9) + " $");
                    break;
                case 2:
                    System.out.println("çift yön bilet fiyatı = " + (fiyatB * 0.9) * 2 + " $");
                    break;
                default:
                    System.out.println("sadece iki seçenek var 1 ve 2");


            }
        } else if (yas > 24 && yas < 65) {
            System.out.println("tek yön bilet mi çift yön bilet mi almak istersiniz?\nTek yön için -->1\nÇift yön için --> 2");
            int yön = scan.nextInt();
            switch (yön) {
                case 1:
                    System.out.println("tek yön bilet fiyatı =" + (fiyatB) + " $");
                    break;
                case 2:
                    System.out.println("çift yön bilet fiyatı = " + (fiyatB) * 2 + " $");
                    break;
                default:
                    System.out.println("sadece iki seçenek var 1 ve 2");
            }


        } else if (yas > 65) {
            System.out.println("tek yön bilet mi çift yön bilet mi almak istersiniz?\nTek yön için -->1\nÇift yön için --> 2");
            int yön = scan.nextInt();
            switch (yön) {
                case 1:
                    System.out.println("tek yön bilet fiyatı =" + (fiyatB * 0.7) + " $");
                    break;
                case 2:
                    System.out.println("çift yön bilet fiyatı = " + (fiyatB * 0.7) * 2);
                    break;
                default:
                    System.out.println("sadece iki seçenek var 1 ve 2");
            }

        } else System.out.println("yaşın hemen öğrenmelisin !!!");


    }

}
