package j17_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C03_ForEachLoop {
    public static void main(String[] args) {

        //TASK-- iki string array elemanlarının  ortak olmasını kontrol eden code create ediniz.

        String arr1[] = {"nazım", "gülsüm", "dilek", "erol", "cüneyt", "cigdem" };
        String arr2[] = {"musty", "gülsüm", "ayse", "enisel", "cüneyt", "cigdem" };

        List<String> aynı = new ArrayList<>();

        for (String a : arr1) {
            for (String b : arr2) {
                if (a.equalsIgnoreCase(b)) {

                    aynı.add(a);


                }

            }


        }
        if(aynı.isEmpty()){//ortak isim lstb boşluk kontrol eder
            System.out.println("ortak isim yok");

        }else System.out.println("aynı = " + aynı);
    }
}