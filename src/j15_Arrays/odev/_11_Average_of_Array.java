package j15_Arrays.odev;

public class _11_Average_of_Array {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 12, 14 , 21 ,23 , 10 ,4
        Array'in ortalamasını alınız.
         */
        int [] arr=  {12,14,21,23,10,4};
        int toplam = 0;
        int ortalama=0;

        for (int i = 0; i < arr.length; i++) {
            toplam+=arr[i];

        }
        System.out.println("ortalama  = " + (ortalama = toplam / arr.length));


    }
}