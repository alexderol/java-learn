package j13_break_Continue;

import java.util.Scanner;

public class C02_Continue {
    public static void main(String[] args) {
        /*
        Program, bir loop içerisinde continue komutu ile karşılaşılırsa, ondan sonraki komutları
        atlar ve loop'un bir sonraki değerinden devam eder.

        */

        // Task-> girilen bir mail hesabındaki ' ' karakterlerini handle ederek print eden code cerate ediniz

        Scanner scan=new Scanner(System.in);
        System.out.println("mail adresini giriniz");
        String mail= scan.nextLine();// er ol demi r @ g mai   l . com

        for (int i = 0; i <mail.length() ; i++) {//girilen mailde tüm yazılanlara kadar git
            char ch=mail.charAt(i);//tüm karakterlerini ch ye ata
            if(ch==' ')continue;//ch eğer ' ' boşluğa denk ise continue yani attla burayı ve aksiyona geç(istenmeyen durumu continue bağla yani)
            System.out.print(ch);//sonrra yanlış daha doğrusu boşluklu bir girdi olursa düzeltilir aksiyon verir


        }











    }
}
