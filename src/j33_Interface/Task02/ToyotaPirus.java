package j33_Interface.Task02;

public class ToyotaPirus extends Vehicle implements Electric,Gas{

    public ToyotaPirus(String model, String motor) {
        super(model, motor);
    }

    @Override
    public void changeBattary() {

    }

    @Override
    public void changeOil() {

    }
}
