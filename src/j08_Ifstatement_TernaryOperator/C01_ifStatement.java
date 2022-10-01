package j08_Ifstatement_TernaryOperator;

public class C01_ifStatement {
    public static void main(String[] args) {

        int krmYas = 33;
        int ismlYas = 40;

        if (krmYas == ismlYas) {// false olduğu için body not run
            System.out.println("Aynı Yastasınız Güzel insanlar");
            System.out.println("yoksa siz ikizmisiniz");
        }
        if (krmYas >= 40) {//false body not run
            System.out.println("Kerim bey olgunluk yaşındasınız");
        }
        System.out.println("bu yazıyı okuduysanız 13 . satırdaki if ile alakası yok. yani bir üstteki ifle alakası yok");

        if (krmYas + ismlYas > 100) {//false bady not   run
            System.out.println("kerm bey ve ismail bey yaşları toplamı 100 den büyük");

        }
        System.out.println("kodda sorun yok ");

        //if blok da {} kullanılmazsa ilk ";" kadar olan çalışır veya çalışmaz if egöre

        //Bağımsız if statment yapıları sadece kendi scap(kapsamlarını) run eder.. tabi şark sağlarsa
        //birden fazla bağımsız if statment yapıları hepsinin bady çalışabileceği gibi hiç birisinin body  de çalışmayabilir...

        //ctrl+alt+l--- java formatına getirmek için kullan.







    }
}
