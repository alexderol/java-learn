package j34_Iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

/*
        task -> Verilen bir integer listin tek  elemanrının karesini tersten iteartor  print eden code create ediniz
 */
        List<Integer> list = new ArrayList<>();


        Scanner scan = new Scanner(System.in);
        int eleman = 1;
        while (eleman > 0) {
            System.out.println("sayı giriniz yeterli sayıya ulaştığınızda cıkmak ve sonucu görmek icin 0 a basınız ");
            eleman = scan.nextInt();
            if (eleman == 0) {
                System.out.println("hesaplanıyor.......");
                break;
            } else
                list.add(eleman);
        }
        System.out.println("ilk hal= "+list);

        ListIterator<Integer> it = list.listIterator();
        while (it.hasNext()) {

            it.next();
        }
        while (it.hasPrevious()) {
            int t = it.previous();
            if (t % 2 == 1) {
                t *= t;
                System.out.print(t+" ");
            }
        }

    }


}


