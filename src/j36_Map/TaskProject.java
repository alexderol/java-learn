package j36_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TaskProject {
    static HashMap<String, String> person = new HashMap<>();
    static Scanner sc = new Scanner(System.in);
    /*
       1) Kullanicidan kimlik numarasini(4 haneli), tam ismini, adresini, telefonunu, alin
       2) Kimlik numarasini key olarak, diger bilgileri value olarak bir map'e depolayin

       saveInfo() method olusturun:
       3)Kullanicidan bircok kimlik numarasi(4 haneli), isim, adres ve telefon alin.
       4)Kimlik numarasini key olarak, diger bilgileri value olarak bir map'e depolayin.
       5)Ayni kimlik numarasi ile bilgi girilmesine engel olun.

       getInfo() method olusturun:
         1)Kimlik numarasini girerek kullanicinin bilgilerine ulasin.
       2)Olmayan kimlik numarasi girilirse kullaniciya hata mesaji verin.

       removeInfo() method olusturun:
       1)Kimlik numarasini girerek data silin.
       2)Girilen kimlik numarasi yoksa kullaniciya hata mesaji verin.
       3)Collection bos ise kullaniciya hata mesaji verin.

       selectOption() method olusturun:
       1)Yukaridaki 3 methodu programi sonlandirana kadar secme hakki verin
 */
    private String isim;
    static int kimlikNo;
    private String adres;
    private String telNo;
    static Scanner scan = new Scanner(System.in);
    static final String S = "\u001B[33m";
    static final String K = "\u001B[31m";
    static final String B = "\u001B[37m";
    static final String M = "\u001B[34m";
    static final String Y = "\u001B[32m";
    static final String C = "\u001B[36m";
    static String emoji="\uD83D\uDE00";

    static Map<Integer, TaskProject> herseyMap = new HashMap<>();

    public static void main(String[] args) {

        selectOption(herseyMap);

        //saveInfo(herseyMap);
        //getInfo(herseyMap);
        //removeInfo(herseyMap);


    }

    private static void selectOption(Map<Integer, TaskProject> herseyMap) {
        boolean flag = true;
        while (flag) {
            System.out.println(C+"1-saveInfo\n2-getInfo\n3-removeInfo\n4-Cıkıs\nSecim Yapınız: ");
            int secim = scan.nextInt();
            switch (secim) {
                case 1:
                    saveInfo(herseyMap);
                    break;
                case 2:
                    getInfo(herseyMap);
                    break;
                case 3:
                    removeInfo(herseyMap);
                    break;
                case 4:
                    flag = false;
                    break;
            }

        }


    }

    private static void removeInfo(Map<Integer, TaskProject> herseyMap) {
        System.out.println("kimlik no gir");
        int kimlikNo = scan.nextInt();
        if (herseyMap.keySet().contains(kimlikNo)) {

            System.out.println(herseyMap.get(kimlikNo).getIsim() + S + "\n isimli kişi silmek üzeresin (Y/N) ");
            char c = scan.next().toUpperCase().charAt(0);
            if (c == 'Y') {
                System.out.println(herseyMap.get(kimlikNo).getIsim() + K + " isimli kişi silindi!!!!");
                herseyMap.remove(kimlikNo);
            } else if (c=='N') {
                System.out.println(B+"Silme islemi iptal edildi");
            }


        } else System.out.println(K + "!!!!!  Girilen kimlik no ile ilgili kayıt bulunamadı  !!!!!!!!");


    }

    private static void getInfo(Map<Integer, TaskProject> herseyMap) {
        System.out.println("kimlik no gir");
        int kimlikNo = scan.nextInt();
        if (herseyMap.keySet().contains(kimlikNo)) {
            System.out.println(herseyMap.get(kimlikNo));
        } else System.out.println(K + "!!!!!  Girilen kimlik no ile ilgili kayıt bulunamadı  !!!!!!!!");
    }

    private static void kisiOlustur() {
        System.out.println("Kimlik 4 haneli no gir");
        int kimlikNo = kimlikNoKontrol(herseyMap);
        System.out.println("isim soyIsim gir");
        String isim = scan.nextLine().toUpperCase();
        System.out.println("adres gir");
        String adres = sc.nextLine().toUpperCase();
        System.out.println("telefon no gir");
        String telNo = sc.nextLine();
        System.out.println(Y+"Kisi başarıyla sisteme kaydedildi !!!"+emoji);

        TaskProject yeniKisi = new TaskProject(isim, adres, telNo);

        herseyMap.put(kimlikNo, yeniKisi);


    }

    private static void saveInfo(Map<Integer, TaskProject> herseyMap) {
        kisiOlustur();


    }

    private static int kimlikNoKontrol(Map<Integer, TaskProject> herseyMap) {




        while (true) {
            kimlikNo= Integer.valueOf(hane4olsun());
            if (herseyMap.keySet().contains(kimlikNo))
                System.out.println("Girilen kimlik no sisteme kayıtlı başka bir kimlik no girmelisiniz");
            else System.out.println("Girilen kimlik no sisteme kayıtlı değil işleme devam edebilirsiniz");
            break;
        }
        scan.nextLine();
        return kimlikNo;
    }

    public TaskProject(String isim, String adres, String telNo) {
        this.isim = isim;
        this.adres = adres;
        this.telNo = telNo;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public static int getKimlikNo() {
        return kimlikNo;
    }

    public static void setKimlikNo(int kimlikNo) {
        TaskProject.kimlikNo = kimlikNo;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    @Override
    public String toString() {
        return
                "isim= " + isim +
                        " adres= " + adres +
                        " telNo= " + telNo;
    }
    public static String hane4olsun(){
        String a;

        while (true){
            a= sc.nextLine();
            if(a.length()!=4){
                System.out.println("Sadece 4 haneli kimlik no olmalı");
            }else break;

        }

        return a;
    }
}
