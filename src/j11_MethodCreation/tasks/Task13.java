package j11_MethodCreation.tasks;

public class Task13 {

    public static void main(String[] args) {

    /*46----
    Yazılan iki String'den ikincisi, birincisinin son harflerine eşitse, true, diğer durumda false dönderen  method create ediniz

    Örnekler:
    kontrolEt("abc", "bc") ➞ true
    kontrolEt("abc", "d") ➞ false
    kontrolEt("samurai", "zi") ➞ false
    kontrolEt("feminine", "nine") ➞ true
    kontrolEt("convention", "tio") ➞ false
    */

        String x="feminine";
        String y="nine";
        String z="tio";

        String bir = "halihazır";
        String iki = "hazır";
        String üç  = "konuşmak";
        String dört= "makara";

        kontrolEt(x,y,z);
        control(bir,iki,üç,dört);

    }

    public static void kontrolEt(String x, String y, String z) {
        System.out.println(x.endsWith(y));
        System.out.println(x.endsWith(z));

    }
    public static void control(String bir, String iki, String üç, String dört){
        System.out.println(bir.endsWith(iki));
        System.out.println(üç.endsWith(dört));
        System.out.println(dört.endsWith(bir));
        System.out.println(iki.endsWith(dört));


    }



    }
