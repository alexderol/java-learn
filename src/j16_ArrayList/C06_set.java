package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C06_set {
    public static void main(String[] args) {
        //set(); --> listin istenen elemannı istenen indexe update eder

        ArrayList<String> listSehir = new ArrayList<>(List.of("Münih", "losAngeles", "London", "Stockholm"));
        System.out.println(listSehir.set(3, "Angara"));// set edilen dğer print eder
        System.out.println(listSehir);// listin set edilmiş hali print edildi

        System.out.println(listSehir.set(11, "pataGonya"));//olmayan index set edilirse rte hatası verir
        System.out.println(listSehir);


    }
}
