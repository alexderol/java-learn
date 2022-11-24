package j36_Map;

import java.util.HashMap;

public class C11_putIfAbsent {
    public static void main(String[] args) {

        HashMap<String, String> hm = new HashMap<>();
        //map.putIfAbsent();--> girilen key mapde yoksa entry(key,value) map e ekler ve null returnd eder
        //girilen key map de var ise o key in valuesini return eder
        hm.put("Amazon", "296 Euro");
        hm.put("Ebay", "234 Euro");// value degeri null atanabilir
        hm.put("Saturn", "300 Euro");
        hm.put("Vatan", "111 Euro");
        hm.put("Apple store", "333 Euro");
        hm.put("mediaMarkt", "183 Euro");


        System.out.println("hm = " + hm);
        System.out.println("hm.putIfAbsent(\"Amazon\",\"296 Euro\") = " + hm.putIfAbsent("Amazon", "296 Euro"));//296 Euro
        System.out.println("hm.putIfAbsent(\"erol\",\"demir\") = " + hm.putIfAbsent("erol", "demir"));//null verdi ama hm ye ekledi
        System.out.println("hm.putIfAbsent(\"Amazon\",\"500 Euro\") = " + hm.putIfAbsent("Amazon", "500 Euro"));//296 euro verdi ekleme yapmaz
        System.out.println("hm = " + hm);
        // map de girilen key yoksa o key ve value   su eklenir


    }
}
