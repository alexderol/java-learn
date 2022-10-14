package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C08_isEmpty_Clear {
    public static void main(String[] args) {

        //isEmpty(); --> listin boş olmasını kontdrol eder true/false return eder
        //Clear(); --> listin bütün elemanlarını silerrr

        ArrayList<String> listSehir = new ArrayList<>(List.of("Münih", "losAngeles", "London", "Stockholm","Angara","pataGonya"));

        System.out.println(listSehir.isEmpty());//liste boş mu eğer boşsa true alırız doluysa false alırız burada false aldık çünkü dolu

        listSehir.clear();//listedekileri siler

        System.out.println(listSehir);// silindiği için boş yazdırır []

        System.out.println(listSehir.isEmpty());//true çıkar çünkü artık burası boş


    }
}
