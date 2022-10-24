package j16_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class _06_arraylist6 {

    /*
    hillNum() isminde bir method oluşturun.
    Parametre olarak Integer ArrayList
    Return tipi int,
    Eğer sayı, önceki sayıdan küçük ve bir sonraki sayıdan büyük ise, o sayıyı yazdırın.
    Örneğin;
    ArrayList  5,4,6,2,1
    2, 6'dan küçük ve 1 den büyüktür.
    Return 2 olmalı.
     */

    public static void main(String[] args) {

        ArrayList<Integer> num = new ArrayList<>(Arrays.asList(5, 4, 6, 2, 1));
        System.out.println("hillNum(num) = " + hillNum(num));


    }

    private static int hillNum(ArrayList<Integer> num) {
        int aranan =0;
        for (int i = 1; i < num.size()-1; i++) {
            if (num.get(i) < num.get(i - 1) && num.get(i) > num.get(i + 1)) {
                aranan=num.get(i);


            }else System.out.println("tanıma uygun sayı yok");

        }


        return aranan;
    }
}



