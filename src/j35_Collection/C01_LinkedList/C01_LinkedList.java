package j35_Collection.C01_LinkedList;

import java.util.*;

public class C01_LinkedList {
    public static void main(String[] args) {
        /*
        LINKEDLİST*******

        1-Linklist de elemanlar "data" ve "adress" olmak üzere iki kısımdan oluşur. Eleman yerine "Node" (düğüm) diye adlandırılır.
        2-Linklist de ilk node data barındırmayan sadece adres bulunduran "head" olarak tanımlanmıştır.
        3-Linklist te son node adres barındırmayan adres kısmı null olan sadece data bulunduran " tail" olarak tanımlanr
        4-Arraylist searching Linklist node ekleme ve silme daha avantajlı.Linklist eleman bulmada index yapısı olmadığından daha hızlıdır
        5-Linklist --> tren vagon ilişkisi baglantısı gibi duşunulebilir..
        6-Collection obj tanımlanırken constructor class (Linklist,Arraylist, set, ..)  olmalı interface (list, queue....) olmamasına dikkat edilmeli
            ancak obj data type olarak paren interface tanımlanabilir...
        7-Linklist class iki tane parent interface den (list, queue) implement etmiştir.
          */

        LinkedList<String> ll1 = new LinkedList<>(Arrays.asList("ebubekir", "Gülsüm", "Adem","İlker","Merve"));//Linklist-->declare ve assaignt yaptık
        //linklist print.....
        System.out.println("ll1 = " + ll1);
        ll1.add("Erol");
        System.out.println(ll1);
        ll1.add(2,"Abdülaziz");
        System.out.println(ll1);
        ll1.addFirst("javaCAN");
        System.out.println(ll1);

        ArrayList<String>ekleme = new ArrayList<>(Arrays.asList("burası eklendi mi"," ya burası","peki ya burasına ne dersin"));
        ll1.addAll(ekleme);
        System.out.println(ll1);
        List<String> ll2 =new LinkedList<>(Arrays.asList("Fatih","Erol","Nur"));
        ll1.addAll(ll2);
        System.out.println(ll1);






    }








}
