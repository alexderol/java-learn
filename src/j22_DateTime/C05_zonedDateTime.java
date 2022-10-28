package j22_DateTime;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class C05_zonedDateTime {
    public static void main(String[] args) {
        //Herhangi bir ülke -şehir -->locak tarih ve zaman bilgisi tutar

        LocalDate trhZone = LocalDate.now(ZoneId.of("America/New_York"));//newyork localinin anlık tarih bilgisi tanımlandı
        LocalDate trhZone1 = LocalDate.now(ZoneId.of("Japan"));//localinin anlık tarih bilgisi tanımlandı

        System.out.println("trhZone = " + trhZone);
        System.out.println("trhZone1 = " + trhZone);

        ZonedDateTime zdt1 = ZonedDateTime.now(ZoneId.of("America/New_York"));//birden fazla saat dilimi olan ülkelerde yer de belirtmelisin
        ZonedDateTime zdt2 = ZonedDateTime.now(ZoneId.of("Japan"));

        System.out.println("zdt1 = " + zdt1);
        System.out.println("zdt2 = " + zdt2);


    }

}
