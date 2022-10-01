package j11_MethodCreation.tasks;

import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {

    /*
    Saati saniyeye çeviren  method create ediniz

    Test Data:
    howManySeconds(2);
    Beklenen çıktı:
     7200
    */

        Scanner scan = new Scanner(System.in);
        System.out.println("saat giriniz saniyeye çevirelim");
        int saat = scan.nextInt();

        howmanySecond(saat);


    }

    private static void howmanySecond(int a) {
        System.out.println(a + " saat "+a*(3600)+ " saniye eder");
    }
}
