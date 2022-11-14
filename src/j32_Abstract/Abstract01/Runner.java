package j32_Abstract.Abstract01;

public class Runner {
    public static void main(String[] args) {
        System.out.println("**********Civic*********");
        Civic cvc = new Civic();
        cvc.sunroof();
        cvc.vites();
        cvc.lastikEbat();
        cvc.motor();
        cvc.koltuk();
        System.out.println("******Accord******");
        Accord acc= new Accord();
        acc.kapi();
        acc.koltuk();
        acc.motor();
        acc.sunroof();
        System.out.println("*****Crv**");


    }
}
