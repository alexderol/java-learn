package j36_Map;

import java.util.HashMap;

public class C09_getOrDefault {
    public static void main(String[] args) {
        HashMap<String,String> hm = new HashMap<>();
        //map.getOrDefault();--> girilen key mapde varsa key e ait value yoksa default deger return eder

        hm.put("Amazon","296 Euro");
        hm.put("Ebay","234 Euro");// value degeri null atanabilir
        hm.put("Saturn","300 Euro");
        hm.put("Vatan","111 Euro");
        hm.put("Apple store","333 Euro");
        hm.put("mediaMarkt","183 Euro");


        System.out.println("hm = " + hm);
        System.out.println("hm.getOrDefault(\"Ebay\",\"Buradan bişey Alma\") = " + hm.getOrDefault("Ebay", "Buradan bişey Alma"));//234 Euro ebay mapta olduğu icin valuesunu verdi
        System.out.println("hm.getOrDefault(\"Ebik\",\"Gabık\") = " + hm.getOrDefault("Ebik", "Gabık"));//Ebik mapte yok ancak default olarak "Gabık" girilen value print edildi
        System.out.println("hm = " + hm);//map sonuc olarak değişmedi key ve value da update yok o yüzden aynı

        //


    }



}
