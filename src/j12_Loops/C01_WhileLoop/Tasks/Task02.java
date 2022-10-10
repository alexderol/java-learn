package j12_Loops.C01_WhileLoop.Tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*
        task-> girilen iki tamsayı arasındaki tamsayıları print eden code create ediniz.
        for loop & while lopp
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayı girin");
        int sayı1= scan.nextInt();
        System.out.println("bir sayı daha girin");
        int sayı2= scan.nextInt();


        int top=0;

        for (int i = sayı1; i <= sayı2; i++) {
            top+=i;


        }
        System.out.println(top);

        System.out.println("***while loop****");

        int toplamwhile=0;

        while (sayı1<=sayı2){

            toplamwhile+=sayı1;
            sayı1++;

        }
        System.out.println(toplamwhile);



    }
}
