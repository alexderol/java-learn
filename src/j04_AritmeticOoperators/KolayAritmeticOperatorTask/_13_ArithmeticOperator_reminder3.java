package j04_AritmeticOperators.KolayAritmeticOperatorTask;

import java.util.Scanner;

public class _13_ArithmeticOperator_reminder3 {

    public static void main(String[] args) {

        /* Verilen iki int hakkında,
            num1'in num2'ye bölümünden kalanı yazdırınız.  */


        int num1=101;
        int num2=5;
        int sonuc= num1%num2;
        System.out.println("sonuc = " + sonuc);

        double num4=247;
        double num5=17;
        double tot=num4%num5;
        System.out.println("tot = " + tot);



        //cuma dersi buradan başlar

        //kullanıcadn 3 basamaklı sayı alın ve sayının rakamlarını birler onlar ve yüzler basamağı olarak yazdırın

        //birler basamağı 3
        // onlar basamağı 5
        //yüzler basamağı 8

        //verilere göre aşağıya bak


        Scanner scan= new Scanner(System.in);
        System.out.print("üç basamaklı sayı girin = ");

        int ucbasamaklı= scan.nextInt();

        //1 ler basamağı--- bir sayının 10 a bölümünden kalan birler basamağıdır..
        int birlerbasamağı=ucbasamaklı%10;//sayının birler basamağı
        ucbasamaklı/=10;//sayının 10 a bölümünden bölümü verir..853/10 den bölümü 85 olur. artık ucbasamaklı sayı bizim 85 oldu
        int onlar =ucbasamaklı %10 ;//;85 in 10 a bölümünden kalan 5 i verir....
        int yüzler=ucbasamaklı/10;//85 in 10 a bölümünü verir--- yani 8.. bizde zaten 8 i istiyoruz..
        System.out.println("Girdiğiniz sayını birler basamağı= "+birlerbasamağı+"\nGirdiğiniz sayını onlar basamağı= "+
                onlar+"\nGirdiğiniz sayını yüzler basamığı= "+yüzler);













    }
}
