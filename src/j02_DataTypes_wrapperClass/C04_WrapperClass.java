package j02_DataTypes_wrapperClass;
//wrapper--sarıcı demek
public class C04_WrapperClass {
    public static void main(String[] args) {
        String name="Erol";
        int yas=36;
        System.out.println(name.toUpperCase());// name eşitini büyük yazdırır..EROL yazdırır
        // non-primitive data turleri data depolamak yaninda kullanışlı birçok method'a sahiptir
        // ancak primitive data turlerinin boyle bir ozelligi yoktur
        // primitive data turleri sadece degerleri saklarlar (container) ve hwerhangi bir özellik(method) vs bulundurmaz.
        //Ancak primitive data turleri icin de bazi işlemler için (String'den tamsayı çekme) method'lar ihtiyaç
        // olduğunda Java her bir primitive data turunu, non-primitive  Wrapper Class  oluşturarak ilgili methodlarla
        // ara çözüm imkanı sunmuştur.
        ///////////önemli///////
        String tc="1234455";
        int yenitc=Integer.valueOf(tc);// tc String değerini int çevirir.
        System.out.println("yenitc = " + yenitc);// yenitc yazdık . bastık ve soutv ye bas hazır getirsin

        String id="98765";
        //TASK--id ve tc String değerlerinin toplamını print eden code yazınız....
        int yeniid=Integer.valueOf(id);// id yeni int yeniid e atantdı..artık elinde iki tane int var ve toplayabilirsin
        System.out.println(yeniid+yenitc);//1234455+98765=1333220 olur yani topladı
        String okulno="234543l";// öğrenci hatayla 1 yerine l harfi girdi say
        //int YeniOkulNo=Integer.valueOf(okulno);// run time Exception--- çalışma zamanı hatası..buraya kadar çalıştı ancak burada okulno daki sayıları almaya-
        // çalışırken "l" harfi olduğu için hacı napyon dedi hata verdi...çünkü sadece sayıları alır value of sadece sayıları alır
        //System.out.println("YeniOkulNo = " + YeniOkulNo);

       // System.out.println("madem geldin dünyaya otur çalış javaya");

        //TASK--byte short int maximum ve minimum değerlerini print eden code yazınız????
        //cevap için gereken bilgi; byte short int bunlar primitive data ancak bunlar methodlarla yazılamaz önce non-primitive data olması gerekir ki-
        // bunun için wrapperClass kullanmam lazım yani non-primitive data olmalılar

        byte maxByteDegeri= Byte.MAX_VALUE;
        byte minByteDegeri= Byte.MIN_VALUE;
        System.out.println("maxByteDegeri = " + maxByteDegeri);
        System.out.println("minByteDegeri = " + minByteDegeri);
        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);// Integer yazdık . koyduk metod seçtik soutv yaptık
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);




    }
}
