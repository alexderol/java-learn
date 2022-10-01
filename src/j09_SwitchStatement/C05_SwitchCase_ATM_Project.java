package j09_SwitchStatement;

import java.util.Scanner;

public class C05_SwitchCase_ATM_Project {
    public static void main(String[] args) {
        /*bakiye(başlangıcta 1000 tl) öğrenme, para yatırma ve çekme,
         cıkış işlemlerinin yapıldığı bir ATM app code create  edin

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("DEMİRBANK AŞ ye hoşgeldiniz");
        System.out.println("");
        System.out.println("Yapmak istediğniz işlemi seçin\nBakiye öğrenmek için 1\nPara yatırmak için 2\nPara çekmek için 3\nÇıkış için 4 ");
        int komut = scan.nextInt();
        int bakiye = 1000;

        switch (komut){
            case 1:
                System.out.println("Bakiyeniz ="+ bakiye + "TL");
                break;
            case 2:
                System.out.print("Yatırmak istediğiniz tutarı girin =");
                int yatırılan = scan.nextInt();
                bakiye+=yatırılan;
                System.out.println("Güncel Bakiyeniz = "+ bakiye + " TL");
                break;
            case 3:
                System.out.println("Çekmek istediğiniz tutarı girin ");
                int çekilen = scan.nextInt();
                if (çekilen>bakiye){
                    System.out.println("Bakiyeniz Yetersiz\nGüncel Bakiyeniz ="+ bakiye + " TL");
                }else {
                    bakiye-=çekilen;
                    System.out.println("Güncel Bakiyeniz = "+ bakiye +" TL");
                }
               break;
            case 4:
                System.out.println("Bizi tercih ettiğiniz için teşekkürler");
                break;
            default:
                System.out.println("yanlış işlem yaptınız");




        }


























    }


}
