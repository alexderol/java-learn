package j15_Arrays.odev;

import java.util.Arrays;

public class _08_array_min_value {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 14 , 19 , 5 , 21
        En küçük (minimum) sayıyı yazdırınız.
         */

        int [] arr ={14 , 19 , 5 , 21};
        Arrays.sort(arr);
        for (int i = 0; i < 1 ; i++) {
            System.out.println(arr[i]);

        }



    }
}

