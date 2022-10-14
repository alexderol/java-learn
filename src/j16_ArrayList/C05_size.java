package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C05_size {
    public static void main(String[] args) {


        // Listin eleman sayısını return eder (arr [] deki length gibi yani 1 den length e kadar git dediğimiz gibi )

        ArrayList<String> listSehir = new ArrayList<>(List.of("Münih", "losAngeles", "London", "Stockholm"));
        System.out.println(listSehir.size());// 4 yani eleman sayısını verdi index 0 dan eleman 1 den başlar unutmma



    }


}
