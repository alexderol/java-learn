package j36_Map;

import java.util.Hashtable;

public class C12_HashTable {
    public static void main(String[] args) {
        /*
        HashTable->
        HashMap e kullanılan tüm methodlar hashTable obj ile de call edilir
        1- HashMap ve TreeMap  thread-safe ve synchronized olmadığı icin Map lar arasında thread-safe ve synchronized
        olan bir map e ihtiyac olduğundan HshTable tanımlanmıştır
        2-HashTable hash Map e göre daha yavastır
        3-HashTable key ve value larda null degere izin vermez.
        4-HashTable eleman ataması yapılırken HashMap gibi hurra taktiği ile random yapar

         */
        Hashtable<String,String> ht = new Hashtable<>();

        ht.put("kebap","adana");
        ht.put("döner","sivas");
        ht.put("köfte","tekirdag");
        ht.put("corba","beyran");
        ht.put("sogus","");
        System.out.println(ht);//{köfte=tekirdag, corba=beyran, döner=sivas, kebap=adana, sogus=}
        ht.put("döner","dönerse senindir");// döner key update edilir. dublicate değil üzerine value ataması yapılır.
        System.out.println(ht);//{köfte=tekirdag, corba=beyran, döner=dönerse senindir, kebap=adana, sogus=}

       // ht.put(null,"trilece");
        //System.out.println(ht);//NullPointerException

        Hashtable<String,String> ht1 = new Hashtable<>();

        ht1.put("salata","patlıcan közleme");
        ht1.put("ara sıcak","icli köfte");

        ht.putAll(ht1);
        System.out.println(ht);//{köfte=tekirdag, salata=patlıcan közleme, corba=beyran, döner=dönerse senindir, ara sıcak=icli köfte, kebap=adana, sogus=}


    }
}
