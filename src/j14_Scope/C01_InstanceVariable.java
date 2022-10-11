package j14_Scope;

public class C01_InstanceVariable {

        /*                                  INSTANCE VARIABLE

        1) Main method'un ve urettiginiz diger methodlarin disinda  disinda(ustunde veya altinda), class'in icinde
         olusturulan variable'lara "instance variable" denir.
          2) Instance variable'lar object olusturulurken olusturulur ve her obje'ye bu variable'lar monte edilir.
        3) Instance variable'lara deger atamasi yapsaniz da olur, yapmasaniz da olur.
             Asagida goruldugu gibi "yas" variable'ina deger atamasi yaptim "tecrube" variable'ina yapmadim.
        Note : Bir variable'a deger atamasi yapma "Initialize" olarak adlandirilir.
         "i" variable'i initialize edildi, digerleri initialize edilmedi.
         4) Initialize edilmeyen "instance variable" lar icin Java kendisi deger atamasi yapar.
        Java'nin instance variable'lara kendisinin verdigi degerlere "default value" denir.
            byte, short, int, long icin default value 0'dir.
            float, double icin default value 0.0'dir.
            char icin default value 0'dir.
            boolean icin default value false'dur.
            String icin default value "null" dir.

*/
        static String kurs="Clarus";
        int yas = 48; //initialized ilk atamsı yapılmış ins. variable
        int tecrube;// default deger 0
        String name;// default deger null
        boolean developerMı;// deafult deger false
        double boy;// default deger 0.0
        char unvan;// default deger bosluk

    public static void main(String[] args) {

                                //instance variablellar******
        int a=7;//local variable
        System.out.println(a);
        //System.out.println(yas);// yas instance variable dır değer ataması yapmadan çalışmaz..non static olduğu için doğrudan call edilmez
        System.out.println(kurs);//static  variable doğrudan methoda çağırılır
        staticMethod();//static method call edildi...astral seyahat :)  ---> static olan main sadece static method kol eder
        //non static method call edilemez
       // non_staticMethod();// non static method call edilemez
        // obj creation --> ClassName + objeName= new ClassName...

        C01_InstanceVariable ebikGabıkObj = new C01_InstanceVariable();// obj create edildi
        ebikGabıkObj.boy=1.7;
        ebikGabıkObj.developerMı=true;
        ebikGabıkObj.name="kubra hanım";
        System.out.println(ebikGabıkObj.name);
        System.out.println(ebikGabıkObj.tecrube);// default deger 0 verir
        ebikGabıkObj.yas=33;
        System.out.println(ebikGabıkObj.yas);// 48 den 33 e değiştirdik
        C01_InstanceVariable obj1= new C01_InstanceVariable();// farklı bir obj1 isminde obje  create ettik
        obj1.boy=1.65;
        obj1.name="fatih bey";



    }
    public void non_Static () {//static olmayan method
        System.out.println("static olmayan methoddan aga ya selam");


    }
    public static void staticMethod(){//static method
        System.out.println("static güneş methoddasın agam devawamkeeee");
    }
}
