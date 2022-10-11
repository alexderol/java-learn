package j12_Loops.C01_WhileLoop.Tasks;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        /*
        task -> x karakteri girilene kadar "javaCAN" x karakteri girildiğinde "jAVATAR" print eden code create ediniz.
        do-while lopp
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("birşeyler yazın");
        String kelim= scan.nextLine();

        do {

            System.out.println("javaCAN");


        }while (kelim.equals("x"));{ System.out.println("JAVATAR");}



    }
}
