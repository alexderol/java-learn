package j16_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.awt.Color.blue;

public class _04_arraylist4 {

    /*
        İsmi changeInArraylist() olan bir method oluşturun.
        Parametre olarak String ArrayList, String s1, String s2
           Arraylist'te s1'i s2 olarak değiştirin

        Return String arrayList

        Örneğin;
        Arraylist  "yellow" , "red" , "blue" , "red" , "blue"
        s1 = blue
        s2 = yellow
        Tüm blue 'ları yellow'a dönüştürün.
        cevap: "yellow" , "red" , "yellow" , "red" , "yellow"
     */

    public static void main(String[] args) {
       ArrayList<String> list= new ArrayList<>(Arrays.asList("yellow" , "red" , "blue" , "red" , "blue"));
        String s1="blue";
        String s2="yellow";

        System.out.println("changeInArraylist(list,s1,s2) = " + changeInArraylist(list, s1, s2));


    }

    private static ArrayList<String> changeInArraylist(ArrayList<String> list, String s1, String s2) {
        Collections.replaceAll(list,s1,s2);
        return list;
    }


}
