package j12_Loops.TaskOfTheWeek;

import java.util.Scanner;

public class T01_Top {

   /* HAFTANIN TASK'iiii :-)
    Bir top belirli yükseklikten atılmaktadır.
    Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
    Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
    Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do while code blogu create ediniz.

    */

    public static void main(String[] args) {
        double toplamYol=0;
        double yereVurma=0;

        Scanner scan = new Scanner(System.in);
        System.out.println("topun bırakıldığı yüksekliği girin m cinsinden");
        double yükseklik= scan.nextInt();

       do {

           yereVurma++;
           toplamYol+=yükseklik*0.75*2;
           yükseklik=yükseklik*0.75;


       }while (yükseklik>1);
        System.out.println("aldigi toplam yolu= "+(toplamYol)+" topun yerde sekme sayısı= "+yereVurma);

    }
}
