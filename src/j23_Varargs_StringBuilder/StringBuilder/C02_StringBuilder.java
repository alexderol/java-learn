package j23_Varargs_StringBuilder.StringBuilder;

import java.util.Collections;

public class C02_StringBuilder {
    public static void main(String[] args) {

        //j23_Varargs_StringBuilder.StringBuilder obj create etme

        //1. yol

        StringBuilder sb1 = new StringBuilder();//default capacity 16 bit, value bos
        System.out.println("sb1.length() = " + sb1.length());//0 eleman yok çünkü
        System.out.println("sb1.capacity() = " + sb1.capacity());//16 verir default 16 zaten

        sb1.append("jAVATAR");// javatar sb1 e eklendi
        System.out.println("sb1.capacity() = " + sb1.capacity());
        System.out.println("sb1 = " + sb1);//jAVATAR eklendi

        sb1.append(" selam ").append(1907).append("  seri ekleme var ").append("istediğin kadar ardı ardına ekleme yapılır");
        System.out.println("sb1 = " + sb1);
        System.out.println("sb1.capacity() = " + sb1.capacity());

        sb1.append(" başarı gayrete aşıkmış gayret edeyim o zaman ");
        System.out.println("sb1.capacity() = " + sb1.capacity());

        //2. YOL
        StringBuilder sb2 = new StringBuilder("Kevser hanıma selamlar");// ilk değer ataması yapılmış sb2 objsi
        System.out.println("sb2.capacity() = " + sb2.capacity());//38 ((16*2)+2) değer 16 atanır ihtiyaca göre iki katının 2 fazlası olarak eklemeye devam eder

        //trim(); -->fazladan ayrılan capacity silinir
        System.out.println("sb2.length() = " + sb2.length());//38
        sb2.trimToSize();
        System.out.println("sb2.capacity() trim sonrası = " + sb2.capacity());

        //3. yol

        StringBuilder sb3 =new StringBuilder(11);//hafızada 11 karakterlik yer ayrıldı
        System.out.println("sb3.length() = " + sb3.length());//0 karakter sayısı sıfır çünkü boş
        System.out.println("sb3.capacity() = " + sb3.capacity());//11
        sb3.append("ebubekir bey");
        System.out.println("sb3.length() = " + sb3.length());//12
        System.out.println("sb3.capacity() = " + sb3.capacity());//24

        ////////*******************************************/////

        //istenen bir character indexi sorgulama alma
        System.out.println("sb1.charAt(12) = " + sb1.charAt(12));//m

        //belirli bir aralıktaki charcterleri alma

        System.out.println("sb1.subSequence(3,13) = " + sb1.subSequence(3, 13));//başlangıc değeri dahil bitiş hariç 3. indexten 12 index dahil verir
        System.out.println("sb1.substring(17) = " + sb1.substring(17));//17 indexten başla sona kadar
        System.out.println("sb1.substring(3,13) = " + sb1.substring(3, 13));//

        //belirli bir indexteki charcterleri silmek

        System.out.println("sb1.deleteCharAt(3) = " + sb1.deleteCharAt(3));//3. index silindi "A" JAVTAR selam.....
        System.out.println("sb1.delete(1,5) = " + sb1.delete(3, 7));//3.4.5.6. indnexler silindi jAVselam.....

        //istenen character veya caharterleri eklemek

        System.out.println("sb3 = " + sb3);//ebubekir bey
        System.out.println("sb3.insert(4,\":)\") = " + sb3.insert(4, ":)"));//ebub:)ekir bey
        String s="güzel insan";

        System.out.println("sb3.insert(1,s,3,7) = " + sb3.insert(1, s, 3, 7));// eel ibub:)ekir bey  -->sb3 ücün 1 karakterisen s nin 3 ve 7 arasındaki carakterleri çak
        System.out.println("sb3.insert(9,s) = " + sb3.insert(9, s));//eel ibub:güzel insan)ekir bey ---> 9 a s yi komple ekle
        StringBuilder sb4 = new StringBuilder("Nihan Hanım");
        System.out.println("sb4.insert(5, \"Qa team lead\",0,2) = " + sb4.insert(5, "Qa team lead", 0, 2));//NihanQa Hanım


        //İstenen index deki karakteri değiştirmek..
        sb4.setCharAt(5,' ');
        System.out.println("sb4 = " + sb4);//Nihan a Hanım

        //istenen index e character yerine birden çok character ekleme
        System.out.println("sb4.replace(8,10,\"hi\") = " + sb4.replace(8, 10, "hi"));// sb4 e git 8. karakteri bul 10 a kadar hi yap---Nihan a hinım


        //StringBuilder obj Stringe çevirme-->toString
        System.out.println("sb3.toString().toUpperCase() = " + sb3.toString().toUpperCase());//EEL IBUB:GÜZEL INSAN)EKIR BEY ---> stringe çevrildi ve strineg methodları ile büyük harf yaptık


        /*
        Compare iki sb'i esit mi diye kontrol etmek icin
        ilk harften baslayarak tum karakterleri karsilastirir
        Ayni olan karakterler icin bir sey return etmezken
        farkli olan ilk karakter icin ascii tablosuna gore kac deger geride veya ileride
        oldugunu print eder
        Tamamen ayni ise bize 0 return eder

        bir sb ile bir String'i compare etmek istersek Java CTE verir
        */

        StringBuilder sb5 =new StringBuilder("JavaCAN");
        StringBuilder sb6 =new StringBuilder("JavaCAN");
        String str1 ="JavaCAN";
        System.out.println("sb5.compareTo(sb6) = " + sb5.compareTo(sb6));//0 tamamen aynı sb5 ile sb6 karşılaştırdık

       // System.out.println("sb6.compareTo(str1) = " + sb6.compareTo(str1));//CTE alırsın çünkü biri strng biri SB

        System.out.println("sb6.equals(sb5) = " + sb6.equals(sb5));//false -->SB equals == gibi çalışır  hem value hem de ref değerine bakar
        System.out.println("str1.equals(sb6.toString()) = " + str1.equals(sb6.toString()));//true--ikiside string oldu o yüzden true verir



    }

}
