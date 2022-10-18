package j15_Arrays;

import java.util.Arrays;

public class C03_Arrays {
    public static void main(String[] args) {

        //String i array a cevirme--> girilen parametre değere göre string  ifade parçalanır

        String str= "javaCAN'lara selam olsun. en kısa zamanda bolcana offer sonrası TUZLABALIK :) ";

        //String ifadeyi kelimelerini  sayısını print edin
        String strArr[]=str.split(" ");//str her  " "  karaktere göre parçalanır. her bir parca strArr ın elemanı olarak atandı
        System.out.println(Arrays.toString(strArr));//[javaCAN'lara, selam, olsun., en, kısa, zamanda, bolcana, offer, sonrası, TUZLABALIK, :)]
        System.out.println(strArr.length);//11 kelime varmış

        //String ifadedki harf sayısını bul

        String harfArr[]=str.split("");
        System.out.println(Arrays.toString(harfArr));
        System.out.println(harfArr.length);//78 karakter varmış tabi harf dışındaki karakterleri de replaceAll ile kaybedebiliriz



    }
}
