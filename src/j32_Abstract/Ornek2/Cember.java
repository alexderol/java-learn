package j32_Abstract.Ornek2;

public class Cember extends Sekil{
    private double yarıCap;
    private final double pi=3.14;// final yaptığımız için hiçbirşey değeri değiştiremez


    public Cember(double yarıCap) {
        this.yarıCap = yarıCap;
    }

    public double getYarıCap() {
        return yarıCap;
    }

    public void setYarıCap(double yarıCap) {
        this.yarıCap = yarıCap;
    }

    public double getPi() {
        return pi;
    }

    @Override
    public double alanHesapla() {
        return pi*this.yarıCap*this.yarıCap;
    }

    @Override
    public double cevreHesapla() {
        return 2*(pi*this.yarıCap);
    }
}
