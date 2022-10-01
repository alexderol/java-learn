package j10_StringManipulations.tasks;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        /*
 Task->
 Girilen iki kelimeden ilki çift sayıda kaqrakter içeriyorsa 2. kelimeyi 1. kelimenin ortasına print eden
 ilk kelime tek sayıda karakter içeriyorsa "kelime2 kelime1 eklenemez" print eden code create ediniz
 name1= mehmet
 name2= ahmet
 Print ==> mehahmetmet
 */
        Scanner scan = new Scanner(System.in);
        System.out.println(" Kelime girin");;
        String k1= scan.nextLine();
        System.out.println("bir kelime daha gir");
        String k2 = scan.nextLine();
        if (k1.length()%2==0){
            String yenihal = k1.substring(0,k1.length()/2)+k2+k1.substring(k1.length()/2);
            System.out.println(yenihal);//sout yaparakta direkt içinde işlem yapıp yazdırabilirdik

        }else System.out.println("kelime2 kelime1 eklenemez");


    }
}
