package j29_Exceptions.Q01;

import java.util.Scanner;

public class Task01Me {
    /*
    'ortalama' isminde bir method create ediniz ve int v  - int f  isminde 2 adet parametresi olsun.
int v = vize
int f = final

Eğer  vize 100 den büyük, veya final 100'den büyük, veya vize 0'dan küçük, veya final 0'dan küçük ise,
Sistem ArithmeticException hatası versin ve "Notlar 0-100 arasında olmalı" mesajını döndürsün.
Diğer durumlarda ise,
vizenin yüzde 40 ını, finalin yüzde 60 ını alsın ve toplasın.(ortalama =)
vizeye 120, finale 80 girin.

Programın çalışmasını sağlayın. (handle edin)
     */static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int v = 0;
        int f = 0;
        System.out.println("ortalamanız = " + ortalam(v, f));


    }

    private static double ortalam(int v, int f) {
        while (true) {
            try {

                System.out.println("Vize notunnu giriniz");
                v = scan.nextInt();
                if (v > 100 || v < 0) {
                    throw new ArithmeticException();
                } else break;

            } catch (ArithmeticException e) {
                System.out.println("Girilen not 1 ile 100 arası olmalı");
            } catch (Exception e) {
                String str = scan.nextLine();
                System.out.println("hatalı giriş yaptınız sadece rakam kullanınız ve 1 ile 100 arası olmalı");

            }
        }

        while (true) {
            try {
                System.out.println("final notunnu giriniz");
                f = scan.nextInt();
                if (f > 100 || f < 0) {
                    throw new ArithmeticException();
                } else break;

            } catch (ArithmeticException e) {
                System.out.println("Girilen not 1 ile 100 arası olmalı");
            } catch (Exception e) {
                String str = scan.nextLine();
                System.out.println("hatalı giriş yaptınız sadece rakam kullanınız ve 1 ile 100 arası olmalı");
            }
        }
        double notOrtalama=(v * 0.4) + (f * 0.6);
        if(notOrtalama>70){
            System.out.println("başarılı");
        }else{
            System.out.println("başarısız");};


        return (v * 0.4 + f * 0.6);
    }

}
