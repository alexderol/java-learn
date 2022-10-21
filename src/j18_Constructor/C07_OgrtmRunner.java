package j18_Constructor;

public class C07_OgrtmRunner {
    public static void main(String[] args) {
        C07_Ogrtm hocam= new C07_Ogrtm("Sevdenur öğretmenim :)",11);
        System.out.println("hocam.isim = " + hocam.isim);
        System.out.println("hocam.kıdem = " + hocam.kıdem);
        hocam.kıdemHesaplama(13);


    }
}
