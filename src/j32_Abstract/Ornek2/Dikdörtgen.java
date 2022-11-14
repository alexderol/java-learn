package j32_Abstract.Ornek2;

public class Dikdörtgen extends Sekil{

    private double uzunKenar;
    private double kisaKenar;

    public Dikdörtgen(double uzunKenar, double kisaKenar) {
        this.uzunKenar = uzunKenar;
        this.kisaKenar = kisaKenar;
    }

    @Override
    public double alanHesapla() {


        return this.uzunKenar*this.kisaKenar;
    }

    @Override
    public double cevreHesapla() {
        return (this.uzunKenar+this.kisaKenar)*2;
    }
}
