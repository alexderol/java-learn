package j11_MethodCreation;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

        //TASK girilen iki sayının eşitliğini kontrol eden method create et
        Scanner scan = new Scanner(System.in);
        System.out.println("ilk sayıyı girin");
        int num1 = scan.nextInt();
        System.out.println("ikinci sayıyı girin");
        int num2 = scan.nextInt();

        System.out.println(esitliklikKontrol(num1, num2));//true veya false kullanıcı girecek çünkü
        esitliklikKontrol(33, 33);//true
        esitliklikKontrol(num1, num2);//kullanıcı bilir
        esitlikKontrol2(56, 67);//sayılar eşit değil verir
        esitlikKontrol2(61, 61);// sayılar eşit verir
        esitlikKontrol2(num1,num2);


    }

    public static boolean esitliklikKontrol(int a, int b) {//true lu false lu
        boolean esitMi = false;// boolean a önce be parametre ata ki true ve false işi belli olsun yani

        if (a == b) {
            esitMi = true;

        } else {
            esitMi = false;
        }
        return esitMi;
    }

    public static void esitlikKontrol2(int a, int b) {
        if (a == b) {
            System.out.println("sayılar eşit :) ");
        } else System.out.println("Sayılar eşit değil :( ");
    }


}
