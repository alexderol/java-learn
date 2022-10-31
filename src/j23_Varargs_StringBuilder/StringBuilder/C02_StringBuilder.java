package j23_Varargs_StringBuilder.StringBuilder;

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



    }

}
