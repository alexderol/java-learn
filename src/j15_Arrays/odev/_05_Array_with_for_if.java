package j15_Arrays.odev;

public class _05_Array_with_for_if {

    public static void main(String[] args) {

        /*
         elemanları : 5,6,8,12,14,19 olan int Array oluşturun ve
        Eğer sayı çiftse topla, tekse çıkar.
        Örneğin:
         -5 + 6 + 8 + 12 + 14 - 19 = 16
        Toplamlarını yazdırın.
         */
        int [] eleman= {5,6,8,12,14,19};
        int topla=0;
        int çıkar=0;

        for (int i = 0; i < eleman.length; i++) {
            if(eleman[i]%2==0){
                topla+=eleman[i];
            }else çıkar-=eleman[i];
        }
        System.out.println("topla = " + topla);
        System.out.println("çıkar = " + çıkar);


    }
}
