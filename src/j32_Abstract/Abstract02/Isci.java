package j32_Abstract.Abstract02;

public class Isci extends Personel{
    @Override
    public void maasHesapla() {//override edilen abstract method
        System.out.println("günlük yevmiye 499 $");
    }

    @Override
    public void maasBilgisi() {//override edilen abstract method
        System.out.println("maas sadece günlük ihtiyaclar haricinde hesaplanır");

    }
}
