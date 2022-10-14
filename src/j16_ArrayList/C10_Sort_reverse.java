package j16_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C10_Sort_reverse {
    public static void main(String[] args) {
        //collections().sort(list); --> verilen listi naturel sıralama return eder
        //collections().reverse(list) ; --> verilen listin ters sıralamasını return eder


        ArrayList<String> listSehir = new ArrayList<>(List.of("Münih", "LosAngeles", "London", "Stockholm"));

        System.out.println(listSehir);// sıralama öncesi[Münih, LosAngeles, London, Stockholm]
        Collections.sort(listSehir);// A dan Z ye sıralar
        System.out.println(listSehir);//sıralama sonrası[London, LosAngeles, Münih, Stockholm]


        Collections.reverse(listSehir);// sıralama ters çevrilir--> Z den A ya sıralar
        System.out.println(listSehir);//[Stockholm, Münih, LosAngeles, London]
        ArrayList<String> listUlke = new ArrayList<>(List.of("Alamanya", "Amerigonya", "İngiltere", "İsveç"));

        System.out.println(listUlke);//ters öncesi
        Collections.reverse(listUlke);//
        System.out.println(listUlke);//sıralamalar ascii değerine göre yapar java


    }
}
