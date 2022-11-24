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
        List<Integer> sayiTek = new ArrayList<>(Arrays.asList(1,35,7));
//Lamda--> stream API (diger adı)
        ciftKarelerininEnbuyugu(sayi);





    }
    // Task : List'in cift elemanlarin karelerinin en buyugunu print ediniz
    public static void ciftKarelerininEnbuyugu(List<Integer> sayi){
        Optional<Integer> maxEleman = sayi.stream().filter(C01_LambdaExpression::ciftMi).map(t -> t * t).reduce(Integer::max);//reduce(Math::max)
        //sayi akısa alındı filtre ile ciftler alında map ile kareleri isaretlendi reduce ile max alındı ve sout yapamıyoruz artı
        // bizde onu optinal maxEleman a atadık  ve sout edebiliriz artık
        System.out.println(maxEleman);
        //Optinal yapma amacı belki sonuc null olacak o yüzden int ve double atasaydık null deger almayacağı icin hatayı handle etti
    }


}
