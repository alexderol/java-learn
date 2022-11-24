package j99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_map {
    public static void main(String[] args) {
        List<Integer> sayi = new ArrayList<>(Arrays.asList(24, 38, 49, 33, 7, 3, 42, 66, 75, 45, 46, 55, 35, 25, 67, 16));
        çiftKarePrint(sayi);//576 1444 1764 4356 2116 256
        System.out.println("\n");
        tekKupPrint(sayi);//117650 35938 344 28 421876 91126 166376 42876 15626 300764
        System.out.println("\n");
        çiftKareKokleriPrint(sayi);//4 6 6 8 6 4



    }
    // Task : Functional Programming ile listin cift elemanlarinin  karelerini ayni satirda aralarina bosluk bırakarak print ediniz
    public static void çiftKarePrint(List<Integer> sayi){
        sayi.stream().filter(C01_LambdaExpression::ciftMi).map(t-> t * t ).forEach(C01_LambdaExpression::yazdir);
        //eleman akısa girdi filtre ile süzüldü mapp ile isaretlendi karesi yani sonra yazdırıldı

    }
    // Task : Functional Programming ile listin tek elemanlarinin  kuplerinin bir fazlasini ayni satirda aralarina bosluk birakarak print ed
    public static void tekKupPrint(List<Integer> sayi){
        sayi.stream().filter(C01_LambdaExpression::tekMi).map(t-> (t * t * t) + 1 ).forEach(C01_LambdaExpression::yazdir);

       // bu şekilde de olur --> sayi.stream().filter(t-> t % 2 ==1).map(t->(int)Math.pow(t,3)+1).forEach(C01_LambdaExpression::yazdir);
                                                                        //yukarıda (int ) yazmamızın nedeni cast yapmak yazdır methodu int cünkü

    }
    // Task : Functional Programming ile listin cift elemanlarinin   karekoklerini ayni satirda aralarina bosluk birakarak yazdiriniz
    public static void çiftKareKokleriPrint(List<Integer> sayi){
        sayi.stream().filter(C01_LambdaExpression::ciftMi).map(t->(int)Math.sqrt(t) ).forEach(C01_LambdaExpression::yazdir);
        //sayi.stream().filter(C01_LambdaExpression::ciftMi).map(Math::sqrt).forEach(C01_LambdaExpression::yazdir);


    }



}
