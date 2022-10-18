package j15_Arrays;

import java.util.Arrays;

public class Task14 {
    public static void main(String[] args) {
        /*  TASK :
        Write a method which accepts  string as parameter and prints the sum of digits
        present in thr given string
        input :"ade1r4d3"
        output : 8
        trick : Use --> Character.isDigit()
                    --> Integer.valueOf()
         */
        String str = "ade1r4d3";
        sayılarıtopla(str);





    }

    private static void sayılarıtopla(String str) {
        str=str.replaceAll("\\D","");
        System.out.println("str = " + str);
        strdönüşüm(str);
    }

    private static void strdönüşüm(String str) {
        int toplam= 0;
        int [] arr = new int[str.length()];
        String [] str2= str.split("");


    }


}

