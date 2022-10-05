package j11_MethodCreation;

import java.util.Scanner;

public class yeniyepyeniucus {
    static Scanner scan = new Scanner(System.in);
    static double fiyatB = 500 * 0.1;
    static double fiyatC = 700 * 0.1;
    static double fiyatD = 900 * 0.1;

    public static void main(String[] args) {
        gezi();


    }

    private static void gezi() {
        System.out.print("hangi şehre gideceksiniz secim yapınız= B , C veya D ");
        String sehir = scan.next().toUpperCase().trim();
        System.out.print("yaşınızı giriniz : ");
        int yas = scan.nextInt();

        switch (sehir) {
            case "B":
                System.out.println(" Bilet fiyatı =" +( yasAralıgı(yas) * gitgel() *fiyatB ));
                break;
            case "C":
                System.out.println("Bilet fiyatı = "+( yasAralıgı(yas) * gitgel() *fiyatC ));

                break;
            case "D":
                System.out.println("Bilet fiyatı = "+( yasAralıgı(yas) * gitgel() *fiyatD ));
                break;
            default:
                System.out.println("hatalı giriş yaptınız!!!");




        }

    }

    private static double gitgel() {
        System.out.println("bilet türünü seçiniz\nTek yön için 1\nÇift yön için 2");
        double nasıl= scan.nextDouble();
        double yönKatSayı=1;
        if (nasıl==1){
            yönKatSayı=0.8*2;
        }else if (nasıl!=1){
            yönKatSayı=1;
        }
        return yönKatSayı;
    }

    private static double yasAralıgı(double yasAralıgı) {
        double yas = 1;
        if (yasAralıgı < 12) {
            yas = 0.5;

        } else if (yasAralıgı > 12 && yasAralıgı < 24) {
            yas = 0.1;
        } else if (yasAralıgı < 65) {
            yas = 0.3;
        } else if (yasAralıgı < 0) {
            System.out.println(" hatalı yaş girdiniz");

        }
        return yasAralıgı;


    }
}
