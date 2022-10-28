package j22_DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class C09_OCA01 {
    public static void main(String[] args) {
                        // date                                                   dateTime
        String date = LocalDate.parse("2014-05-04").format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(date);
        //EL cevap-->LocalDate ama format şekli LocalDateTime o yüzden eception verir yani
            //what is the result ?

        /*
         * A) May 04, 2014T00:00:00:000
         *
         * B) 2014-05-04T00:00:00:000
         *
         * C) 5/4/14T00:00:00:000
         *
         * D) An exception is throw at runtime  **cevap***
         */



    }
}
