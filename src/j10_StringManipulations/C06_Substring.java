package j10_StringManipulations;

import java.util.Scanner;

public class C06_Substring {
    public static void main(String[] args) {
       /*
substring()
Metin icinde, istenilen araliktaki bir parcasina ya da butunune ulasilabilir. Sonuc ise String dir.
substring(i)->Method'a parametre olarak girilen  index'den sona kadar olan parcayi return eder
substring(baslangicIndexi, bitisIndexi)->Method'a parametre olarak girilen  baslangicIndexi'den bitis
indexi'e kadar parçayı return eder
baslangic indexi ==> inclusive/dahil
bitis indexi ==> eclusive/haric
 */
        String str = "java bilenin sırtı yere gelmez";
        String yeniStr = str.substring(10);//10 karakter ve sonrasını yazdırır
        System.out.println(yeniStr);//
        //son 10 değeri nasıl yazdırırırz aşağıya bak
        System.out.println("str.substring(str.length(10)) = " + str.substring(str.length()-10));// son 10 karakteri bulduk length ile

        //ilk 10 karakteri nasıl yazdırırız aşağıya bak
        System.out.println("str.substring(0,10) = " + str.substring(0, 10));// burada 0 alır ancak 10. yu almaz yani java 0 dan başlar indexi saymaya ona göre

        //ilk karakteri nasıl yazdırırız
        System.out.println("str.substring(0,1) = " + str.substring(0, 1));// yani burada 0. karakteri yazdır dedik yani ilk karakter capiş ok


        /*
        TASK--> girilen 4 hafrli kelimeyi tersten yazdırınız
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("4 harfli kelime gir =");
        String word = scan.next();
        if (word.length()!=4){
            System.out.println("4 harfli kelime girmeni bekledik öyle yaparmısın");
            }
        else {
            //System.out.println(word.substring(word.length()-1));//e
            System.out.println(word.substring(3,4));
            System.out.println(word.substring(2,3));//l
            System.out.println(word.substring(1,2));//a
            System.out.println(word.substring(0,1));//k

        }




    }



}
