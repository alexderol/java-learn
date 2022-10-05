package j11_MethodCreation;

import java.util.Scanner;

public class Task14 {
    /*
Fazla mesaiyi hesaplayan bir  method create ediniz
Yazacağınız program toplam kazancı return etsin.

Kullanıcıdan saatlik çalışma ücretini, hangi saatler arasında çalıştığını ve
fazla mesaiye kalırsa kazancını kaç ile katlayacağını alalım.

Daha sonra şu şekilde bir program yazınız :

Örnek :
saatlik çalışma ücreti : 40.0
hangi saat başladı : 9.0
hangi saat bitti : 20.0
mesaiyi kaçla katlayacağız : 1.8

ucretHesapla(9.0,20.0,40.0,1.8);

9 ile 17 arasında toplam çalışma 8 saat olduğu için 8 x 40 = 320
17 ile 20 arasında toplam çalışma 3 saat olduğu için 3 x 40 x 1.8 =  216

toplam = 536.0
*/
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("mesai başlama saatinizi yazınız");
        double baslama= scan.nextDouble();
        System.out.println("mesai bitis saati yazınız ");
        double bitis= scan.nextDouble();

        System.out.println("mesai saat ücretini yazınız ");
        double saatÜcreti= scan.nextDouble();

        
        
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
        System.out.println("fazla mesai ücret kat sayısı yazınız ");
        double fazlaMesaiKat= scan.nextDouble();

        System.out.println(ucretHesapla(9.0, 20.0, 40.0, 1.8));//static
        System.out.println(ucretHesapla(baslama, bitis, saatÜcreti, fazlaMesaiKat));//dynamic


    }

    private static double ucretHesapla(double start, double finish, double price, double priceExtra) {
        double yevmiye1=(17-start)*price;
        double yevmiye2=(finish-17)*price*priceExtra;


        return yevmiye1+yevmiye2 ;
    }
}
