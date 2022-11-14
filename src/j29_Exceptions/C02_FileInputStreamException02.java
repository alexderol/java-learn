package j29_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_FileInputStreamException02 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("src/j29_Exceptions/ebikGabık");
            int k;

            try {
                while ((k = fis.read()) != -1) {
                    System.out.print((char) k);
                }
                System.out.println(" içteki try block çalıştı");


            } catch (IOException e) {
                System.out.println(" dosya okunamıyor");
                System.out.println(" içteki catch çalıştı");
            }
            System.out.println("dıştaki try block çalıştı ");

        } catch (FileNotFoundException e) {// dosyay ulaşşılamazsa bu catch çalışır
            System.out.println("dosyaya ulaşılamıyor");
            System.out.println("en dıştaki catch çalıştı");
        }
        System.out.println("sorun handle edildi");

    }// aksyion yap try catch ile hata yakalarsan  catch ile yakala ve kırma  program çalışsın


}






