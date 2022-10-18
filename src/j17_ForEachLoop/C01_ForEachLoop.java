package j17_ForEachLoop;

import javax.swing.text.StyleContext;
import java.util.ArrayList;
import java.util.List;

public class C01_ForEachLoop {
    public static void main(String[] args) {
        /*
        for each loop for loopun gelişmiş halidir
        1- clean codedur
        2-code okuma kolaylığı vardır
        3-hata yapma riski azaltır


         */

        List<Integer> sayiList = new ArrayList<>(List.of(16, 5, 2, 33, 22, 27, 41, 24));

        //task list elemanlarını ayrı satırlara print edeniz

        for (int i = 0; i < sayiList.size(); i++) {

            System.out.println("sayiList.get(i) = " + sayiList.get(i));

        }
        System.out.println(" \naşağısı forechle ile yapıldı yukarısı amelelik gibi kaldı ");


        for (Integer a:sayiList) {
            System.out.println("forechle bu kadar kolay " + a + " ");

        }

        //TASK list elemanlarının ilk 3 eleman hariç tek olanları print eden code create ediniz
        System.out.println("\ntask 2*******");

        for (Integer b :sayiList) {
            sayiList.subList(3,sayiList.size()-1);
            if(b%2==1){
                System.out.print(b+" ");
            }

        }

        //Task list elemanlarının 2 ile 5 index(2,3,4,5) elemanlarını toplayınız
        System.out.println("\n task3*****");
        int toplam=0;

        for (Integer d : sayiList.subList(2,6)) {
            toplam+=d;


        }
        System.out.println("toplam = " + toplam);


    }


}
