package j32_Abstract.Abstract01;

public class Crv extends Honda{
    @Override
    public void motor() {
        System.out.println("2.4 süper turbo motor arazide koşturur");
    }

    @Override
    void koltuk() {
        System.out.println("deri koltuk arazide rahat edersin");
    }

    @Override
    void kapi() {
        System.out.println("kapı vakumlu olsun arazide toz toprak girmesin");
    }
}
