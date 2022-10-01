package j09_SwitchStatement.tasks;

import java.util.Scanner;

public class Task_SeyahatProjesi {

    public static void main(String[] args) {

        /*
        bulundugunuz yerden, bir yere yolculuk edeceksiniz.

        1. Köln veya Frankfurta gidebilirsiniz.
        2. Bilet fiyatı hesabı = Her 20 Km başına 5 euro. örn: (100 km yol. Bilet parası  (100/20)* 5 =25 euro

todo İPUCU:  toplamTutar, işlem, FrankfurtKm, KmBirimFiyat   gibi sabit veri tipleri oluşturabilirsiniz.
 İşlemlerde direkt bunları cağırabilirsiniz.

        todo İLK OLARAK;

        "Nereye yolculuk etmek istiyorsunuz? (Frankfurt : 60 KM          ---         Köln : 80 KM ---       (20 KM başına 5 euro bilet parası alınmaktadir..)    yazısı gelsin.

    1.    Frankfurt veya Köln olarak bir giriş yapın. (Girdiğiniz sehrin harfleri , girildikten sonra büyük hale gelsin.

   todo    Frankfurt girildiyse,
        örn: girdi= Frankfurt
                case=FRANKFURT:

      Rota = Frankfurt yazdırın.
      Frankfurt km hesabı işlemi yapın.

      son olarak konsolda: Frankfurt 15 Euro         yazsın.
      todo  case: KÖLN ise

      "Rota = Köln" yazdırın.
       km hesabına göre işlemi yapınız.

       son olarak konsolda:  Köln   20 Euro             yazsın.



       2.  Sistem bize "Kaç kişilik bilet istiyorsunuz? (Max 2 kişilik olabilir):   "   sorusunu sorsun.

       case:1  ise
        " 1 kişilik " yazdırın. (1 kişilik seçerseniz bir işlem yapmanıza gerek kalmaz, bilet ücreti yukarıda çoktan belirlenmiş olur.)

        case:2 ise

        "2 kişilik " yazdırın
        2 kişi için bilet fiyatını hesaplayın.


        todo  Son olarak yolculugunuzu check edin;

        konsolda örn:   Frankfurt  - 2 Kişilik    yazsın.

        1.Bakiyemi belirtin.
        2.Toplam Tutarı belirtin.
        3.double paraUstu oluşturun ve hesaplayın.
        4.Double para üstünü yazdırın.


         */
        Scanner scan = new Scanner(System.in);
        System.out.println("***** seyahat şirketimize hos geldiniz *****");
        System.out.println("Frankfurt : 60 km \nKoln : 80 km\n 20 Km basına 5 euro ucretlendirme yapılır :) ");

        int kölnfiyat = 80 / 20 * 5;
        int frankfurtfiyat = 60 / 20 * 5;
        double bakiye = 513.15;


        System.out.print("yolculuk yapacagınız sehri seciniz : ");
        String secim = scan.nextLine().toUpperCase();
        switch (secim) {
            case "FRANKFURT":
                System.out.println(secim + "'a kaç kişi seyahat edeceksiniz?\nBir kişi için 1\nİki kişi için 2\nYazınız");
                int fryolcu = scan.nextInt();
                if (fryolcu == 1) {
                    System.out.println("FRANKFURT'a bir kişilik bilet fiyatı " + frankfurtfiyat + " Euro");

                } else if (fryolcu == 2) {
                    System.out.println("FRANKFURT'a iki kişilik bilet fiyatı " + (frankfurtfiyat * 2) + " Euro");
                } else System.out.println("hatalı giriş yaptınız bilgileri kontrol ediniz");
                break;
            case "KOLN":
                System.out.println(secim + " 'e kaç kişi seyahat edeceksiniz?\nBir kişi için 1\nİki kişi için 2\nYazınız");
                int klyolcu = scan.nextInt();
                if (klyolcu == 1) {
                    System.out.println("KOLN'e bir kişilik bilet fiyatı " + frankfurtfiyat + " Euro");

                } else if (klyolcu == 2) {
                    System.out.println("KOLN'e iki kişilik bilet fiyatı " + (frankfurtfiyat * 2) + " Euro");
                } else System.out.println("hatalı giriş yaptınız bilgileri kontrol ediniz");
                break;

        }

        System.out.println("Bilet kontrol edelim\nAlınan bilet için 1\nBir yolcu tutarı için 2\nİki yolcu tutarı için 3\nGiriş yapınız");
        int check = scan.nextInt();
        switch (check) {
            case 1:
                System.out.println("Alınan bilet " + secim + " için  ");
                break;
            case 2:
                System.out.println("Bir kişilik bilet fiyatı " + kölnfiyat + " Euro");
                System.out.println("Bakiyenizi öğrenmek için \n1 i tuşlayın\n ödeme sonrası kalan bakiye için 2 yi tuşlayın");
                int x = scan.nextInt();
                switch (x) {
                    case 1:
                        System.out.println("Bakiye = " + bakiye);
                        break;
                    case 2:
                        System.out.println("Ödeme sonrası bakiyeniz= " + (bakiye - kölnfiyat) + " Euro");
                        break;
                }
            default:
                System.out.println("Yanlış giriş");
                break;

            case 3:
                System.out.println("Bir kişilik bilet fiyatı " + kölnfiyat + " Euro");
                System.out.println("Bakiyenizi öğrenmek için \n1 i tuşlayın\n ödeme sonrası kalan bakiye için 2 yi tuşlayın");
                int tus = scan.nextInt();
                switch (tus) {
                    case 1:
                        System.out.println("Bakiye = " + bakiye);
                        break;
                    case 2:
                        System.out.println("Ödeme sonrası bakiyeniz= " + (bakiye - (kölnfiyat * 2) + "Euro"));
                        break;
                    default:
                        System.out.println("yanlış mı girdin acaba");
                }



        } System.out.println("Teşekkürler");
}}
