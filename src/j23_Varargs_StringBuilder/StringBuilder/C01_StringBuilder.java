package j23_Varargs_StringBuilder.StringBuilder;

import java.time.LocalTime;

public class C01_StringBuilder {
    public static void main(String[] args) {
         /*
String = > daha yavas ,Immutable==> degisemez,
String'lerde method kullanarak String'i degistirmek atama yapmadan mumkun degildir.

1) Java pass-by-value kullanir
2) String Class'i immutable Class'dir.

 StringBuffer =mutable==>degisebilir,less efficient/ daha yavas ,
 StringBuffer synchronized,thread safe.

StringBuilders = mutable==>degisebilir ,
not senkronized/not thread safe,fakat more efficient(daha etkili,ve hizli )

1) String Class'i immutable(Degistirilemez)dir. Java mutable Stringler uretebilmemiz icin
j23_Varargs_StringBuilder.StringBuilder isimli bir class uretmistir.
2) Java'da j23_Varargs_StringBuilder.StringBuilder ile hemen hemen ayni isi yapan birde StringBuffer classi vardir.
"StringBuffer" Class'i j23_Varargs_StringBuilder.StringBuilder Class'indan daha once uretilmistir.
"StringBuffer" yavas calisan bir class'dir, "j23_Varargs_StringBuilder.StringBuilder" ise hizli calisir.
"StringBuffer"  "synchronize" islemlerini yapabilir, ama "j23_Varargs_StringBuilder.StringBuilder" yapamaz.
3) Ayni anda bir cok isin yapilmasina "multi threading" denir. "multi" = Cok, "thread"= Yapilan islerin herbiri
Multi threading varsa, bu islerin siraya konulmasi lazim.Islerin siraya konulmasina "synchronization" denir.

    */




     String str = "JavaCAN";
        System.out.println("method öncesi str = " + str);

        strBirlestir(str);//makyaja gitti


        System.out.println("method sonrası str = " + str);//str değişmedi immutable

        // Task -> 50000 tekrarlı bir loop ile String ve stringBuilder objlerin runtime sürelerini karşılaştıran method create ediniz
        String str1 ="";
        StringBuilder sb1 = new StringBuilder("");

        LocalTime str1Start = LocalTime.now();
        System.out.println("str1Time = " + str1Start);

        for (int i = 0; i < 50000; i++) {
            str1+= i;
        }

        LocalTime str1Finish = LocalTime.now();
        System.out.println("str1Finish = " + str1Finish);


        System.out.println(" sb1 işlemi \n");


        LocalTime sb1Start = LocalTime.now();
        System.out.println("sb1start = " + sb1Start);

        for (int i = 0; i < 50000; i++) {
            sb1.append(i);
        }



        LocalTime sb1Finish = LocalTime.now();
        System.out.println("sb1 finish = " + sb1Finish);



    }

    public static void strBirlestir(String str){

        System.out.println(str+ " selam sana uyan");


    }

}
