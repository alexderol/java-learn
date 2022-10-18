package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C03_indexOf {

    public static void main(String[] args) {
        //indexOf(); --> list içinde istenen elemanın index değerini return eder
        ArrayList<String> listUlke = new ArrayList<>(List.of("Alamanya", "Amerigonya", "İngiltere", "İsveç"));
        ArrayList<String> listSehir = new ArrayList<>(List.of("Münih", "losAngeles", "London", "Stockholm"));

        System.out.println(listSehir.indexOf("London"));//2 gelir

        System.out.println(listSehir.indexOf("ankara"));//-1
        System.out.println(listSehir.indexOf("manisa"));//-1///olmadığı için yok yani -1 Array deki gibi olsaydı şurada olurdu demez

        listUlke.add("Amerigonya");
        System.out.println(listUlke);
        System.out.println(listUlke.indexOf("Amerigonya"));// 1 yazdı çünkü Amerigonya yeniden ekledik yazdırırken bize ilk sıradakini getirir yani soldan sağa ilk olan

        System.out.println(listUlke.lastIndexOf("Amerigonya")); // 4 yazdı çünkü sağdan (sondan ) ilk bulunan elemanın indexi return eder


    }


}

