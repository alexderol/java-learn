package j99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_Filter {
    public static void main(String[] args) {

        List<Integer> sayi = new ArrayList<>(Arrays.asList(24, 38, 49, 33, 7, 3, 42, 66, 75, 45, 46, 55, 35, 25, 67, 16));
        printCiftElemanStructured(sayi);//24 38 42 66 46 16
        System.out.println("\n");
        printCiftElemanFunctional1(sayi);//24 38 42 66 46 16
        System.out.println("\n");
        printCiftElemanFunctional2(sayi);//24 38 42 66 46 16
        System.out.println("\n");
        printCiftElemanFunctional3(sayi);//24 16

    }

    ///Task : "Structured Programming" (amele code) kullanarak list elemanlarının ciftlerini aynı satirda aralarında bosluk olacak sekilde print ediniz.
    public static void printCiftElemanStructured(List<Integer> sayi) {
        for (Integer w : sayi) if (w % 2 == 0) System.out.print(w + " ");

    }
    ///Task : "Functional Programming" (cıncıx code) kullanarak list elemanlarının ciftlerini aynı satirda aralarında bosluk olacak sekilde print ediniz.
    public static void printCiftElemanFunctional1(List<Integer> sayi){//lamda expression bad practice
    sayi.
            stream().//list elemanları akısa alındı
            filter(t-> t % 2 == 0).//çift olma durumuna göre filtrelendi
            forEach(C01_LambdaExpression::yazdir);//c01_LambdaExpression clasındaki yazdır methodu refere(call) ettik

    }
    public static void printCiftElemanFunctional2(List<Integer> sayi){//method refere best practice ****
        sayi.
                stream().//list elemanları akısa alındı
                filter(C01_LambdaExpression::ciftMi).//c01 den method refere ettik
                forEach(C01_LambdaExpression::yazdir);//c01_LambdaExpression clasındaki yazdır methodu refere(call) ettik

    }
    ///Task : "Functional Programming" (cıncıx code) kullanarak list elemanlarının 35 den kücük ciftlerini aynı satirda aralarında bosluk olacak sekilde print ediniz.
    public static void printCiftElemanFunctional3(List<Integer> sayi){//
        sayi.
                stream().//list elemanları akısa alındı
                filter(C01_LambdaExpression::ciftMi).
                filter(a-> a < 35&& a%2==0). // akısta sayıyı a ya atadı ve a 35 den küçük olsun ve a çift olsun dedi ve yazdır
                forEach(C01_LambdaExpression::yazdir);

    }
    ///Task : "Functional Programming" (cıncıx code) kullanarak list elemanlarının 34 den büyük yada  ciftlerini aynı satirda aralarında bosluk olacak sekilde print ediniz.
    public static void printCiftElemanFunctional4(List<Integer> sayi){//
        sayi.
                stream().//list elemanları akısa alındı
                filter(t-> t % 2 ==0 || t>34 ).
                forEach(C01_LambdaExpression::yazdir);

    }

}
