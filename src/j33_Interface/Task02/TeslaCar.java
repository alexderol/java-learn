package j33_Interface.Task02;

public class TeslaCar extends Vehicle implements Electric{
    public TeslaCar(String model, String motor) {
        super(model, motor);
    }

    @Override
    public void changeBattary() {
        System.out.println("Batarya değişimi şart");

    }

}
