package j36_Map;

import java.util.HashMap;
import java.util.Map;

public class Task09 {

    /*
     Task-> aşağıdaki çıktıyı print eden code create ediniz.
     Kiraz 100
     İncir 200
     Enginar 150
     Üzüm 145
     Nar 250

     */

    public static void main(String[] args) {


        Map<String, Integer> hm = new HashMap<>();

        hm.put("Kiraz", 100);
        hm.put("İncir", 200);
        hm.put("Enginar", 150);
        hm.put("Üzüm", 145);
        hm.put("Nar", 250);

        for (Map.Entry<String, Integer> hm2 : hm.entrySet()) {
            System.out.println(hm2.getKey() + " " + hm2.getValue());

        }

    }
}
