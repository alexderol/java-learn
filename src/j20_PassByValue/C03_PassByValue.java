package j20_PassByValue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_PassByValue {
    public static void main(String[] args) {
        /*
        java non-primitive(Class array list-->referrans) data turlerinde obj nin kendisi değil de dataları değişirse obj nin referans ve kendisi
        değişmediği dataları değişikliğini kalıcı yapar
         */
        //Task -> list elemanları 24 , 20, 87 olsun iki farklı method ile list elemanlarını updat edip print eden code create ediniz
        //1. method forechle kullan 2. method set () kullan

        List<Integer> list = new ArrayList<>(Arrays.asList(24,20,87));
        System.out.println("method öncesi list = "+ list);//24,20,87
        listUpdat1(list);
        listUpdat2(list);
        System.out.println("method sonrası list ="+ list);//48, 40, 174

        //




    }

    private static void listUpdat2(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i)*2);

        }System.out.println("list = " + list);
    }

    private static void listUpdat1(List<Integer> list) {
        for (Integer a: list) {
            a*=2;
            System.out.println("a = " + a);
        }
    }
}
