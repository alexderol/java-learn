package j21_ImmutableClass;

public class C01_ImmutableClass {
    public static void main(String[] args) {
        String str1="murat";// ilk değeri murat atanan str1 variable
        String str2="murat";//str1 ve str2 aynı ilk değere sahip olduğu için String havuzunda ortak referansa atanır


        String str3 = new String("murat"); // değerleri aynı referansları farklı objedir
        String str4 = new String("murat");// değerleri  aynı referansları farklı objedir

        String str5 = str1+"";// aynı değeri verir ancak referansları farklı str5=str1 olsaydı true olurdu birte "" hiçlik eklenmiş değer ihçlik eklenince değişmez ama referanns değişir


        System.out.println(str1 == str2);//true
        System.out.println(str1 == str3);//false
        System.out.println(str1.equals(str2));//true değerlere bakar ikisi de murat
        System.out.println(str3 == str4);//false objelere farklı
        System.out.println(str1 == str5);// false değerleri aynı referansları farklı
        System.out.println(str1.equals(str5));//true



    }
}
