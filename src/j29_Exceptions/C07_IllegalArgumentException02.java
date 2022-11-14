package j29_Exceptions;

import java.util.Scanner;

public class C07_IllegalArgumentException02 {
    public static void main(String[] args) {
        /*
        *****"throw"- "throws" farkları;*****
        1->throws-> main method kapanıs parantezi ile method body acılıs parantezi yazılır..
           throw-> method body içinde yazılır
        2-throws-> keywordden sonra birden fazla exception tanımlanabilir
          throw-> keywordden sonra sadece bir tane exception tanımlanır
        3-throws -> keywordden sonra sadece exception class name yazılır
          throw -> keywordden sonra Exception classtan obje tanımlanır
        4-throws -> keyword method ilk satırda sadece bir kez tanımlanır
          throw -> keyword istenildiği kadar method body de tanımlanabilir

         */



       try {
           System.out.println("try bloctan selamlar burası BASI");
           hata();
           System.out.println("try bloctan selamlar burası SONU");
       }catch (IllegalArgumentException e){
           System.out.println(e);
           System.out.println(e.getMessage());
           e.printStackTrace();
       }
        System.out.println("handle edildi code devam");


    }

    public static void hata(){
        throw new IllegalArgumentException("!!!!Yine mi hata!!!!! ");


    }


}
