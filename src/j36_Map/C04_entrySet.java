package j36_Map;

import java.util.HashMap;
import java.util.Map;

public class C04_entrySet {
    public static void main(String[] args) {
        HashMap<String,String> hm = new HashMap<>();
        //map.entrySet;--> girilen map in key value tüm datalarını sete atayıp return eder
        //girişleri sete at return yap demek

        hm.put("Amazon","296 Euro");
        hm.put("Ebay","234 Euro");// value degeri null atanabilir
        hm.put("Saturn","300 Euro");
        hm.put("Vatan","111 Euro");
        hm.put("Apple store","333 Euro");
        hm.put("mediaMarkt","183 Euro");


        System.out.println("hm = " + hm);//{Saturn=300 Euro, Ebay=234 Euro, Apple store=333 Euro, mediaMarkt=183 Euro, Amazon=296 Euro, Vatan=111 Euro}
        System.out.println("hm.entrySet() = " + hm.entrySet());//[Saturn=300 Euro, Ebay=234 Euro, Apple store=333 Euro, mediaMarkt=183 Euro, Amazon=296 Euro, Vatan=111 Euro]

        for (Map.Entry<String,String> w:hm.entrySet()) {//entrySet ile gelen key value loop icin Entry<String,String> data
            System.out.println("w.getValue() = " + w.getValue());

        }



    }
}
