package j13_break_Continue;

import java.util.Scanner;

public class C06_Task {
    //girilen bir ifadedeki c kakaterine kadar a karakter sayısını print eden code create edin
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("birşeyler yazınız");
        String girdi = scan.nextLine();

        int aSayısı=0;

        for (int i = 0; i < girdi.length(); i++) {
            if(girdi.charAt(i)=='a'){
                aSayısı++;

            }else if(girdi.charAt(i)=='c')break;
            System.out.println("döngüde işleme giren karakter = "+girdi.charAt(i));

        }
        System.out.println("girilen girdi de a sayısı= "+aSayısı);
    }
}
