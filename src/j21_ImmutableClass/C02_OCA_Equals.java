package j21_ImmutableClass;

public class C02_OCA_Equals {
    public static void main(String[] args) {
        String a = "";
        a += 2;
        a += 'c';
        a += false;

        if (a == "2cfalse") {
            System.out.println("==");
        }
        if (a.equals("2cfalse")) {
            System.out.println("equals");
        }

        String b ="2cfalse";

        String x="ali";
        String y="ali";

        if (x == y) {//sart saglamaz if çalışmaz->  a refensı  "2cfalse"  atama olmdg için ref yok
            System.out.println("ahan da referansları aynı havuzda x ve y eşit ==");
        }
        //tanımlana atanan değeri a  ile aynı havuzda ve ref olan b variable
        if (a == b) {//sart saglamaz if çalışmaz->  a refensı  "2cfalse"  atama olmdg için ref yok
            System.out.println("ahan da referansları aynı havuzda a ve b eşit ==");
        }

    }
}
