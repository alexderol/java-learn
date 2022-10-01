package j08_Ifstatement_TernaryOperator;

import java.util.Random;
import java.util.Scanner;

public class prc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //f System.out.println("Erol yaşını giriniz ");
        //f int yas1 = scan.nextInt();
        //f System.out.println("Halide yaşınızı giriniz");
        //f int yas2 = scan.nextInt();
        //f String sonuc = yas1>yas2 ? "Erol halideden büyük" : "Halide erol dan büyük";
        //f System.out.println("sonuc = " + sonuc);


        //fSystem.out.println("ikinici alıştırma *****");
        //fSystem.out.println("");
        //fSystem.out.println("a için bir sayı giriniz");
        //fint a = scan.nextInt();
        //fSystem.out.println("b için bir sayı giriniz");
        //fint b = scan.nextInt();
//f
        //fString amac = a>b ? (a>=100 ? (a<1000 ? "a sayısı 3 basamaklı": " a sayısı 3 basamaktan fazla" ) : "a sayısı 100'den küçük" ):"b a dan büyük";
        //fSystem.out.println("amac = " + amac);

        /*
         Kullanicidan 100 uzerinden notunu isteyin.
          Not'u harf sistemine cevirip yazdirin.
           50’den kucukse "D",
            =50  <60 arasi "C",
             =60  <80 arasi "B",
              =80’nin uzerinde ise "A"
               */

        //fSystem.out.println("***3. ALIŞTIRMA****");
        //fSystem.out.println("Sınavdan aldığınız notu giriniz ");
        //fint not = scan.nextInt();
        //fString giris = not>0 && not<100 ? "Notunuz hangi harf karşılığı birazdan gösterilecek" : "0 ile 100 arası bir not girin";
        //fSystem.out.println( giris);
        //fString sonuc =  not>0 && not<50 ? "D aldınız":(not>=50 && 60>not ? "C aldınız": (not>=60 && not<80 ? "B aldınız": (not>=80 && not<=100 ?
        //f    "A aldınız":"")));
        //fSystem.out.println( sonuc);


        /*TASK girilen bir yılın arttık (LEAP YEAR) olmasını kontrol eden code create ediniz...
        Kural1--4 ile bolünemeyen yıllar artık yıl değildir.
        Kural2 --4 ile bolünüp 100 ile bolünemeyen yıllar artık yıldır
        kural3 -- 4 ün katı olmasına rağmen 100 ile bölünebilen yıllardan sadece 400 ün katı olan yıllar artık yıldır
         */
        //fSystem.out.println("***4. ALIŞTIRMA***********");

        //fSystem.out.println("Bİr yıl giriniz");
        //fint yıl = scan.nextInt();
        //fString sonuc = yıl%4==0 ? "artık yıldır" : (yıl%4==0 && yıl%100==0 ? "artık yıl" : (yıl%400==0 ? "artık yıl":"artık yıl değil"));
        //fSystem.out.println(sonuc);

        /*Task-->
        girilen bir karakterin harf olup olmadığını kontral eden code create ediniz
        * */

        //fSystem.out.println("***5. ALIŞTIRMA***********");
        //fSystem.out.println("Bir şeyler yazınız");
        //fchar girdi = scan.next().charAt(0);
        //fString nedir = girdi>='A' && girdi<='Z' || girdi>='a' && girdi<='z' ? "Girilen Karakter Harftir" : "Girilen karakter harf DEĞİL";
        //fSystem.out.println(nedir);



        /*Task--> girilen iki sayıyı seçilen dört işlemden birine uygulayıp  sonucu
        print eden code create ediniz
        * */

        //fSystem.out.println("***6. ALIŞTIRMA***********");
        //fSystem.out.println("X sayısı için değer yazınız");
        //fint x = scan.nextInt();
        //fSystem.out.println("y sayısı için değer yazınız");
        //fint y = scan.nextInt();
        //fSystem.out.println("yapmak istediğiniz işlemi seçin \n + için 1 \n - için 2 \n / için 3 \n * için 4 ");
        //fint secim = scan.nextInt();
        //fString sonuc = secim==1 ? String.valueOf(x+y) : secim==2 ? String.valueOf(x-y) : secim == 3 ? String.valueOf(x/y) : secim == 4 ? String.valueOf(x*y) : "girilen değeri kontrol ediniz";
        //fSystem.out.println(sonuc);


        /*Task--> kullanıcının cinsiyeti kadın ise 60 yaşından büyük ve prim günü 6000
        den fazla ise emekliliğinin,
        kullanıcının cinsiyeti erkek ise 65 yaşından büyük ve prim günü 7000
        den fazla ise emekliliğini kontrol edip kalan yıl ve prim gününü print eden
         code create ediniz
        * */
        //fSystem.out.println("***7. ALIŞTIRMA***********");
        //fSystem.out.println("cinsiyet giriniz");
        //fString cinsiyet   = scan.nextLine().toLowerCase();
        //fSystem.out.println("Yaş giriniz");
        //fint yas = scan.nextInt();
        //fSystem.out.println("Prim günü girin");
        //fint prim = scan.nextInt();
        //fString emeklilikKadın = cinsiyet=="kadın" && yas>=60 && prim >= 6000 ? "emekli oldunuz" : (yas<60 && prim>=6000 ? (60-yas) + "yıl bekle" : (yas>=60 && prim < 6000 ? (6000-prim)+ "gün yatır" : "emekli olamazsın"));
        //fString emeklilikErkek = cinsiyet=="erkek" && yas>=65 && prim >= 7000 ? "emekli oldunuz" : (yas<65 && prim>=7000 ? (65-yas) + "yıl bekle" : (yas>=65 && prim < 7000 ? (7000-prim)+ "gün yatır" : "emekli olamazsın"));
        //fSystem.out.println(emeklilikErkek);

        /*Task--> TASK -> Kuualanıcının ehliyetinin varlığını kontrol ediniz.
          Ehliyeti varsa yıl tecrübesi 7 yıl ve üstü ise aldıgı mesafe 100000 km ve üzeri ise kontak anahtarını teslim ediniz
          aksi durumda tecrübe yılı ve mesafe eksiklerini print eden code create ediniz

        * */
        //fSystem.out.println("***8. ALIŞTIRMA***********");
        //fSystem.out.println("Ehliyetiniz var mı");
        //fboolean ehlyt = scan.nextBoolean();
        //fSystem.out.println("Ehliyetiniz kaç yıllık");
        //fint yıl = scan.nextInt();
        //fSystem.out.println("Kaç km araç kullandın");
        //fint km = scan.nextInt();
        //fString anahtar = ehlyt == true && yıl>=7 && km>=100000 ? "Kontak anahtarını teslim ediniz" : (yıl<=7 && km>=100000 ? (7-yıl)+ "tecrübe eksik": (yıl>=7  &&  km<100000 ? (100000-km)+ "yol sürde gel" : "Anahtarı alamazsın" ) );
        //fSystem.out.println(anahtar);


        /*
        2 basamaklı bir sayı tanımlayacaksın. sonra kullanıcı farklı iki basamaklı sayı girecek.
         eğer doğru bilirse büyük ikramiyeyi alacak. eğer sayıların yerleri farklıysa (45 ile 54 gibi) 2. büyük ikramiyeyi alacak.
        sadece 1 rakam tutuyorsa(yerlerinden bağımsız. örneğin sayı 45 tahmin 53. 5 tutuyor.)
        3. büyük ikramiyeyi alacak . hiç tutmuyorsa avcunu yalayacak

         */


        //fSystem.out.println("iki basamaklı bir sayı giriniz");
        //fint sayı1 = scan.nextInt();
        //fSystem.out.print("iki basamaklı bir sayı daha giriniz");
        //fint sayı2 = scan.nextInt();
        //fint sayı1birler = sayı1 % 10;
        //fint sayı1onlar = sayı1 / 10;
        //fint sayı2birler = sayı2 % 10;
        //fint sayı2onlar = sayı2 / 10;
        //f
//f
//f
        //fif (sayı1 == sayı2) {
        //f    System.out.println("büyük ikramiye senin");
        //f    ///ab               dc
        //f    //b         d         a          c
        //f} else if (sayı1birler == sayı2onlar && sayı2birler == sayı1onlar) {
        //f    System.out.println("2. ikramiye");
//f
        //f} else if (sayı1birler == sayı2birler || sayı1birler == sayı2onlar || sayı1onlar == sayı2birler || sayı1onlar == sayı2onlar) {
        //f    System.out.println("ikramiye 3 ");
        //f}
        //felse System.out.println("Avucunu yala");


        /* kullanıcıdan şifre ise
        ilk harf büyük olcak + büyük A ise geçerli değilse geçersiz
         */
        ///***İLK Harf bakmaca********//////

        //f System.out.println("şifrenizi giriniz");
        //f String pass = scan.nextLine();
        //f if (pass.charAt(0) >= 'A' && pass.charAt(0) <= 'Z') {
        //f     System.out.println("Büyük Harftir");
        //f } else if (pass.charAt(0) >= '0' && pass.charAt(0) <= '9') {
        //f     System.out.println("Rakamdır");
        //f
//f
        //f } else if (pass.charAt(0) >= 'a' && pass.charAt(0) <= 'b') {
        //f     System.out.println("Küçük Harftir");
        //f }else System.out.println("semboldür");

    /* Bugün günlerden ne diye sor
    sonra da kaç gün sonrasını merak ediyorsun diye sor

 */
        System.out.println("*****SWİTCH alıştırma******");
        System.out.println("");
        System.out.print("Bugün günlerden hangisi : \n pazartesi 1 \n Salı 2 \n Carşamba 3 \n Persembe 4 \n Cuma 5 \n Ctesi 6 \n Pazar 7");
        int gün = scan.nextInt();

        switch (gün) {
            case 1 :
                System.out.println("Bugün günlerden Pazartesi");
                break;
            case 2 : System.out.println("Bugün günlerden Salı");
                break;
            case 3 : System.out.println("Bugün günlerden Carşamba");
                break;

            case 4 : System.out.println("Bugün günlerden Persembe");
                break;
            case 5 : System.out.println("Bugün günlerden Cuma");
                break;
            case 6 : System.out.println("Bugün günlerden Ctesi");
                break;
            case 7 : System.out.println("Bugün günlerden Pazar");
                break;
            default:
                System.out.println("yanlış giriş");
                break;

        }

        System.out.print("Kaç gün sonrası hangi gün olduğunu öğrenmek mi istiyorsun o zaman gün sayısı giri");
        int sonra = scan.nextInt();
        int ilerisi = sonra%7 ;

        switch (ilerisi) {
            case 1 :
                System.out.println("Bugün günlerden Pazartesi");
                break;
            case 2 : System.out.println("Bugün günlerden Salı");
                break;
            case 3 : System.out.println("Bugün günlerden Carşamba");
                break;

            case 4 : System.out.println("Bugün günlerden Persembe");
                break;
            case 5 : System.out.println("Bugün günlerden Cuma");
                break;
            case 6 : System.out.println("Bugün günlerden Ctesi");
                break;
            case 7 : System.out.println("Bugün günlerden Pazar");
                break;

    }
        System.out.println("");
        System.out.println("Olmak istediğin yerdemisin, değilsen neden hala oradasın......");



}}


