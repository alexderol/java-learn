package j20_PassByValue;

public class C02_PassByValue {
    public static void main(String[] args) {
        //Task-> verilen fiyat için %11 %22 %33 indirimli fiyatı print eden code create ediniz

        double fiyat = 100;

        System.out.println("method call öncesi fiyat = " + fiyat);//100

        System.out.println("fiyatDegisim11(fiyat) = " + fiyatDegisim11(fiyat));
        System.out.println("fiyatDegisim22(fiyat) = " + fiyatDegisim22(fiyat));
        System.out.println("fiyatDegisim33(fiyat) = " + fiyatDegisim33(fiyat));

        System.out.println("method call sonrası fiyat = "+ fiyat);//100

        //Pass BY Value yani 3 method için 3 vesikalık üretiyor ve methodlara gönderiyor orjinali değişmiyor


    }

    private static double fiyatDegisim33(double fiyat) {
        return fiyat*=0.67;
    }

    private static double fiyatDegisim22(double fiyat) {
        return fiyat*=0.78;
    }

    private static double fiyatDegisim11(double fiyat) {


        return fiyat*=0.89;
    }
}
