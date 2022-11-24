package j36_Map;

import java.util.HashMap;
import java.util.Scanner;

public class Task08 {
    /*
        ismi update() olan bir method oluşturun.
        Parametreleri , Integer -String HashMap,  int ve String olmalı. (3ayrı parametre)
        return tipi  Integer - String HashMap
        Eğer HashMap, int olan parametreyi içeriyorsa,
        int değerinde var olan String'i güncelleyin.
        Örnek :
         Hash map:
        1, "New jersey"
        2, "New York"
        3, "London"
        4, "Paris"

        int = 3
        String = Miami
        cevap aşağıdaki gibi olmalı:
        1, "New jersey"
        2, "New York"
        3, "Miami"
        4, "Paris"
         */
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "New Jersey");
        map.put(2, "New York");
        map.put(3, "London");
        map.put(4, "Paris");

        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int a = scan.nextInt();
        System.out.println("şehir ismi gir");
        String change = scan.next();

        System.out.println("updaet(map,a,change) = " + updaet(map, a, change));


    }

    private static HashMap<Integer, String> updaet(HashMap<Integer, String> map, int a, String change) {
        if (map.containsKey(a)) map.put(a, change);

        return map;
    }


}
