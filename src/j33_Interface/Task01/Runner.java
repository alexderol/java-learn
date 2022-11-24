package j33_Interface.Task01;

public class Runner {
    public static void main(String[] args) {
        Cember cember = new Cember();
        System.out.println("cember.alan(4) = " + cember.alan(4));
        System.out.println("cember.cevre(4) = " + cember.cevre(4));

        Dikdörtgen d = new Dikdörtgen();
        System.out.println("d.alan(2,3) = " + d.alan(2, 3));
        System.out.println("d.cevre(2,3) = " + d.cevre(2, 3));

        Kare k = new Kare();
        System.out.println("k.alan(4) = " + k.alan(4));
        System.out.println("k.cevre(4) = " + k.cevre(4));


    }
}
