package j29_Exceptions;

public class C05_ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
         //ArrayIndexOutOfBoundsException-->Arraylerde olmayan bir index elemanı ile işlem yapmaya kalkıldığında oluşan RTE Exception dır
        int  arr []={24,27,38,41,54};
        System.out.println(arr[0]);//24
        //System.out.println(arr[7]);//ArrayIndexOutOfBoundsException
        try {
            System.out.println(arr[7]);
            System.out.println("burası çalışmışsa try çalışmış kod devamdır");

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(" Catch çalıştığına göre try çalışmadı ");
        }
        System.out.println(" handle edildi ");

    }
}
