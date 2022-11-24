package j35_Collection.C01_LinkedList;

import java.util.LinkedList;

public class C02_LinkedList {
    public static void main(String[] args) {
        LinkedList<Object> list = new LinkedList<>();//data Object olduğu için herşeyi alır icine hz Adem yani
        //bad practice application cok yavaşlatır
        //specific datalar çalışır genelde cünkü hız önemli

        list.add("Nazım");
        list.add("$");
        list.add(1907);
        System.out.println(list);







    }
}
