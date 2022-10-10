package j12_Loops.Tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        //İTERVİEW sorusu******!!!!!!!
        //
        /*
       Interview Question

               Girilen  100’den kucuk bir tamsayi için
               1’den baslayarak girilen sayiya kadar tum sayilari print eden ama;
              - Sayi 3’un kati ise sayi yerine "Java" yazdirin.
              - Sayi 5’in kati ise sayi yerine "CAN'dır" yazdirin.
              - Sayi hem 3’un hem 5’in kati ise sayi yerine "JavaCAN" prnt eden code create ediniz

*/
        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayı girin");
        int num = scan.nextInt();
        if (num>=100){
            System.out.println("sayı 100 den küçük olmalı");

        }else {
            for (int i = 1; i < num; i++) {
                if (i%3==0 && i%5==0){
                    System.out.println("JavaCAN");
                }else if(i%3==0){
                    System.out.println("Java");
                }else if(i%5==0){
                    System.out.println("CAN'dır");
                }else System.out.println(i+ " hiçbir şartı sağlamayan sayı");


            }
        }





    }
}
