package HaftaninTasks.User_Task_Girisli;

import java.time.LocalDateTime;

public class Kullanıcı {// kullanıcı obj üretecek kalıphane
    //1- Bir user(Kullanıcı) class oluşturun fields: name , registerDate(kayıtZamanı) (data type->LocalDateTime )
//task 1. step
    String name;//obj de değer alacak instance variable
    LocalDateTime kayıtZamanı;//obj değerini  alacak

    public Kullanıcı(String name, LocalDateTime kayıtZamanı) {// full parametreli teleskopik constructor
        this.name = name;
        this.kayıtZamanı = kayıtZamanı;

    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", kayıtZamanı=" + kayıtZamanı +
                '}';
    }
}
