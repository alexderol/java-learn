package j36_Map;

import java.util.HashMap;
import java.util.TreeMap;

public class C13_TreeMap {
    /*+
    TreeMap->
    1-TreeMap keylerde null deger tanımlanamaz.Fakat value larda null deger tanımlanabilir.
    2-TreeMap elemanlarının key NATUREL ORDER   a  göre tanımlar
    3-TreeMap synchronized ve thread-safe değildir
    4-TreeMap en yavas map turudur. app hızı icin kullanırken coook dikkat edilmeli
     */

    public static void main(String[] args) {
        TreeMap<Integer,String> tm = new TreeMap<>();
        tm.put(101,"uğur");
        tm.put(102,"Enise");
        tm.put(103,"Kevser");
        tm.put(104,"Fatih");
        tm.put(105,"Emine");
        System.out.println(tm);//{101=uğur, 102=Enise, 103=Kevser, 104=Fatih, 105=Emine} key e göre natural sıralar
        //tm.put(null,"Emine");//NullPointerException
        tm.put(104,"Hüma");
        tm.put(107,null);
        System.out.println(tm);//{101=uğur, 102=Enise, 103=Kevser, 104=Hüma, 105=Emine, 107=null}

        HashMap<String,String> hm = new HashMap<>();

        hm.put("Amazon","296 Euro");
        hm.put("saturn","300 Euro");
        hm.put("Vatan","111 Euro");
        hm.put("Apple ","333 Euro");
        hm.put("Apple store","500 Euro");
        hm.put("mediaMarkt","183 Euro");




        TreeMap<String,String> tm1 = new TreeMap<>(hm);
        System.out.println(tm1);//{Amazon=296 Euro, Apple =333 Euro, Apple store=500 Euro, Vatan=111 Euro, mediaMarkt=183 Euro, saturn=300 Euro}


        //ceilingKey-->encuku abi - abla
        System.out.println(tm.ceilingKey(103));//103 verdi---> method parametre olarak girilen key deger mapde varsa return eder yoksa parametreden büyük en kucuk key degerini rutturn eder
        System.out.println(tm.ceilingKey(108));//null
        System.out.println(tm.ceilingKey(100));//101 yazar cünkü 100 den büyük mapteki en kucuk key i getirir yani 101
        System.out.println(tm.ceilingKey(1));//101 yazar cünkü 1 den büyük mapteki en kucuk key i getirir yani 101

        //ascending order->artan sıralama
        //descending order->azalan sıralama
        System.out.println(tm.descendingKeySet());//[107, 105, 104, 103, 102, 101]

        System.out.println(tm.firstKey());//101
        System.out.println(tm.lastKey());//107


    }




}
