package j36_Map;

import java.util.HashMap;

public class C05_clear_size_isEmpty {
    public static void main(String[] args) {
        HashMap<String,String> hm = new HashMap<>();
        //map.size;--> girilen map in  entry sayısın return eder
        //map.clear;--> girilen map in  entry lerini siler
        //map.isEmpty;--> girilen map in  entry sinin varlığını kontrol eder boolean var yok yani


        hm.put("Amazon","296 Euro");
        hm.put("Ebay","234 Euro");// value degeri null atanabilir
        hm.put("Saturn","300 Euro");
        hm.put("Vatan","111 Euro");
        hm.put("Apple store","333 Euro");
        hm.put("mediaMarkt","183 Euro");


        System.out.println("hm = " + hm);

        System.out.println("hm.size() = " + hm.size());//6
        System.out.println("hm.isEmpty() = " + hm.isEmpty());//false
        hm.clear();
        System.out.println("hm.size() = " + hm.size());//0
        System.out.println("hm.isEmpty() = " + hm.isEmpty());//true


    }

}
