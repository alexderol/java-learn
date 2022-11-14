package j29_Exceptions;

import java.util.Scanner;

public class C01_ArithmeticException {
    public static void main(String[] args) {

        //ArithmeticException: matematiksel işlemlerde oluşan RTE exception dır.

        String str = "";
        //str.charAt(2);//RTE  verir StringIndexOutOfBoundsException: String index out of range: 2
        Scanner scan = new Scanner(System.in);
        System.out.println("1. sayıyı girin");
        int sayi1 = scan.nextInt();
        System.out.println(" 2. sayiyi girin");
        int sayi2 = scan.nextInt();

        int oran;  // sayi2 yi 0 seçersek-->ArithmeticException: / by zero
        try {//dene hatanın olaması muhtemel işlemi yap
            /*
            1- try-catch kullanıldığında try block hatasız çalısrsa catch block asla çalışmaz..
            2- try block catch veya finally block olmadan CTE verir. try blocktan sonra birden fazla catch block tanımlanabilir
            hiçbir catch block çalışmayadabilir
           !!!!!!! araba benzin lambası yanarsa benzinciye git metaforu !!!!!
            3-Parent - child ilişkisi olan catchlerde child önce yazılmalı aksi halde CTE

             */
            oran = sayi1/sayi2;// try blockta hata yakalandığı satırdan sonra ilgil catch block çalışır



            System.out.println(oran);
        }
        catch (ArrayIndexOutOfBoundsException e ){
            System.out.println(" arrayde olmayan eleman istiyorsun ");
            System.out.println(" cırak catch den selamlar ");
        }
        catch (ArithmeticException e){//problem yok çünkü parentten önce önce çıraklar sonra usta ilgilenir
            System.out.println("Bölmede bolönen sıfır olamaz"+e.getMessage());//exception oluştuğunda sadece hata print etmek için kullanılır
            //by Zero
            e.fillInStackTrace();//oluşan exception ın tüm detaylarını getirir
            //java.lang.ArithmeticException: / by zero



            System.out.println("cırak catch den selamlar ");
        }
        catch (Exception e) {//Exception class tüm exception ların hz Adem i dir
            //hata yaklandığında yapılacak aksiyonların olduğu blocktur burası

            //Exception-> oluşan hata data type
            //e -> javanın oluşan exception a atayacağı obje name dir best practice : e

            System.out.println("sayı 0 a bölünmez  ");
            System.out.println("usta catch den selamlar ---->Exception varrsa o ustadır hz Adem yani o yüzden ;)");


        }

        //catch (ArithmeticException falanfilan){// child olduğu için CTE verir
        //}
        finally {// catch blocklardan sonra istenirse finally block kullanılabilir
            /*
            try-catch içinde yapılan işlemlerden sonra mutlaka çalışması gereken block varrsa finally tanımlanır
            hata durumda catch çalışmzsa program sonlanır finally tanılanırsa cathc çalışmasa bile program devam eder
            finally block hata olsa da olmasa da çalışır...
            cloud database ortamlarında bağlantı kesmek için kullanılır....cloud ile connection yazdığınızda code başarılı
            bir şekilde çalışırsa işlem bittiğinde finally block ile connection kapanmazsa maliyet pahalı olur...banka örneği...

             */
            System.out.println("finally block her türlü çalışır bu son kısım ");





        }


        System.out.println("Exception sonrası handle edildi takılmadan devam etti ");







    }





}
