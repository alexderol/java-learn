package j16_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Scanner;

public class Task08 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        // Task-> Girilen sayıların içinde ortalamadan buyuk olanları print eden METHOD create ediniz.

        ArrayList<Integer> list = new ArrayList<>();

        int sayı = 1;
        while (sayı > 0) {
            System.out.println("istediğniiz kadar sayı girin..yeterli olduğunu düşündüğünüzde 0 a basın");
            sayı = scan.nextInt();
            list.add(sayı);
        }
        Ortalama(list);
    }

    private static void Ortalama(ArrayList<Integer> list) {
        int sum=0;
        int ortalama=0;
        for (int i = 0; i < list.size(); i++) {
            sum+=list.get(i);
            ortalama=sum/ list.size();
        }
        ArrayList<Integer> ortalamadanBüyükler = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)> ortalama){
                ortalamadanBüyükler.add(list.get(i));
            }
        }
        System.out.println("ortalamadanBüyükler = " + ortalamadanBüyükler);


    }


}
