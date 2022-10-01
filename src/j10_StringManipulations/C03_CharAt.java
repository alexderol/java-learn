package j10_StringManipulations;

import java.util.Scanner;

public class C03_CharAt {
    public static void main(String[] args) {
        /*
        charAt methodu parametre int olarak girilen index deki char değerini return eder.
        index değeri 0 dan başlar
         */
        String sehir = "Istanbul";
        char besinciIndexKrkt= sehir.charAt(5);
        System.out.println(besinciIndexKrkt);//b 0 dan başlayarak saymaya başlar
        System.out.println(sehir.charAt(5));//b

        //son index karakteri ---->> length()-1
        System.out.println(sehir.charAt(sehir.length() - 1));// son karakteri bulmak için yapılır

        //ilk index karakteri----> charAt(0);
        System.out.println(sehir.charAt(0));//I yazdırır

        //System.out.println(sehir.charAt(18));//run time error çünkü 18 karakter yok ki :)
        //TRICK--> charAt() index boyutunu geçerse run time error verir

        //TASK-> istanbul izmir girilen kelimesinin ortadaki karakteri print eden code create edin
        Scanner scan = new Scanner(System.in);
        System.out.println("bir kelime girin");
        String kelime = scan.nextLine();
        if(kelime.length()%2!=0){//kelimenin uzunluğunu yaz ortası varsa alttan devam et ortası yoksa olmaz zaten
            System.out.println(kelime.charAt((kelime.length()-1) / 2));// kelimenin uzunluğunu ikiye böl ortasını bul tabi uzunluk tek ise
        }else System.out.println("girilen kelimenin orta karakteri yok");//yani manisa 6 harfli ortası yok ki ama izmir yazsan m olur


        System.out.println("bundan snorası alıştırma***");
        System.out.println("bir cümlü yaz");
        String secim= scan.nextLine();
        System.out.println(secim.charAt(secim.length() - 1));
        System.out.println(secim.length());
        System.out.println(secim.charAt(10));


    }
}
