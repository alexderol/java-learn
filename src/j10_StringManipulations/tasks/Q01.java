package j10_StringManipulations.tasks;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        // TASK : Kullanıcıdan alacağınız bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir şarkı sözü yazınız");
        String söz = scan.nextLine();
        System.out.println(söz.contains(" "));


    }
}

