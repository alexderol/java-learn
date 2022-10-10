package j12_Loops.C01_WhileLoop.Tasks;

import java.util.Random;
import java.util.Scanner;

public class Task06_sayiBulmaca {

    public static void main(String[] args) {
        // bilgisayara 1 ile 100 arasinda bir sayi tutturun
        // kullanicidan bu sayiyi tahmin etmesini isteyin
        // girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
        // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin
        Scanner scan= new Scanner(System.in);
        Random rnd= new Random();
        int sayi =rnd.nextInt(100);
        int tahmin=0;

        for (int i = 0; i < 1000; i++) {
            System.out.println("pc nin tuttuğu sayıyı tahmin et");
            int user=scan.nextInt();
            tahmin++;
            if(user==sayi){
                System.out.println("sayıyı bildin");
                break;
            }else if(user<sayi){
                System.out.println("Daya büyük sayı gir");

            }else if(user>sayi){
                System.out.println("Daha küçük sayı gir");
            }
        }
        System.out.println("\n\n"+tahmin+". tahmindne bildiniz");





    }

}
