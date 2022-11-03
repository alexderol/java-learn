package j25_Encapsulation.Encapsulation02;

public class Kisi {//pojo class--field getter setter constructor olur
    /*
    kisi pojo class için fields --> ad, soyad, password(String), yas
    tüm fields kullanıcı görebilmeli password haric update edilmeli
    password encapsulat update edilmemeli
    yas variable - değer girmeye karşı encapsulat edilsin

     */

    String name;
    String soyAd;
    private String password;
    private int yas;

    public Kisi(String name, String soyAd, String password, int yas) {
        this.name = name;
        this.soyAd = soyAd;
        this.password = password;
        this.yas = yas;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSoyAd(String soyAd) {
        this.soyAd = soyAd;
    }

    public void setYas(int yas) {

        this.yas =Math.abs(yas);//- olmasını engelledik

    }

    public String getName() {
        return name;
    }

    public String getSoyAd() {
        return soyAd;
    }

    public String getPassword() {
        return password;
    }

    public int getYas() {
        return yas;
    }
}
