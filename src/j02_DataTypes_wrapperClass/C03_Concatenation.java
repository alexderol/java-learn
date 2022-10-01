package j02_DataTypes_wrapperClass;

public class C03_Concatenation {
    public static void main(String[] args) {
        //concatenation--birleştirme

        String ad="Erol";
        String soyad="Demir";

        int a=7;
        int b=11;
        // birden çok string variable ile farklı data type variablellar + ile işleme alınırsa
        // java birleştirme yaparak yeni bir string oluşturur

        System.out.println(ad+soyad+a+b);//ErolDemir711

        System.out.println(a+ad+soyad+b);//7ErolDemir11

        System.out.println(a+b+ad+soyad);//18ErolDemir iki int arka arkaya gelirse toplar string sonra birleşir

        System.out.println(" "+a+b);// 711 boşluk string olduğu için artık sonuç string olur

        System.out.println(ad+soyad+(a+b));//ErolDemir18 özel yapılar ()  önce çalışır sonra string çalışır

        System.out.println((a+b)+ad+soyad);//18ErolDemir

        System.out.println(ad+(a-b)+(a-b));//Erol-4-4

        System.out.println(ad+((a-b)+(a-b)));//Erol-8
        char ch='1';//
        System.out.println(ad+ch);//Erol1

        System.out.println(a+ch+ad);//a nın değeri 7 ama ch nin değeri ascii değeri 49 toplanır //56Erol
        //a+ch de string olmadığı yerde concatenation olmaz

        System.out.println(ad+(ch+b));//Erol60 (ch+b) ch ascii değeri 49 idi 49+11=60 oda Erol60 olur

        System.out.println(a+ad+ch);//7Erol1  ch burada 1 dir çünkü string oldu

        /*
        TRİCK --- char data turu isleme girdiği variable in turune göre farklı işlem yapar
        eğer işleme girdiği variable aritmetik bir işlemse ascii değeri ile işlem yapar
         */

        /*
        TRİCK--Bir aritmetik işlem içinde String kullanılırsa, aritmetik işlem önceliğine göre
         işlem yapılıp String variable'a Concatenation yapılır.

         */
        /* günün task
        /*
        TASK :
        Verilen sayi1 ve sayi2 variable’larinin degerlerini degistiren (SWAP)
        code create edip print ediniz.
        a) 3. bir variable kulanarak
        b) 3. bir variable kullanmadan

	     input	: sayi1=20 ve sayi2=34;
		 output  :  sayi1=34 ve sayi2=20



        int sayi1=20;
        int sayi2=34;

        // a)
        System.out.println("*** a çözümü ***");







        // b)
        System.out.println("*** b çözümü ***");



         */


        //çozüm-1
        int sayi1=20;
        int sayi2=34;
        // çalışması için code yorumdan  çıkar
        /*
        int sayi3=0;// sayı2 yi boş olan sayı3 e koy
        sayi3=sayi2;// sağdaki soldakine atandı
        sayi2=sayi1;
        sayi1=sayi3;

        System.out.println("swap işlemi sonrası sayi1= "+sayi1);
        System.out.println("swap işlemi sonrası sayi2= "+sayi2);
        */


        //cözüm---2----



        sayi2=sayi1+sayi2;
        sayi1=sayi2-sayi1;//54-20=34
        sayi2=sayi2-sayi1;//54-34=20
        System.out.println();


        System.out.println("swap işlemi sonrası sayi1= "+sayi1);
        System.out.println("swap işlemi sonrası sayi2= "+sayi2);
















    }


}
