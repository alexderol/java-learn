package j08_Ifstatement_TernaryOperator.Task_Nested_If;

import java.util.Scanner;

public class Q05 {

    public static void main(String[] args) {
		/*
		TASK :
		Kullanicidan  yasini ve kilosunu alaliniz
		18 yasindan kucuk ise kan bagisi yapamaz
		18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
		 */

        System.out.println("**Kan Bağışı Hayat Kurtarır Hoşgeldiniz**");
        System.out.println(" ");


        Scanner scan = new Scanner(System.in);
        System.out.print("Yaşınızı giriniz =  ");
        int yas = scan.nextInt();
        System.out.print("Kilonuzu giriniz = ");
        int kilo = scan.nextInt();

        if (yas<18) {
            System.out.println("Kan bağışı yapamazsınız veliniz gelsin");
        }else if (yas>18 && kilo<50) {
            System.out.println("Kan bağışı yapamazsınız kilo alın gelin ");
        }else if(yas>18 && kilo>50){
            System.out.println("Kan bağışı Yapabilirsiniz tebrikler bir kişiyi kurtardınız....");
        }









    }

}
