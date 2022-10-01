package j09_SwitchStatement.tasks;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {
        // VIP (Very Important Person) kisaltmasinda harflerin kelime karşılığını print eden code create ediniz
        Scanner sc = new Scanner(System.in);
        System.out.print(" harf giriniz  ");
        String ay = String.valueOf(sc.nextLine().charAt(0));
        switch (ay) {
            case "v":
            case "V":
                System.out.println("Very");
                break;
            case "i":
            case "I":
                System.out.println("Important");
                break;

            case "p":
            case "P":
                System.out.println("Important");
                break;
            default:
                System.out.println("dikkatli ol");
        }


    }
}
