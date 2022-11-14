package j29_Exceptions;

import java.io.IOException;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*
Task -> girilen hava sıcaklığı 10'un altında ise IOException hatası tanımlayıp hatayı print eden method create
edip mainde kontrol ediniz.

Trick->
sicaklikKontrol(int sıcaklık){
 throw new IOException("Hava Gerçekten soğuk dışarı çıkma");

}

main(){
Scanner ...
try{
 sicaklikKontrol(int sıcaklık);
}
catch (IOException e) {
}

}
 */

        Scanner scan = new Scanner(System.in);
        System.out.println("sıcaklığı giriniz");
        int sıcaklık = scan.nextInt();


        sicaklikKontrol(sıcaklık);
        System.out.println("burası çılışmıssa handle!! eline sağlık");






    }

    private static void sicaklikKontrol(int sıcaklık) {
        try {
            if(sıcaklık<10){
                throw new IOException("hava gerçekten soğuk dışarıya çıkma");

            }else System.out.println("hava "+ sıcaklık+ " derece çok kalın şeyler giyme terlersin");

        }catch (IOException e) {
            System.out.println("Kalın giyinmelisin çünkü hava 10 derecenin altında ");
        }


    }
}
