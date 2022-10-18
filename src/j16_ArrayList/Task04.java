package j16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Task04 {
    public static void main(String[] args) {
        /* TASK :

         * Input olarak verilen listteki isimlerden
         * icinde 'a' harfi bulunanlari silen bir code create ediniz.
         *
         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]
         */

        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("Ali", "Veli", "Ayse", "Fatma", "Omer"));
        ArrayList<String> aOlmayanlist = new ArrayList<>();// boş list

        for (int i = 0; i < list1.size(); i++) {
            if (!list1.get(i).toLowerCase().contains("a")) {// listin her bir elemanı a bulundurmuyorsa en baştaki ! bak
                aOlmayanlist.add(list1.get(i));// yeni liste a olmayan eleman eklendi
            }

        }
        System.out.println("aOlmayanlist = " + aOlmayanlist);// biz burada yeni bir list yaptık ama soruda istenen aynı list

        list1.clear();// list1 boşalttık
        list1.addAll(aOlmayanlist);// boşalttığımıza aolmayanlist in elemanlarını list1 e atadık çonkü soru onu istiyor
        System.out.println("list1 = " + list1);/// çıktı ya bak anlarsın


    }
}
