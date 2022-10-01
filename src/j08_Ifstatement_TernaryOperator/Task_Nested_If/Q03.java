package j08_Ifstatement_TernaryOperator.Task_Nested_If;

import java.util.Scanner;

public class Q03 {

    public static void main(String[] args) {
		/* TASK :
		 *  Kullanicinin boyunu  m  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz

	    INFO :
		BMI = kilo(kg) /(boy*boy)(m)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz 
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.
		
		 */
        System.out.println("Vücuk kitle endeksinizi hesaplama programına hoşgeldiniz...\nSağlıkla Kalın :)");
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen Kilonuzu yazınız = ");
        double kilo = scan.nextInt();
        System.out.print("Lütfen boyunuzu cm olarak yazınız = ");
        double boy = scan.nextInt();
        double VKE = kilo / (boy/100 * boy/100);

        if (VKE <= 20) {
            System.out.println("Oldukça Zayıfsınız .....");
        } else if (20 < VKE && VKE <= 25) {
            System.out.println("Normal sinirlardasınız..");
        } else if (25 < VKE && VKE <= 30) {
            System.out.println("Şişman kategorisindesiniz..");
        } else if (30 < VKE) {
            System.out.println("Normal sinirlardasınız..");

        }

    }
}
