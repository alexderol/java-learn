package j15_Arrays.odev;

import java.util.Arrays;

public class _15_Word_Count {

    public static void main(String[] args) {

        /*
        Bu String'i oluşturun. "Removes white space from both ends of a string"
        String'deki kelime sayısını yazdırınız.
         */
        String aa = "Removes white space from both ends of a string";
        String [] saydırma=aa.split(" ");
        System.out.println("Arrays.toString(saydırma) = " + Arrays.toString(saydırma));
        int kelime=0;
        for (int i = 0; i < saydırma.length; i++) {
            if (saydırma[i].length()>1){
                kelime++;

            }

        }
        System.out.println("kelime = " + kelime);


    }
}