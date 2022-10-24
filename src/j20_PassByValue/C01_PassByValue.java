package j20_PassByValue;

public class C01_PassByValue {
    public static void main(String[] args) {
        /*
        java , Pass By Value bir programlama dilidir
        Bir primitive variable argument olarak bir methoda call edeildiğinde variable değil bir copy yani clone
        değeri (pointer) gönderilir
         */

        //Task -> verilen fiyat için %24 arttırılmış fiyatı print eden method create ediniz

        double fiyat = 100;// primitive double type variable
        System.out.println("fiyat method call öncesi değeri = " + fiyat);//100

        fiyatArtır(fiyat);// fiyat variable methoda parametre call edildi

        System.out.println("method call sonrası fiyat değeri = "+fiyat );//100

        // method öncesi ve sonrrası değer değişmedi bu işte pass By Value dur




    }

    private static void fiyatArtır(double bisey) {
        bisey*=1.24;
        System.out.println("arttırılmış fiyat = "+bisey);


    }


}
