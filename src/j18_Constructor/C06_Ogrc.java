package j18_Constructor;

public class C06_Ogrc {//kalıphane
    //field
    String isim="merve hanım";
    int yas;
    String name;
    int age;
    public C06_Ogrc(String isim, int yas) {// 2 parametreli constructor
        //this.isim = isim;  //thisler nasıl çalışır aşağıdaki örnekten çıkarım yap
        //this.yas = yas;
        name=isim;
        age=yas;
        System.out.println("cons taki isim ="+isim);
        System.out.println("cons taki isim ="+this.isim);
        System.out.println("cons taki isim ="+name);
        // kime nereden kimi çağırıyor renklere bak
    }


    /*
    public class C06_Ogrc {//ogrc obj için kalıphane
    //Fields
    String  isim="Merwe Hanım ";
    int yas;
    String name;
    int age;

    public C06_Ogrc(String isim, int yas) {//2p'li cons.
       // this.isim = isim;//parametre isim değeri inst. obj isim değerine atandı
       // this.yas = yas;//parametre yas değeri inst. obj yas değerine atandı
        isim = isim;//pramtre isim yine parametre isme atandı inst. obj isim degeri değişmedi
        yas = yas;//pramtre yas yine parametre yas atandı inst. obj yas degeri değişmedi

       //name=isim;//parametre isim değeri inst. obj name değerine atandı
       //age=yas;//parametre yas değeri inst. obj age değerine atandı
        System.out.println("cons'taki isim :"+isim);//poaramter isim değeri : Saliha H
        System.out.println("cons'taki isim :"+this.isim);//inst. obj isim değeri: Merwe Hanım
        System.out.println("cons'taki name :"+name);//inst. obj name değeri :null
    }
}
     */



}
