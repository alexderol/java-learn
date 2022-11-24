package j35_Collection.C02_Set;

import java.util.Arrays;
import java.util.LinkedList;

public class Task05 {
    /*
    Task->
   return tipi linkedhashset olan removing() isminde bir method oluşturun.
    Parametre olarak bir LinkedHashset ve iki String ten oluşmalı.
    Eğer Stringler LinkedHashset 'in içinde varsa, silinmeli.

    Örneğin,
    linkedhashset : Germany , France , USA , Canada , Mexico , Brazil
    String 1= Germany
    String 2 = USA
     Germany ve USA 'i sil.
    Set'i return et.
     */
    public static void main(String[] args) {


        System.out.println(removing());


    }

    private static  LinkedList<String> removing() {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("Germany" , "France" , "USA" , "Canada "," Mexico" , "Brazil"));
        System.out.println(list);
        String bir= "Germany";
        String iki = "USA";
        list.remove(bir);
        list.remove(iki);

        return list;
    }
}
