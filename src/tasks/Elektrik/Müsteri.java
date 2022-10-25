package tasks.Elektrik;

public class Müsteri {
    public static void main(String[] args) {

        String name="Nakamura";
        ElektrikHesap müsteri= new ElektrikHesap();
        müsteri.tüketimEkle(500);
        müsteri.tüketimEkle(300);
        müsteri.odenecekTutar();
        System.out.println("müsteri.toplamTuketim = " + müsteri.toplamTuketim+ " Kw");
        System.out.println("müsteri.fatura = " + müsteri.fatura+" TL ");


    }


}
