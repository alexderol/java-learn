package j15_Arrays.odev;

public class _03_Create_array3_int {

    public static void main(String[] args) {

    /*  elemanları   : 25,30,30,35,100 olan   İnt Array oluştur ve
          Array in elemanlarının toplamını yazdır.
          Cevap 220 olmalı.
     */
        int [] arr= {25,30,30,35,100};
        int toplamını=0;
        for (int i = 0; i < arr.length ; i++) {
            toplamını+=arr[i];


        }
        System.out.println("toplamını = " + toplamını);


    }
}