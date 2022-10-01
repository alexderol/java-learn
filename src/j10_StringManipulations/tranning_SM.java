package j10_StringManipulations;

public class tranning_SM {
    public static void main(String[] args) {
        String kelime = "sözlerimi geri alamam yazdığımı yeniden yazamam";
        String lale = "seni severdim sana rağmen";
        System.out.println("kelime.length() = " + kelime.length());
        System.out.println("kelime.indexOf(\"m\") = " + kelime.indexOf("m"));
        System.out.println("kelime.contains(\"jale\") = " + kelime.contains("jale"));
        System.out.println("kelime.concat(lale).concat(kelime).substring(0,5) = " + kelime.concat(lale).concat(kelime).substring(0, 5));
        System.out.println("kelime.concat(lale) = " + kelime.concat(lale));
        System.out.println("kelime.lastIndexOf(\"a\") = " + kelime.lastIndexOf("a"));
        kelime=kelime.concat(" ").concat(lale);
        System.out.println("kelime = " + kelime);
        System.out.println("kelime.indexOf(\"sözlerimi\") = " + kelime.indexOf("sözlerimi"));
        System.out.println("kelime.substring(10) = " + kelime.substring(10));



    }
}
