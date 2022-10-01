package j03_ScannerClass_TypeCasting;

import java.util.Scanner;

public class C02_TypeCasting {
    public static void main(String[] args) {

/*



 */
   //fBoolean basarılı=true;// doğal uyum olacak
   //fBoolean basarı=basarılı;///aynı tipleri birbirine atayabiliriz..
   //f    System.out.println("basarı"+basarılı);

        double d= 17;//double variable a int 17 atandı kü çük büyüğe atandı
        System.out.println("d ="+d);//17.00 auto wedding

        int sayi1= 33;
        int sayi2= 7;
        System.out.println(sayi1/sayi2);//sonuç 4;java iki int sayıyı birbirine böldüğümüzde sonuç int atar.
        //eğer bölme işleminde ondalık sonuç çıkarsa ondalık kısmı siler
        //****///

        byte b=127;
        int i=b; // b yi i ye atarsak widding olur küçük büyüğe atanır...
        System.out.println("i ="+i);

        int num= 1453;
        double d1=num; //küçük büyüğe atandı..
        System.out.println("d1 ="+d1);// 1453,00


        /////////double/int = double olur büyük kutu kazanır
        double db=d1/num; ///TRİCK -- iki farklı data type sayı işleme girerse (+-/*) java -
                            // küçük olan data type türü için aw (autowidding) sonucu büyük olan data type olarak atar

        System.out.println(db);//1.0 double dır.

        /// hep küçükten büyüğe gittik şimdi tam tersini yapacağız//// büyükten küçüğe yani
        //explicit Narrğing Casting-- büyüt data type larını kacçak data ttype larina çevirme

        double d2=14.53;
        int num2= (int) d2;/// hata verdi yani büyüğü küçüğe koyamazsın diyor. d2 yi 14 olarak num2 ye atadı.
        System.out.println("num2 ="+num2);//14

        int num3=153;
        byte b1= (byte) num3;// num3 int dı byte oldu
        System.out.println("b1 = " + b1);//-103 oldu...


        double d3=333;
        long l= (long) d3;//double büyük long küçük o yüzden casting yaptık

        double d4=571.4444;
        long l2= (long) d4;
        System.out.println("l2 = " + l2);//571 sonuç olur küsürat gitti....
        //////yukarısının bitisi////

        ///yeni konu////

        ///TASK---
        /* task->
         * Kullanicidan bir character girmesini isteyin ve
         * girilen karakteri ve ascii degerini yazin
         *
         * Ornek : Input  : a
         *         Output : Girdiginiz ‘a’ karakterinin ascii degeri : 95
         *
         *///düşün/kullanıcı diyorsa scanner objesi demek
                //char ch=scan.next().charAt(0);

       //  çözüm  */
        Scanner scan= new Scanner(System.in);//1 adım
        System.out.println("ascii değeri istediğin karakteri gir= ");//2. adım
        char ch1=scan.nextLine().charAt(0);
        int asciiDegeri=ch1;
        System.out.println("ch1 ascii değeri = " + asciiDegeri);//// a nın ascii değeri 36 ymış

        byte a = scan.nextByte();
        System.out.println(a);





    }


}
