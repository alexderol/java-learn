package j29_Exceptions;

public class C04_NullPointerException {
    public static void main(String[] args) {
       //NullPointerException--> null ataması yapılan bir stringde length() method run edildiğinde RTE Exception dır. ancak run edince ortaya çıkar

        String str = "";
        System.out.println(str.length());//0

        String str1 = null;
        //System.out.println(str1.length());//.NullPointerException
        try {
            System.out.println(str1.length());
        }catch (NullPointerException e){
            System.out.println(" dutluluk iyidir  ama length iyi değil be ");
        }

        System.out.println(" handle edildi code devam");


    }


}
