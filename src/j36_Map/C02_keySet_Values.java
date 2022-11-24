package j36_Map;

import java.util.HashMap;

public class C02_keySet_Values {
    public static void main(String[] args) {
        HashMap<String,String> hm = new HashMap<>();
        //map.keySet();--> girilen map key degerini set'e atayıp return eder
        //map.value();--> girilen map value degerini coll atayıp return eder
        hm.put("Amazon","296 Euro");
        hm.put("Ebay","234 Euro");// value degeri null atanabilir
        hm.put("Saturn","300 Euro");
        hm.put("Vatan","111 Euro");
        hm.put("Apple store","333 Euro");
        hm.put("mediaMarkt","183 Euro");

        //map sout komutuna parametre olarak print edilir
        System.out.println("hm = " + hm);//{null=222 Euro, saturn=300 Euro, Apple store=500 Euro, ebay=null, mediaMarkt=183 Euro, Amazon=296 Euro, Vatan=111 Euro}

        System.out.println("hm.keySet() = " + hm.keySet());//[Saturn, Ebay, Apple store, mediaMarkt, Amazon, Vatan]
        System.out.println("hm.values() = " + hm.values());//[300 Euro, 234 Euro, 333 Euro, 183 Euro, 296 Euro, 111 Euro]
        System.out.println("**********");
        //Task--> hasmap key ve value dgerlerini satır satır print ediniz..whit loop

        for (String w: hm.keySet() ) {
            System.out.print(w+" ");

        }
        System.out.println();
        for (String w: hm.values() ) {
            System.out.print(w+" ");

        }


    }
}
