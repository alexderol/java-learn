package j29_Exceptions;

import java.time.DateTimeException;
import java.time.LocalDateTime;

public class C08_DateTimeException {
    public static void main(String[] args) {

        //LocalDateTime date = LocalDateTime.of(2022,11,33);//RTE



        try {
            LocalDateTime date = LocalDateTime.of(2022,11,40,01,15,55);
            System.out.println("bu yazıyı okuduysan Exception fırlatmadı trydasın");

        }catch (DateTimeException e){
            System.out.println("hata var hatta catch çalıtı----> "+e.getMessage());

        }
        System.out.println("handle edilmiştir");


    }
}
