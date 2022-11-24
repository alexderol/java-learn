package j36_Map;

import java.util.HashMap;

public class C06_putAll {
    public static void main(String[] args) {
        HashMap<String,String> hm = new HashMap<>();
        //map.putAll(map);--> girilen map in   istenen map e ekler

        hm.put("Amazon","296 Euro");
        hm.put("Ebay","234 Euro");// value degeri null atanabilir
        hm.put("Saturn","300 Euro");
        hm.put("Vatan","111 Euro");
        hm.put("Apple store","333 Euro");
        hm.put("mediaMarkt","183 Euro");


        System.out.println("hm = " + hm);


        HashMap<String,String> hm1 = new HashMap<>();
        //map.putAll(map);--> girilen map in   istenen map e ekler

        hm1.put("kofteci yusuf","kaburga ızgara");
        hm1.put("starBucks","flat White");// value degeri null atanabilir
        hm1.put("güllüoglu","cennet camuru");
        hm1.put("nusret","dana spagetti");
        hm1.put("Clarusway","bolcana offer");
        hm1.put("javacan","javanaz");


        System.out.println("hm1 = " + hm1);

        hm.putAll(hm1);
        System.out.println("hm = " + hm);
        System.out.println("hm1 = " + hm1);

        //cincix code
        HashMap<String,String> hm2 = new HashMap<>(hm1);// hm2 map hem tanımlandı hemde entry olarak hm1 parametre olarak entry atandı
        System.out.println("hm2 = " + hm2);


    }


}
