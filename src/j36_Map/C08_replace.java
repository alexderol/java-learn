package j36_Map;

import java.util.HashMap;

public class C08_replace {
    public static void main(String[] args) {
        HashMap<String,String> hm = new HashMap<>();
        //map.replace();--> girilen value dgeri ilgili Key de update edilir return eder

        hm.put("Amazon","296 Euro");
        hm.put("Ebay","234 Euro");// value degeri null atanabilir
        hm.put("Saturn","300 Euro");
        hm.put("Vatan","111 Euro");
        hm.put("Apple store","333 Euro");
        hm.put("mediaMarkt","183 Euro");


        System.out.println("hm = " + hm);
        System.out.println("hm.replace(\"Amazon\",\"296 Euro\",\"314 Euro\") = " + hm.replace("Amazon", "296 Euro", "314 Euro"));
        System.out.println("hm = " + hm);

        //replace eski value yeni value ile update et demek
        System.out.println("hm.replace(\"erol\",\"demir\") = " + hm.replace("erol", "demir"));//null

    }
}
