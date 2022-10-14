package j15_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        //TASK--> girilen int array elemanları toplamını print eden code create ediniz
        Scanner scan = new Scanner(System.in);
        System.out.println("kaç elemanlı array istiyorsunuz");
        //int arrBoyut = scan.nextInt();
        int arr[]=new int[scan.nextInt()];//kullanıcı girdisini direk yeni oluşturana ekledik

        int toplam=0;


        for (int i = 0; i < arr.length; i++) {//koltukları doldurmaya başlıyoruz 0 dan başla arrBoyut a kadar yolcu bindir
            System.out.print(i+ ". index elemanı giriniz ");
            arr[i]= scan.nextInt();
            toplam+=arr[i];

    }
        System.out.println(" istediğiniz array = " + Arrays.toString(arr)+"\n\n array eleman toplamı toplam= "+toplam);

    }}
