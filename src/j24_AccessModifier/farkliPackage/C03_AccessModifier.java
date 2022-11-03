package j24_AccessModifier.farkliPackage;

import j24_AccessModifier.C01_AccessModifier;


public class C03_AccessModifier {

    private String privateTeamLead="Hakan Bey";
    String defaultName="Cebrail Bey";
    protected String protectedName="Dilek Hannım";
    public String publicName="Gamze Hanım";


    public static void main(String[] args) {

        C01_AccessModifier obj9 = new C01_AccessModifier(23,63);//public cons a ulaştık
        System.out.println("obj9.publicYas = " + obj9.publicYas);//publicyasa ulaşılabiliyor çonkü package dan dolayı//public yaşa ulaştık
        //digerlerine erişim olmaz sadece public olanlar çalıştı



    }



}
