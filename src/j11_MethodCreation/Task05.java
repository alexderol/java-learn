package j11_MethodCreation;

import java.util.Scanner;

public class Task05 {
    static Scanner scan = new Scanner(System.in);
    static int bakiye = 1000;

    public static void main(String[] args) {
        /*bakiye(başlangıcta 1000 tl) öğrenme, para yatırma ve çekme,
         cıkış işlemlerinin yapıldığı bir ATM app code create  edin

         */

        System.out.println("DEMİRBANK AŞ ye hoşgeldiniz");
        System.out.println("");
        System.out.println("Yapmak istediğniz işlemi seçin\nBakiye öğrenmek için 1\nPara yatırmak için 2\nPara çekmek için 3\nÇıkış için 4 ");

        Task05AtmMethod.secim();


    }



}
