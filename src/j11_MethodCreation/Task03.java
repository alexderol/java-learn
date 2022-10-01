package j11_MethodCreation;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        //TASK girilen ik sayıyı seçilen dört işleme göre hesapayan method create et
        Scanner scan = new Scanner(System.in);
        System.out.println("birinci sayı girin");
        int sayı1 = scan.nextInt();

        System.out.println("ikinci sayı girin");
        int sayı2 = scan.nextInt();
        System.out.println("işlemi seciniz");
        char islem = scan.next().charAt(0);
        islemMenu(islem, sayı1, sayı2);





    }//main dışı

    public static void topla(int a, int b) {
        System.out.println("a+b = " + (a + b));
    }

    public static void carp(int a, int b) {
        System.out.println("a*b = " + (a * b));
    }

    public static void cıkar(int a, int b) {
        System.out.println("a-b = " + (a - b));
    }

    public static void böl(int a, int b) {
        System.out.println("a/b = " + (a / b));
    }

    public static void islemMenu(char ch, int x, int y) {
        switch (ch) {
            case '+':
                topla(x, y);
                break;
            case '*':
                carp(x, y);
                break;
            case '-':
                cıkar(x, y);
                break;
            case '/':
                böl(x, y);
                break;
            default:
                System.out.println("yanlış giriş");

        }
    }

}
