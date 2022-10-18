package j15_Arrays;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        // Task -> Kullanıcıdan alacağınız 5 adet sayıyı , girişi sırasına göre tersten print eden code create ediniz
        Scanner scan = new Scanner(System.in);
        int [] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println(i+ ". eleman değeri giriniz ");
            arr[i] = scan.nextInt();

        }
        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.print( arr[i]+" ");
        }


    }
}
