package j10_StringManipulations.tasks;

public class Task08 {
    public static void main(String[] args) {
        /*  TASK :
   Asagidaki String degiskenini kullanarak  konsolda isminizi yazdiriniz.
   String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    */
        String d="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println(d.charAt(d.indexOf("E")) + d.charAt(d.indexOf("R")) + d.charAt(d.indexOf("O")) + d.charAt(d.indexOf("L")));//ascii değerlerini topladı309
        System.out.println(""+d.charAt(d.indexOf("E")) + d.charAt(d.indexOf("R")) + d.charAt(d.indexOf("O")) + d.charAt(d.indexOf("L")));//başına "" koyarak Stringe çevirdik ve EROL yazdı
        //d ye git "E" indexini al yani index 4 ü al dchar da git 4 karakteri al diyor
        //

    }
}
