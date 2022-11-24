package j35_Collection.C01_LinkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        /*
        task-> node değerleri "yakup","JavaCAN","teykinay" olan linklist creat ediniz
        girrilen bir String değeri linklistte varlığını kontrol edip varrsa silip "Eleman Halledildi" yoksa "aradıgımız kisi ulaşılamıyor"
        print eden code create ediniz

         */
        LinkedList<String> list = new LinkedList<>(Arrays.asList("yakup","JavaCAN","teykinay"));
        Scanner scan = new Scanner(System.in);
        System.out.println("bir şeyler yazı listeden kontrol edeyim");
        String girdi = scan.nextLine();
        //System.out.println(list.remove(girdi) ? "eleman halledildi" : "aranılan kişiye ulaşılamıyor");
        if(list.remove(girdi)){
            System.out.println("Eleman halledildi");

        }else System.out.println("aradıgımız kisi ulaşılamıyor");



    }
}
