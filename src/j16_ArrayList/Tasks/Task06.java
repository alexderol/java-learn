package j16_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
         /* TASK :
        Kullanıcıdan alacağınız 6 elemanlı bir dizinin
        sadece tek elemanlarını ayrı diziye bir metodda atayarak
         yazdırınız.

        */

        int sayiArr[]=new int[6];
        Scanner sc =new Scanner(System.in);
        for (int i = 0; i < sayiArr.length; i++) {
            System.out.print(i+1+". elemanı agam giresen :");
            sayiArr[i]= sc.nextInt();
        }
        System.out.println("tekElemanlar(sayiArr) = " + tekElemanlar(sayiArr));
    }//main sonu

    private static ArrayList<Integer> tekElemanlar(int[] sayiArr) {

        ArrayList<Integer> tekSayilar = new ArrayList<>();//tek sayıları atanacagı boş list
        for (int i = 0; i < sayiArr.length; i++) {
            if (sayiArr[i] %2==1) {//array elemamlrın tek olma şartı
              tekSayilar.add(sayiArr[i]);//tek olma şartı sağlayan array elemanı liste atandı
            }
        }

    return tekSayilar;
    }
}
