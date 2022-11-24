package j36_Map;

import java.util.HashMap;

public class C07_containsKey_containsValue {
    public static void main(String[] args) {
        HashMap<String,String> hm = new HashMap<>();
        //map.containskey();--> girilen key dgerinin mapte varlığını kontrol eder
        //map.containsvalue();--> girilen value dgerinin mapte varlığını kontrol boolean return eder

        hm.put("Amazon","296 Euro");
        hm.put("Ebay","234 Euro");// value degeri null atanabilir
        hm.put("Saturn","300 Euro");
        hm.put("Vatan","111 Euro");
        hm.put("Apple store","333 Euro");
        hm.put("mediaMarkt","183 Euro");


        System.out.println("hm = " + hm);

        System.out.println("hm.containsKey(\"Amazon\") = " + hm.containsKey("Amazon"));//true
        System.out.println("hm.containsValue(\"296 Euro\") = " + hm.containsValue("296 Euro"));//true
        System.out.println("hm.containsValue(\"erol\") = " + hm.containsValue("erol"));//false
        System.out.println("hm.containsKey(\"23\") = " + hm.containsKey("23"));//false

        //if acıp sorgulama yapabiliriz


    }
}
