package j23_Varargs_StringBuilder.Varargs;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*
        Task--> girilen ilk sayı hariç diğerlerini toplayan ve toplam ile ilk sayıyı çarpan method create ediniz
         */
        int arr[]={1,2,3,4,5,6};

        System.out.println("ilkiHaricToplaİlkCarp(1,2,3,4,5,6) = " + ilkiHaricToplaİlkCarp(1, 2, 3, 4, 5, 6));

        Scanner scan = new Scanner(System.in);
        System.out.println("array kaç elemanlı olsun");
        int arr2 []= new int[scan.nextInt()];



    }

    private static int ilkiHaricToplaİlkCarp(int a, int ...b) {

        int toplam=0;
        for ( int w: b) {
            toplam += w;
                    }


        return toplam*a;
    }

}
