package j14_Scope;

public class C02_StaticVariable {
    /* instance variable'lar obje'ye bagimlidir ve her obje farkli degerler alabilir
    ogrenci notlari veya ogretmen branslari gibi
    bir objeye ait bir variable'in son degerini bulmak icin sadece o objeyi dikkate aliriz

   Static variabler ise class variable olarak tanimlanir
   ve tum class uyeleri icin aynidir. Okul ismi, okul mudurunun adi gibi
   eger static variable'in degeri degistirilirse herkes icin degisir--> Güneş misali


 */
    static String firmaName="Clarusway";
    static int firmaId;
    static  boolean firmaIT;//güneş

    public static void main(String[] args) {//main bası
        System.out.println("firmaId = " + firmaId);//0 alırız
        firmaId=1001;// static variable name ile call edildi ---> best practice
        System.out.println("firmaId = " + firmaId);//1001 alırız

        C02_StaticVariable.firmaIT=true;//class name ile static variable call ettik-->bad practice..bööööö
        staticMethod();// static main e call edildi....
        //non_StaticMethod();// sefil dünyalı galaxy e çıkamaz


    }//main sonu
    public static void staticMethod() {//staticmethod -->galaxy
        firmaId=2002;// static variable call ettik çünkü her yere erişir
        System.out.println("agam yeni ıd'ing hayırlı olsun"+firmaId);

    }
    public void non_StaticMethod(){//non Static method -> sefil dünyalı
        firmaName="javaCAN";//-->
        System.out.println("yeni firma= "+firmaName);
    }
}
