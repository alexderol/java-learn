package j32_Abstract.Ornek3;

public abstract class Salad extends Food {

    public abstract void MadeIn();//parent ve child abs claslarda aynı ismli iki method tanımlanabilir

    @Override
    public void taste() {
        System.out.println("salata hangisi olsun ");

    }
}
