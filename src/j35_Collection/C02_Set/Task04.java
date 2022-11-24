package j35_Collection.C02_Set;

import java.util.Arrays;
import java.util.HashSet;

public class Task04 {
    /*
    Task
    Parametre olarak bir String HashSet   ve  iki String alan  return type HashSet
    olan  changeSet() isminde bir method oluşturun.
    Eğer HashSet String 1 e sahipse,HashSet'in  String 1 elemanını String 2 ile değiştirin.
    ÖRNEK:
    hashset = "banana" , "strawberry" , "kiwi" , "pineapple"
    String 1 = banana
    String 2 = peach
    CEVAP: "peach" , "strawberry" , "kiwi" , "pineapple"
     */
    public static void main(String[] args) {
        HashSet<String > meyve=new HashSet<>(Arrays.asList("banana" , "strawberry" , "kiwi" , "pineapple"));
        String bir = "banana";
        String iki = "peach";

        System.out.println(changeSet(meyve,bir,iki));


    }
    private static HashSet<String > changeSet(HashSet<String> meyve, String bir, String iki) {

        if(meyve.contains(bir)){
            meyve.remove(bir);

            meyve.add(iki);

        }


        return meyve;
    }



}
