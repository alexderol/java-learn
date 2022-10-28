package j22_DateTime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class C08_Period {
    public static void main(String[] args) {
        //Period --> iki tarih arasında geçen tekrarlanabilen zamanı tutar


        LocalDate bugun = LocalDate.now();
        LocalDate erolBrtDay= LocalDate.of(1987,05,22);
        Period fark = Period.between(erolBrtDay,bugun);
        System.out.println("fark = " + fark);

        System.out.println("fark.toTotalMonths() = " + fark.toTotalMonths());
        System.out.println("fark.getDays() = " + fark.getDays()); //farkın gün bilgisi gelir toplam kaç gün değil ama

        System.out.println("*** \n");
        System.out.println("bugun = " + bugun);
        Period period5Gun = Period.ofDays(5);// 5 günde bir tekraryayan period
        Period period7Ay = Period.ofMonths(7);//7 ayda bir tekrarlanan
        Period period2Yıl = Period.ofYears(2);//2 yılda bir tekrarlanan
        Period periodx = Period.ofMonths(7).ofDays(21);////burada 21 çalışır 7 ay çalışmaz

        bugun=bugun.plus(period5Gun);
        System.out.println("bugun = " + bugun);

        bugun=bugun.minus(period7Ay);
        System.out.println("bugun = " + bugun);
        //Trick-- period tanımlamada birden çok zaman parametresi tanımlanırsa son parametre çalışır aşağıda örneği var
        bugun=bugun.plus(periodx);
        System.out.println("bugun = " + bugun);// periodta çoklu tanımlamada en son ne yazdıysan o çalıaşır burada da 21 gün çalışır öncesi yani 7 ay çalışmaz

        //Task--05/09/2022 de başlayan kurs 9 ay sürüyorsa ne zaman biter print eden code create ediniz
        LocalDate başlayan = LocalDate.of(2022,9,5);
        Period bitis = Period.ofMonths(9);
        System.out.println("başlayan.plus(bitis) = " + başlayan.plus(bitis));
        System.out.println("başlayan.plus(bitis).format(DateTimeFormatter.ISO_DATE) = " + başlayan.plus(bitis).format(DateTimeFormatter.ISO_DATE));// yazım formatı için
        //ISO-->International Organization for Standardization


    }
}
