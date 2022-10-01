package j01_Variables;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("hmerhaba dünya");
        //bu komut konsala yazılan metni print eder
        //dan sonra yazılan ifadeler komut veya kod satırı olarak değil yorum olarak tanımlanır
        /*
        bu araya yazılan her ifade yorum satırı olur java kod olarak algılamaz
        başarı gayrete aşıktır
        bahanesi olanın başarısı olmaz
        tek // da tek satır yazılır yıldızlı olanda birden çok satır olabilir
         */
        /*
        hoca anlatırken not almak için ideal
        // singal line
        /* multiline
         */
        /*
        imlecin olduğu satır ctrl+d( double cate) ile alt satıra kopyalanır
         */

        //istediğmiz kodu yoruma almak için başına /* koyup istediğmiz satıra gidip enter yaparsan yoruma alır hepsini

        System.out.println("javacanlara selam olsun");// çalışmasını istemediğimiz satırın başına // yazarak yoruma alınabilir
        System.out.println("javacanlara selam olsun");// çalışmasını istemediğimiz satırın başına // yazarak yoruma alınabilir
        System.out.println("javacanlara selam olsun");// çalışmasını istemediğimiz satırın başına // yazarak yoruma alınabilir
        System.out.println("javacanlara selam olsun");// çalışmasını istemediğimiz satırın başına // yazarak yoruma alınabilir
        System.out.println("kod satırında CTE varsa hata alırsın yani kırmızı çizgimiz:)");
        System.out.print("Erol Demir ");
        System.out.println("36 ");
        System.out.println("Manisa ");
        System.out.println("Manav");
        /*
    TRICK; javada code satırı cümle(statment) sonuna mutlamak ; koyulmalı.
    code satırında kırmızı alt çizgi uyarısı "compile time error" yani CTE uyarı hatası demektir.
    CTE düzeltilmeden code yazılmaz, yazılan code çalışmaz
    TRİCK---Print; yazdırma işleminden sonraki komutu AYNI satırdan devam ettirir
    TRİCK---Println; yazdırma işleminden sonraki komutu ALT satırdan devam ettirir


         */
        /*
        javada boşluk bir karakter olarak tanımlanır
        e r o l _- 10 karakter

         */
        System.out.print("bu ve alttaki yan ayana olacak ");//print alttaki satırı da yanına yazdırır
        System.out.println("  alt 1 ");
        System.out.println("bu altta mı ustte mı");///prıntln alt alta yazdırır
        System.out.println("alt mı");
        System.out.println("aşagı dugru olsun");

    }


}
