package j15_Arrays.odev;

public class _04_Create_Array_String {

    public static void main(String[] args) {

        /*
        elemanları: "new jersey" , "new york", "boston","California" olan  String array  oluşturun ve
        Array'daki eleman sayısını yazdırınız.
        Cevap 4 olmalı.
         */
        String [] arr=  {"new jersey" , "new york", "boston","California"};
        int elemanSayısı=0;
        for (int i = 0; i < arr.length ; i++) {
            elemanSayısı++;

        }
        System.out.println("elemanSayısı = " + elemanSayısı);


    }
}
