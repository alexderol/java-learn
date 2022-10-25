package tasks.Elektrik;

public class ElektrikHesap {

    /*ElektirikHesap Class:  fields : toplamTuketim(int), oran(double), fatura(double)
    Müşteriye ait tüketilen enerjiyi toplamTuketim'e toplayan tüketimEkle method
    oran(0.7)  katsaysı ile  toplamTuketim çarparak fatura değeri atayan odenecekTutar method

    Müsteri Class: fields: name ElektrikHesabi class obj.
    Runner Class obj ile enz 2  aylık elektrik tüketim faturası print eden code create ediniz
    */
    int toplamTuketim;
    double oran=0.7;
    double fatura;

    public void tüketimEkle(int tuketim){

        toplamTuketim+=tuketim;
    }
    public void odenecekTutar(){
        fatura+=toplamTuketim*oran;

        ;
    }




}
