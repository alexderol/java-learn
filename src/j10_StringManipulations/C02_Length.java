package j10_StringManipulations;

public class C02_Length {
    public static void main(String[] args) {
        /*length methodu girilen String in uzunluğunu yani içinde bulunan karakter sayısını return eder.(return çıktı demek)
        bütün karakterleri (boşluk vs all of them ) sayıp adedini verir.
         */
        String str = "madem geldin dünyaya otur çalış javaya";
        int strKarakterSayısı= str.length();//int type bir data verir
        System.out.println(str);//madem geldin dünyaya otur çalış javaya
        System.out.println(strKarakterSayısı);//38
        System.out.println(str.length());//38

        String str1 ="";
        System.out.println(str1.length());//0

        String str2= " ";//boşluk olduğu için bir karakter olduğunu yazdırır
        System.out.println(str2.length());//1

        //String str3= null;// null bir değer değildir sadece hiçliği gösterir
        //System.out.println(str3.length());//run time error
        //str3.concat(str1);//run time error
        //TRICK-->null atanan Stringler String methodu çalışmaz
        /*
        null case sensitivedir. Null veya NULL yazılamaz.
        null bir değer değildir (dutluk) sadece hiçliği gösteren bir pointer(giriş) dır.
         */

        String name;// deklare edilmiş ama atanmamış String method çalışmaz
        //name.concat(str1);
        System.out.println("***Buradan Aşağısı Alıştırma****");
        String ad= "Senin derinlerinde bir yerde buldum, sarılacak, kavuşacak köklerimiz";
        System.out.println(ad.length());//68
        String erol= "Demir";
        System.out.println(erol.length());//5


    }

}
