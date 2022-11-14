package j29_Exceptions;

public class C03_ClassCastException {
    public static void main(String[] args) {
        //ClassCastException--> birbirine dönüştürülemeyen data typelar birbirine dönüştürüldüğünde oluşan RTE Exception dır
        Object obj = "JavaCAN lara selam olsun";
        String str = (String) obj;// obj data type String data taype cast yapılarak atandı
        System.out.println(str);//JavaCAN lara selam olsun

        Object sayi1 = 10;
        //String str2 = (String) sayi1; // cast ettik
       // System.out.println(str2);//.ClassCastException!!!!
        try {
            String str2 = (String) sayi1;

        } catch (ClassCastException e) {
            System.out.println(" Catch çalıştı ve dedi ki--> Integer object hiç String e çevrilir mi :(");

        }
        try {
            String str3 = (String) obj;
            System.out.println(" bu yazı ekrandaysa Exception fırlatmadı try çalışmış komut surunsuz çalışmıştır");


        }catch (ClassCastException e){
            System.out.println(" Catch çalıştı ve dedi ki--> Integer object hiç String e çevrilir mi :(");
        }

        System.out.println(" sorun handle edilmiş code kırılmadan run olmuştur");


    }


}
