package j10_StringManipulations.tasks;

        import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {

        /* TASK :
         * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olup olmadigina bakiniz e.g: ala => 3
         * Test data: ali eme all
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir isim yazınız");
        String isim = scan.nextLine();
        if(isim.length()<4){
            System.out.println(isim.charAt(0) != isim.charAt(1) && isim.charAt(0)!=isim.charAt(2)&& isim.charAt(1)!=isim.charAt(2) ?
                    "Girilen kelime 3 harfli ve harfleri farklı" : "Kelime 3 harfli ancak harfler farklı değil");


        }else System.out.println("isim en fazla 3 harfli olmalı");











    }
}