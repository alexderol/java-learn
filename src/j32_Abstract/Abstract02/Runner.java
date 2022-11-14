package j32_Abstract.Abstract02;

public class Runner {
    public static void main(String[] args) {
        Isci maraba = new Isci();
        maraba.maasBilgisi();
        maraba.maasHesapla();
        maraba.name = "erol Bey";//name parent clastan yani personel clastan alındı çünkü extends ilişkisi varsa alırsın
        System.out.println(maraba.name);//erol geldi
        maraba.sigorta();//concrete method parent clasta call edildi

        IdariPersonal cincik = new IdariPersonal();
        cincik.name="Dilek Hanım";
        System.out.println(cincik.name);
        cincik.maasHesapla();
        cincik.maasBilgisi();
        cincik.sigorta();

    }
}
