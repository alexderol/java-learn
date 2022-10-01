package j10_StringManipulations.tasks.tasks;

import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {

		/*  TASK :
				StringMethods:
				girilen  bir strngin ilk yarisini print eden code create ediniz
	    	    ORNEK:
		     	INPUT :istanbul
				OUTPUT :ista
	    */Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen cift uzunlukta bir str giriniz :");
        String str=scan.nextLine();
        if (str.length()%2==0) {
            System.out.println("strnin ilkyarisi:" +str.substring(0,str.length()/2));
        } else {
            System.out.println("Lutfen cift uzunlukta  str giriniz :");
        }

    }
}
