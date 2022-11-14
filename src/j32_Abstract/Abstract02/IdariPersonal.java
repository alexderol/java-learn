package j32_Abstract.Abstract02;

public class IdariPersonal extends Personel {

    @Override
    public void maasHesapla() {
        System.out.println("frapan idarecimize saat basi 120 $");
    }

    @Override
    public void maasBilgisi() {
        System.out.println(" concık code yazan idari personele ekstradan 100 $");

    }

    @Override
    public void sigorta() {//override edilen concrete method
        System.out.println(" cincik coder personel fill sigorta ");
    }
}
