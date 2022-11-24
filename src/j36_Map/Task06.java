package j36_Map;

import java.util.HashMap;
import java.util.Scanner;

public class Task06 {
/*
map1() isminde bir method oluşturun.
Parametresi   bir Integer -String map  ve bir int
return tipi String
Tamsayı değerlerini (int) döndürün.
ÖRNEK:
Map:
                1 ,  "Lion"
                2 ,  "Tiger"
                3 ,  "Elephant"
                4 ,  "Cat"
                5  , "Dog"
Integer 3
Cevap Elephant olmalı.
 */



    public static void main(String[] args) {

        HashMap<Integer,String> m1= new HashMap<>();
        m1.put(1,"lion");
        m1.put(2,"Tiger");
        m1.put(3,"Elephant");
        m1.put(4,"Cat");
        m1.put(5,"Dog");
        int a;
        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayı gir");
        a= scan.nextInt();
        System.out.println("map1(m1,a) = " + map1(m1, a));


    }

    private static String map1(HashMap<Integer, String> m1, int a) {
        //String str= m1.get(a);// int key dgeerine karşılık value get eder


        return m1.get(a) ;// value string olduğu icin böyle de yaparız
    }
}
