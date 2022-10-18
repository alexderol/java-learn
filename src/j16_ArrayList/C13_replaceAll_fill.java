package j16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class C13_replaceAll_fill {
    public static void main(String[] args) {
        ArrayList<Integer> lisSayi = new ArrayList<>(Arrays.asList(1,24,14,19,60,1,55,27,1,38));
        System.out.println("lisSayi replace öncesi = " + lisSayi);
        Collections.replaceAll(lisSayi,1,20);//lisSayi da tüm elemanlarda  1 yerine 20 atandı
        System.out.println("lisSayi replace sonrası = " + lisSayi);


        //fillllllllllllllllllllllllllllllllllllllllllllllllll
        System.out.println("lisSayi fill öncesi = " + lisSayi);
        Collections.fill(lisSayi,33);// lisSayi daki tüm elemanları istenilen değer update eder.. burada hepsi 33 oldu
        System.out.println("lisSayi fill sonrası = " + lisSayi);




    }
}
