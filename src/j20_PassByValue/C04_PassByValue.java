package j20_PassByValue;

public class C04_PassByValue {
    static double etiketFiyatı;
    static double indirimOranı;


    public static void main(String[] args) {
        /*
        eger bir methodda yapılan değişiklik kalıcı olsun istenirse ;
        1-değişiklik yapılan variable static olarak tanımlanır
        2- diger classta
         */
        System.out.println("*** 1 . yöntem ****\n ");
        etiketFiyatı=200;
        indirimOranı=0.11;
        System.out.println("method call öncesi etiketFiyatı = " + etiketFiyatı);

        indirimYapan();// call ettik methodu

        indirimOranı=0.22;
        indirimYapan();//tekrra call

        indirimOranı=0.5;
        indirimYapan();// tekrar call

        System.out.println("method call sonrası etiketFiyatı = " + etiketFiyatı);

        //etiketFiyatı sürekli değişti çünkü static çünkü her methodu çalışmasında static variable da değişiklik oldu



    }

    private static void indirimYapan() {
        etiketFiyatı*=1-indirimOranı;
        System.out.println("etiketFiyatı = " + etiketFiyatı);
    }
}
