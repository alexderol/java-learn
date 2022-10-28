package j22_DateTime;

import java.time.LocalDate;
import java.time.LocalTime;

public class C02_LocalTime {
    public static void main(String[] args) {

        LocalTime suAn = LocalTime.now();//System den anlık zaman bilgisi alır
        System.out.println("suan = " + suAn);
        System.out.println("suAn.getHour() = " + suAn.getHour());
        System.out.println("suAn.getNano() = " + suAn.getNano());
        System.out.println("suAn.getSecond() = " + suAn.getSecond());

        LocalTime time1 = LocalTime.of(12,10,11);// istenilen saat dakika saniye atandı
        //belirli bir zamanda ileri geri zamana gidilebilir
        System.out.println("time1.plusMinutes(20) = " + time1.plusMinutes(20));
        System.out.println("time1.plusMinutes(150) = " + time1.plusMinutes(150));
        System.out.println("time1.minusHours(12).plusHours(12) = " + time1.minusHours(12).plusHours(12));


        LocalTime forBasi = LocalTime.now();
        System.out.println("forBasi = " + forBasi.getNano());

        int sayi = 0;
        for (int i = 0; i < 100000; i++) {
            sayi+=i;
        }
        LocalTime forSonu = LocalTime.now();
        System.out.println("forSonu.getNano() = " + forSonu.getNano());
        System.out.println("forSonu.getNano()-forBasi.getNano() = " + (forSonu.getNano() - forBasi.getNano()));


    }
}
