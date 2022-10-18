package j15_Arrays.odev;

import java.util.Arrays;

public class _16_Advance_Array_get_sum {

    public static void main(String[] args) {

        /*
        Bu şekilde bir String oluşturunuz.  "$12 $23 $10 $2 $5 $2"
        $ işaretlerini kaldırın ve sayıları toplayın.
        Sayıların toplamını yazdırın.
         */
        int toplam = 0;
        String arr = "$12 $23 $10 $2 $5 $2";
        String[] para = arr.split("$");
        System.out.println("Arrays.toString(para) = " + Arrays.toString(para));
        for (int i = 0; i < para.length; i++) {


            if (para[i].contains("$")) {
                toplam += Integer.parseInt(para[i].replace("$", ""));

            }
        }
        System.out.println("toplam = " + toplam);
    }


}
