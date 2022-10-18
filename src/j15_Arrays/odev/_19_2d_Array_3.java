package j15_Arrays.odev;

import java.util.Arrays;

public class _19_2d_Array_3 {

    public static void main(String[] args) {


        /*
        Aşağıdaki gibi olan bir 2D String Array oluşturunuz.
        [{"new jersey","atlanta","ohio"} ,
        {"Pittsburgh" ,"ohio","new york","ohio"} ,
        {"ohio","new york"}]
        Bütün ohio'ları Florida'yla değiştiriniz.
        Array'i yazdırınız.

         */
        String word[][] = {{"new jersey", "atlanta", "ohio"},
                {"Pittsburgh", "ohio", "new york", "ohio"},
                {"ohio", "new york"}};





        for (int i = 0; i < word.length; i++) {
            for (int j = 0; j < word[i].length; j++) {


                  word[i][j].replace("ohio", "new york");




        }
        System.out.println("Arrays.toString(word) = " + Arrays.deepToString(word));


    }


}}


