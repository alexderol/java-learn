package j10_StringManipulations;

import java.util.Scanner;

public class C09_Replace_ReplaceAll {
    public static void main(String[] args) {
        /** replace()
         * Metin icerisindeki karakter ya da bir parcasinin, istenilen karakter ya da
         * metinle degistirilmesini (update -set) saglar. Sonuc String'dir..
         *

         */
        String str = "javaCAN'lara selam olsun java ile 123456 bolcana offer";
        System.out.println("str.replace('a','@') = " + str.replace('a', '@'));//j@v@CAN'l@r@ sel@m olsun j@v@ ile bolc@n@ offer
        System.out.println("str.replace(\"can\",\"kan\") = " + str.replace("can", "kan"));//javaCAN'lara selam olsun java ile bolkana offer
        System.out.println("str.replace(\"CAN\",\"TAN\") = " + str.replace("CAN", "TAN"));

        /** ReplaceFirst
         * Replace ile aynı sadece ilk bulunanı değiştirir
         */
        System.out.println("str.replaceFirst('a','@') = " + str.replaceFirst("a", "@"));//j@vaCAN'lara selam olsun java ile bolcana offer
        //sadece ilk a yı @ yaptı diğerleri aynı kaldı

        /** replaceAll() method u replace() methoduna benzer ama 2 fark vardır
         *replace() methodu char kabul eder ama replaceAll kabul etmez
         * 2-replaceAll() method u regex kullanımına izin verir (Regular Expressions)
         */

        //(Regular Expressions)
        //  \\s bosluk (
        //  \\S bosluk disindaki tum karakterler
        //  \\w harfler ve rakamlar (a z A Z, 0 9)
        //  \\W harfler ve rakamlar disindaki tum karakterler
        //  \\d rakamlar 0 9
        //  \\D rakamlar disindaki tum karakterler


        System.out.println("str.replaceAll(\"\\\\s\",\"+\") = " + str.replaceAll("\\s", "+"));//javaCAN'lara+selam+olsun+java+ile+bolcana+offer
        //burada boşlukları aldı yerine + koydu

        System.out.println("str.replaceAll(\"\\\\s\",\"+\") = " + str.replaceAll("\\S", "+"));//javaCAN'lara+selam+olsun+java+ile+bolcana+offer
        System.out.println("str.replaceAll(\"\\\\s\",\"+\") = " + str.replaceAll("\\w", "+"));//
        System.out.println("str.replaceAll(\"\\\\s\",\"+\") = " + str.replaceAll("\\W", "+"));//
        System.out.println("str.replaceAll(\"\\\\s\",\"+\") = " + str.replaceAll("\\d", "+"));//
        System.out.println("str.replaceAll(\"\\\\s\",\"+\") = " + str.replaceAll("\\D", "+"));//
        /*
        //task  Girilen ismini, soyismini ve 16 haneli kredi karti no bilgilerini aşağıdaki formatta print eden code create ediniz.
        // isim-soyisim : M***** B*******
        // kart no : **** **** **** 1234
        //*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Adınızı giriniz: ");
        String user = scan.nextLine();
        System.out.println("Soyad giriniz");
        String user2 = scan.nextLine();
        System.out.println("16 haneli kart nosunu yazın");
        long cardNo = scan.nextLong();

        String newUser = user.charAt(0) + user.substring(1).replaceAll("\\w", "*");// ilk karakteri al + substring 1 den itibaren parçala ve ilk harif hepsini * a değiştir dedik
        String newUser2 = user2.charAt(0) + user2.substring(1).replaceAll("\\w", "*");
        String newCardNo = "**** **** **** " + String.valueOf(cardNo).substring(12);//long olan değeri strng yaptık ancak ona da soruda bizde * istedi ya ilk 12 hanesini * yazdık sonrasına da substringl 12 densonrasını yaz dedik
        System.out.println("İsim Soyisim= " + newUser + " " + newUser2 + " Kart No :" + newCardNo);


    }


}
