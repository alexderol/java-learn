package j16_ArrayList;

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
        List<String> eleman= new ArrayList<>(Arrays.asList("Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"));
        String str1 = eleman.get(2);//eleman daki 2. index deki eleman str1 e atandı ** aslıda burada değiş tokuş yaptık
        String str2 = eleman.get(7);//eleman daki 7. index deki eleman str1 e atandı
        System.out.println("eleman öncesi  = " + eleman);
        eleman.set(7,str1);// 3. eleman 2. index str1 ile update edildi
        eleman.set(2,str2);//8. eleman 7. index str2 ile update edildi
        System.out.println("eleman sonrası  = " + eleman);

        // istenilen index i str1 ve str2 ile onlara atadık sonra tekrar onları da yerlerini değiştirererk geri atadık get aldık setle verdik


    }
}
