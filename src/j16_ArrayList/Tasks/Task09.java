package j16_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task09 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
    /* TASK :
   Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin
   toplamını bulan code create ediniz.
    */
        ArrayList<Integer> list = new ArrayList<>();
        int girdi=1;
        while (girdi>0){
            System.out.println("karesinin toplamının bulunmasını istedğiniz kadar sayı yazın ancak yeterli sayıdan sonra 0 a basın");
            girdi= scan.nextInt();
            list.add(girdi);
        }
        int toplam=0;
        for (int i = 0; i < list.size(); i++) {
            toplam+=list.get(i)* list.get(i);
        }
        System.out.println("toplam = " + toplam);

    }
}

