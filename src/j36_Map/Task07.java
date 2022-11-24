package j36_Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Task07 {

    /*
    returnKey() isminde bir method oluşturun.
    Parametresi     String-Integer HashMap olsun.
    Return tipi Array List olsun.
    Hashmap:
                       "Lion",     1
                       "Tiger",    2
                       "Elephant", 3
                       "Cat",      4
                       "Dog",      5
    Tüm ANAHTARLARI(Keys) for döngüsü ile döndürün.
     */

    public static void main(String[] args) {
        HashMap<String,Integer> m1= new HashMap<>();
        m1.put("lion",1);
        m1.put("Tiger",2);
        m1.put("Elephant",3);
        m1.put("Cat",4);
        m1.put("Dog",5);

        System.out.print(returnKeygen(m1));


    }

    private static ArrayList returnKeygen(HashMap<String, Integer> m1) {
        ArrayList<String>arr = new ArrayList<>();
        for (Map.Entry<String,Integer> w: m1.entrySet()) {
            arr.add(String.valueOf(w));

        }


        return arr;
    }
}

