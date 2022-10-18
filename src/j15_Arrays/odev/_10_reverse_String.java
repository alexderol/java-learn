package j15_Arrays.odev;

import java.util.Arrays;

public class _10_reverse_String {

    public static void main(String[] args) {

        /*
        Bir String oluşturun : "Hello World"
        Stringi tersten yazdırın ve print edin.
        Cevap böyle olmalı :  "dlroW olleH"
         */
        String kelime = "Hello World";

        String [] arr= kelime.split("");
        System.out.println(Arrays.toString(arr));
        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.print( arr[i]);
        }


    }
}