package j33_Interface;

import java.io.DataInput;

public class Runner {
    public static void main(String[] args) {

        Sahin dogan= new Sahin();
        dogan.ebat();
        dogan.jant();
        dogan.kapi();
        dogan.kaporta();
        dogan.klima();
        dogan.koltuk();
        dogan.motor();
        System.out.println("dogan.sisLamp() = " + dogan.sisLamp());//default concrete method olduğu icin obje ile call
        dogan.sunRoof();
        dogan.yakit();
        System.out.println("DisDonanim.RENK = " + DisDonanim.RENK);
        ///IcDonanim.KUMAS="Deri kumas olsun";//Cannot assign a value to final variable 'KUMAS'...--final variebla değer atanmaz
        System.out.println("IcDonanim.KUMAS = " + IcDonanim.KUMAS);
        System.out.println("IcDonanim.MUSIC = " + IcDonanim.MUSIC);
        System.out.println("IcDonanim.RENK = " + IcDonanim.RENK);
        //aynı isimli variable interface ismiyle call edilir
        System.out.println("Lastik.RENK = " + Lastik.RENK);
        DisDonanim.anten();//static concrete method interface name ile call edildi



    }
}
