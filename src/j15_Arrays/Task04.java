package j15_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        // TASK--> girilen bir int array elamanlarınıdan ortalamadan büyükolanı elamn sayısını print eden code create edin
        Scanner scan = new Scanner(System.in);
        System.out.println("kaç elemanlı array istiyorsunuz");

        int arr[]=new int[scan.nextInt()];//kullanıcı girdisini direk yeni array oluşturduk

        int toplam=0;


        for (int i = 0; i < arr.length; i++) {//koltukları doldurmaya başlıyoruz 0 dan başla
            System.out.print(i+ ". index elemanı giriniz ");
            arr[i]= scan.nextInt();
            toplam+=arr[i];

        }
        System.out.println(" istediğiniz array = " + Arrays.toString(arr)+"\n\n array eleman toplamı toplam= "+toplam);
        int arrOrtalama=toplam/ arr.length;// ortalamayı bulduk
        System.out.println("array ortalama = "+arrOrtalama);
        int ortalamayıGecenElemanSayısı=0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>arrOrtalama){
                ortalamayıGecenElemanSayısı++;

            }

        }
        System.out.println("ortalamayı geçen array eleman sayısı = "+ortalamayıGecenElemanSayısı);





    }
}
