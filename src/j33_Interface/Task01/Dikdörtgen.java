package j33_Interface.Task01;

public class Dikdörtgen implements Sekil {


    @Override
    public double cevre(double... boyut) {
        if (boyut.length == 1) {//boyut 1 elemanlıysa
            return (boyut[0]*4);
        }else return (boyut[0]+boyut[1])*2;
    }

    @Override
    public double alan(double... boyut) {
        if (boyut.length == 1) {//boyut 1 elemanlıysa
            return (boyut[0]*boyut[0]);
        }else return boyut[0]+boyut[1];
    }
}
