package j09_SwitchStatement;

import java.util.Scanner;

public class C03_SwitchCase {
    public static void main(String[] args) {
        //TASK-- girilen ay numarasına göre kaç gün çektiğini print eden code create edin
        Scanner scan = new Scanner(System.in);
        System.out.println("ay girin girin");
        int ay = scan.nextInt();

        switch (ay) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("girilen ay 31 gün çeker");
                break;
            case 4 :
            case 6 :
            case 9 :
            case 11:
                System.out.println("girilen ay 30 çeker");
                break;
            case 2:
                System.out.println("yılınızı giriniz ");
                int yıl = scan.nextInt();
                if (yıl%4==0){
                    System.out.println("girilen ay şubat ayı 29 gün içerir");      //şubat 4 yılda bir 29 çeker
                }else System.out.println("girilen ay şubat ayı 28 gün içerir");
                System.out.println(yıl%4==0 ? "girilen ay şubat ayı 29 gün içerir" : "girilen ay şubat ayı 28 gün içerir");

            default:
                System.out.println("düzgün yaz gir vs");
        }















    }

}
