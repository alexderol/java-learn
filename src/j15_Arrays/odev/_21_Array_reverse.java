package j15_Arrays.odev;

public class _21_Array_reverse {

    public static void main(String[] args) {

        /*
        Girilen 123 Intiger'ının basamaklarını ters çevirin.
        Örnek:
        Input(girdi): 123
        Output(çıktı): 321
         */
        int [] arr=  {1,2,3};
        int reverse=0;
        for (int i = arr.length-1; i >= 0 ; i--) {
            System.out.print(arr[i]);

        }


    }
}


