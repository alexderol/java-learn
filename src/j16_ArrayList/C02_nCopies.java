package j16_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C02_nCopies {
    public static void main(String[] args) {

        ArrayList<String> listUlke= new ArrayList<>(List.of("Alamanya", "Amerigonya", "İngiltere", "İsveç"));
        ArrayList<String> listSehir= new ArrayList<>(List.of("Münih", "losAngeles", "London", "Stockholm"));

        // nCopies (int, obj); --> int elemanlı bir

        ArrayList<String> yeniList = new ArrayList<>(Collections.nCopies(7,"JavaCAN"));//
        System.out.println(yeniList);//[JavaCAN, JavaCAN, JavaCAN, JavaCAN, JavaCAN, JavaCAN, JavaCAN] n tane kopya alır

        // addAll();---> bir liste diğer listi olduğu gibi ekler...hepsini ekle işte
        listUlke.addAll(listSehir);// ülke list sonuna şehir list tamamen eklendi
        System.out.println(listUlke);//[Alamanya, Amerigonya, İngiltere, İsveç, Münih, losAngeles, London, Stockholm]

        listSehir.addAll(3,listUlke);//3. indexten itibaber ülke listi şehir listine eklenecek
        System.out.println(listSehir);//

        //TASK--> 1 den 10 a kadar sayıları bir liste atayıp print eden code create ediniz

        ArrayList<Integer>list1 = new ArrayList<>();
        for (int i=1; i<=10;i++ ){
            list1.add(i);
        }
        System.out.println(list1);


    }
}
