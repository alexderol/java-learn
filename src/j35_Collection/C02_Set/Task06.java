package j35_Collection.C02_Set;

import java.util.Arrays;
import java.util.HashSet;

public class Task06 {
    /*
    Task
    totalCount() isminde bir method oluşturun.
    Parametresi  'Integer Hashset' olmalı

    HashSetteki eleman sayısını alın.
    totalCount'u döndürün.
    Örnek:
    hashset ; 4,2,3,1,7
    cevap: 5
     */
    public static void main(String[] args) {


        System.out.println(totalCount());
    }

    private static int totalCount() {
        HashSet<Integer> list = new HashSet<>(Arrays.asList(4,2,3,1,7));


        return list.size();
    }


}
