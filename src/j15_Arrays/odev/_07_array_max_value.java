package j15_Arrays.odev;

import java.util.Arrays;

public class _07_array_max_value {

    public static void main(String[] args) {

        /*
            int Array oluşturun ve elemanları : 12,2,5,15,8
            En büyük değeri yazdırınız.
         */
        int [] Array= {12,2,5,15,8};

        int büyük=0;
        for (int i = 0; i < Array.length; i++) {

            if(Array[i]>büyük){
                büyük=Array[i];

            }
        } System.out.println("büyük = " + büyük);


    }
}

