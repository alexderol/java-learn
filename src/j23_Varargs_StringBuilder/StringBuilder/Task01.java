package j23_Varargs_StringBuilder.StringBuilder;

public class Task01 {
    public static void main(String[] args) {
        /*
Bir cümleyi parametre olarak kabul eden, StringBuilder kullanarak cümleyi ters çeviren ve cümlenin palindrom
       olup olmadığını kontrol eden (büyük/küçük harf duyarlılığı olmadan) bir method yazın.
    (without case sensitivity)
    Eg : input : I love Java
    Output: "Reversed sentence : avaJ evol I
       It is not a palindrome"

 */




        System.out.println("reverseString(\"erol\") = " + reverseString("erol"));//lore--amele code

        tersSB(new StringBuilder("halide"));//edilah----method parametre içinde SB yaptık

        System.out.println("isPalindrom(\"adanada\") = " + isPalindrom("ey edip adanada ye "));//false


    }
    public static String reverseString (String str){//AMELE CODE
        String tersString="";
        for (int i = str.length()-1; i >= 0 ; i--) {
            tersString+=str.charAt(i);

        }


        return tersString;
    }
    public static void tersSB(StringBuilder sb){//clean code
        System.out.println("sb.reverse() = " + sb.reverse());

    }
    public static boolean isPalindrom(String sb1){
        if(sb1==null){
            return false;
        }

        return new StringBuilder(sb1).reverse().toString().equals(sb1);
    }

}

