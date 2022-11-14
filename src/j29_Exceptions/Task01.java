package j29_Exceptions;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        /*
    Task -> Girilen password'un 6 karakterden az 10 karakterden fazla olmamasını kontrol eden code create ediniz
     */
        Scanner scan = new Scanner(System.in);
        System.out.println("şifreyi giriniz");
        String password = scan.next();

        try {
            if (password.length() < 6) {
                throw new IllegalArgumentException("password 6 dan az olamaz");
            } else if (password.length()>10) {
                throw new IllegalArgumentException("Password 10 dan fazla olamaz");

            }else System.out.println("password geçerli--> "+password);

        } catch (IllegalArgumentException e) {
            System.out.println("cathc çalıştır ama throw da bak bakalım ne var mesaj aşağıda \n"+ e);
        }
        System.out.println("handle edildi code devam");



    }
}
