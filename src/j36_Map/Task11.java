package j36_Map;

import java.util.HashMap;
import java.util.Map;

public class Task11 {
      /*
    Count the words in a String one by one
    Bir Stringdeki kelimeleri saydırıp prnt eden code create ediniz .
    String Str = "Ali came to school and Ayse came to school"
    Ali=            1
    came=   2
    to=         2
    school= 2
    and=    1
    Ayse=   1
*/

    public static void main(String[] args) {

        String str = "Ali came to school and Ayse came to school";
        System.out.println(countWords(str));

    }

    public static Map<String,Integer> countWords(String str){

        Map<String,Integer> myMap = new HashMap<>();
        String arr[] = str.split(" ");

        for (int i = 0; i < arr.length; i++) {
            if(myMap.containsKey(arr[i])) {
                myMap.put(arr[i],myMap.get(arr[i])+1);
            }else {
                myMap.put(arr[i], 1);
            }
        }

        return myMap;
    }
}
