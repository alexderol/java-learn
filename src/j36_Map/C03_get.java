package j36_Map;

import java.util.HashMap;

public class C03_get {
    public static void main(String[] args) {
        HashMap<String,String> hm = new HashMap<>();
        //map.get(key);--> girilen map key degerinin valuesunu return eder

        hm.put("Amazon","296 Euro");
        hm.put("Ebay","234 Euro");// value degeri null atanabilir
        hm.put("Saturn","300 Euro");
        hm.put("Vatan","111 Euro");
        hm.put("Apple store","333 Euro");
        hm.put("mediaMarkt","183 Euro");


        System.out.println("hm = " + hm);
        System.out.println("hm.get(\"Ebay\") = " + hm.get("Ebay"));//234 Euro
        System.out.println("hm.put(\"erol\") = " + hm.get("erol"));//null çünkü dger yok
        System.out.println("hm.put(\"12\") = " + hm.get(12));//null  verdi key data type farketmeksizin olmayan için null return eder




    }
}
