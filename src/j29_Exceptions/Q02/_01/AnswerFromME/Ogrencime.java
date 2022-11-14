package j29_Exceptions.Q02._01.AnswerFromME;

import j29_Exceptions.Q02._01.Ogrenci;

import java.util.ArrayList;
import java.util.List;

public class Ogrencime {


    private  String ad;
    private  String soyad;
    private int yas;

    public static List<Ogrenci> ogrenciList = new ArrayList<>();

    @Override
    public String toString() {
        return "Ad= " + ad + "\n" +
                "Soyad= " + soyad + "\n" +
                "Yas= " + yas ;
    }

    public Ogrencime() {
    }

    public Ogrencime(String ad, String soyad, int yas) {
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }
}
