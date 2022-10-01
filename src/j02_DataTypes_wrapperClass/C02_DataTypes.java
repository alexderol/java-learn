package j02_DataTypes_wrapperClass;

public class C02_DataTypes {
    public static void main(String[] args) {

               /*
		 Java'da  2 farkli data type vardir.
		 1)Primitive Data Type (8 tane)

		   a)boolean: Sadece True veya False değerlerini alabilir. sadece iki farkli deger alabildigi icin memory'de az(bir bit'lik) alan kaplar

		   b)char :Tek character'li (S, ?, 3, * gibi her bir sembol) ifadeler icin char data type'i kullanilir.
		   		her bir char memory'de 16 bit'lik yer kaplar.char deger mutlaka tek tirnak icine konulmalıdilir.
		   		char değerler aritmetik islemler için charlarin ASCII ("American Standard Code for Information Interchange") Table'daki degerlerini alır.

		   c)byte : -128'den +127 ye kadar tum tam sayi degerlerini alır.
		   		byte variable -> memory'de 8 bitlik alan kaplar.

		   d)short : -32768'den 32767'ye kadar tum tam sayi degerlerini alır.
		   		short variable -> memory'de 16 bıt alan kaplar.

		   e)int : -2,147,483,648'den 2,147,483,647'ye kadar tum tam sayi degerlerini alır.
		  		int variable -> memory'de 32 bit alan kaplar.

		   f)long : -9,223,372,036,854,755,808'den 9,223,372,036,854,755,807'ye kadar tum tam sayi degerlerini alır.
		   		long variable -> memory'de 64 bit alan kaplar.

		   g)float : ondalikli sayilar icin kullanilır.
		   		float variable -> memory'de 32 bit kullanir.
		   		float variable -> ondalik kisimlarinda en fazla 7 rakam barindirabilir.
		   		0.1234567
		   		Bir ondalikli sayinin float oldugunu belirlemek icin en sona(1.23f veya 1.23F) 'f' veya 'F' yazılmalıdır aksi halde variable double olarak tanımlanır.


		   h)double : ondalikli sayilar icin kullanılır.
		   		double variable -> memory'de 64 bit kullanir.
		 		double variable -> ondalik kisimlarinda en fazla 16 rakam barindirabilirler.
		 		0.1234567890123456

		 2)Non-Primitive Data Type
		 	String: Cift tirnak arasina yazilan sifir veya daha fazla character'lerden olusan variable.
		 	çift trnak arasına ne yazıyorsak string dir.

		 */

        String name= "erol";
        String yas= "35";
        int age= 22;
        boolean emeklimi= true;
        boolean ıtci= false;
        char ch='$';

        //******TASK-- 1999 yılında bir kişinin yaşını yazdırınız...*****

        int dtarihi=1999;
        int buyıl=2022;
        int yasınız=buyıl-dtarihi;
        System.out.println(yasınız);

        float f1=12.45f;
        float f2=23.56F;
        double boy=1.85;
        System.out.println(f1*f2);//12,45*23,56 demek

        //TASK--iki farklı byte tanımlayıp toplam farkını bulup print ediniz

        byte a=5;
        byte b=7;
        System.out.println(a-b);
        System.out.println(a+b);

        ///TASK--- iki farklı tamsayı türünde sayı tanımlayıp toplam farkını print ediniz
        byte e=5; //byte 127 altında sayıları verebilirsin 127 üstünde hata alırsın
        int d=1907;
        System.out.println(e+d);


        ///TASK--tam sayı ve ondalıklı sayı tanımlayıp toplamını bulunuz
        int i=1907;
        float s=15.2f;
        System.out.println(i+s);

        ///TASK--tam sayı ve char data type iki variable  tanımlayıp toplam print ediniz

        char h='&';  //ascıı değerini tam sayı ile toplar & asci değeri 38
        int w=19;
        System.out.println(h+w);

        ///TASK--ad ve soyadınızı ve yaşınızı print ediniz
        String ad="Erol";
        String soyad="Demir";
        int yass=36;
        System.out.println(ad+" "+soyad+" "+yass);


















    }
















}