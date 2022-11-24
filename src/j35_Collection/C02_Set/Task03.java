package j35_Collection.C02_Set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Task03 {
    /*
commonValues() isminde bir method oluşturun ve parametresi  2 tane hashset olmalı.
return tipi arraylist olmalı.
ÖRNEĞİN:
İlk Hashset : "Germany" , "England" , "South Africa" , "Brazil" , "USA"
İkinci  hashset  : "Germany" , "China" , "Brazil" , "France" ,  "USA"
Ortak değerleri ArrayListe ekleyiniz.
çıktı:  "Germany" , "Brazil" ,"USA"
ArrayListi yazdırınız.
 */
    public static void main(String[] args) {

        HashSet<String> h1 = new HashSet<>(Arrays.asList("Germany" , "England" , "South Africa" , "Brazil" , "USA"));
        HashSet<String> h2 = new HashSet<>(Arrays.asList("Germany" , "China" , "Brazil" , "France" ,  "USA"));

        System.out.println(cammonValues(h1, h2));//[USA, Brazil, Germany]


    }

    private static ArrayList<String> cammonValues(HashSet<String> h1, HashSet<String> h2) {
        h1.retainAll(h2);//h1 ve h2 kesişen ortak elemanlar h1 e atandı aşağıda da ortak elemanlı oluşan h1 arraylist e atandı ve return ettik
        ArrayList list = new ArrayList<>(h1);

        return list;
    }
}
