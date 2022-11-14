package j29_Exceptions.Q02._01.AnswerFromME;

import j29_Exceptions.Q02._01.Ogrenci;

import java.util.List;

public class Okulme {

    private String OkulAd;
    private int maxOgrSayisi;
    private List<Ogrenci> ogrenciList;

    @Override
    public String toString() {
        return  "OkulAd= " + OkulAd +
                "\nmaxOgrSayisi= " + maxOgrSayisi +
                "\nogrenciList= " + ogrenciList ;
    }

    public Okulme() {
    }

    public String getOkulAd() {
        return OkulAd;
    }

    public void setOkulAd(String okulAd) {
        OkulAd = okulAd;
    }

    public int getMaxOgrSayisi() {
        return maxOgrSayisi;
    }

    public void setMaxOgrSayisi(int maxOgrSayisi) {
        this.maxOgrSayisi = maxOgrSayisi;
    }

    public List<Ogrenci> getOgrenciList() {
        return ogrenciList;
    }

    public void setOgrenciList(List<Ogrenci> ogrenciList) {
        this.ogrenciList = ogrenciList;
    }
}
