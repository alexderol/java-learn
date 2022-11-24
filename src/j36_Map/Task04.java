package j36_Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Task04 {

    ///			KELİME ANALİZİ

    /*
     * Girilen bir metinde kelimelerin kaç kere geçtiğini bulan program yazınız.
     *
     * 1. Adım : ( Kelime = Kaç Kere Geçiyor ) Şeklinde veri tutmak için HashMap oluşturun.
     * 2. Adım : Girilen metni split methodu ile parçalayalım.
     * 			 ilk önce "." ya göre parçalayıp cümleleri elde edelim
     * 			 daha sonra " " boşluğa göre parçalayıp kelimeleri elde edelim
     * 3. Adım : Tüm kelimeleri kontrol etmek için for döngüsü kullanalım ve tüm kelimeleri oluşturduğumuz hashMap'e aktaralım.
     * 			 Eğer hashmap'te yoksa ekleyelim ve sayısına 1 yazalım.
     * 		 	 Eğer hashmap'te zaten varsa, sayısını bir artıralım.
     * 3. Adım : Tüm kelimeler kontrol edildikten çıktı verelim. Ve tüm kelimeleri tekrar sayısıyla birlikte gösterelim.
     *
     * İpucu : "." özel karakter olduğu için "\\." şeklinde split ediniz.
     * */

    static HashMap<String, Integer> map = new HashMap<>();

    static ArrayList<String> parcalananHarf = new ArrayList<>(Arrays.asList());

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("birşeyler yazın");
        String cümle = scan.nextLine();


        splitcimKelime(cümle);



    }



    private static void splitcimKelime(String cümle) {
        ArrayList<String> parcala = new ArrayList<>(Arrays.asList( cümle.split(" ")));
        System.out.println(parcala);
        int tekrarsıysı = 1;
        for (String w : parcala) {
            if (!map.containsKey(w)) {
                map.put(w, tekrarsıysı);
            } else if ((map.containsKey(w))) map.put(w, tekrarsıysı++);

        }

        System.out.println(map);
    }

}
