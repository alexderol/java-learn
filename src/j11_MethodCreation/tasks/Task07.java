package j11_MethodCreation.tasks;

import java.util.Scanner;

public class Task07 {

    public static void main(String[] args) {

    /*
    Üç sayı arasındaki en küçük sayıyı bulan  method create ediniz

    Test data:
    12,24,34

    Beklenen Çıktı:
    12
    */
        Scanner scan = new Scanner(System.in);
        System.out.println("üç sayı yazınız");
        int sayı1 = scan.nextInt();int sayı2 = scan.nextInt(); int sayı3 = scan.nextInt();
        kıyasla (sayı1,sayı2,sayı3);




    }

    private static void kıyasla(int a,  int b, int c) {
        if (a<b && a<c){
            System.out.println(a + " en küçüktür");

        }else if (b<a && b<c){
            System.out.println(b+" en küçüktür");
        }else System.out.println(c+ " en küçüktür");

    }


}

