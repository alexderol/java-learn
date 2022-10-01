package j11_MethodCreation.tasks;

import java.time.LocalDate;
import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {

    /*
    Kullanıcı tarafından girilen bir yılın  artık yıl olup
    olmadığını kontrol eden method create ediniz

    Test Data:
    2017

    Beklenen Çıktı:
    false
    */
        Scanner scan = new Scanner(System.in);
        System.out.println("bir yıl giriniz");
        int yıl = scan.nextInt();

        control(yıl);






    }

    static void control(int a) {
        if (a%400==0 || a%4==0){
            System.out.println("Girilen yıl artık yıldır");
        }else System.out.println("Girilen yıl artık yıl değildir");

    }


}
