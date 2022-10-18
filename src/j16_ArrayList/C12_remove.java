package j16_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C12_remove {
    public static void main(String[] args) {

        //removes(); --> listden istenen elemanı siler


        ArrayList<String> listSehir = new ArrayList<>(List.of("Münih", "LosAngeles", "London", "Stockholm"));

        System.out.println(listSehir.remove("angara"));//false
        System.out.println(listSehir.remove("London"));//true
        System.out.println(listSehir.remove(1));//LosAngeles
        System.out.println(listSehir);//[münih, Stockholm]
        //System.out.println(listSehir.remove(11));// rte verir

        listSehir.add("Münih");
        listSehir.add("Angara");
        listSehir.add("Münih");
        System.out.println(listSehir);//[Münih, Stockholm, Münih, Angara, Münih]

        listSehir.remove("Münih");// ilk münih silinir
        System.out.println(listSehir);//[Stockholm, Münih, Angara, Münih]

        ArrayList<String> listUlke = new ArrayList<>(List.of("Alamanya", "Amerigonya", "İngiltere", "İsveç"));
        listSehir.addAll(listUlke);
        System.out.println("listSehir = " + listSehir);
        listSehir.removeAll(listUlke);
        System.out.println(listSehir);/// ekledik sonra çıkardık addAll ve removeAll çalıştık yani



    }
}
