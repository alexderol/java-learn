package j18_Constructor;

public class C03_Student {//main olmayan sadece student objesi create etmek için pojo (plan old java object) obj için standart kalıphane
    //fields
    String ad;
    String soyAd;
    int sinif;
    double ortalama;
    int okulNo;
    boolean takdir;

    public void mezuniyet(){//method
        if(ortalama>=50){
            System.out.println(" diploman hayırlı olsun :)");
        }else System.out.println("seneye de bekleriz....");
    }


    @Override
    public String toString() {// obj referans değeri print etmemesi için obj datalarını stringe çeviren method creat ettik...sag tık--> generate-->tostring select all
        return
                "ad='" + ad + '\'' +
                ", soyAd='" + soyAd + '\'' +
                ", sinif=" + sinif +
                ", ortalama=" + ortalama +
                ", okulNo=" + okulNo +
                ", takdir=" + takdir +
                '}';
    }
}
