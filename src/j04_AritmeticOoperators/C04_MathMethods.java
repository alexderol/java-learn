package j04_AritmeticOperators;

public class C04_MathMethods {

    public static void main(String[] args) {
        /*
     Math.abs(a)
     Girilen degerin mutlak degerini verir.

   Math.max(a, b)
   Girilen iki degerden buyuk olani verir.

   Math.min(a, b)
   Girilen iki degerden kucuk olani verir.

   Math.round(a)
   Girilen degerin en yakin tamsayiya yuvarlar.

   Math.sqrt(a)
   Girilen degerin karekokunu verir.

   Math.pow(a, b)
   Girilen a ve b degerini a uzeri b olarak verir. üstlü sayı yapar

   Math.ceil(a) 3.1 => 4
   Girilen bir ondalikli sayiyi bir sonraki en yakin tam sayiya yukseltir.

   Math.floor(a) 3.7 => 3
   Girilen bir ondalikli sayiyi bir onceki en yakin tam sayiya indirger.



     */

        /* Matematiksel işlemleri yapacağımız değişkeni oluşturalım */

        double dSayi = -29.45; //aradaki virgül değil nokta

        System.out.println("Sayının ilk değeri    : " + dSayi);

        /* Sayının mutlak değerini alalım */

        System.out.println("Sayının mutlak değeri : " + Math.abs(dSayi));


        /* Sayıyı yukarı yuvarlayalım */

        System.out.println("Sayı yukarı yuvarla   : " + Math.ceil(dSayi));


        /* Sayıyı aşağı  yuvarlayalım */

        System.out.println("Sayı aşağı  yuvarla   : " + Math.floor(dSayi));


        /* 81 sayısının karekökünü alalım */

        System.out.println("100'ün karekök değeri : " + Math.sqrt(81));


        /* 3  sayısının küpünü alalım */

        System.out.println("3'ün küpünün   değeri : " + Math.pow(3, 3));

        System.out.println("sayının mutlak değeri= " +Math.abs(8));







    }

}
