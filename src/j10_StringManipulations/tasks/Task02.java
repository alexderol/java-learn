package j10_StringManipulations.tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*
   Girilen passwordun aşagıdakişartları sağlamasını kontrol eden coden create ediniz
    a)Ilk karakteri buyuk harf olmalı
    b)Son karakteri sayi olamlı
    c)en az 6 karakter uzunlugunda olmalı

 */
        Scanner scan = new Scanner(System.in);
       System.out.println("Enter Password");
       String pass = scan.nextLine();
       if (pass.charAt(0) >= 'A' && pass.charAt(0) <= 'Z') {
           if (pass.charAt(pass.length() - 1) >= '0' && pass.charAt(pass.length() - 1) <= '9') {
               if (pass.length() >= 6) {
                   System.out.println("Password doğru");
               }
           }
       } else System.out.println("hatalı giriş");
        //Yukarısı benim yazdığım ama hoca bunu tek if ile yazdı birde öyle yaz
        //if ((password.charAt(0)>='A'&&password.charAt(0)<='Z') &&(password.charAt(password.length()-1)>='0'&&
        //                            password.charAt(password.length()-1)<='9')&&(password.length()>=6)) {
        //            System.out.println("password geçerli");
        //        }else System.out.println("password geçersiz");

        //ders alıştırması///
        System.out.println("yeni bir poss gir");
        String sifre = scan.nextLine();
        if((pass.charAt(0) >= 'A' && pass.charAt(0) <= 'Z') && pass.charAt(pass.length()-1) >= '0' && pass.charAt(pass.length() - 1) >= '9' && pass.length() >= 6);{
           System.out.println("giriş başarılı");
                  }







    }

}
