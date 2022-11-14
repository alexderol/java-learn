package j32_Abstract;

public class C01_Abstract {
    /*
    1-Bazı durumlarda child claslar parent clasdaki methodların genellikle bodylerini
    değiştirerek override ederler. Bu gibi durumlarda parent clastaki methoda body tanımlamak
    ram ve memory açısından gereksizdir.cözüm olarak java parent clasa bodysiz -<abstract>- yani soyut methodlar
    tanımlamıştır.
    2-Parent clastaki abstract methodlar application güvenliği acısından child clasta override edilmek
    zorundadır. Eğer Parent bir classta child clasın mutlaka kullanması gereken method varsa abstract tanımlanmalı.
    Motor örneği gibi düşün motor her arabada olmalı

    3-Abstrac method tanımlamak için;
    a-{} olmaz
    b-access modifierdan sonra abstract keyword kullanılmalı
    c-abstract method içinde  abstract keyword ve {} birarada kullanılamaz aksi halde CTE verir

   ******-Abstrac class tanımlamak için;
   a-class ifadesinden önce abstract keyword kullanılmalı

   4- abstract method sadece abstract clasta tanımlanır. Kesinlikle concrete clasta
   abstract method tanımlanamzz..Ama abstract clasta concrete method tanımlanabilir

   5-Abstrac clas içinde hem abstract method hemde concrete method tanımlanabilir..
   6-Bir concrete child class parent abstract clasa extends ettiğinde abstract methodları implement etmek zorunda
   ama concrete methodlar isteğe göre override edilir.
   7-parent child ilişkisi olan abstract claslar abstract methodları implement etmek zorunda değil
   8-parent olan abstract clas birden cok concrete veya abstract child clas extends edebilir
     ancak child clas birden cok abstract parent clasla extend e-d-emez...
   9-abstract clasda final ve abstract method tanımlanamaz CTE verir--
   10-abstract clasda private ve abstract method tanımlanamaz CTE verir->
   10-abstract clasda  ve abstract method tanımlanamaz CTE verir
   10-abstract clasda  ve static method tanımlanamaz CTE verir

   *******ABStract CLAS ASLA KESİNLİKLE OBJE Ü-RE-TE-MEZ**********
   TRİCK-->>> abstract claslar referansı child clasın objesini tutabilir...polimorphism






     */








}
