package j18_Constructor;

public class C02_Arac {
    String marka;
    String model;
    int km=10;
    double motorHacmi;
    boolean vitesAuto=false;
    boolean ikinciEl;
    int yil;


    public static void main(String[] args) {
        C02_Arac arac1= new C02_Arac();// arac1 obj create ettik
        arac1.ikinciEl=true;
        arac1.marka="volvo";
        arac1.km=50;
        arac1.model="xc90";
        arac1.motorHacmi=2.4;
                    //        volvo          xc90           50            default      true               2.4
        System.out.println(arac1.marka+" "+arac1.model+" "+arac1.km+" "+arac1.yil+" "+arac1.ikinciEl+" "+arac1.motorHacmi);

        // ikinci bir aracın tüm field larını atayarak print ediniz

        C02_Arac arac2 = new C02_Arac();

        arac2.motorHacmi=3.0;
        arac2.yil=2020;
        arac2.km=105000;
        arac2.model="corsa";
        arac2.marka="opel";
        arac2.ikinciEl=true;
        arac2.vitesAuto=true;
        System.out.println(arac2.marka+" "+arac2.model+" "+arac2.km+" "+arac2.yil+" "+arac2.ikinciEl+" "+arac2.motorHacmi+" "+ arac2.vitesAuto);

        System.out.println(arac2);// yukarıda amele gibi yazdık burada ise generate toString method oluşturduk





    }

    @Override
    public String toString() {/// to string methodu sağ click ile yaptık
        return
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", km=" + km +
                ", motorHacmi=" + motorHacmi +
                ", vitesAuto=" + vitesAuto +
                ", ikinciEl=" + ikinciEl +
                ", yil=" + yil +
                '}';
    }
}
