package j15_Arrays.odev;

import java.util.Arrays;

public class _14_String_method_replace {

    public static void main(String[] args) {

        /*
        Bu String'i oluşturunuz.  "Hello World"
        "o" harfleri yerine "K" yerleştiriniz.
        Sonuç bu şekilde olmalıdır:
        HellK WKrld
         */
        String [] arr= {"Hello World"};
        String aa= "Hello World";
        System.out.println("aa.replaceAll(\"o\", \"K\") = " + aa.replaceAll("o", "K"));
        System.out.println("aa = " + aa);


    }
}