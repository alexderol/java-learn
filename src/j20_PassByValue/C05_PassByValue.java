package j20_PassByValue;

public class C05_PassByValue {
    public static void main(String[] args) {
        /*
        eger bir methodda yapılan değişiklik kalıcı olsun istenirse ;
        1-değişiklik yapılan variable static olarak tanımlanır
        2- değişikli yapılan variable lar atama tanımlanır
         */

        double etiketFiyatı=100;
        double indirmOranı=0.1;
        System.out.println("method call öncesi = "+ etiketFiyatı);//100

        etiketFiyatı=indirim(etiketFiyatı,indirmOranı);// etiketFiyatına yeni durumu atama yaptık

        System.out.println(" method call sonrasıı "+etiketFiyatı);//90

    }

    private static double indirim(double etiketFiyatı, double indrimOranı) {
        etiketFiyatı*=(1-indrimOranı);
        System.out.println("etiketFiyatı = " + etiketFiyatı);

        return etiketFiyatı;
    }
}
