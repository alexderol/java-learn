package j32_Abstract.Ornek3;

public class Runner {
    public static void main(String[] args) {

        Baklava b = new Baklava();
        b.MadeIn();
        b.taste();//baklava clasta taste() yok sweet classa gider orada var ve aksiyon neyse onu basar
        System.out.println("b = " + b);

        SezarSalad ss = new SezarSalad();
        ss.MadeIn();
        ss.taste();


    }
}
