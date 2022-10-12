package j15_Arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {
        //array elemanı varlığını kontrol etme....bir eleman array de var mı yok mu yani

        int arr[] = {67, 97, 20, 63, 43, 34, 54, 24, 16, 7, 55, 17};

        int sayi = 34;//array içinde 34 var mı yok mu

        boolean flag = false;//varsa bayrak kalkar true yoksa false bayrak indir
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == sayi) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("aradığınız sayı Arrayin içinde mevcut :)");
        } else System.out.println("aradığınız sayı array da YOK :(");
        //yukarının kısa yolu aşağıda ////

        Arrays.sort(arr);//elemanları sıraladı
        System.out.println(Arrays.toString(arr));//sıralama yazdırdı

        Arrays.binarySearch(arr,34);//arr içinde 34 var mı yok mu yu soruyor..aranan elemanı arayıp indexini return eder
        System.out.println(Arrays.binarySearch(arr, 34));//5 yani 5. index te demek
      //TRİCK---> binarySearch methodu olmayan elemanı çalışırsa sonuç olarak -> eğer bu eleman arrayda olsaydı kaçıncı SIRA da olurdu yu return eder
        System.out.println(Arrays.binarySearch(arr, 29));//-6 sırada olurdu yani



    }
}
