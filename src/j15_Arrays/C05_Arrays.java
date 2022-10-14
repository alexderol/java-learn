package j15_Arrays;

import java.util.Arrays;

public class C05_Arrays {
    public static void main(String[] args) {
        //Array copy... copyOf(arr,newLength);-> girilen arr'yin newLength kadar ilk elemanını copyalar

        int sayi[] = {63, 21, 47, 27, 35, 12, 36, 31, 46, 24};

        int yeniArr[] = Arrays.copyOf(sayi, 5);//[63, 21, 47, 27, 35]
        System.out.println("sayı dan 5 eleman kopyalana yeni arr : " + Arrays.toString(yeniArr));//[63, 21, 47, 27, 35]

        int baskaArr[] = Arrays.copyOfRange(sayi, 3, 8);//3 dahil 8 hariç index elemanlar kopyalanır->3.4.5.6.7. index
        System.out.println("sayı arr'den özel kopyalanan baska Arr : " + Arrays.toString(baskaArr));//[27, 35, 12, 36, 31]
// Array'ı belirli bir eleman ile update(set) etme... fill(arr,value);

        Arrays.fill(sayi, 99);//
        System.out.println("sayı arr'i 99 ile full'lenmiş hali : " + Arrays.toString(sayi));//[99, 99, 99, 99, 99, 99, 99, 99, 99, 99]

        Arrays.fill(sayi,3,7,33);//3.4.5.6. index elemanlar 33 ile update edildi
        System.out.println("sayı arr'i 3 ile 7 index arası  33 ile full'lenmiş hali : " + Arrays.toString(sayi));//[99, 99, 99, 33, 33, 33, 33, 99, 99, 99]




    }


}
