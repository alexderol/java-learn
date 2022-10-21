package j18_Constructor;

public class C01_Constructor {

    String str="";//instance variable  yani obje variable
    String selam="guzel insan";

    public static void main(String[] args) {
        /*
        1- constructor ismi  Class name ile aynı olmalı. Büyükharfle başlar
        2- constructor cereat edildiğinde mainden sonra () {} mutlaka kullanılmalı
        3- eger parametreli constructor create edildiğinde java default constructoru ezer siler yani
        4- constructorun return type olmaz methoddan ayıran özelliğidir
        5-Class oluştuğunda java deault constractoru kendi cereat eder
          */

        // clas name1   obje ismi     new Keyword   default constructor
        C01_Constructor   obj1      =  new          C01_Constructor();
        C01_Constructor   obj2      =  new          C01_Constructor();
        C01_Constructor   obj3      =  new          C01_Constructor();
        C01_Constructor   obj4      =  new          C01_Constructor();


        obj1.str="javaCAN"; // str ins variable obj1 ile coll edilerek obj1 değeri atandı
        obj2.str="javatar";// str ins variable obj2 ile coll edilerek javatar değeri atandı
        //str variable ı obj1 ile farklı obj2 ile farklı değer atandı...
        System.out.println("obj3.selam = " + obj3.selam);// javaCAN

        System.out.println("obj2.str = " + obj2.str);//javatar

        System.out.println("obj4.str = " + obj4.str);//null


        obj3.aga();// obje buluduğu clasın özelliklerine ulaşmaya yarayandır
        obj2.aga();//



    }
    public  void aga(){// eger static yaparsak obj üzerinden ulaşamayız
        System.out.println("agaya selam ");
    }
}
