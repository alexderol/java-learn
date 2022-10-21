package j18_Constructor;

public class C03_StudentRunner {
    public static void main(String[] args) {
        C03_Student ogrenci1= new C03_Student();/// obje create ettik
        ogrenci1.ad="Erva";
        ogrenci1.soyAd="Demir";
        ogrenci1.sinif=1;
        ogrenci1.okulNo=2015;
        ogrenci1.ortalama=93;
        ogrenci1.takdir=false;

        System.out.println(ogrenci1);

        ogrenci1.mezuniyet();//

        C03_Student ogrenci2 = new C03_Student();
        ogrenci2.ad="erol";
        ogrenci2.soyAd="Demir";
        ogrenci2.sinif=5;
        ogrenci2.okulNo=2020;
        ogrenci2.ortalama=40;
        ogrenci1.takdir=false;


        System.out.println(ogrenci2);
        ogrenci2.mezuniyet();




    }

}
