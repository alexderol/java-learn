package j10_StringManipulations.tasks;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        /*girilen string in son karakterini silen code create edin

         */
        Scanner scan = new Scanner(System.in);
        System.out.println(" kelime gir");
        String str = scan.nextLine();
        System.out.println("son karakteri yazdırma yani ="+ str.substring(0, str.length() - 1));
        //yani substring 0 dan başla length-1 e kadar yazdır yani sonu yazdırma
        //System.out.println(str.replace(str.length() - 1, ""););


    }
}
