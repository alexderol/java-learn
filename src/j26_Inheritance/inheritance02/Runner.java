package j26_Inheritance.inheritance02;

import j26_Inheritance.Inheritance01.Fish;
import j26_Inheritance.Inheritance01.Sheep;

public class Runner {

    /*
 1)Java'da class'lar arasinda parent(Aile)-child(Cocuk)  relationship(iliski) tanımlanmıştır.
 2)Parent Class'a "super class"   Child Class'a "sub class"  denir.
 3)Ortak ozellikler parent class'a, specific ozellikler child class'a tanımlanır.
 4)Parent Child Relationship "reusability", "maintenance",  "less code", "well organization" avantajları içim kullanılır.
 5)Child classlar parent'lardaki her methodu ve variable'i  kullanabilir ama parent class child'dakileri kullanamaz.
 6)Java "Multiple Inheritance"'i desteklemez. Yani; Java'da  bir Child Class'in 1'den fazla parent'i olamaz.
 7)Bir parent class, 1'den fazla child class ile olusturulan  parent child relationship'e "Hierarchical Inheritance"
   denir.
 8)Child-Parent-Grandparent... seklinde olusturulan cok katli  parent child relationshipe'e multi-level inheritance denir.
 9)"Object Class" -> Hz.Adem Class :) butun classlarin parent class'idir. Java'da parent class'i olmayan tek class "Object Class"dir

*/


    public static void main(String[] args) {

       Cat k1 = new Cat();
        System.out.println("k1.a = " + k1.a);//0
        System.out.println("k1.c = " + k1.c);//2
        System.out.println("k1.d = " + k1.d);//5
        System.out.println("k1.m = " + k1.m);//1

        /*
         Ayni isimli variable'lardan hangisinin kullanildi
        olusturulan object'in data type'ina göre bilinir
        Variable'i arastirmaya data type'i classindan baslanır.
        */


        k1.mA();//animal
        k1.mC();//cat
        k1.mM();//mammal

        /*
        Method cagirilirken ayni isimli methodlardan
        hangisinin kullanilacagina Constructor karar verir.
        Methodlari arastirmaya Consctuctor ismini tasiyan
        class'dan baslayin ve parentlarda arastirmaya devam edin.
        */
     System.out.println("***********************");
        Mammal k2 = new Cat("Kevser");//data typeı parent Mammal class ancak constructoru parametreli cat classtır'
        System.out.println("k2.c = " + k2.c);// data type c gelecek yani Mammal daki c -->4
        System.out.println("k2.a = " + k2.a);//0
        System.out.println("k2.m = " + k2.m);//Mammal daki m gelecek data taype öncemil
        k2.mA();//animals taki mA cons
        k2.mC();//method constructora göre çalışır cons cat olduğu için cat methodu gelecek
        k2.mM();//
     System.out.println("***************");
        Animals k3 = new Cat();
        System.out.println("k3.m = " + k3.m);
        //k3.c; cte verir çünkü data type animal olduğu için call edilmez animal classta yok çünkü
        k3.mA();
        k3.mM();
        System.out.println("************");
        Mammal m1 = new Mammal('$');
        System.out.println("m1.m = " + m1.m);//kendisi yani mammal
        System.out.println("m1.a = " + m1.a);//Animalsta a null yani 0
        System.out.println("m1.c = " + m1.c);//kendisinde var 4
        //m1.d bu çalışmaz çünkü baba evladın özelliğini alamaz kim kime uzanıyorsa uzandığı yeri alır yani extendi alır
        m1.mA();//animal
        m1.mC();//Mammal
        m1.mM();//Mammal


    }
}
