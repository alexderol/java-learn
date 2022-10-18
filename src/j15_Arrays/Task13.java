package j15_Arrays;

import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {
        /* TASK :
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
        3 e bolunebilen sayi adedini print eden java code create ediniz (negatif sayilar da dahil olsun)

         */
        Scanner scan = new Scanner(System.in);
        int üceBölünen = 0;
        int [] arr = new int[8];
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(i+ ". eleman değeri giriniz");
            arr[i] = scan.nextInt();
            if(arr[i]%3==0){
                üceBölünen++;
            }


        }
        System.out.println("üce bölünen eleman sayısı= "+üceBölünen);






    }

}
