package j36_Map;

import java.util.HashMap;
import java.util.Map;

public class Task02 {
    public static void main(String[] args) {
        /*
        Task ->
         Key:isim ,email,adres,telefon
         Key2lere ait valueeleri depolayan bir kartvizit  map ve isim Key'e kartvizit map'i value tanımlayan farklı bir map tanımlayıp
         print eden code create ediniz
         */
        Map<String,String> nazımkartvizit = new HashMap<>();
        nazımkartvizit.put("isim","Nazım");
        nazımkartvizit.put("email","ebik@gmail.com");
        nazımkartvizit.put("adres","akhisar");
        nazımkartvizit.put("telefon","123456789");

        Map<String,String> mehmetkartvizit = new HashMap<>();
        mehmetkartvizit.put("isim","Mehmet");
        mehmetkartvizit.put("email","memet@gmail.com");
        mehmetkartvizit.put("adres","manisa");
        mehmetkartvizit.put("telefon","55504882125");

        Map<String,Map<String,String>> kartvitztsss = new HashMap<>();
        kartvitztsss.put("QA ",nazımkartvizit);
        kartvitztsss.put("Developer ",mehmetkartvizit);
        System.out.print(kartvitztsss);

        System.out.println(kartvitztsss.get("Developer ").get("email"));


    }
}


//semihMap.get(isim) = Semih Nerde
//        semihMap.get(telefon) = 0 532 230000
//        ismailKartvizit.get(isim) = İsmail Demir
//        ismailKartvizit.get(telefon) = 0 546 450000
//        semih in telefonu = 0 532 230000
//        ismail in bilgileri = {telefon=0 546 450000, adres=Amsterdam/Hollanda, email=ismail@gmail.com, isim=İsmail Demir}
//        kartvizitler = {ismail={telefon=0 546 450000, adres=Amsterdam/Hollanda, email=ismail@gmail.com, isim=İsmail Demir}, semih={telefon=0 532 230000, adres=Frkanfurt/Almanya, email=Semih@hotmail.com, isim=Semih Nerde}}
