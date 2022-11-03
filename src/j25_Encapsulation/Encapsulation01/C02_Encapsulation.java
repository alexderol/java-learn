package j25_Encapsulation.Encapsulation01;

public class C02_Encapsulation {//pojo class

    private String name = "Gamze Hanım";
    private int ıd = 1001;

    public C02_Encapsulation() {

    }

    public C02_Encapsulation(String dilek_hanım, int i) {
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return ıd;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int ıd) {
        this.ıd = ıd;
    }
//
    //public C02_Encapsulation(String name, int ıd) {
    //    this.name = name;
    //    this.ıd = ıd;
    //}
//
    //public String isimVer(){// getter methodudur aslında
//
    //    return name;
    //}
    //public int idVer(){//getteer methodudur aslında
//
    //    return ıd;
    //}
    //public void isimDegis(String isim){//setter method aslında
    //    this.name=isim;
    //}
//
    //@Override
    //public String toString() {
    //    return
    //            "name='" + name + '\'' +
    //            " ıd=" + ıd ;
    //}
}
