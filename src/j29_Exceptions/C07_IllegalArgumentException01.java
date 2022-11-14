package j29_Exceptions;

import java.util.Scanner;

public class C07_IllegalArgumentException01 {
    public static void main(String[] args) {
        //IllegalArgumentException-->kullanılmasını istenmeyen değerlerde programın hata vermesi isteniyorsa
        //bu Exception fırlatılır

        /*
        Example->mesela şahsa yaşını gir dedik -43 girdi burada IllegalArgumentException fırlatır çünkü - yaş olmaz

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("yaşınız girinz");
        int age = scan.nextInt();
        try {
            if(age<0){  throw new IllegalArgumentException();}else System.out.println("yaşınız hayırlı olsun--> "+age);//throw keyword ile Exception obj oluştrularak hata fırlatılır
            // böylece şartımıza uymayan koşulda catch blocka geçilir daha pratik code yazıldı
            System.out.println("Exception fırlatması lazımdı ");
        }catch (IllegalArgumentException e){
            System.out.println("try çalışmamış demektir şuan catch desin demekki yaşını yanlış girmişsin ki burası çalıştı "+age+ " şeklinde yaş mı olur");
        }
        System.out.println("handle edildi code devam");








    }

}
