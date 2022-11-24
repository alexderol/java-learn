package j35_Collection.C03_Queue;

import java.util.*;

public class C02_Deque {
    public static void main(String[] args) {
        /*
        Deque-->double anded queue--< Queue larda---> FİFO ,Deque larda---> FİFO ve LİFO
        LİFO: last in first out
         */
        Deque<String> dq1 = new LinkedList<>(Arrays.asList("küsleme","önkol","böbrek yatagı","ezme","haydari"));
        dq1.add("humus");
        System.out.println("dq1 = " + dq1);//LinkedList olduğu için sona ekledi

        System.out.println("dq1.getFirst() = " + dq1.getFirst());//ilk elemanı getirir eleman yoksa exception fırlatır
        System.out.println("dq1.getLast() = " + dq1.getLast());///son elemanı getirdi elemon yoksa exception fırlatır

        System.out.println("dq1.peekFirst() = " + dq1.peekFirst());//ilk elemanı verir ama silmez boşsa null verirdi
        System.out.println("dq1.peekLast() = " + dq1.peekLast());//son elemanı verir ama silmez boşsa null verir

        dq1.clear();
       // dq1.getFirst();
        dq1.peekFirst();
        System.out.println("app devam get olsaydı exception alacaktık ama peekFirst null dedi devam dedi");

        Deque<String> dq2 = new LinkedList<>(Arrays.asList("havuc dilimli","güllac","su muhallebi","trilece","kazan dibi"));

        System.out.println("dq2.pollFirst() = " + dq2.pollFirst());
        System.out.println("dq2.pollLast() = " + dq2.pollLast());

        System.out.println("dq2.removeFirst() = " + dq2.removeFirst());
        System.out.println("dq2.removeLast() = " + dq2.removeLast());


        //remove larda eleman yoksa exception alırsın ama poll kullanırsan null alırsın fark bu code kırılmaz pollda



    }


}
