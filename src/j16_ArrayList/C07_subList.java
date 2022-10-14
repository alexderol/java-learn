package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C07_subList {
    public static void main(String[] args) {
        ArrayList<String> listSehir = new ArrayList<>(List.of("Münih", "losAngeles", "London", "Stockholm","Angara","pataGonya"));

        //subList(); --> listden istenen list parçasını return eder

        System.out.println(listSehir.subList(3, 5));//3 ve 4. index elemanları verecek ("Angara","pataGonya")


        ArrayList<String> city = new ArrayList<>(listSehir.subList(2,5));//listSehir den 2. 3. ve 4. index i alıp city liste e ekleyecek[London, Stockholm, Angara]
        System.out.println(city);



    }
}
