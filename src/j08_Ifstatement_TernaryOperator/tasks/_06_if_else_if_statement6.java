package j08_Ifstatement_TernaryOperator.tasks;

import java.util.Scanner;

public class _06_if_else_if_statement6 {

    public static void main(String[] args) {

        /*      8. satırda int number oluşturulmuştur.
                Eğer int number 0 yazdırılırsa "Im neutral",
                Eğer int number 0'dan büyükse "I m positive",
                Eğer int number 0'dan küçükse "I am negative" yazdırılsın.   */

        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayı giriniz");

        int number = scan.nextInt();


        //Kodu aşağıya yazınız. BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ.
        if (number==0){
            System.out.println("Im neutral");
        }
        if (number > 0){
            System.out.println("I am Positive");
                    }
        else System.out.println("I am Negative");
        }




    }

