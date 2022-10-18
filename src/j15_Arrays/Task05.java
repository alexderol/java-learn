package j15_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task05 {


    public static void main(String[] args) {
        // Task-> girilen int değeri tersten print eden code create ediniz.
        Scanner scan = new Scanner(System.in);
        System.out.println("kaç elemanlı array istiyorsunuz");
        int [] arr = new int[scan.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i+ ". eleman değeri giriniz ");
            arr[i]= scan.nextInt();

        }
        Arrays.sort(arr);
        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.print(arr[i]);
        }







    }
  
}
