package j16_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task05 {
    public static void main(String[] args) {
        /*TASK :
2 Boyutlu bir Multidimensional array i input kabul edip, arraydeki tüm elemanları bir
listeye kopyalayan ve harf sırasına göre yazdıran bir METHOD yazınız.
Eg : Input : {{Ali,Veli,Ayse},{Hasan,Can},{Suzan}}
   Output:[Ali, Ayse, Can, Hasan, Suzan, Veli]

 */
        String isim[][] = {{"Ali", "Veli", "Ayse"}, {"Hasan", "Can"}, {"Suzan"}};
        yeniList(isim);


    }

    private static List<String> yeniList(String[][] isim) {
        List<String> isimList = new ArrayList<>();
        for (int i = 0; i < isim.length; i++) {
            for (int j = 0; j < isim[i].length; j++) {
                isimList.add(isim[i][j]);// her katın her dairesindeki eleman döngü ile alınıp boş liste atıldı


            }

        }
        System.out.println("isimList = " + isimList);
        Collections.sort(isimList);
        System.out.println("isimList sıralanmış hali = " + isimList);
        return isimList;
    }
}
