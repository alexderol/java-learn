package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C11_contains {
    public static void main(String[] args) {
        //contains(); --> listdeki elemanın varlığıın kontrol eder true/false return eder


        ArrayList<String> listSehir = new ArrayList<>(List.of("Münih", "LosAngeles", "London", "Stockholm"));
        System.out.println(listSehir.contains("Münih"));//true
        System.out.println(listSehir.contains("Gördes"));//false


    }
}
