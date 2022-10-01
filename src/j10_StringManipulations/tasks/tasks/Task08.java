package j10_StringManipulations.tasks.tasks;

public class Task08 {
    public static void main(String[] args) {
        /*  TASK :
   Asagidaki String degiskenini kullanarak  konsolda isminizi yazdiriniz.
   String  harfDepo = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    */

        String  harfDepo = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
char h=harfDepo.charAt(harfDepo.indexOf("N"));
char a=harfDepo.charAt(harfDepo.indexOf("A"));
char l=harfDepo.charAt(harfDepo.indexOf("Z"));
char u=harfDepo.charAt(harfDepo.indexOf("L"));
char k=harfDepo.charAt(harfDepo.indexOf("I"));

        System.out.println(h+a+l+u+k);//asciii->toplama-> 373
        System.out.println("adım : "+h+a+l+u+k);//string->concat-> HALUK









    }
}
