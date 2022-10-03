package j10_StringManipulations.tasks.tasks;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {

        /*
        Girilen String'in son karakterini silen code create ediniz...
         */



        Scanner sc = new Scanner(System.in);

        System.out.print("bir metin giriniz : ");
        String str = sc.next();

        System.out.println(str.substring(0, str.length() - 1));
        System.out.println((str.substring(0,str.length()-1)));



    }
}
