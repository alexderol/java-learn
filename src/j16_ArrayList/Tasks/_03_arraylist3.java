package j16_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _03_arraylist3 {

    /*
        getLength() isminde bir method oluşturun.
        Parametre olarak String ArrayList
        Return tipi Integer ArrayList
        ArrayList içindeki her bir Stringin uzunluğunu bulunuz.

        Tüm elementlerin uzunluğunu döndürün

        Örneğin;
        ArrayList  :  "New jersey" ,"New york" , "Ohio" , "Florida" , "Boston"
        Tüm Stringlerin uzunluklarını yazdırın;
        cevap: 10 ,  8 , 4 , 7 , 6 olmalı
     */

    public static void main(String[] args) {

        List<String> listIsim = new ArrayList<>(Arrays.asList("New jersey" ,"New york" , "Ohio" , "Florida" , "Boston"));

        System.out.println("getLength(listIsim) = " + getLength(listIsim));


    }

    private static ArrayList<Integer> getLength(List<String> listIsim) {

        ArrayList<Integer> listUzunluk= new ArrayList<>();


        for (int i = 0; i < listIsim.size(); i++) {

           listUzunluk.add(listIsim.get(i).length());

            }


        return listUzunluk;
    }



    }
