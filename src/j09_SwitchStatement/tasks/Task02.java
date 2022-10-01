package j09_SwitchStatement.tasks;

import java.util.Scanner;



public class Task02 {
    public static void main(String[] args) {

        // Kullanıcının yasadıgı güne  göre 100 gün sonra hangi gün olduğunu print eden code create ediniz
        // pazartesi hafta başlangıcı olarak alınız
        Scanner scan = new Scanner(System.in);
        System.out.println("Pazartesi: 1\nSalı : 2\nÇarşamba: 3\nPerşembe: 4\nCuma: 5\nCumartesi: " +
                "6\nPazar: 7\n Haftanın kaçıncı gününde olduğunu giriniz : ");
        int bugün = scan.nextInt();
        System.out.println("Kaç gün sonrasını öğrenmek istiyorsunuz ?");
        int kacGünSonra = scan.nextInt();
        int istenilen = ((kacGünSonra%7)+bugün)%7;

        switch (istenilen){
            case 1 :
                System.out.println("100 gün sonra Pazartesi");
                break;
            case 2 :
                System.out.println("100 gün sonra Salı");
                break;
            case 3 :
                System.out.println("100 gün sonra Çarşamba");
                break;
            case 4 :
                System.out.println("100 gün sonra Perşembe");
                break;
            case 5 :
                System.out.println("100 gün sonra Cuma");
                break;
            case 6 :
                System.out.println("100 gün sonra Cumartesi");
                break;
            case 0 :
                System.out.println("100 gün sonra Pazar");
                break;
            default:
                System.out.println("Yanlışlık var biryerlerde gizli :)");



        }





    }
}

