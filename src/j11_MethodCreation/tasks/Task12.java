package j11_MethodCreation.tasks;

import java.util.Scanner;

import static j11_MethodCreation.tasks.Task08.control;

public class Task12 {

    public static void main(String[] args) {

    /*    Kullanıcıdan alınan bir mailin doğru olup olmadığını kontrol eden method create ediniz

    Şartlar:
    * Bir mail adresinde @ karakteri olmalı
    * Bir mail adresinde . (nokta) karakteri olmalı
    * Bir mail adresinde @ karakterinden önce en az bir karakter yazılmalı (a@gmail.com gibi)

    Örnekler
    validateEmail("@gmail.com")
    Çıktı : false

    validateEmail("gmail")
    Çıktı : false

    validateEmail("hello@gmail")
    Çıktı : false

    validateEmail("hello@edabit.com")
    Çıktı : true
    */
        Scanner scan = new Scanner(System.in);
        System.out.print("Mail adresinizi yazınız= ");
        String account = scan.nextLine();
        kontrol(account);


    }

    private static boolean kontrol(String hesap) {


        return hesap.contains("@") && hesap.contains(".") && hesap.substring(0, hesap.indexOf('@')).length() > 0;
    }


}