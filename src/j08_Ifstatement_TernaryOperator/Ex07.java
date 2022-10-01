package j08_Ifstatement_TernaryOperator;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        /*Task--> TASK -> Kuualanıcının ehliyetinin varlığını kontrol ediniz.
          Ehliyeti varsa yıl tecrübesi 7 yıl ve üstü ise aldıgı mesafe 100000 km ve üzeri ise kontak anahtarını teslim ediniz
          aksi durumda tecrübe yılı ve mesafe eksiklerini print eden code create ediniz

        * */

        Scanner scan = new Scanner(System.in);
        System.out.print("Ehliyetiniz var mı ?\n Evet için 'E' \n Hayır için 'H' \ngiriniz =");
        char ehliyet = scan.next().toUpperCase().charAt(0);//toUpperCase cevabı büyük harf yapar

        if (ehliyet == 'E') {
            System.out.println("Kaç yıldır Ehliyetiniz var ? ");
            int tecrübe = scan.nextInt();
            if (tecrübe >= 7) {
                System.out.println("Aldığın mesafeyi gir = ");
                int mesafe = scan.nextInt();
                if (mesafe >= 100000) {
                    System.out.println("Anahtarı alabilirsin istediğin yere de gidersin ");
                } else System.out.println("daha " + (100000 - mesafe) + " yol alman lazım koçuuummm");
            } else System.out.println(" Anahtarı almanız için " + (7 - tecrübe) + " yıl lazım");

        } else if (ehliyet == 'H') System.out.println("Ehliyet al öyle sürrrrrrrrrbeeeeaaa");


    }
}
