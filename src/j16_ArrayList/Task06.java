package j16_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {

        /* TASK :
 Kullanıcıdan alacağınız 6 elemanlı bir dizinin
 sadece tek elemanlarını ayrı diziye bir metodda atayarak
  yazdırınız.

 */
      int sayiArr[]= new int[6];
      Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            System.out.println(i+1+". eleman değeri giriniz");
            sayiArr[i]= scan.nextInt();


        }
        System.out.println("tek sayı elemanları = "+ tekElemanlılar(sayiArr));


    }

    private static ArrayList<Integer> tekElemanlılar(int[] sayiArr) {
        ArrayList<Integer> tekSayılar= new ArrayList<>();// tek sayıların atanacağı boş list açtık
        for (int i = 0; i < sayiArr.length; i++) {
            if(sayiArr[i]% 2 == 1){
                tekSayılar.add(sayiArr[i]);

            }


        }


        return tekSayılar;
    }
}
