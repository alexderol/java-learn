package j22_DateTime;

import java.time.LocalDate;
import java.time.Month;

public class C01_LocalDate {

    /*

     */


    public static void main(String[] args) {

        LocalDate bugün = LocalDate.now();// new yoktur kullanırsan CTE alırsın
        System.out.println(bugün);

        System.out.println("bugün.getYear() = " + bugün.getYear());
        System.out.println("bugün.getDayOfYear() = " + bugün.getDayOfYear());
        System.out.println("bugün.getDayOfMonth() = " + bugün.getDayOfMonth());
        System.out.println("bugün.getMonthValue() = " + bugün.getMonthValue());
        System.out.println("bugün.atTime(1,6,1,11) = " + bugün.atTime(1, 6, 1, 11));
        System.out.println("bugün.getDayOfWeek() = " + bugün.getDayOfWeek());

        LocalDate date2= LocalDate.of(1923,10,29);
        LocalDate date3= LocalDate.of(2015, Month.DECEMBER,2);

        // verilen bir tarihin öncesi ve sonrasına gitme

        System.out.println("date2.plusDays(12) = " + date2.plusDays(12));
        System.out.println("date3.plusMonths(3) = " + date3.plusMonths(3));
        System.out.println("date2.plusYears(2) = " + date2.plusYears(2));
        System.out.println("bugün.plusWeeks(6) = " + bugün.plusWeeks(6));
        System.out.println("bugün.minusDays(123) = " + bugün.minusDays(123));
        System.out.println("bugün.plusDays(43).minusMonths(3).plusWeeks(3).minusYears(2) = " + bugün.plusDays(43).minusMonths(3).plusWeeks(3).minusYears(2));




    }



}
