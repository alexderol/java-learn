package j26_Inheritance.Inheritance01;

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

        Animals animal = new Animals();
        animal.hareket();
        animal.icme();
        animal.yeme();

        System.out.println("*****");

        Mammal memeli = new Mammal();
        memeli.sutBeslenme();//mammal
        memeli.dogum();//mammal
        memeli.yeme();//animal
        memeli.hareket();//animal

        System.out.println("************");

        Fish hamsi = new Fish();
        hamsi.ızgaraTava();
        hamsi.hareket();
        hamsi.yeme();
        hamsi.icme();

        System.out.println("******");

        Cat kedi = new Cat();
        kedi.cırmala();
        kedi.hareket();
        kedi.dogum();
        kedi.yeme();
        kedi.icme();
        kedi.sutBeslenme();

        System.out.println("*********");










    }
}
