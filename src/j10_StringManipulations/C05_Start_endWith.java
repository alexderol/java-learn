package j10_StringManipulations;

import java.util.Scanner;

public class C05_Start_endWith {
    public static void main(String[] args) {
        /*
        türkçesi bununla başlar bununla biter mi sorusuna cevaptır
         startsWith()
 *  Metnin bas kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
 *  String'in basladigi characteri dogrular
 * endsWith()
 * Metnin son kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.


         */
        String sehir = "istanbul";
        System.out.println(sehir.startsWith("i"));//true
        System.out.println(sehir.startsWith("is"));//true
        System.out.println(sehir.startsWith("s"));//false
        System.out.println(sehir.startsWith("a", 3));// 3. indnex a ile mi başlar demek True verir

        System.out.println(sehir.endsWith("l"));//true
        System.out.println(sehir.endsWith("n"));//false kelime n ile biter mi false

        String str= "bul";
        System.out.println(sehir.endsWith(str));// sehir yani istanbul str ile yani bul ile bitiyor mu?  true olur

        //TASK--> girilen e-mail hesabını @gmail.com içermiyorsa "Lütfen gmail hesabı giriniz,
        //gmail.com ile bitiyorsa "hesabınz onaylandı" aksi durumda "geçerli hesap giriniz" print eden code create edin
        Scanner scan = new Scanner(System.in);
        System.out.println("gmail hesabınızı giriniz");
        String mail= scan.nextLine();
        if (mail.endsWith("@gmail.com")){
            System.out.println("Başarıyla giriş yapıldı");
            if (mail.endsWith(".com")){
                System.out.println("Hesabınız onaylandı");
            }else System.out.println("hesabınız onaylanmadı");


        }else System.out.println("Lütfen geçerli bir  hesap ile giriş yapınız");

        String örnek= "Gözlerini çevir gökyüzüne";
        System.out.println(örnek.endsWith("ne"));


    }


}
