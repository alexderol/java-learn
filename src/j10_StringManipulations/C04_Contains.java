package j10_StringManipulations;

import java.util.Scanner;

public class C04_Contains {
    public static void main(String[] args) {
        /*
        String içerisinde istenen stringin varlığını kontrol eder boolean return eder...
         */

        String s1 = "Enise Hanım başarılı bir Qa tester team lead";
        System.out.println(s1.contains("hanım"));//false çünkü yukarıda Hanım yazıyor hanım yazmıyor
        System.out.println(s1.contains("E"));//true
        System.out.println(s1.contains(" "));//true

        String s2 = "Qa";
        System.out.println(s1.contains(s2));//true s1 içerir mi Qa? evet içerir
        System.out.println(s2.contains(s1));//false s2 içerir mi s1 dekini tabi ki hayır

        //ilki.contains(ikinci) yani açıklaması ilki içerir mi ikincisini demek

        //TASK--> girilen bir cümlede aranan kelimenin varlığını kontrol eden code create edin..ternary kullan
        Scanner scan = new Scanner(System.in);
        System.out.println("bir cümle giriniz");

        System.out.println("****ANtrenMAN***");
        String ab = "Gök yüzünü tutamam";
        String cd = "Sözlerimi geri alamam";
        System.out.println(ab.contains(cd));//false
        System.out.println(ab.contains("gök"));// false oldu çünkü Gök yazmadık. case sensitive yani
        System.out.println(ab.contains(" "));// true çünkü ab içinde boşluk var


    }
}
