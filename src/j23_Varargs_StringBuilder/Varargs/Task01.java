package j23_Varargs_StringBuilder.Varargs;

public class Task01 {
    public static void main(String[] args) {
        /*
    Task ->
    verilen Stringleri birlestiren concat isimli METHOD create ediniz.
    input : "m", "e", "r", "v", "e";
    output : merve
    */

        String arr1 []={"m", "e", "r", "v", "e"};
        String arr2 []={"a", "l", "i",};
        strBirlestir(arr1);
        strBirlestir(arr2);





    }
    public static void strBirlestir(String ...str){
        String birlesim="";
        for ( String w:str){
            birlesim=birlesim.concat(w);
        }
        System.out.println(birlesim);
    }

}
