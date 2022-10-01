package j10_StringManipulations.tasks.tasks;

public class Task03 {
    public static void main(String[] args) {
        //"Alamanya" Stringindeki ikinci 'a' caharacterinin indexini bulunuz.

        String str = "Alamanya";

       // str.indexOf('a')-> ilk a'nın index'ini verir
        System.out.println(str.indexOf('a', str.indexOf('a') + 1));

        String s1 = "erol halide demir";
        System.out.println(s1.indexOf('i', s1.indexOf('m')));
        String s2 ="telefon tutanakları ellerinde";
        System.out.println(s2.indexOf('e', s2.indexOf('l')));
        System.out.println(s2.indexOf('i', s2.indexOf('r')));// bu r den sonraki i yi yaz demek


    }
}
