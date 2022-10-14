package j15_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task03 {

    public static void main(String[] args) {
		
		 /*
       Task-> Verilen  bir arrayin tum elemanlarini
        bir soldaki konuma print eden code create ediniz
       input:  [1,2, 3]
        output [2, 3, 1]
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("kaç elemanlı array istiyorsunuz");

        int eski[] = new int[scan.nextInt()];

        int yeni[] = new int[eski.length];


        for (int i = 0; i < yeni.length; i++) {
            System.out.println("eleman değir gir = " );
            eski[i]=scan.nextInt();
        }
        yeni[yeni.length - 1] = eski[0];

        for (int i = 0; i < yeni.length-1 ; i++) {


            yeni[i] = eski[i + 1];


        }
        System.out.println(Arrays.toString(yeni));


    }

}
