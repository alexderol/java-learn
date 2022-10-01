package j08_Ifstatement_TernaryOperator.tasks;

import java.util.Scanner;

public class _05_if_else_if_statement5 {

    public static void main(String[] args) {

    /*  90.25 ve 90.25 değerinde iki double oluşturun.
        Eğer ilk double, ikinci double'dan büyükse  "Hello World" yazdırın.
        Eğer ilk double, ikinci double'dan küçükse "Not Hello World" yazdırın.
        Aksi halde (else) "I love java" yazdırın. */
    double a = 90.25, b = 90.25;
    if (a>b) {
        System.out.println("Hello World");
    }
    if (a<b){
        System.out.println("Not Hello World");
    }else System.out.println("I love java");




    }
}
