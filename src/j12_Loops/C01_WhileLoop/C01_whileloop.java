package j12_Loops.C01_WhileLoop;

import java.util.Scanner;

public class C01_whileloop {
    /*
    task-- 11 den 20 ye kadar olan tamsayıları print eden code create edin

     */
    public static void main(String[] args) {

        for (int i = 11; i < 21; i++) {
            System.out.print(i + " ");

        }
        System.out.println("****While Çözüm****");

        int basla = 11;//fordan farkıl bunu koymamız şart//while başlangıc değeri
        while (basla < 21) {//basla 21 den küçük iken body action uygula/
            System.out.print(basla + " ");
            basla++;//while döngü değşim komutu basla+=1
        }
        //task-2--> 7 kere javaCAN print eden code create edin
        System.out.println("****While task 2 Çözüm****");
        int i = 1;
        while (i < 8) {
            System.out.println(i + "--> javaCAN");
            i++;

        }
        System.out.println("****While task 3 Çözüm****");
        //Task-3--2 basamaslı tek sayılar ıyanyana print eden code create edin

        int t = 11;
        while (t < 100) {
            //System.out.println(t);t+=2; //1. çözüm
            if (t % 2 == 1) System.out.println(t);
            t++; //2. çözüm

        }


        // task04-> girilen metni while loop ile  tersden print eden code create ediniz
        System.out.println("   *** task04 ***   ");

        Scanner sc=new Scanner(System.in);
        System.out.println("bir metin giriniz : ");
        String  metin= sc.nextLine();
        int metinUzunluk=metin.length();

        while (metinUzunluk>=1){//metnin uzunlugu 0 a eşit ve buyuk iken
            System.out.print(metin.charAt(metinUzunluk-1));//
            metinUzunluk--;
        }

        ///task5--> girilen tamsayıya kadar tamsayıların toplanını print eden code create edin
        System.out.println("   *** task05 ******   ");


        System.out.println("bir tam sayı gir");
        int say=sc.nextInt();
        int toplam=0;//döngü aksiyonundan oluşacak toplam için boş int oluşturduk
        while (say>0){//say 1 olana kadar
            toplam+=say;//her döngüde say topla ekle
            say--;//her döngüde bir azalt
        }
        System.out.println("girdiğin sayıların toplamı= "+toplam);

        System.out.println("   *** task06***   ");
        //Task 6-- girilen tam sayıya kadar faktöriyel print eden code cereat et

        System.out.println("faktöriyel için sayı gir");
        int num=sc.nextInt();
        int faktöriyel=1;
        while (num>1){
            faktöriyel*=num;
            num--;
        }
        System.out.println("faktöriyel= "+faktöriyel);

        System.out.println("   *** task07***   ");













    }









    }

