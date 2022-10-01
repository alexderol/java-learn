package j09_SwitchStatement;

import java.util.Scanner;

public class C06_SwitchCase {
    public static void main(String[] args) {
        //TASK-- girilen haftanın gününü hafta içi veya sonu olduğuğunu bildiren code create edin
        Scanner scan = new Scanner(System.in);
        System.out.print("Günü giriniz");
        String gün = scan.next().toLowerCase();// sen nasıl yazarsan tolower_case ile çıktı hep küçük olur sende ona göre atamayı yap

        switch (gün) {
            case "pazartesi":///mesela tolower_case yaptığımız için "Pazartesi" olsaydı burası çalışmazdı çünkü "pazartesi" yazması gerek çünkü tolower_case kullandık
            case "salı":
            case "carşamba":
            case "perçembe":
            case "cuma":
                System.out.println("Hafta içi");
                break;
            case "cumartesi":
            case "pazar":
                System.out.println("Hafta sonu");
                break;
            default:
                System.out.println("ilk okula geri dön");


        }

    }}
