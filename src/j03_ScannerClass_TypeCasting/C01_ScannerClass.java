package j03_ScannerClass_TypeCasting;

import java.util.Scanner;

public class C01_ScannerClass {
    public static void main(String[] args) {

        // kullanıcıdan veri almak için şu 3 adım takip edilir...
        //1.Adım---ScannerClass tan obje creat edilir.
      //fScanner Scan=new Scanner(System.in);// Scanner Classından scan isminde değerini System içinden olan bir obj
        //

        //2.Adım--- Kullanıcıdan istenen veri için bilidirimde bulunulur--sout("...")
      //fSystem.out.print("adınızı giriniz :");// println varsa consolda isim yazma yeri aşağıda olur ancak print olursa hemen yanında olur


        //3.Adım---Kullanıcının girdiği veri data typene göre bir variable atanır. kullanıcıdan gelecek bilgiye göre string yada int oluşturulur

      //fString isim= Scan.nextLine();// kullanıcıdan gelen String type de isim verisi scan objesinin nextLine methoduyla atandı.

      //f System.out.println("isim = " + isim);

        //TASK1--Kullanıcının girdiği değere göre kare alanı ve çevresini hesaplayan bir code creat ediniz.


        //fScanner scanner= new Scanner(System.in);//1.Adım obje oluşturma
       //f  System.out.println("karenin kenarını giriniz :");//2.Adım
       //f  int kenar= scanner.nextInt();//3.Adım
       //f System.out.println("alan :"+(kenar*kenar)+" çevre :"+(kenar*4));

        /*/TASCK-- kullanıcının gunde içtiği cay ve kullandığı seker değerine göre bir yılda
        kaç kg şeker kullandığı hesaplayan bir cade create ediniz
        1 şeker=1.7 gr
        örnek: Input :  cay sayisi : 10 seker sayisi :2
               output: yilda 12.41 kg seker kullanıyorsunuz
         */

      /*System.out.println("günlük içtiğiniz çay sayısını giriniz :");//2. adım çünkü 1. adım var 26 da
        int caySayisi= Scan.nextInt();// çay için 3. adım yani

       System.out.println("günlük şeker sayınızı giriniz :");
        int seker= Scan.nextInt();// şeker için 3 adım

       System.out.println("yıllık şeker tüketiminiz :"+(caySayisi*seker*1.7*365)/1000+"kg");// 1.7 1 şekerin gr hali 365 yıllık tüketim /1000 de kg çevirme

       */
        //////1. anlatım
       //f Scanner scan= new Scanner(System.in);
       //f System.out.println("isminizi  giriniz =");
       //f char ch= scan.nextLine().charAt(0);// kullanıcıdan gleen string ifadenin 0. index ilk alır karakterini
       //f System.out.println("isminizin ilk karakteri ="+ch);


//alt a basıp seç silme seçme vs  yap aynı anda

        ///isminin ilk harfi için // char ch= scan.nextLine().charAt(0) alır charAt(0,1,2....) istediğimiz harfi alırken


       // yeni anlatım

        Scanner scan= new Scanner(System.in);
        System.out.println("isminizi  giriniz =");
        String ad= scan.nextLine();
        System.out.println("ad= "+ad);//kullanıcının girdiği ilk ifadeyi ad'e atar

/*Scanner sc = new Scanner(System.in);//1. adım
        System.out.println("isminiz giriniz : ");//2. adım
        // char ch = sc.nextLine().charAt(0);// kullanıcıdan gelen string ifadenin 0. index ilk  karakteririni alır
        // System.out.println("isminizin ilk karakteri :" + ch);
        // String isim=sc.nextLine();//kullanıcını girdiği tüm satırı isim'e atar
        String ad = sc.next();//kullanıcını girdiği ilk ifadeyi  ad'e atar
        System.out.println("ad = " + ad);
        // System.out.println("isim = " + isim);

 */
    ///TYP CASTİNG///


        //byte-short-int-long-float-- doğal sıra







    }

}
