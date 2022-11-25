package j99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class C04_Reduce {
    /*
    reduce()-->azaltmak ... bir cok datayi tek bir dataya(max min carp top vs islemlerde) cevirmek icin kullanilir.
    kullanımı yaygındır pratiktir.
    Bir Stream içerisindeki verilerin teker teker işlenmesidir. Teker teker işleme sürecinde, bir önceki adımda elde edilen sonuç
    bir sonraki adıma girdi olarak sunulmaktadır. Bu sayede yığılmlı bir hesaplama süreci elde edilmiş olmaktadır.
    reduce metodu ilk parametrede identity değeri, ikinci parametrede ise BinaryOperator türünden bir obj kullanılır.
    reduce işleminde bir önceki hesaplanmış değer ile sıradaki değer bir işleme tabi tutulmaktadır.
    İşleme başlarken bir önceki değer olmadığı için bu değer identity parametresinde tanımlanmaktadır.

*/
    public static void main(String[] args) {
        List<Integer> sayi = new ArrayList<>(Arrays.asList(24, 38, 49, 33, 7, 3, 42, 66, 75, 45, 46, 55, 35, 25, 67, 16));
        List<Integer> sayiTek = new ArrayList<>(Arrays.asList(1, 35, 7));
        List<Integer> sayiTek2 = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 4, 6, 12, 8));
//Lamda--> stream API (diger adı)
        ciftKarelerininEnbuyugu(sayi);//Optional[4356]
        sum(sayi);//Optional[626]
        ciftCarp(sayiTek2);//[2304]
        enkucukdger(sayi);//3

    }

    // Task : List'in cift elemanlarin karelerinin en buyugunu print ediniz
    public static void ciftKarelerininEnbuyugu(List<Integer> sayi) {
        Optional<Integer> maxEleman = sayi.stream().filter(C01_LambdaExpression::ciftMi).map(t -> t * t).reduce(Integer::max);//reduce(Math::max)
        //sayi akısa alındı filtre ile ciftler alında map ile kareleri isaretlendi reduce ile max alındı ve sout yapamıyoruz artı
        // bizde onu optinal maxEleman a atadık  ve sout edebiliriz artık
        System.out.println(maxEleman);
        //Optinal yapma amacı belki sonuc null olacak o yüzden int ve double atasaydık null deger almayacağı icin hatayı handle etti
    }

    // Task : List teki tüm elemanların toplamını print ediniz
    public static void sum(List<Integer> sayi) {
        System.out.println(sayi.stream().reduce(Integer::sum));
        //toplama isi Integer:: sonra methodları seçtik reduce da
        System.out.println("lambda expression = " + sayi.stream().reduce(0, (a, b) -> a + b));//burada a ilk degeri 0 dan alır..b ilk degerini stream() den akıştan alır
        //a : ilk degerini her zaman atanan Identity degerinden alır
        // b: dgerini her zaman stream() akıstan alır.
        // ** a ilk degerden sonraki dgerlerini action body () den alır
        //ok(->) varsa Lambda Expression dır
        // a  +  b    a+b    burada a ilk degeri identity den yani yukarıdaki 0 dan alır b ise stream() deki ilk eleman yani 24 alır 0+24 =24 oldu artık 45 line daki cümleye bak
        // cümleden de anlaşılacağı üzere a artık aksiyondan deger alır yani 24 olur  a +b b ye yine stream() den gelir 24+38 oldu döngü böyle dönüp duruacak son sayıya kadar

    }

    // Task : List'teki cift elemanlarin carpimini  yazdiriniz.
    public static void ciftCarp(List<Integer> sayiTek2) {
        System.out.println(sayiTek2.stream().filter(C01_LambdaExpression::ciftMi).reduce(Math::multiplyExact));//Math clastan method refere

        sayiTek2.stream().filter(C01_LambdaExpression::ciftMi).reduce(1, (t, u) -> t * u);//43 line daki mantık


    }
    // Task : List'teki elemanlardan en kucugunu 4 farklı yontem ile print ediniz.
    public static void enkucukdger (List<Integer> sayi) {
        System.out.println(sayi.stream().reduce(Math::min));//1. yol
        System.out.println(sayi.stream().reduce(Integer::min));//2. yol
        System.out.println(sayi.stream().reduce(C04_Reduce::halikcaMinbul));//3.yol
        System.out.println(sayi.stream().reduce(Integer.MAX_VALUE, (t, u) -> t < u ? t : u));//4.yol

    }
    public static int halikcaMinbul(int a, int b){
        return a<b?a:b;
    }
    // Task : List'teki 24'ten buyuk en kucuk tek sayiyi print ediniz.
    public static void biseydenBuyuk (List<Integer> sayi) {
        System.out.println(sayi.stream().filter(t -> t % 2 == 1 && t > 24).reduce(Integer::min));


    }



}
