package j34_Iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Task02 {
    public static void main(String[] args) {
        /*
        bir listedeki istenen sayıla aralğında olmayan elemanları silip print eden code create edin
        ex=  [2,13,56,23,45,14,40]
        output [23,40]
         */

        List<Integer> list = new ArrayList<>(Arrays.asList(2,13,56,23,45,14,40));

        ListIterator<Integer> it = list.listIterator();
        while (it.hasNext()){
            int d = it.next();
            if(d>=20 && d<=40) {
                System.out.print(d+" ");
            }
        }





    }
}
