package j10_StringManipulations;

import java.util.Scanner;

public class C07_Indexof_lastIndexof {
    public static void main(String[] args) {
        /* indexOf()
 * char karakter ya da String metnin kacinci indexden basladigini veren bir method dur. Sonuc integer dir.
 * Bu method index'i sorulan char'in String icindeki ilk gorunumunun index'ini return eder
  contains den farkı indexini verir, contains ise true false

*/


        String str = "Good";
        System.out.println("str.indexOf('o') = " + str.indexOf('o'));// 1 ilk görülen 'o' nun index nosunu verirr
        System.out.println("str.indexOf('d') = " + str.indexOf('d'));//3
        System.out.println("str.indexOf('D') = " + str.indexOf('D'));//-1
        //olmayan kakarter sorgulanırsa -1 return eder
        System.out.println("str.indexOf(\"od\") = " + str.indexOf("od"));//2  olur çünkü od kelimesinin başlangıcındaki o yu bulur ve indexi yazar

        ///*********lastindexof********
        /** lastIndexOf()
         *  String içinde aranan karakter(ler)in sondan itibaren ilk indexini verır
         *  indexOf un sondan olan hali fakat index numaraları değişmez.
         *  lastIndexOf() Method'u index'i sorulan character'in son gorunumunun index'ini return eder.
         *  indexOf() methodunda birden fazla character'in index'i sorulursa ilk character'in index'i return edilir.
         */
        String name = "mustafa nizamoğlu";
        System.out.println("name.indexOf('a') = " + name.indexOf('a'));//4
        System.out.println("name.lastIndexOf('a') = " + name.lastIndexOf('a'));//11
        //lastIndexOf sondan sola doğru ilerler ilk gördüğü a yı alır yani 11 karakter....
        System.out.println("name.indexOf(\"fa\") = " + name.indexOf("fa"));//5
        System.out.println("name.lastIndexOf(\"fa\") = " + name.lastIndexOf("fa"));//5
        //son iki sout da 5 olur çünkü saldan da sağdan da fa bir tane olduğu için aynı sonucu varir

        /*
        TASK-->Girilen cümlenin aşağıdaki durumları sağlayacak code create ediniz
        1-Girilen cümle java içermiyor
        2-Girilen cümle 1 tane java içeriyor
        3-Girilen cünlede birden fazla java içeriyor
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir cümle giriniz =");
        String word = scan.nextLine().toLowerCase();
        if (word.indexOf("java") == -1) {
            System.out.println("cümle java içermiyor");
        } else if (word.indexOf("java") == word.lastIndexOf("java")) {//burada baştan bak java varmı sondan bak java var mı ikisinden de bir tane ise zaten bir java vardır demek
            System.out.println("cümle bir tane java içeriyor ");
        } else if (word.indexOf("java") != word.lastIndexOf("java") )// yani burada baştan sondan birden fazla java varsa birden fazla dır
        { System.out.println("Cümle birden fazla java içeriyor");}
        //bunu yazarken bi hata almıştın hep bir java varı görüyordu çünkü nextLine yapmamış next yapmıştım hatırla ki sonra böyle bir hata olursa buna dikkat et


    }

}



