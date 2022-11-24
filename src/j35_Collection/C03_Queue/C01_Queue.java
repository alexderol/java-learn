package j35_Collection.C03_Queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class C01_Queue {
    public static void main(String[] args) {
        /*
        Queue collection da elemanlar interface olduğu icin child class olan Linklist veya PriorityQueue ile ojb uretilir
        Eczrane yemekhane vs belirli bir şart ile aksiyon alan elemanlar icin kullanılır.
        Constructor secimine göre (cons dan kasıt Linklist ve PriorityQueue ) obj özellikleir belirlenir
        FİFO (first in first out) --> collection ilk giren eleman ilk cıkar

         */
        Queue<String>q1= new LinkedList<>(Arrays.asList("Cebrail","Sümeyra","Yakup","Muharrem"));
        System.out.println("q1= "+q1);//[Cebrail, Sümeyra, Yakup, Muharrem]
        q1.add("erol");
        System.out.println("q1 = " + q1);//[Cebrail, Sümeyra, Yakup, Muharrem, erol]

        Queue<String>q2= new PriorityQueue<>(Arrays.asList("JavaCAN","JavaSU","JavaNAZ","JavİYE"));
        System.out.println("q2 = " + q2);
        q2.add("java");
        System.out.println("q2 = " + q2);

        System.out.println("q1.element() = " + q1.element());//sıranın ilk elemanını verir
        System.out.println("q1.peek() = " + q1.peek());//sıranın başındaki elemanı verir boşsa null verir
        System.out.println("q1.remove() = " + q1.remove());//cebrail
        System.out.println("q1.poll() = " + q1.poll());//sümeyra verdi cünkü bi önce remove yaptıkya o yüzden cebrail i sildi ama cebrailden önceki peek ilk elemanı verdi ancak cebraili silmedi remove sildi amaa

        /*
        peek--> copy-paste gibi ilk elemanı return eder ama silmez
        poll--> cut-paste gibi ilk elemanı siler return eder
        element-> ilk elemanı silmeden return eder
        remove--> ilk elemanı siler return eder
        !!!!TRick--->poll ve remove farkı şudur--> eğer queue Collections bos ise remove exception fırlatır.
                                                --->   pool ise null return eder
        */

        q1.clear();//q1 elemanları silindi
        System.out.println("q1.size() = " + q1.size());//0
        System.out.println("q1.poll() = " + q1.poll());//null
        //System.out.println("q1.remove() = " + q1.remove());//NoSuchElementException

        /*
        offer--> queue collection a eleman eklemek icin kullanılır
         */
        System.out.println("q2.offer(\"küşneme\") = " + q2.offer("küşneme"));//true
        /*
        trick---> offer ve add farkı--> eger queue collection da eleman kısıtlaması yapılmış ise add methodu  noSuchElementException fırlatır
        offer ise true-false return eder
         */


    }


}
