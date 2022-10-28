package tasks.grade;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {
    /*
    Runner Class :  3 adet  ders ve 1 adet öğrc (maxCredit=10) obj create ederek öğrencinin alabileceği ve
    alamayacagı dersleri print eden code create ediniz
     */
    public static void main(String[] args) {

        Lesson les1 = new Lesson();
        les1.name="Java";
        les1.credit=5;

        Lesson les2 = new Lesson();
        les2.name="Phyton";
        les2.credit=6;
        Lesson les3 = new Lesson();
        les3.name="jira";
        les3.credit=13;


        Student ogrenci= new Student();
        ogrenci.name="erol";

       




    }
}


