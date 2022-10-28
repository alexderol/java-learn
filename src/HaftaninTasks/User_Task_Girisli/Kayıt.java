package HaftaninTasks.User_Task_Girisli;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Kayıt {
    /*
    2- Registration(Kayıt) isminde bir class oluşturun ve register()(kayıtAl()) isminde bir metod
    create ederek Kullanıcı Class'dan user ismini(name) alarak ArrayList e ekleyin ve bu list i
            return edin.*/
//task 2. step

            ArrayList<Kullanıcı> kullanıcıKisiler = new ArrayList<>(); //Kullancı Classtan oluşturulacak obj lerin tutulacağı boş list yaptık

    public ArrayList<Kullanıcı> kayıtAl() {//kullanıcı classdan obj üretmek için constructor a gerekn name ve kayıt zamanı bilgilerini oluşturup
                                            // oluşan objeyi liste ekler
        Scanner scan = new Scanner(System.in);
        System.out.println("adınızı giriniz");
        //String ad = scan.nextLine();//kullanıcı objesi için name alındnı

        Kullanıcı k1 = new Kullanıcı(scan.nextLine(), LocalDateTime.now()); // k1 objesi name kullanıcıdan sistemdende saati alacak
        kullanıcıKisiler.add(k1);// oluşturrulan k1 objesi liste eklendi

        return kullanıcıKisiler;


    }
    /*

3- Registration(Kayıt) classı na aynı zamanda kendine verilen(parametre)
ArrayListteki userlardan(kullanıcı obj) her dakikanın ilk 10  saniyesinde kaydolanları
yazdıran printHappyUsers(sanslıKullanıcı) isminde bir metod create ediniz

     */
//3. step
    public void  sanslıKullanıcı ( ArrayList<Kullanıcı>  kullanıcıKisiler){// kullanıcı listindeki objlerin kayıtzamının 10 sn den az olup olmadığına göre şanslı kullanıcı print edecek

        for (Kullanıcı k: kullanıcıKisiler) {//forechle yaptık. Kullanıcı class dan kayıtAl metodu ile üretilip KullanıcıKişi listine eklenen objler döngüye alındı. forech de sıra önemli olmadığı için ayaptık
            if(k.kayıtZamanı.getSecond()<=10){
                System.out.println(k.name+" Şanslı kişisin. Sisteme giriş zamanı = "+ k.kayıtZamanı+". saniye ");
            }else System.out.println(k.name+ " şanslı kişi değilsin sisteme giriş zamanı = "+k.kayıtZamanı+" saniye");

        }


    }
    public void listele(ArrayList<Kullanıcı>  kullanıcıKisiler){
        System.out.println(kullanıcıKisiler);//obj kullanıcı Classtaki toString print eder

    }
}




