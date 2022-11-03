package j24_AccessModifier;

public class C01_AccessModifier {

        /*
          1) "private" class member'lar sadece icinde bulunduklari class'larda kullanilabilirler.
         Diğer class'lardan "private" class memler'lari kullanamaz.

         2) Diğer package'lerden   olusturulan object için class'i import edilmeli

         3) Diğer package'lerden default class memberlara erişilemez.
          "default" ile "package private" es anlamlidir.

         4) public class member'lara herkes her yerden erişebilir.(farkli java projesi disinda).

          5) "protected" class member'lara ayni package'dan erişilebilir. Farkli package
         için :
                a)Child class erişebilir.
                b)Child class degil ise erişilemez.

          6) Class'lar için  sadece "public" ve "default" access modifier kullanilir.
          Class tanımlanırken "private" veya "protected" access modifier kullanilmaz.

 */

    private int privateYas=24;
    int defaultYas=33;//Acces yazılmazsa default tur
    protected int protectedYas=40;
    public int publicYas=48;

    private C01_AccessModifier (){//private p siz cons olşşturk
        System.out.printf("private constructor runing");
    }

    public C01_AccessModifier(int privateYas, int defaultYas){
        System.out.printf("public private constructor runing");
    }

    private void privateMethod(){
        System.out.printf("private method runing");
    }
    protected  void protectedMethod(){
        System.out.printf("protectedm method runing");
    }

    //C01_AccessModifier obj = new C01_AccessModifier();// kendi classından çağırılır









}
