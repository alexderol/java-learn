package j35_Collection.C02_Set;

import java.util.*;

public class Task01 {
    /*
    task--> dger ataması yapılan Array i arrylist e ceviren methodu create  ediniz
    main içesinde methodu return ettiği arrylist i hasset linkedhasset ve tresete atayınız
     */
    public static void main(String[] args) {

        String  arr[]={"Muharrem","Umit","Sinan","Nihan"};

        //  arrayListeCevir(arr);
        HashSet<String >hs=new HashSet<>(arrayListeCevir(arr));
        LinkedHashSet<String >lhs=new LinkedHashSet<>(arrayListeCevir(arr));
        TreeSet<String > ts=new TreeSet<>(arrayListeCevir(arr));

        System.out.println("hurra set : "+hs);//[Muharrem, Sinan, Nihan, Umit]
        System.out.println("erken gelen girer set : "+lhs);//[Muharrem, Umit, Sinan, Nihan]
        System.out.println("alfabetik sıre set : "+ts);//[Muharrem, Nihan, Sinan, Umit]
    }//main sonuu

    public static ArrayList<String> arrayListeCevir(String[] arr) {
        ArrayList<String >arLst=new ArrayList<>(List.of(arr));

        return arLst;
    }


}
