package j16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        // bir listte istenen sayının varlığını kontrol eden code create ediniz

        ArrayList<Integer> lisSayi = new ArrayList<>(Arrays.asList(1,24,23,14,19,60,1,55,27,1,38));
        Scanner scan = new Scanner(System.in);


        System.out.println(" hangi sayıyı arıyorsun");
        int ara = scan.nextInt();
        boolean varMı =     false;




        for (int i = 0; i < lisSayi.size(); i++) {
            if (lisSayi.get(i) ==ara) {
                varMı= true;

                System.out.println("aradığın sayı bizde MEVCUT");
                break;

            }else System.out.println(" yok ");

            }

        }


    }

