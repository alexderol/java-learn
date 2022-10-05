package Tasks;

import java.util.Scanner;

public class Task03_Faktoriyel {
    public static void main(String[] args) {
        //interviewwwwwwwwwww!""""!"!!!!!!!!
        //girilen sayının faktöriyelini hesaplayan method creat ediniz

        Scanner scan = new Scanner(System.in);
        System.out.println("sayı girin");
        int sayı= scan.nextInt();

        System.out.println(faktoriyel(sayı));


    }

    private static int faktoriyel(int sayı) {
        int faktöriyel=1;// boş kutu lazımdı ama değer degirmeliydik 1 çarpmadaetkisiz eleman  o yüzden 1 yazdık
        for (int i = 1; i <= sayı; i++) {
            faktöriyel*=i;

        }
        //System.out.println("faktöriyel = "+faktöriyel);
        return faktöriyel;
    }
}
