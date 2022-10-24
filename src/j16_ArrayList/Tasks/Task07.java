package j16_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task07 {
    public static void main(String[] args) {
        /* TASK :
         * 10 elamanli bir list olusturun. Ardindan dizinin 3. elemani ile
         * 8. elemaninin yerlerini degistirin.
         *
         * ORNEK:
         *
         * INPUT : String[] isimler={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
         * OUTPUT : String[] isimler={"Umit","Emin","Furkan","Kerem","Taylan","Orhan","Sinan","Kemal","Ahmet","Ali"};
         */

        List<String> listIsim = new ArrayList<>(Arrays.asList("Umit", "Emin", "Kemal", "Kerem", "Taylan", "Orhan", "Sinan", "Furkan", "Ahmet", "Ali"));

        String str3 = listIsim.get(2);//list'deki 3. eleman 2 index ile str1 'e atandı

        String str8 = listIsim.get(7);//list'deki 8. eleman 7 index ile str1 'e atandı
        System.out.println("listIsim = " + listIsim);//update öncesiz->

        listIsim.set(2, str8);//3. elelman 2. index str8 ile update edildi
        listIsim.set(7, str3);//8. elelman 7. index str2 ile update edildi

        System.out.println("listIsim = " + listIsim);//update sonrası ->


    }
}
