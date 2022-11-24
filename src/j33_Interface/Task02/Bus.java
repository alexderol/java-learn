package j33_Interface.Task02;

public class Bus extends Vehicle implements Diesel{
    public Bus(String model, String motor) {
        super(model, motor);
    }

    @Override
    public void changeDiesel() {


    }

    @Override
    public void changeBattary() {

    }

    @Override
    public void changeOil() {

    }
}
