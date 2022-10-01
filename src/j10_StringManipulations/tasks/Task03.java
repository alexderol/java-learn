package j10_StringManipulations.tasks;

public class Task03 {
    public static void main(String[] args) {
        //"Alamanya" Stringindeki ikinci 'a' caharacterinin indexini bulunuz.
        String a="Alamanya";

                                                // ilk a nın yeri biz ilk a sonrasını istediğimiz için +1 yaptık
        System.out.println(a.indexOf('a', a.indexOf('a')+1));//ilk a dan sonraki a demek 4 vermesi gerek
        //a.indexOf('a')----> bize ilk a nın indexini verir ve +1 yaparak

        String ornek="Yürüyüşün ölümü korkutuyor";
        System.out.println(ornek.indexOf('ü', ornek.indexOf('y')+1 ));
        System.out.println(ornek.lastIndexOf('u', ornek.lastIndexOf('y')));//22
        System.out.println(ornek.indexOf('k', ornek.lastIndexOf('k')));

        String exam = "öszlerimi geri alamam, çaldığımı baştan çalamam";
        System.out.println(exam.lastIndexOf('a',exam.lastIndexOf('ş')));
        System.out.println(exam.lastIndexOf('a', exam.lastIndexOf('n')));
        System.out.println(exam.indexOf('ı', exam.indexOf('ğ')));//




    }
}
