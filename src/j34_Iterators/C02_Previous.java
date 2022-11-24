package j34_Iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class C02_Previous {
    public static void main(String[] args) {

        List<Integer> l1 = new ArrayList<>(Arrays.asList(24, 38, 9, 11, 7, 27, 23));


        System.out.println("l1 ilk hali--> " + l1);

        ListIterator<Integer> it1 = l1.listIterator();
        while (it1.hasNext()) {//ilk önce pointie sona götürdük
            it1.next();
        }
        while (it1.hasPrevious()) {//sonra da pointer sonda iken bi öncesinde eleman var mı diye sorduk ve yazdırdık
            System.out.print(it1.previous() + " ");

        }

        //TRİCK previous calışması için önce hasNext calışmalı cünkü pointer sona gitmeli sonra geriye gelmeli previous ile


        List<String> l2 = new ArrayList<>(Arrays.asList("cagla", "ugur", "muharrem", "cebrail"));
        //l2 sonuna :) ekle
        System.out.println("önce l2-->" + l2);

        ListIterator<String> it2 = l2.listIterator();

        while (it2.hasNext()) {
            String s = it2.next();
            if (!it2.hasNext()) {//sonrasında eleman yoksa yani son elemansa demek
                it2.set(s + ":)");
            }


        }
        System.out.println("sonrası -->" + l2);
        /*
        hasprevious method için KESİNLİKLE hasNext ve next methodları calıştırılarak pointer sonra götürülmeli
        ve sonra previous ile geri geri geldirilmeli

        ITERATORS **************
        1-sadece hasNext, next, remove, calısır
        2-tüm collection (list, st array, map vs ....) için tanımların
        3-sadece ileri bastan->sona doğru tekrarlar
        4-kapsam geniş aksiyon az

        LİSTİTERATORS**********
        1-hasNext, next, remove, hasPrevious, previous, set etc.. methodlar calısır
        2-sadece list yapılanrda tanımlanır
        3-bastan <--> sona (cift yönlü) tekarlar
        4-kapsamı dar ama aksiyonu cok

        */


    }
}
