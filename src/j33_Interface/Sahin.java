package j33_Interface;

public class Sahin extends Tofas implements IcDonanim, DisDonanim,Lastik {//
    @Override
    public void motor() {
        System.out.println("motor 2.0 diesel");

    }

    @Override
    public void yakit() {
        System.out.println("yakıt diesel motor diesel çünkü ");
    }


    @Override
    public void kapi() {
        System.out.println("4 kapi idealdir");
    }

    @Override
    public void kaporta() {
        System.out.println("kaporta saglam olsun");

    }

    @Override
    public void koltuk() {
        System.out.println("koltuklar deri olmasın be bence");

    }

    @Override
    public void klima() {
        System.out.println("klima digital olmalı");
    }

    @Override
    public void ebat() {
        System.out.println("16' lastik ebatı");

    }

    @Override
    public void jant() {
        System.out.println("Celik jant her zaman parlar");

    }
}
