package j11_MethodCreation;

import java.util.Scanner;

public class C05_RecursiveMethod {
    public static void main(String[] args) {
        /*
Recursive  call edildiğinde run time'da programa ekstradan yük getiren bir yapıdadır
çünkü bir fonksiyon kendi kendini çağırdığında her çağırmada yığında (stack) bir işlem gerçekleşir ve bir bellek konumu oluşur.
Bu yüzden özyineleme ile yapılan hesaplamalar daha yavaş ve verimsizdir.
Peki özyinelemeyi neden kullanıyoruz?
Bazı karmaşık çözülmesi güç problemlerde döngülere göre daha kısa ve anlaşılır olduğu için.
 */
        //TASK---> faktoriyel girilen sayıdan 1 e kadar olan tam sayıların carpımıdır.
        //girilen sayının faktöriyelini hesaplayan method create edin
        Scanner scan = new Scanner(System.in);
        System.out.println("faktöriyelini hesaplanmasını istediğiniz sayıyı girin");
        int sayi = scan.nextInt();
        System.out.println(faktöriyel(sayi));


    }//

    public static int faktöriyel(int a) {
        if (a >= 1) {
            return a * faktöriyel(a - 1);//recursive call
        } else return 1;


    }
}
