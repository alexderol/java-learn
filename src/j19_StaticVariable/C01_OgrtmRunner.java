package j19_StaticVariable;

public class C01_OgrtmRunner {

    public static void main(String[] args) {

        C01_Ogrtm hc1= new C01_Ogrtm("cüneyt", 11);
        System.out.println("hc1.tecrube = " + hc1.tecrube);
        System.out.println("hc1.isim = " + hc1.isim);
        //hc1.okul="kabadaş";
        System.out.println("hc1.okul ="+ hc1.okul);// null olur ama aşağıdakilerde KABATAŞ OLUR HEPSİNDE ÇÜNKÜ STATİC UPDATE OLDU
        C01_Ogrtm.okul="KABATAŞ ERKEK LİSESİ";


        C01_Ogrtm hc2= new C01_Ogrtm("bekir", 7);
        System.out.println("hc1.tecrube = " + hc2.tecrube);
        System.out.println("hc1.isim = " + hc2.isim);
        //hc2.okul="kabatas";
        System.out.println("hc2.okul ="+ hc2.okul);//bad practice ama çalışır


        C01_Ogrtm hc3= new C01_Ogrtm("nazım", 13);
        System.out.println("hc1.tecrube = " + hc3.tecrube);
        System.out.println("hc1.isim = " + hc3.isim);
        //hc3.okul="gabadaş";
        System.out.println("hc3.okul ="+ hc3.okul);

        hc1.evlilikYilDonumu();//obj ile non static method call ettik

        C01_Ogrtm.maasHesapla();//clas ile static method call ettik

        hc2.maasHesapla();//bad practice çünkü static method class ismiyle call edilir





    }
}
