package j15_Arrays;

import java.util.Arrays;

public class C04_Arrays {
    public static void main(String[] args) {
        //array eşitlik kontrolu...equals () -> methodu index ve value kontrolu yapar ve true /false return eder

        int sayi1[]={39,3,72,63,84};
        int sayi2[]={84,72,63,3,39};

        System.out.println("sayi 1 ve sayi2 eşit mi = "+Arrays.equals(sayi1, sayi2));//false verdi.. nasıl çalıştı 0 ıncı endekse baktı farklılar eşit değil oldu
        Arrays.sort(sayi1);//[3,39,63,72,84] sıralandı
        Arrays.sort(sayi2);//[3,39,63,72,84] sıralandı
        System.out.println("sayi 1 ve sayi2 eşit mi = "+Arrays.equals(sayi1, sayi2));//true aldık sıraladık ilk indexe baktı sonra sırayla indekse baktı eşitler true oldu




    }
}
