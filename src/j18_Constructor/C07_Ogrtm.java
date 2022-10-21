package j18_Constructor;

public class C07_Ogrtm {//kalıphane
    String isim;
    int tecrube;
    int kıdem=5;

    public C07_Ogrtm(String isim, int tecrube) {//2p parametreli constructor
        this.isim = isim;
        this.tecrube = tecrube;
    }

    public void kıdemHesaplama(int kıdem){// int parametreli void

        System.out.println("kıdemin = "+(kıdem*2));
        System.out.println( "kıdem= "+(this.kıdem*2));


    }
}
