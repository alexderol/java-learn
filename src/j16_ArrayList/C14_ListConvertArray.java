package j16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C14_ListConvertArray {
    public static void main(String[] args) {

        //list i array a çevirme --> toArray();
        //1. yöntcem--> toArray(); parametre olarak String [0] alarak yapılır.

        ArrayList<String> listUlke = new ArrayList<>(List.of("Alamanya", "Amerigonya", "İngiltere", "İsveç"));
        String arrUlke []= listUlke.toArray(new String[0]);// ülke listi artık ülke arrayı oldu

        System.out.println("listUlke ArrayList = " + listUlke);
        System.out.println("listUlke artık arrUlke oldu ve  = " + Arrays.toString(arrUlke));

        //2.yöntem--> oluşturulan Arrayin data type object olarak atanır
        //Trick-->Object class java da tüm classların parent(atası:HZ ADEM)
        // Object Class java da parent i olmayan tek Class dır.. tüm vagonları çeken ama çekilemeyen lokomotiftir
        // String Integer Calasslar Object Class childi olduğu için iseteme durumlarında data type olarak object class kullanılır
        //
        Object arrUlkeler []=listUlke.toArray();// object yani hz Adem classına atandık
        System.out.println("Arrays.toString(arrUlkeler) = " + Arrays.toString(arrUlkeler));

      List<String> list2 = new ArrayList<>(List.of("erol","demir","akhisar"));
      String lis2Arr [] =list2.toArray(new String[0]);

      Object objelisi [] = list2.toArray();
        System.out.println("objelisi = " + Arrays.toString(objelisi));


    }
}
