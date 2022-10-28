package j16_ArrayList;

import java.util.Scanner;

public class romanRakamş {

    /*  TASK :
           Create a method to convert Roman numerals to numbers
           Romen rakamlarını sayılara dönüştürmek için bir method create ediniz
           Input:
               System.out.println(romanNumbers(805));
                 System.out.println(fromRomans("DCCCV"));
             Output: DCCCV   805

             Input: s = "M-CM-XC-IV"
           Output: 1994
           Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.

                 M + [C M] + [X L] + V   ---->   1945
                 The chars in the brackets are in ascending order.
                  Parantez içindeki karakterler artan sıradadır (C-100, M-1000) ---> [C M]=900
I     1
V     5
X     10
L     50
C     100
D     500
M     1000

      */
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("**********ROMAN RAKAMINA ÇEVİRME PROGRAMINA HOŞGELDİNİZ*******");
        System.out.println("roman rakamını sayıya çevirmek için 1'i, sayıyı roman rakamına çevirmek için 2'i tıklayın.");
        int secim = sc.nextInt();
        int[] arr = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        String[] arr1 = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        switch (secim) {
            case 1:
                fromRomans(arr, arr1);
                break;
            case 2:
                romanNumbers(arr, arr1);
                break;
            default:
                System.out.println("lütfen 1 veya 2yi tıklayın. ");
        }

    }
    private static void fromRomans(int[] arr, String[] arr1) {

        System.out.println("Roman rakamı giriniz: ");
        String str = sc.next().toUpperCase();
        int sayi = 0;
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 'M':
                    sayi += 1000;
                    break;
                case 'D':
                    sayi += 500;
                    break;
                case 'C':
                    if (str.charAt(str.length() - 1) == 'C') {
                        sayi += 100;
                    } else if (str.charAt(i + 1) == 'M') {
                        sayi += 900;
                        i++;
                    } else if (str.charAt(i + 1) == 'D') {
                        sayi += 400;
                        i++;
                    } else
                        sayi += 100;
                    break;
                case 'L':
                    sayi += 50;
                    break;
                case 'X':
                    if (str.charAt(str.length() - 1) == 'X') {
                        sayi += 10;
                    } else if (str.charAt(i + 1) == 'C') {
                        sayi += 90;
                        i++;
                    } else if (str.charAt(i + 1) == 'L') {
                        sayi += 40;
                        i++;
                    } else
                        sayi += 10;
                    break;
                case 'V':
                    sayi += 5;
                    break;
                case 'I':
                    if (str.charAt(str.length() - 1) == 'I') {
                        sayi += 1;
                    } else if (str.charAt(i + 1) == 'X') {
                        sayi += 9;
                        i++;

                    } else if (str.charAt(i + 1) == 'V') {
                        sayi += 4;
                        i++;
                    } else
                        sayi += 1;
                    break;
            }

        }
        System.out.println(sayi);
    }

    private static void romanNumbers(int[] arr, String[] arr1) {
        System.out.println("sayı giriniz: ");
        int sayi = sc.nextInt();
        String romen = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            while (sayi >= arr[i]) {
                sayi -= arr[i];
                romen += arr1[i];
            }

        }
        System.out.println(romen);

}}
