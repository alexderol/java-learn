package j12_Loops.Tasks;

import java.util.Scanner;

public class Task12 {

    /*
    girilen 5 sayının 10 ile 20 arası hariç diğerlerinin toplamının hesap eden code create edin
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int toplam = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + ". sayıyı giriniz--> ");
            int sayı = scan.nextInt();
            if (sayı <= 10 || sayı >= 20) {
                toplam += sayı;
            }


        }
        System.out.println("girdiğiniz sayıların istenen şartta toplamı= "+ toplam);

    }
}
