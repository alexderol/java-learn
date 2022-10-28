package j21_ImmutableClass;

import java.util.ArrayList;
import java.util.List;

public class C03_ImmutableClass {
    public static void main(String[] args) {
        /*
  Boolean, Short, Integer, Long, Float, Double, Char ve String gibi tüm kapsayıcı sınıflar (Wrapper Class)
  BigDecimal, BigInteger java'da immutable sınıflara örnek olarak gösterilebilir.
        Date, j23_varargs_stringbuilder.j23_Varargs_StringBuilder.j23_Varargs_StringBuilder.j23_Varargs_StringBuilder.Varargs.j23_Varargs_StringBuilder.j23_Varargs_StringBuilder.Varargs.StringBuilder, StringBuffer, Arrays ve ArrayList de Mutable (değişebilir) class'lardır.
 */

        String name="Merve";
        System.out.println("işlem öncesi "+ name);//Merve
        name.concat("javaCAN");
        System.out.println("islem sonrası " + name);//Merve --> islem sonrası name variable meth sonrası aynı değerde kaldı ımmututabel yani

        List<String> isimList = new ArrayList<>();// boş list
        System.out.println("isimList islem öncesi = " + isimList);
        isimList.add("fatih");
        isimList.add("erkan");
        isimList.add("serhat");
        isimList.remove(1);
        isimList.set(1,"JavaCAN");
        System.out.println("isimList islem ssonrası = " + isimList);/// muttable değişir


    }


}
