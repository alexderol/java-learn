package j15_Arrays;

import java.util.Arrays;

public class C07_MdArrays {
    public static void main(String[] args) {
      //arr elemanlarını toplayan code create ediniz
        int arr[][] = {
                {1, 2, 3}, //0. kat
                {10, 20}, //1. kat
                {101}//2. kat
        };
        int toplam=0;

        for (int i = 0; i < arr.length ; i++) {//kat
            for (int j = 0; j <arr[i].length ; j++) {//daire katın length ine kadar
                toplam+=arr[i][j];
            }

        }
        System.out.println("arr deki elemanlar toplamı = " + toplam);


    }

}
