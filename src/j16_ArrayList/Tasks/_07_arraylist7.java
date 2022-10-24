package j16_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _07_arraylist7 {

    /*
        common_values() isminde bir method oluşturun.
        Parametre olarak 2 tane Integer ArrayList
        Return tipi integer ArrayList olmalı
         İki arraylist alın ve arraylist'teki tüm ortak değerleri döndürün
        Örneğin;
        ArrayList 1:    3 , 2 , 5 , 6
        ArrayList 2:     5 , 8 , 9
        return  5 olmalı

        Örneğin;
        ArrayList 1: 8,7,9,6,7
        ArrayList 2: 6,7,12,3,1
        return 6 ve 7 olmalı
     */

    public static void main(String[] args) {
        ArrayList<Integer> num1 = new ArrayList<>(Arrays.asList(8,7,9,6,7));
        ArrayList<Integer> num2 = new ArrayList<>(Arrays.asList(6,7,12,3,1));

        common_values(num1, num2);


    }

    private static void common_values(ArrayList<Integer> num1, ArrayList<Integer> num2) {
        ArrayList<Integer> son = new ArrayList<>();
        for (int i = 0; i < num1.size(); i++) {
            for (int j = 0; j < num2.size(); j++) {
                if(num1.get(i)== num2.get(j)){
                    son.add(num1.get(i));
                }
            }

        };


    }
}
