package j32_Abstract.Ornek2;

public class Runner {
    public static void main(String[] args) {
        Dikdörtgen dikdörtgen= new Dikdörtgen(24,7);
        //dikdörtgen.alanHesapla(); methodları tostring içinde call ettik zaten bunlara gerek yok
        //dikdörtgen.cevreHesapla();
        //dikdörtgen.ciz();

        dikdörtgen.setName("dikdörtgen");
        System.out.println(dikdörtgen);
        Cember cember = new Cember(39);
        cember.setName("cember");
        System.out.println(cember);



    }
}
