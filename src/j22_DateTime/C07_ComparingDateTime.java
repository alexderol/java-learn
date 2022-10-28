package j22_DateTime;

import java.time.LocalDate;

public class C07_ComparingDateTime {//compar karşılaştır
    public static void main(String[] args) {
        LocalDate bugun = LocalDate.now();
        LocalDate falangun = bugun.minusDays(2);
        LocalDate fesmekanGun = bugun.plusDays(3);
        System.out.println("bugun = " + bugun);
        System.out.println("falangun = " + falangun);
        System.out.println("fesmekanGun = " + fesmekanGun);
        System.out.println("bugun.isBefore(falangun) = " + bugun.isBefore(falangun));
        System.out.println("bugun.isBefore(fesmekanGun) = " + bugun.isBefore(fesmekanGun));
        System.out.println("bugun.isAfter(fesmekanGun) = " + bugun.isAfter(fesmekanGun));
        System.out.println("falangun.isAfter(fesmekanGun) = " + falangun.isAfter(fesmekanGun));
        System.out.println("bugun.isLeapYear() = " + bugun.isLeapYear());// is ile başlayan methodlar boolean return eder
        LocalDate bu = LocalDate.ofYearDay(2012,250);
        System.out.println("bu.isLeapYear() = " + bu.isLeapYear());


        System.out.println("bugun.compareTo(falangun) = " + bugun.compareTo(falangun));
        System.out.println("bu.compareTo(bugun) = " + bu.compareTo(bugun));
        LocalDate erolBrtDay = LocalDate.of(1987,05,22);
        LocalDate haldeBrtDay = LocalDate.of(1985,12,2);
        System.out.println("erolBrtDay.compareTo(haldeBrtDay) = " + erolBrtDay.compareTo(haldeBrtDay));

        /*     ComperaTo komutu işlevi:
2020-05-23 >  2018-04-02   compareTo =>  2  en büyük fark yılda olduğu için
2020-05-23 >  2020-04-02   compareTo =>  1  en büyük fark ayda  olduğu için
2020-05-23 >  2020-05-02   compareTo =>  21  en büyük fark günde olduğu için
 önce yıllara bakar sonra aylara bakar sonra günlere bakar büyük zaman diliminden küçkü zaman dilimine doğru yani yıl ay gün şeklinde çalışr
 */


    }
}
