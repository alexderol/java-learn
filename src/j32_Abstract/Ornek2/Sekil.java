package j32_Abstract.Ornek2;

public abstract class Sekil {

    private String name;

    public Sekil() {//p siz
    }

    public Sekil(String name) {//parametreli parent constructor
        setName(name);
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public abstract double alanHesapla();

    public abstract double cevreHesapla();

    public String ciz() {


        return this.name + " cizildi";
    }

    @Override
    public String toString() {//obj  value print eder
        return
                "Sekil Ismi= " + this.name + "\nSekil Alan= " +
                        this.alanHesapla() + "\nSekil Cevre = " +
                        this.cevreHesapla() + "\nSekil " + this.ciz();
    }                                                       //method call
}
