package j99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C05_Sorted {
    //sorted() => Doğal düzene göre sıralanmış, bu akışın elemanlarında oluşan bir akış döndürür.
//sorted() methodu tekrarlı kullanılırsa en son kullanılan aktif olur.

    //reverseOrder() => Comparator Class'ının bir methodudur. Doğal sıralamanın tersini (büyükten küçüğe) uygulayan
// bir Comparator (karşılaştırıcı) return eder.


    public static void main(String[] args) {
        List<Integer> sayi = new ArrayList<>(Arrays.asList(24, 38, 49, 33, 7, 3, 42, 66, 75, 45, 46, 55, 35, 25, 67, 16));
        kucuktenBuyugeCiftKare(sayi);//256.0 576.0 1444.0 1764.0 2116.0 4356.0
        büyüktenKucugeKaresi(sayi);//5625.0 4489.0 3025.0 2401.0 2025.0 1225.0 1089.0 625.0 49.0 9.0

    }

    // Task : list'in cift  elemanlarinin karelerini  kucukten buyuge print ediniz.
    public static void kucuktenBuyugeCiftKare(List<Integer> sayi) {
        sayi.stream().filter(C01_LambdaExpression::ciftMi).map(t -> t * t).sorted().forEach(C01_LambdaExpression::yazdir);
//sayi akış filtre map ile karesi sorted ile sıralandı(natural order küçükten büyüğüne yani) forEach ile yazdır

    }

    // Task : list'in tek  elemanlarinin kareleri ni buykten kucuge  print ediniz.
    public static void büyüktenKucugeKaresi(List<Integer> sayi) {
        sayi.stream().filter(C01_LambdaExpression::tekMi).map(t -> t * t).sorted(Comparator.reverseOrder()).forEach(C01_LambdaExpression::yazdir);
        //sayi akış filtre map ile karesi sorted ile sıralandı(Comperator) sınıfından reversOrder secip foreach ile yazdır yaptık

    }

}
