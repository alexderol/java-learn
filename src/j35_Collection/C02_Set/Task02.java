package j35_Collection.C02_Set;

import java.util.*;

public class Task02 {
    public static void main(String[] args) {
        ///interview question
        // girilen string datanın karakterlerini alfabetik print ediniz
        //el cevap--> TreeSet e atanır->ilgili collection a çeviririm
        String str ="alilktküüaaeaialymş";
        TreeSet<String> lazım= new TreeSet<>();
        lazım.add(str);

        System.out.println(lazım);



        //hashSet ve treeSet tanımlayıp run surelerini karsılastırınız
        //trick --- run süresi için System.currentTimeMillis(); methodu call edin

        Long tsBasla= System.currentTimeMillis();

        TreeSet<String> ts = new TreeSet<>();
        ts.add("Emine");
        ts.add("Mehmet");
        ts.add("Erol");
        ts.add("Erva");
        ts.add("Hal1ide");
        ts.add("Hali212de");
        ts.add("Hali1212de");
        ts.add("Hali312de");
        ts.add("1");
        ts.add("2");
        ts.add("3");
        Long tsBitir= System.currentTimeMillis();
        System.out.println("treeSet zaman= "+(tsBitir-tsBasla));



        Long hsBasla= System.currentTimeMillis();
        HashSet<String > hs1 = new HashSet<>();
        hs1.add("Emine");
        hs1.add("Mehmet");
        hs1.add("Erol");
        hs1.add("Erva");
        hs1.add("Halide");
        hs1.add("Hali212de");
        hs1.add("Hali1212de");
        hs1.add("Hali312de");
        hs1.add("1");
        hs1.add("2");
        hs1.add("3");
        Long hsBitir= System.currentTimeMillis();
        System.out.println("haSet zaman= "+ (hsBitir-hsBasla));

        //iyi bir javacan icin gelisMAC lazım ::::)))

    }

}
