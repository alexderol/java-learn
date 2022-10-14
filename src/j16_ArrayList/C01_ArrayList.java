package j16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class C01_ArrayList {
    /*
     Array List genel Tanimi:

            ArrayList<Type> arrayListName = new ArrayList<Type>();
            List<Type> arrayListName = new ArrayList<>();**bestpractice**

             1. Type : String, Integer, Double, Long, Byte, Short, Boolean, Object, .... seklinde olmalidir
                - ArrayList<int> hatali bir tanimlamadir. Type wrapper class dedigimiz object türünden olmalidir
                - primitive'lerin wrapper classlari Büyük harflar baslayan isimleridir
                - int'n wrapper class'i        --> Integer'dir
                - double'un wrapper class'i    --> Double'dir. vs...

            2.  - Arrayler tanimlanirken sabit bir .length;'de tanimlanir ve bu length degistirilemez
                - ArrayList'ler tanimlamada .size(); belirmeme zorunlulugu yoktur degistirilebilir.
            3.  Intellij sonda bos biralikan <> yerine <~> seklinde ifade yazabilir bu ifade tanimdaki tür ile ayni anlamindadir.

    List declarations(tanımlama) :
    Array den farki boyut esnekleğidir.Array'lerde length sabittir, degistirilemez. ArrayList'lerde (List) length esnektir.
     eleman ekledikce List size'ini artirir,  eleman sildikce List size'ini azaltir.


    key word: List<wrapper Class> name=

    List'e assaign etme(atama) :
    List'ler data type olarak primitive'leri kabul etmez. Primitive'lerde data type'ini non-primitive yapmak icin wrapper class'lari kullanilir.
    List<wrapper Class> name = new List<>()      *****yanlışşşşşşş (<> :jenerik wrapper Class dan parametre alır.)
    List<wrapper Class> name = new ArrayList<>() *****doğru
    List<wrapper Class> name = new ArrayList<Wrapper Class>() *****doğru->best practice
    ArrayList<wrapper Class> name = new ArrayList<>()  *****doğru

    List'e ilk değer atama (initialize):....
    1.yol : asList();
    ArrayList<Integer> sayı= new ArrayList<>(Arrays.asList(1,2,3)) demek 1,2,3 elemanlarini array olarak al demektir.
    2.yol : Listof();
    ArrayList<String> ulkeler= new ArrayList<String>( List.of("Almanya", "Fransa", "Ingiltere", "Ispanya", "Italya") );

    ArrayList ler array'lerin aksine direkt olarak ekrana yazdirilabilirler-->  print için:  System.out.println(name);
    Array'ler Arrayy.toString(arrayAdi); ile yazdirilabilir.


    Collections ==> Bir araya getirilmis parcalar anlamına gelir. ArrayList, Set, Vector, Queue ler java collections sınıfı nesneleridir.

 */

    public static void main(String[] args) {

        int sayi=33;//tek bir data saklayabilen variable

        int sayi1[]=new int[5];// 5 değer saklayabilen yapı

        int sayi2[][]=new int[5][6];// 5*6 = 30 değer saklayabilen yapı

        ArrayList<Integer>sayiList= new ArrayList<>();// istenildiği kadar int değer saklayan yapı .... ArrayList bu işe yarıyo


                ///oluşturulan boş arrayliste değer atama
        ArrayList<Integer>listSayi = new ArrayList<>(); // boş ınteger type list oluşturduk
        //1. Yol--> add(); methodu...

        System.out.println(listSayi);//[] boş yani

        listSayi.add(10);// listSayı ya ilk elemon olarak 10 değeri eklendi
        System.out.println(listSayi);//[10] yazar
        listSayi.add(39);
        listSayi.add(72);
        listSayi.add(61);
        listSayi.add(41);
        listSayi.add(41);

        System.out.println(listSayi);//[10, 39, 72, 61, 41, 41] tekrarlı eleman eklenebilir

        //2.yol --> Arrays.asList(); methodu

        //ArrayList<String> listIsim = new ArrayList<>();// şuan boş
        ArrayList<String> listIsim = new ArrayList<>(Arrays.asList("muharrem", "nur", "Enise", "fatih"));// doldu ArrayList.asList yaptık ve eklenmesi istediğimizi yazdık
        System.out.println("ListIsim = " + listIsim);

        // 3. Yol --> List.of(); methodu
        ArrayList<String> listUlke= new ArrayList<>(List.of("Alamanya", "Amerigonya", "İngiltere", "İsveç"));
        listSayi.add(2,14);// listde index2 ye 14  değeri eklendi . 2. indnexdeki eski eleman bir index ileri kaydırıldı
        System.out.println(listSayi);//2. indexe 14 çaktığını gördük eski 2. sıradaki ise bir ileri kaydırılmış



    }
}
