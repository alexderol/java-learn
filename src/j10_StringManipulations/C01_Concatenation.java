package j10_StringManipulations;

public class C01_Concatenation {
    public static void main(String[] args) {
        /* concat() methodu içine (parametre) aldığı string variable ı çalıştığı stringin sonuna ekler
         * java da + işlemi yapılırken eğer en az bir string variable varsa tüm java toplama concat yapar
         *
         */
        String name = " Nur";
        String meslek = " Qa tester";
        System.out.println(name.concat(meslek));
        System.out.println(name);//Nur yazdırır

        //Trick-->String methodları variable da geçici değişiklik yapar ama değişken atama yapılırsa kalıcı değişir
        name=meslek.concat(name);//name atama yaptık
        System.out.println("name = " + name);// yani burada concat ederken atama da yapmış olduk name artık Qa testerNur oldu..
        System.out.println(name.concat(true + "  \')\'"));//Qa tester Nurtrue ')'
        //TRick--> concat methodları String harici tüm dataları  Stringe çevirip  concat eder
        System.out.println(name.concat(100 + " yüz burada concat olurken Stringe çevrilip eklendi"));

        String isim  = "Erol";
        String soyIsm= "Demir";
        System.out.println(isim.concat(soyIsm));
        isim=isim.concat(soyIsm);
        System.out.println(isim);
        System.out.println(isim.concat(" ").concat(isim));
        System.out.println(isim.concat(soyIsm).concat(String.valueOf(1907)));


    }


}
