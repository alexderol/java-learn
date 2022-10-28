package HaftaninTasks.User_Task_Girisli;

import java.util.ArrayList;
import java.util.Scanner;

public class GirisPaneli {
    //public static void giris(){ // burada statici kaldırıp runnerde obje ilede çağırılır öyle yaptı ben yazmadım
    public static void giris(){
        Scanner scan = new Scanner(System.in);

        Kayıt yeniKayıt = new Kayıt();//Kayıt Classına erişim için  parametresiz Constructor ile yeniKayıt objesi ürettik

        ArrayList<Kullanıcı> kisi = new ArrayList<>();//Kullancı classtan uretilen obj tutulacağı bos list

        boolean cıkılsınMı = true;// while döngü için şart tanımlandı

        while (cıkılsınMı) {

            System.out.print(" ne istiyorsunuz aşağıdakilerden seçin...\n1--->Kullanıcı Kayıt Al\n2--->Sanslı Kisiyi bul\n3--->Listele\n4--->Cıkıs\nSeçiminiz=");
            int tercih = scan.nextInt();
            switch (tercih) {

                case 1:
                    kisi=yeniKayıt.kayıtAl();//Kayıt Classtan yeniKayıt obje(10 satır) ile KayıtAl methodu call edildi
                    break;
                case 2:
                    yeniKayıt.sanslıKullanıcı(kisi);
                    break;
                case 3:
                    yeniKayıt.listele(kisi);
                    break;
                case 4:
                    cıkılsınMı = false;
                    break;

                default:
                    System.out.println("hatalı giriş yaptınız dikkatli şekilde tekrar deneyin");

            }
        }



    }

}
