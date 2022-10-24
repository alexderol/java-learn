package j16_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Scanner;

public class _11_prime_numbers {

    /*
    negatif olmayan bir n sayısı girin ve bu sayıya kadar olan kaç asal sayı var ise yazdırın.

        Örnek 1:
        n = 20

        cevap: 8      ==   (2,3,5,7,11,13,17,19)  20 ye kadar 8 adet asal sayı vardır.
        Örnek2:
        Input(Girdi): 10
        Output(Çıktı): 4
        Explanation(Açıklama): 10'dan küçük 4 adet asal sayı vardır. (2,3,5,7)
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Negetive olmayan bir sayı girin");
        int girilen= scan.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < girilen; i++) {
            list.add(i);
        }
        int count =0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)%2!=0 && list.get(i)%3!=0&&list.get(i)%5!=0){
                System.out.println(i+" ");
                count++;

            };
        } System.out.println(girilen+" sayısından küçük "+count+ " tane asal sayı var");



    }
}
