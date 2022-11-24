package j33_Interface.Task01;

public class Cember implements Sekil{


    @Override
    public double alan(double... boyut) {
        return pi*boyut[0]*boyut[0];
    }

    @Override
    public double cevre(double... boyut) {
        return 2*pi*boyut[0];
    }
}
