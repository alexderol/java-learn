package j25_Encapsulation.Encapsulation02;

public class Runner {
    public static void main(String[] args) {
        Kisi obj1 = new Kisi("ümit","k","ümitK33",33);
        System.out.println("obj1.name = " + obj1.name);
        obj1.name="güzel insan ümit bey";
        System.out.println("obj1.name = " + obj1.name);

        System.out.println("obj1.soyAd = " + obj1.soyAd);
        System.out.println("obj1.getPassword() = " + obj1.getPassword());
        obj1.setYas(-34);//34 olur
        System.out.println("obj1.getYas() = " + obj1.getYas());

    }
}
