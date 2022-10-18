package j16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C15_ArraysConvertList {
    public static void main(String[] args) {
        // King of Trick----> Arraydan çevrilen List array kaynaklı olduğu için array davranışı gösterir boyut sabittir
        // .. dolayısıyla remove ve add method çalışmaz

        String arrJavaCan[]= {"Akif", " Gamze", "Musty","Sevde"};
        List<String> ListJavaTar= Arrays.asList(arrJavaCan);//javaCAN DEĞERLERİ Lite eklendi.
        System.out.println("ListJavaTar.size() = " + ListJavaTar.size());//4
        ///ListJavaTar.add("seifl haluk"); hata verir çünkü boyutu ilgilendiren bişey yapamazsın sadece Array gibi çalışabilirsin

        // Kral TRICK--->list data type ArrayList tanımlanırsa RTe vermez list davranışı sergiler boyut esnekliği yapar...!!!

        ArrayList<String> ListJavaTa1r = new ArrayList<>(Arrays.asList(arrJavaCan));
        ListJavaTa1r.add("sefil haluk");
        System.out.println(ListJavaTa1r);

        String calısma  [] = {"erol", "halide", "erva","manisa"};
        List<String> calısmaList = Arrays.asList(calısma);
        //calısmaList.add("sefil"); rte verir


    }
}
