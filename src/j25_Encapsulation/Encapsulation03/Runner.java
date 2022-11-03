package j25_Encapsulation.Encapsulation03;

public class Runner {
    public static void main(String[] args) {
        Car honda =new Car("Accord","siyah",-200,2012);//1.araba

        Car volvo =new Car("s80","beyaz",2000,-2015);//2.araba

        Car haciMurat = new Car();//3. araba
        haciMurat.setModel("serce");
        haciMurat.setMotor(1300);
        haciMurat.setYıl(1974);
        haciMurat.setRenk("cücük Sarı");

        System.out.println("honda ne ararsan var onda "+honda);
        System.out.println("haci murat  " + haciMurat);
        System.out.println("isvec tankı " + volvo);






    }
}
