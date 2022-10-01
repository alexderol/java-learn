package j11_MethodCreation;

import java.util.Scanner;

public class C02_MethodCreation {
    public static void main(String[] args) {
        //TASK girilen 3 notun ortalamasını hesaplayan method create edin
        Scanner scan = new Scanner(System.in);
        System.out.println("birinci notunuzu girin");
        double not1 = scan.nextDouble();

        System.out.println("ikinci notunuzu girin");
        double not2 = scan.nextDouble();


        System.out.println("ücüncü notunuzu girin");
        double not3 = scan.nextDouble();

        double ortalamanız = ortalamahesapla(not1,not2,not3);
        System.out.println("ders ortalamanız = "+ ortalamanız);



    }//main kapanış dikkat

    public static double ortalamahesapla(double a, double b, double c ) {
        return (a+b+c)/3;

    }




}
