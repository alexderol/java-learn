package j09_SwitchStatement;

import java.util.Scanner;

public class C04_SwitchCase {
    public static void main(String[] args) {

        //TASK--> girilen ayın hangi mevsimde olduğunu print eden code create edin
        Scanner scan = new Scanner(System.in);
        System.out.println("ay girin girin");
        int ay = scan.nextInt();
        switch (ay) {
            case 12 :
            case 1 :
            case 2 :
                System.out.println("KIŞ");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("İLKBAHAR");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("YAZ");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("SONBAHAR");
                break;


            default :
                System.out.println("DİKKKKAAAATTTTTATATATAYTA");

        }

            // ortak aksiyon alan case ler ardı ardına yaz break    ile kapat sonra yukarıda ki gibi 





































    }

}
