package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C04_Get {
    public static void main(String[] args) {
        // get();--> listede istenen elemanı return eder (arr[3]-> arrr nin 3. inndexdeki elemanı ver gibi diyebiliriz arraydeki gibi  )

        ArrayList<String> listSehir = new ArrayList<>(List.of("Münih", "losAngeles", "London", "Stockholm"));

        System.out.println(listSehir.get(1));//losAngeles
        System.out.println(listSehir.get(11));// olmayan index elemanı rte verir



    }
}
