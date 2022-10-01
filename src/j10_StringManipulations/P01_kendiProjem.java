package j10_StringManipulations;

import java.util.Scanner;

public class P01_kendiProjem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sistempass = "1234";
        double balance = 1000;

        System.out.print("Şire girin =");
        String userpass = scan.next();
        if (userpass.equals(sistempass)) {
            System.out.println("\t\t\t\t\tBAŞARILI GİRİŞ YAPTINIZ");
            System.out.println("Yapmak istediğiniz işlemi seçiniz:\nProfil düzenleme için 1\nBakiye bilgisi için 2\nÇıkış için 3");
            int secim = scan.nextInt();
            switch (secim) {
                case 1:
                    System.out.println("İsim Değiştirmek için 1\nÜnvan değişikliği için 2");
                    int change = scan.nextInt();
                    if (change == 1) {
                        System.out.print("Lütfen yeni adınızı yazınız =");
                        String newName = scan.next();
                        System.out.print("Soyadınızı yazınız = ");
                        String secondName = scan.next();
                        System.out.println("Adınız Başarıyla Değiştirildi\nYeni Adınız= " + newName + " " + secondName);

                    } else if (change == 2) {
                        System.out.print("Lütfen yeni ünvanınızı yazınız =");
                        String newTitle = scan.next();
                        System.out.println("Ünvanınız Başarıyla Değiştirildi\nYeni Ünvanınız= " + newTitle);

                    } else System.out.println("Birşeyler Ters Gidiyor");
                break;
                case 2:
                    System.out.print("Bakiyeniz = " + balance + "TL \nPara Yatırmak İçin 1\nPara Çekmek için 2");
                    double choose = scan.nextInt();

                    if (choose == 1) {
                        System.out.print("Yatırmak istediğiniz Tutarı girin =");
                        double cash = scan.nextInt();
                        System.out.println(cash + " TL tutarında para yatırdınız\nYeni Bakiyeniz = " + (cash + balance) + " TL");
                    } else if (choose == 2) {
                        System.out.print("Çekmek istediğniz tutarı giriniz =");
                        double take = scan.nextInt();

                        System.out.println("Çekilen tutar " + take + "\nKalan Bakiyeniz =" + (balance - take) + " TL");
                    } else System.out.println("birşeyler ters ama hangisi acaba ");
                break;
                case 3:
                    System.out.println("Bizi tercih ettiğiğniz için teşekkürler");
                break;
            }
        } else System.out.println("Hatalı Giriş");


    }
}