package j36_Map;

import java.util.HashMap;

public class C10_remove {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        //map.remove();--> girilen entry may de var ise siler ve true return eder yoksa false return eder
//parametre olarak sadece key deger girilirse key varsa siler ve silinen key in valuesunu return eder, yoksa null return eder
        hm.put("Amazon", "296 Euro");
        hm.put("Ebay", "234 Euro");// value degeri null atanabilir
        hm.put("Saturn", "300 Euro");
        hm.put("Vatan", "111 Euro");
        hm.put("Apple store", "333 Euro");
        hm.put("mediaMarkt", "183 Euro");


        System.out.println("hm = " + hm);//{Saturn=300 Euro, Ebay=234 Euro, Apple store=333 Euro, mediaMarkt=183 Euro, Amazon=296 Euro, Vatan=111 Euro}
        System.out.println("hm.remove(\"Amazon\") = " + hm.remove("Amazon", "296 Euro"));//true
        System.out.println("hm.remove(\"Amazon\") = " + hm.remove("Amazon", "500000 Euro"));//false
        System.out.println("hm.remove(\"Amazon\") = " + hm.remove("Amazon", "ebik"));//false
        System.out.println("hm.remove(\"Vatan\") = " + hm.remove("Vatan"));//111 Euro silindi
        System.out.println("hm = " + hm);//{Saturn=300 Euro, Ebay=234 Euro, Apple store=333 Euro, mediaMarkt=183 Euro}


    }
}
