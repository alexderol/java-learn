package j25_Encapsulation.Encapsulation01;

public class C01_Encapsulation {
/*
   1) Encapsulation kisaca "data hiding" demektir

   2) Basarili bir Encapsulation için :
      a)Nasil kullanilacagi ve hedefi net olmalidir.(Direksiyon gibi)
      b)Kodun karmasikligi kullanimin karmasikligina sebep olmamalidir.Yani cok
       karmasik kodlardan olusan bir yapi basit bir sekilde kullanilabilmelidir.
      c)Bir bolumun hata vermesi diger bolumlerin hatasına sebep olmamalidir.

   3) Encapsulation yapısı  tanımlanması için
      a)Access modifier'lari private tanımlanmalı
      b) istenilen field'lar için  getter ve setter methodlari ile "encapsulated" datalar okunmalı (getter) ve
       update edilebilmeli(setter)    .
       c) uygun constructor tanımlanmalı.
       d) toString() method tanımlanmalı


   4) Encapsulation'in faydalari
      a) Esneklik(Flexibility). Field'lar setter() methodunu ile istenildiği kadar update edilebilir
      b) Reusability-> Field'lar  getter ve setter method'lari bir kere tanımlanıp proje icindeki
        tum classlar'dan istenildiği kadar kullanabiliri.
      c) Istenilen field  okunabilir(getter() olustur), istenilen field okunamaz(getter() olusturma)
       hale getirebilir.
      d) Istenilen field degistirebilir (setter() olustur), Istenilen field degistirilemez
       (setter() olusturma) yapabilir.
       TRİCK-->  Tum variable'lar private ve sadece getter() method tanımlanan  class'da
        data'lar sadece okunabilir, degistirilemez. Bu tarz class'lara "immutable class" denir.

   5) Kullanicinin kullandigi sistem arkasindaki karmasik yapiyi kullaniciya gosterilmez.

 */
public static void main(String[] args) {

    C02_Encapsulation obj1 = new C02_Encapsulation("Dilek Hanım", 11);
    C02_Encapsulation obj2 = new C02_Encapsulation();

    System.out.println("obj1.idVer() = " + obj1.getId());//11
    System.out.println("obj1.isimVer() = " + obj1.getName());//Dilek Hanım
    //biz diğer classta public method yaparak yukarıdakilere ulaşabildik
    obj1.setName("Dilek Team lead");
    System.out.println("obj1.isimVer() = " + obj1.getName());//Dilek Team lead

    System.out.println("obj2.idVer() = " + obj2.getId());//1001
    System.out.println("obj2.isimVer() = " + obj2.getName());//Gamze Hanım
    //obj2 için işlem yapmadık yukarıdakiler obj1 için yapıldı o yüzden obj2 ile
    // yazdırılanlar ilk hali dir mesela name ve id değişmemiş hali ile gelir
    obj2.setName("Gamze hanım scrum master");
    System.out.println("obj2.isimVer() = " + obj2.getName());//Gamze hanım scrum master
    //obj2 ile işlem yaptık ve değişiklik hemen yansıdı





}



}
