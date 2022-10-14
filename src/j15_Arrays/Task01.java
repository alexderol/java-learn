package j15_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        //TASK kullanıcdan alınan değerlerle bir int array create edin ve büyükten küçüğe  print edin

        Scanner scan = new Scanner(System.in);
        System.out.println("kaç elemanlı array istiyorsunuz");
        int arrBoyut = scan.nextInt();
        int arr[]=new int[arrBoyut];// boyutu belirlenmiş boş int array  (ucağın koltuk sayısı yani )

        for (int i = 0; i < arrBoyut; i++) {//koltukları doldurmaya başlıyoruz 0 dan başla arrBoyut a kadar yolcu bindir
            System.out.print(i+ ". index elemanı giriniz ");
            arr[i]= scan.nextInt();
        }
        System.out.println(" istediğiniz array = " +Arrays.toString(arr));// kullanıcıdan alınan değerlerle array oluşturk şimdi büyükten küçüğe sırala
        Arrays.sort(arr);//arr küçükten büyüğüe sıralandı ama tersi isteniyor
        for (int i =arr.length-1 /* en büyük sondaki elemandan döngü başlar */ ; i >=0 ; i--) {// sondaki elemandan başla ilk elemana kadar dön demek
            System.out.print(arr[i]+" ");


        }


    }
}
