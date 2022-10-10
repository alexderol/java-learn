package j13_break_Continue;

import java.util.Scanner;

public class C01_Break {
    public static void main(String[] args) {
        /*
    break loop'u istenilen yerden sonlandırmak için döngüyü kontrol edebiliriz.Bir loop'u, loop'un koşul bölümüne bağlı
    kalmaksızın sona erdirmek için break komutu kullanılır. break komutu loop'a bağlı kod bloğunun
    herhangi bir işlem satırında yer alabilir. Program kod bloğunda break komutu'nu görür görmez,
    loop başlangıç koşulu sağlanmış olsa bile, loop'dan çıkar ve loop'dan sonra gelen ilk işlem
    satırından çalışmasına devam eder. İç içe(nested) looplarda break komutu kullanıldığında sadece
     içinde kullanıldığı loop'dan çıkışı sağlar:


    temelde döngüden atlamak için kullanılır, çoğunlukla if-else deyimi ile kullanılır
    */

    // Task ->girilen bir mail hesabının @ sembolune kadar olan karakterlerni print eden code create ediniz.
        Scanner scan=new Scanner(System.in);
        System.out.println("mail adresini giriniz");
        String mail= scan.nextLine();

        for (int i = 0; i < mail.length(); i++) {//0 indexten mail son indexe kadar her bir karakteri döngüye alır
            char c=mail.charAt(i);//döngüdeki her karakteri c ye atar
            if(c=='@') break;//c de @ karakteri farsa if blok çalışır ve break olur döngü kırılır @ den sonrası artık çalışmaz
            System.out.print(c);//looptaki elde edilen karakterrleri c ye atayıp print eder

        }
















    }
}
