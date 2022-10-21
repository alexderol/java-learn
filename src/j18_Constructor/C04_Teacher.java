package j18_Constructor;

public class C04_Teacher {

    String ad;
    String soyAd;
    int tecrübe;
    String brans;
    double maaş;
    int id;
    boolean emekli;



   public  void dersSaati(){

       System.out.println(ad+" hocam normalden  daha fazla derse girdğin için fazla ücret alacaksın ");

   }

    public C04_Teacher() {
    }

    public C04_Teacher(String ad, String soyAd, int tecrübe, String brans, double maaş, int id, boolean emekli) {
        this.ad = ad;
        this.soyAd = soyAd;
        this.tecrübe = tecrübe;
        this.brans = brans;
        this.maaş = maaş;
        this.id = id;
        this.emekli = emekli;
    }

    @Override
    public String toString() {
        return
                "ad='" + ad + '\'' +
                ", soyAd='" + soyAd + '\'' +
                ", tecrübe=" + tecrübe +
                ", brans='" + brans + '\'' +
                ", maaş=" + maaş +
                ", id=" + id +
                ", emekli=" + emekli +
                '}';
    }
}
