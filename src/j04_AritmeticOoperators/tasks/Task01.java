package j04_AritmeticOoperators.tasks;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Task01 {
	public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
		int x = 4;
        x++;//5
        x += x;//10
        --x;//9
        x = 7 + x;//16
        x *= x;//256
        x -= 3;//253

        System.out.println(" x = " + x );
        
        int a = 3;
        double d = 4.5;

        d+=a;//d=7,5
        a+=d;//7,5+3=10,5 a=10 oldu int olduğu için
        d-=a;//7,5-10=-2,5 d double olduğu için küsürat olur -2,5 oldu
        a-=d;//10-(-2,5)=12,5 a =12 olur

        System.out.println(" d = " + ++d );//1,5
        System.out.println(" a = " + a-- );//12

            int i = 5;
            i+=i+5;//15

            short s1= 5;
            short s2=10;
            s2=32+15;

            s2= (short) (s1+s2);
           // s2=s1+5;
            s2+=s1;
            s2+=s1+5;
            //short s3=s1+s2;

            System.out.println("Arabanızın kapı sayısını giriniz :");
            byte kapi = scan.nextByte();
            System.out.println("kapi = " + kapi);
            scan.nextLine();


            /*    kullanıcının  10 sene önceki yaşadığın şehri print eden code create ediniz.   */
            System.out.println("10 yıl önce yaşadığınız şehri giriniz: ");
            String sehir = scan.nextLine();
            System.out.println("sehir = " + sehir);

            System.out.println("Doğum gününüzü giriniz :");
            String dogumGunu = scan.nextLine();
            System.out.println("dogumGunu = " + dogumGunu);



    }

}
