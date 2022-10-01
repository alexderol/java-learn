package j11_MethodCreation;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {

        //hesap makinesi yap method ile

        Scanner scan = new Scanner(System.in);
        System.out.println("ilk rakamı girin");
        int sayı1 = scan.nextInt();
        System.out.println("ikinici rakamı girin");
        int sayı2 = scan.nextInt();
        System.out.println("yapmak istediğiniz işlemi yazın (*-+/) den birini yazın");
        char ch = scan.next().charAt(0);
        islem(ch,sayı1,sayı2);










    }

    private static void islem(char ch, int x, int y) {
        switch (ch){
            case '+':
                toplama(x,y);
            break;
            case '-':
                cıkarma(x,y);
                break;
            case '/':
                bölme(x,y);
                break;
            case '*':
                carpma(x,y);
                break;
            default:
                System.out.println("hatalı giriş dikkatli ol");
        }

    }
    public static void toplama (int a, int b){
        System.out.println("Toplama = " + (a+b) );
    }
    public static void cıkarma (int a, int b){
        System.out.println("Cıkarma = " + (a-b) );
    }
    public static void carpma (int a, int b){
        System.out.println("Carpma = " + (a*b) );
    }
    public static void bölme (int a, int b){
        System.out.println("Bölme = " + (a/b) );
    }

}
