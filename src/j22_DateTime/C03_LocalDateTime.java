package j22_DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class C03_LocalDateTime {
    public static void main(String[] args) {
        //LocalDateTime ---> tarih (yıl ay gün ) ve zaman (saat dakika saniye milisaniye) bilgilerini tutar

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("ldt = " + ldt);

        LocalDate d = LocalDate.of(2016,3,13);// tarih ataması yapıldı
        LocalTime t = LocalTime.of(14,45,35);// zaman ataması yapıldı

        LocalDateTime trhZmn = LocalDateTime.of(d,t);
        System.out.println("trhZmn = " + trhZmn);

        LocalDateTime ldt1 = LocalDateTime.of(1987, Month.MAY,22,20,30);// 1987 yılının 22 mayıs 22:20 saatine saniyesine gittik
        System.out.println("ldt1 = " + ldt1);
        System.out.println("trhZmn.getDayOfMonth() = " + trhZmn.getDayOfMonth());
        System.out.println("trhZmn.getDayOfWeek() = " + trhZmn.getDayOfWeek());

        System.out.println("trhZmn.plusWeeks(3).minusWeeks(3).plusHours(13).minusSeconds(72) = " + trhZmn.plusWeeks(3).minusWeeks(3).plusHours(13).minusSeconds(72));



    }
}
