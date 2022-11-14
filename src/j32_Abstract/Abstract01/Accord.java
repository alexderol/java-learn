package j32_Abstract.Abstract01;

public class Accord extends Honda {

    @Override
    public void motor() {//implement abstract method
        System.out.println("2.0 Turbo motor harika olur");
    }

    @Override
    void koltuk() {//implement abstract
        System.out.println("koltuklar bu kez deri olmasın ");
    }

    @Override
    void kapi() {//implement abstract method
        System.out.println("vakumlu kapı en iyisidir");
    }

    @Override
    void sunroof() {//override edilen concrete method
        System.out.println("sunroof yakışır");
    }
}
