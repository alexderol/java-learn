package j11_MethodCreation.tasks;

import java.util.Scanner;

import static jdk.nashorn.internal.objects.NativeMath.random;

public class _01_method1 {
    /*
    Ismi randomNum olan bir method oluşturun.
    Parametre olarak int max almalı.
    Bu method, 0 ile max arasında.random bir değer döndürmelidir.
    Random numarayı döndürünüz.
    Note: Eğer bir class oluşturmaya ihtiyaç duyuyorsanız oluşturabilirsiniz.
    Note: Methodun adı istenilenle birebir aynı olmalı (randomNum), aksi taktirde cevap yanlış olur.
     */

    public static void main(String[] args) {
       int a = 1;
        System.out.println(random(a));


    }
    public static int random (int a){

        int b = (int) (Math.random()* Integer.MAX_VALUE);


        return b;
    }
}
