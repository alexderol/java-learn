package j13_break_Continue;

import java.util.Scanner;

public class C04_PinControl {
    public static void main(String[] args) {
        // Task -> String data type bir pin datasının 3 giriş hakkında kontrol eden code create ediniz.
        Scanner sc = new Scanner(System.in);


        String dgruPin = "javaCAN";


        int girisHakki = 3;
        while (true) {
            System.out.println("AGAm pin'ini giresen :");
            String agaPin = sc.nextLine();
            if (agaPin.equals(dgruPin)) {
                System.out.println("agam bugun ballısın gayet başarılı :) ");
                break;
            } else {
                System.out.println("agam bugun nasipsizsin bi daha dene");
                girisHakki--;
                System.out.println("agam kalan canın : " + girisHakki);
                if (girisHakki == 0) {
                    System.out.println("agam canın kalmadı bidahkine bekleme yapma dewamkeee :(");
                    break;
                }
            }
        }

    }


}

